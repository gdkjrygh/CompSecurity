// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            DialogFeature, Utility, NativeProtocol, AppCall, 
//            Validate, ServerProtocol

public class DialogPresenter
{
    public static interface ParameterProvider
    {

        public abstract Bundle getLegacyParameters();

        public abstract Bundle getParameters();
    }


    public DialogPresenter()
    {
    }

    public static boolean canPresentNativeDialogWithFeature(DialogFeature dialogfeature)
    {
        return getProtocolVersionForNativeDialog(dialogfeature) != -1;
    }

    public static boolean canPresentWebFallbackDialogWithFeature(DialogFeature dialogfeature)
    {
        return getDialogWebFallbackUri(dialogfeature) != null;
    }

    private static Uri getDialogWebFallbackUri(DialogFeature dialogfeature)
    {
        Object obj = dialogfeature.name();
        dialogfeature = dialogfeature.getAction();
        obj = Utility.getDialogFeatureConfig(FacebookSdk.getApplicationId(), dialogfeature, ((String) (obj)));
        dialogfeature = null;
        if (obj != null)
        {
            dialogfeature = ((Utility.DialogFeatureConfig) (obj)).getFallbackUrl();
        }
        return dialogfeature;
    }

    public static int getProtocolVersionForNativeDialog(DialogFeature dialogfeature)
    {
        String s = FacebookSdk.getApplicationId();
        String s1 = dialogfeature.getAction();
        return NativeProtocol.getLatestAvailableProtocolVersionForAction(s1, getVersionSpecForFeature(s, s1, dialogfeature));
    }

    private static int[] getVersionSpecForFeature(String s, String s1, DialogFeature dialogfeature)
    {
        s = Utility.getDialogFeatureConfig(s, s1, dialogfeature.name());
        if (s != null)
        {
            return s.getVersionSpec();
        } else
        {
            return (new int[] {
                dialogfeature.getMinVersion()
            });
        }
    }

    public static void logDialogActivity(Context context, String s, String s1)
    {
        context = AppEventsLogger.newLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_dialog_outcome", s1);
        context.logSdkEvent(s, null, bundle);
    }

    public static void present(AppCall appcall, Activity activity)
    {
        activity.startActivityForResult(appcall.getRequestIntent(), appcall.getRequestCode());
        appcall.setPending();
    }

    public static void present(AppCall appcall, Fragment fragment)
    {
        fragment.startActivityForResult(appcall.getRequestIntent(), appcall.getRequestCode());
        appcall.setPending();
    }

    public static void setupAppCallForCannotShowError(AppCall appcall)
    {
        setupAppCallForValidationError(appcall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static void setupAppCallForErrorResult(AppCall appcall, FacebookException facebookexception)
    {
        if (facebookexception == null)
        {
            return;
        } else
        {
            Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
            Intent intent = new Intent();
            intent.setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
            intent.setAction(FacebookActivity.PASS_THROUGH_CANCEL_ACTION);
            NativeProtocol.setupProtocolRequestIntent(intent, appcall.getCallId().toString(), null, NativeProtocol.getLatestKnownVersion(), NativeProtocol.createBundleForException(facebookexception));
            appcall.setRequestIntent(intent);
            return;
        }
    }

    public static void setupAppCallForNativeDialog(AppCall appcall, ParameterProvider parameterprovider, DialogFeature dialogfeature)
    {
        Context context = FacebookSdk.getApplicationContext();
        String s = dialogfeature.getAction();
        int i = getProtocolVersionForNativeDialog(dialogfeature);
        if (i == -1)
        {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        if (NativeProtocol.isVersionCompatibleWithBucketedIntent(i))
        {
            parameterprovider = parameterprovider.getParameters();
        } else
        {
            parameterprovider = parameterprovider.getLegacyParameters();
        }
        dialogfeature = parameterprovider;
        if (parameterprovider == null)
        {
            dialogfeature = new Bundle();
        }
        parameterprovider = NativeProtocol.createPlatformActivityIntent(context, appcall.getCallId().toString(), s, i, dialogfeature);
        if (parameterprovider == null)
        {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        } else
        {
            appcall.setRequestIntent(parameterprovider);
            return;
        }
    }

    public static void setupAppCallForValidationError(AppCall appcall, FacebookException facebookexception)
    {
        setupAppCallForErrorResult(appcall, facebookexception);
    }

    public static void setupAppCallForWebDialog(AppCall appcall, String s, Bundle bundle)
    {
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Bundle bundle1 = new Bundle();
        bundle1.putString("action", s);
        bundle1.putBundle("params", bundle);
        bundle = new Intent();
        NativeProtocol.setupProtocolRequestIntent(bundle, appcall.getCallId().toString(), s, NativeProtocol.getLatestKnownVersion(), bundle1);
        bundle.setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
        bundle.setAction("FacebookDialogFragment");
        appcall.setRequestIntent(bundle);
    }

    public static void setupAppCallForWebFallbackDialog(AppCall appcall, Bundle bundle, DialogFeature dialogfeature)
    {
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        String s = dialogfeature.name();
        Object obj = getDialogWebFallbackUri(dialogfeature);
        if (obj == null)
        {
            throw new FacebookException((new StringBuilder()).append("Unable to fetch the Url for the DialogFeature : '").append(s).append("'").toString());
        }
        int i = NativeProtocol.getLatestKnownVersion();
        bundle = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(appcall.getCallId().toString(), i, bundle);
        if (bundle == null)
        {
            throw new FacebookException("Unable to fetch the app's key-hash");
        }
        if (((Uri) (obj)).isRelative())
        {
            bundle = Utility.buildUri(ServerProtocol.getDialogAuthority(), ((Uri) (obj)).toString(), bundle);
        } else
        {
            bundle = Utility.buildUri(((Uri) (obj)).getAuthority(), ((Uri) (obj)).getPath(), bundle);
        }
        obj = new Bundle();
        ((Bundle) (obj)).putString("url", bundle.toString());
        ((Bundle) (obj)).putBoolean("is_fallback", true);
        bundle = new Intent();
        NativeProtocol.setupProtocolRequestIntent(bundle, appcall.getCallId().toString(), dialogfeature.getAction(), NativeProtocol.getLatestKnownVersion(), ((Bundle) (obj)));
        bundle.setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
        bundle.setAction("FacebookDialogFragment");
        appcall.setRequestIntent(bundle);
    }
}
