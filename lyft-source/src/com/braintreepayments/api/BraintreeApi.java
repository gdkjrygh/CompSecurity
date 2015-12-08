// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.braintreepayments.api.data.BraintreeData;
import com.braintreepayments.api.data.BraintreeEnvironment;
import com.braintreepayments.api.exceptions.AuthenticationException;
import com.braintreepayments.api.exceptions.AuthorizationException;
import com.braintreepayments.api.exceptions.DownForMaintenanceException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.exceptions.ServerException;
import com.braintreepayments.api.exceptions.UnexpectedException;
import com.braintreepayments.api.exceptions.UpgradeRequiredException;
import com.braintreepayments.api.internal.HttpRequest;
import com.braintreepayments.api.internal.HttpResponse;
import com.braintreepayments.api.models.AnalyticsRequest;
import com.braintreepayments.api.models.PayPalAccount;
import com.braintreepayments.api.models.PayPalAccountBuilder;
import com.braintreepayments.api.models.PaymentMethod;
import com.braintreepayments.api.models.ThreeDSecureLookup;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api:
//            ClientToken, VenmoAppSwitch, PayPalHelper

public class BraintreeApi
{

    private static final String PAYMENT_METHOD_ENDPOINT = "payment_methods";
    private BraintreeData mBraintreeData;
    private ClientToken mClientToken;
    private Context mContext;
    private HttpRequest mHttpRequest;
    private VenmoAppSwitch mVenmoAppSwitch;

    protected BraintreeApi(Context context, ClientToken clienttoken)
    {
        this(context, clienttoken, new HttpRequest(clienttoken.getAuthorizationFingerprint()));
    }

    protected BraintreeApi(Context context, ClientToken clienttoken, HttpRequest httprequest)
    {
        mContext = context;
        mClientToken = clienttoken;
        mHttpRequest = httprequest;
        mVenmoAppSwitch = new VenmoAppSwitch(context, clienttoken);
    }

    public BraintreeApi(Context context, String s)
    {
        this(context, ClientToken.getClientToken(s));
    }

    private void checkAndThrowErrors(HttpResponse httpresponse)
    {
        switch (httpresponse.getResponseCode())
        {
        default:
            throw new UnexpectedException();

        case 401: 
            throw new AuthenticationException();

        case 403: 
            throw new AuthorizationException();

        case 422: 
            throw new ErrorWithResponse(httpresponse.getResponseCode(), httpresponse.getResponseBody());

        case 426: 
            throw new UpgradeRequiredException();

        case 500: 
            throw new ServerException();

        case 503: 
            throw new DownForMaintenanceException();

        case 200: 
        case 201: 
        case 202: 
            return;
        }
    }

    private String jsonForType(String s, String s1)
    {
        try
        {
            s = (new JSONObject(s)).getJSONArray(s1).get(0).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ServerException("Parsing server response failed");
        }
        return s;
    }

    private String versionedUrl(String s)
    {
        return (new StringBuilder()).append(mClientToken.getClientApiUrl()).append("/v1/").append(s).toString();
    }

    public String collectDeviceData(Activity activity, BraintreeEnvironment braintreeenvironment)
    {
        return collectDeviceData(activity, braintreeenvironment.getMerchantId(), braintreeenvironment.getCollectorUrl());
    }

    public String collectDeviceData(Activity activity, String s, String s1)
    {
        mBraintreeData = new BraintreeData(activity, s, s1);
        return mBraintreeData.collectDeviceData();
    }

    public PaymentMethod create(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        HttpResponse httpresponse = mHttpRequest.post(versionedUrl((new StringBuilder()).append("payment_methods/").append(builder.getApiPath()).toString()), builder.toJsonString());
        checkAndThrowErrors(httpresponse);
        return builder.fromJson(jsonForType(httpresponse.getResponseBody(), builder.getApiResource()));
    }

    public PayPalAccount finishPayWithPayPal(int i, Intent intent)
    {
        Object obj = null;
        PayPalAccountBuilder paypalaccountbuilder = handlePayPalResponse(null, i, intent);
        intent = obj;
        if (paypalaccountbuilder != null)
        {
            intent = (PayPalAccount)create(paypalaccountbuilder);
        }
        return intent;
    }

    public PayPalAccount finishPayWithPayPal(Activity activity, int i, Intent intent)
    {
        activity = handlePayPalResponse(activity, i, intent);
        if (activity != null)
        {
            return (PayPalAccount)create(activity);
        } else
        {
            return null;
        }
    }

    public String finishPayWithVenmo(int i, Intent intent)
    {
        return mVenmoAppSwitch.handleAppSwitchResponse(i, intent);
    }

    protected PaymentMethod getPaymentMethod(String s)
    {
        s = mHttpRequest.get(versionedUrl((new StringBuilder()).append("payment_methods/").append(s).toString()));
        checkAndThrowErrors(s);
        s = PaymentMethod.parsePaymentMethods(s.getResponseBody());
        if (s.size() == 1)
        {
            return (PaymentMethod)s.get(0);
        }
        if (s.size() > 1)
        {
            throw new ServerException("Expected one payment method, got multiple payment methods");
        } else
        {
            throw new ServerException("No payment methods were found for nonce");
        }
    }

    public List getPaymentMethods()
    {
        HttpResponse httpresponse = mHttpRequest.get(versionedUrl("payment_methods"));
        checkAndThrowErrors(httpresponse);
        return PaymentMethod.parsePaymentMethods(httpresponse.getResponseBody());
    }

    public PayPalAccountBuilder handlePayPalResponse(Activity activity, int i, Intent intent)
    {
        PayPalHelper.stopPaypalService(mContext);
        return PayPalHelper.getBuilderFromActivity(activity, i, intent);
    }

    public boolean isCvvChallengePresent()
    {
        return mClientToken.isCvvChallengePresent();
    }

    public boolean isPayPalEnabled()
    {
        return mClientToken.isPayPalEnabled();
    }

    public boolean isPostalCodeChallengePresent()
    {
        return mClientToken.isPostalCodeChallengePresent();
    }

    public boolean isThreeDSecureEnabled()
    {
        return mClientToken.isThreeDSecureEnabled();
    }

    public boolean isVenmoEnabled()
    {
        return mVenmoAppSwitch.isAvailable();
    }

    public void sendAnalyticsEvent(String s, String s1)
    {
        if (!mClientToken.isAnalyticsEnabled())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s = new AnalyticsRequest(mContext, s, s1);
        mHttpRequest.post(mClientToken.getAnalytics().getUrl(), s.toJson());
        return;
        s;
    }

    public void startPayWithPayPal(Activity activity, int i)
    {
        PayPalHelper.startPaypal(activity.getApplicationContext(), mClientToken);
        PayPalHelper.launchPayPal(activity, i, mClientToken);
    }

    public void startPayWithVenmo(Activity activity, int i)
    {
        mVenmoAppSwitch.launch(activity, i);
    }

    public ThreeDSecureLookup threeDSecureLookup(String s, String s1)
    {
        s1 = (new JSONObject()).put("merchantAccountId", mClientToken.getMerchantAccountId()).put("amount", s1);
        s = mHttpRequest.post(versionedUrl((new StringBuilder()).append("payment_methods/").append(s).append("/three_d_secure/lookup").toString()), s1.toString());
        checkAndThrowErrors(s);
        return ThreeDSecureLookup.fromJson(s.getResponseBody());
    }

    public String tokenize(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        return create(builder.validate(false)).getNonce();
    }
}
