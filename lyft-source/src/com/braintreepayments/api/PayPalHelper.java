// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.braintreepayments.api.exceptions.ConfigurationException;
import com.braintreepayments.api.models.PayPalAccountBuilder;
import com.paypal.android.sdk.payments.PayPalAuthorization;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalOAuthScopes;
import com.paypal.android.sdk.payments.PayPalProfileSharingActivity;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PayPalTouch;
import com.paypal.android.sdk.payments.PayPalTouchActivity;
import com.paypal.android.sdk.payments.PayPalTouchConfirmation;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api:
//            ClientToken

public class PayPalHelper
{

    private static final String OFFLINE = "offline";
    protected static boolean sEnableSignatureVerification = true;

    private PayPalHelper()
    {
        throw new IllegalStateException("Non-instantiable class.");
    }

    protected static PayPalConfiguration buildPayPalConfiguration(ClientToken clienttoken)
    {
        PayPalConfiguration paypalconfiguration = new PayPalConfiguration();
        clienttoken = clienttoken.getPayPal();
        if (clienttoken.getEnvironment().equals("live"))
        {
            paypalconfiguration.environment("live");
        } else
        if (clienttoken.getEnvironment().equals("offline"))
        {
            paypalconfiguration.environment("mock");
        } else
        {
            paypalconfiguration.environment(clienttoken.getEnvironment());
        }
        return paypalconfiguration.clientId(clienttoken.getClientId()).merchantName(clienttoken.getDisplayName()).merchantUserAgreementUri(Uri.parse(clienttoken.getUserAgreementUrl())).merchantPrivacyPolicyUri(Uri.parse(clienttoken.getPrivacyUrl()));
    }

    protected static Intent buildPayPalServiceIntent(Context context, ClientToken clienttoken)
    {
        context = new Intent(context, com/paypal/android/sdk/payments/PayPalService);
        context.putExtra("com.paypal.android.sdk.paypalConfiguration", buildPayPalConfiguration(clienttoken));
        context.putExtra("com.paypal.android.sdk.enableAuthenticatorSecurity", sEnableSignatureVerification);
        if (clienttoken.getPayPal().getEnvironment().equals("custom"))
        {
            context.putExtra("com.paypal.android.sdk.baseEnvironmentUrl", clienttoken.getPayPal().getDirectBaseUrl());
            context.putExtra("com.paypal.android.sdk.enableStageSsl", false);
        }
        return context;
    }

    public static PayPalAccountBuilder getBuilderFromActivity(Activity activity, int i, Intent intent)
    {
        if (i == -1)
        {
            PayPalAccountBuilder paypalaccountbuilder = new PayPalAccountBuilder();
            if (activity != null)
            {
                paypalaccountbuilder.correlationId(PayPalConfiguration.getClientMetadataId(activity));
            }
            activity = (PayPalTouchConfirmation)intent.getParcelableExtra("com.paypal.android.sdk.loginConfirmation");
            if (activity != null)
            {
                try
                {
                    activity = activity.toJSONObject().getJSONObject("response");
                }
                // Misplaced declaration of an exception variable
                catch (Activity activity)
                {
                    return null;
                }
                paypalaccountbuilder.authorizationCode(activity.optString("authorization_code")).source("paypal-app");
                paypalaccountbuilder.email(activity.optString("email"));
            } else
            {
                activity = (PayPalAuthorization)intent.getParcelableExtra("com.paypal.android.sdk.authorization");
                paypalaccountbuilder.authorizationCode(activity.getAuthorizationCode()).source("paypal-sdk");
                try
                {
                    paypalaccountbuilder.email(activity.toJSONObject().getJSONObject("user").getString("display_string"));
                }
                // Misplaced declaration of an exception variable
                catch (Activity activity) { }
            }
            return paypalaccountbuilder;
        }
        if (i == 2)
        {
            throw new ConfigurationException();
        } else
        {
            return null;
        }
    }

    public static boolean isPayPalIntent(Intent intent)
    {
        return intent.getParcelableExtra("com.paypal.android.sdk.loginConfirmation") != null || intent.getParcelableExtra("com.paypal.android.sdk.authorization") != null;
    }

    protected static void launchPayPal(Activity activity, int i, ClientToken clienttoken)
    {
        Object obj;
        if (PayPalTouch.available(activity.getBaseContext(), sEnableSignatureVerification) && !clienttoken.getPayPal().getEnvironment().equals("offline") && !clienttoken.getPayPal().getTouchDisabled())
        {
            obj = com/paypal/android/sdk/payments/PayPalTouchActivity;
        } else
        {
            obj = com/paypal/android/sdk/payments/PayPalProfileSharingActivity;
        }
        obj = new Intent(activity, ((Class) (obj)));
        ((Intent) (obj)).putExtra("com.paypal.android.sdk.requested_scopes", new PayPalOAuthScopes(new HashSet(Arrays.asList(new String[] {
            PayPalOAuthScopes.PAYPAL_SCOPE_EMAIL, PayPalOAuthScopes.PAYPAL_SCOPE_FUTURE_PAYMENTS
        }))));
        ((Intent) (obj)).putExtra("com.paypal.android.sdk.paypalConfiguration", buildPayPalConfiguration(clienttoken));
        activity.startActivityForResult(((Intent) (obj)), i);
    }

    protected static void startPaypal(Context context, ClientToken clienttoken)
    {
        stopPaypalService(context);
        context.startService(buildPayPalServiceIntent(context, clienttoken));
    }

    protected static void stopPaypalService(Context context)
    {
        context.stopService(new Intent(context, com/paypal/android/sdk/payments/PayPalService));
    }

}
