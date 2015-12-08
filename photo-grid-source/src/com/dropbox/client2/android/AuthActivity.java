// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.dropbox.client2.RESTUtility;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

public class AuthActivity extends Activity
{

    public static final String ACTION_AUTHENTICATE_V1 = "com.dropbox.android.AUTHENTICATE_V1";
    public static final String ACTION_AUTHENTICATE_V2 = "com.dropbox.android.AUTHENTICATE_V2";
    public static final String AUTH_PATH_CONNECT = "/connect";
    public static final int AUTH_VERSION = 1;
    private static final String DEFAULT_WEB_HOST = "www.dropbox.com";
    private static final String DROPBOX_APP_SIGNATURES[] = {
        "308202223082018b02044bd207bd300d06092a864886f70d01010405003058310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130744726f70626f783112301006035504031309546f6d204d65796572301e170d3130303432333230343930315a170d3430303431353230343930315a3058310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130744726f70626f783112301006035504031309546f6d204d6579657230819f300d06092a864886f70d010101050003818d0030818902818100ac1595d0ab278a9577f0ca5a14144f96eccde75f5616f36172c562fab0e98c48ad7d64f1091c6cc11ce084a4313d522f899378d312e112a748827545146a779defa7c31d8c00c2ed73135802f6952f59798579859e0214d4e9c0554b53b26032a4d2dfc2f62540d776df2ea70e2a6152945fb53fef5bac5344251595b729d4810203010001300d06092a864886f70d01010405000381810055c425d94d036153203dc0bbeb3516f94563b102fff39c3d4ed91278db24fc4424a244c2e59f03bbfea59404512b8bf74662f2a32e37eafa2ac904c31f99cfc21c9ff375c977c432d3b6ec22776f28767d0f292144884538c3d5669b568e4254e4ed75d9054f75229ac9d4ccd0b7c3c74a34f07b7657083b2aa76225c0c56ffc", "308201e53082014ea00302010202044e17e115300d06092a864886f70d01010505003037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f6964204465627567301e170d3131303730393035303331375a170d3431303730313035303331375a3037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f696420446562756730819f300d06092a864886f70d010101050003818d003081890281810096759fe5abea6a0757039b92adc68d672efa84732c3f959408e12efa264545c61f23141026a6d01eceeeaa13ec7087087e5894a3363da8bf5c69ed93657a6890738a80998e4ca22dc94848f30e2d0e1890000ae2cddf543b20c0c3828deca6c7944b5ecd21a9d18c988b2b3e54517dafbc34b48e801bb1321e0fa49e4d575d7f0203010001300d06092a864886f70d0101050500038181002b6d4b65bcfa6ec7bac97ae6d878064d47b3f9f8da654995b8ef4c385bc4fbfbb7a987f60783ef0348760c0708acd4b7e63f0235c35a4fbcd5ec41b3b4cb295feaa7d5c27fa562a02562b7e1f4776b85147be3e295714986c4a9a07183f48ea09ae4d3ea31b88d0016c65b93526b9c45f2967c3d28dee1aff5a5b29b9c2c8639"
    };
    public static final String EXTRA_ACCESS_SECRET = "ACCESS_SECRET";
    public static final String EXTRA_ACCESS_TOKEN = "ACCESS_TOKEN";
    public static final String EXTRA_ALREADY_AUTHED_UIDS = "ALREADY_AUTHED_UIDS";
    public static final String EXTRA_AUTH_STATE = "AUTH_STATE";
    public static final String EXTRA_CALLING_CLASS = "CALLING_CLASS";
    public static final String EXTRA_CALLING_PACKAGE = "CALLING_PACKAGE";
    public static final String EXTRA_CONSUMER_KEY = "CONSUMER_KEY";
    public static final String EXTRA_CONSUMER_SIG = "CONSUMER_SIG";
    public static final String EXTRA_DESIRED_UID = "DESIRED_UID";
    public static final String EXTRA_UID = "UID";
    private static final String SIS_KEY_AUTH_STATE_NONCE = "SIS_KEY_AUTH_STATE_NONCE";
    private static final String TAG = com/dropbox/client2/android/AuthActivity.getName();
    public static Intent result = null;
    private static String sAlreadyAuthedUids[];
    private static String sApiType;
    private static String sAppKey;
    private static String sAppSecret;
    private static String sDesiredUid;
    private static SecurityProvider sSecurityProvider = new _cls1();
    private static final Object sSecurityProviderLock = new Object();
    private static String sWebHost = "www.dropbox.com";
    private boolean mActivityDispatchHandlerPosted;
    private String mAlreadyAuthedUids[];
    private String mApiType;
    private String mAppKey;
    private String mAppSecret;
    private String mAuthStateNonce;
    private String mDesiredUid;
    private String mWebHost;

    public AuthActivity()
    {
        mAuthStateNonce = null;
        mActivityDispatchHandlerPosted = false;
    }

    private void authFinished(Intent intent)
    {
        result = intent;
        mAuthStateNonce = null;
        finish();
    }

    public static boolean checkAppBeforeAuth(Context context, String s, boolean flag)
    {
        Object obj = new Intent("android.intent.action.VIEW");
        s = (new StringBuilder("db-")).append(s).toString();
        ((Intent) (obj)).setData(Uri.parse((new StringBuilder()).append(s).append("://1/connect").toString()));
        obj = context.getPackageManager().queryIntentActivities(((Intent) (obj)), 0);
        if (obj == null || ((List) (obj)).size() == 0)
        {
            throw new IllegalStateException((new StringBuilder("URI scheme in your app's manifest is not set up correctly. You should have a ")).append(com/dropbox/client2/android/AuthActivity.getName()).append(" with the scheme: ").append(s).toString());
        }
        if (((List) (obj)).size() > 1)
        {
            if (flag)
            {
                context = new android.app.AlertDialog.Builder(context);
                context.setTitle("Security alert");
                context.setMessage("Another app on your phone may be trying to pose as the app you are currently using. The malicious app can't access your account, but linking to Dropbox has been disabled as a precaution. Please contact support@dropbox.com.");
                context.setPositiveButton("OK", new _cls2());
                context.show();
                return false;
            } else
            {
                Log.w(TAG, (new StringBuilder("There are multiple apps registered for the AuthActivity URI scheme (")).append(s).append(").  Another app may be trying to  impersonate this app, so authentication will be disabled.").toString());
                return false;
            }
        }
        obj = (ResolveInfo)((List) (obj)).get(0);
        if (obj == null || ((ResolveInfo) (obj)).activityInfo == null || !context.getPackageName().equals(((ResolveInfo) (obj)).activityInfo.packageName))
        {
            throw new IllegalStateException((new StringBuilder("There must be a ")).append(com/dropbox/client2/android/AuthActivity.getName()).append(" within your app's package registered for your URI scheme (").append(s).append("). However, it appears that an activity in a different package is registered for that scheme instead. If you have multiple apps that all want to use the same accesstoken pair, designate one of them to do authentication and have the other apps launch it and then retrieve the token pair from it.").toString());
        } else
        {
            return true;
        }
    }

    private String createStateNonce()
    {
        byte abyte0[] = new byte[16];
        getSecureRandom().nextBytes(abyte0);
        StringBuilder stringbuilder = new StringBuilder();
        if (mAppSecret == null)
        {
            stringbuilder.append("oauth2:");
        }
        for (int i = 0; i < 16; i++)
        {
            stringbuilder.append(String.format("%02x", new Object[] {
                Integer.valueOf(abyte0[i] & 0xff)
            }));
        }

        return stringbuilder.toString();
    }

    private String getConsumerSig()
    {
        if (mAppSecret == null)
        {
            return "";
        }
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("SHA-1");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new RuntimeException(nosuchalgorithmexception);
        }
        messagedigest.update(mAppSecret.getBytes(), 0, mAppSecret.length());
        return String.format("%1$040X", new Object[] {
            new BigInteger(1, messagedigest.digest())
        }).substring(32);
    }

    private static Intent getOfficialAuthIntent()
    {
        Intent intent = new Intent("com.dropbox.android.AUTHENTICATE_V2");
        intent.setPackage("com.dropbox.android");
        return intent;
    }

    private static SecureRandom getSecureRandom()
    {
        SecurityProvider securityprovider = getSecurityProvider();
        if (securityprovider != null)
        {
            return securityprovider.getSecureRandom();
        } else
        {
            return new SecureRandom();
        }
    }

    private static SecurityProvider getSecurityProvider()
    {
        SecurityProvider securityprovider;
        synchronized (sSecurityProviderLock)
        {
            securityprovider = sSecurityProvider;
        }
        return securityprovider;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean hasDropboxApp(Intent intent)
    {
        PackageManager packagemanager;
        List list;
        packagemanager = getPackageManager();
        list = packagemanager.queryIntentActivities(intent, 0);
        if (list != null && 1 == list.size()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((intent = packagemanager.resolveActivity(intent, 0)) != null)
        {
            int i;
            int k;
            try
            {
                intent = packagemanager.getPackageInfo(((ResolveInfo) (intent)).activityInfo.packageName, 64);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                return false;
            }
            intent = ((PackageInfo) (intent)).signatures;
            k = intent.length;
            i = 0;
            while (i < k) 
            {
                Signature signature = intent[i];
                String as[] = DROPBOX_APP_SIGNATURES;
                int l = as.length;
                for (int j = 0; j < l; j++)
                {
                    if (as[j].equals(signature.toCharsString()))
                    {
                        return true;
                    }
                }

                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static Intent makeIntent(Context context, String s, String s1, String s2, String s3)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("'appKey' can't be null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("'appSecret' can't be null");
        } else
        {
            setAuthParams(s, s1, null, null, s2, s3);
            return new Intent(context, com/dropbox/client2/android/AuthActivity);
        }
    }

    public static Intent makeOAuth2Intent(Context context, String s, String s1, String s2)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("'appKey' can't be null");
        } else
        {
            setAuthParams(s, null, null, null, s1, s2);
            return new Intent(context, com/dropbox/client2/android/AuthActivity);
        }
    }

    static void setAuthParams(String s, String s1, String s2, String as[])
    {
        setAuthParams(s, s1, s2, as, null, null);
    }

    static void setAuthParams(String s, String s1, String s2, String as[], String s3, String s4)
    {
        sAppKey = s;
        sAppSecret = s1;
        sDesiredUid = s2;
        if (as == null)
        {
            as = new String[0];
        }
        sAlreadyAuthedUids = as;
        if (s3 == null)
        {
            s3 = "www.dropbox.com";
        }
        sWebHost = s3;
        sApiType = s4;
    }

    public static void setSecurityProvider(SecurityProvider securityprovider)
    {
        synchronized (sSecurityProviderLock)
        {
            sSecurityProvider = securityprovider;
        }
        return;
        securityprovider;
        obj;
        JVM INSTR monitorexit ;
        throw securityprovider;
    }

    private void startWebAuth(String s)
    {
        Object obj = Locale.getDefault();
        String s1;
        String s2;
        String s3;
        String s4;
        if (mAlreadyAuthedUids.length > 0)
        {
            s1 = mAlreadyAuthedUids[0];
        } else
        {
            s1 = "0";
        }
        obj = (new StringBuilder()).append(((Locale) (obj)).getLanguage()).append("_").append(((Locale) (obj)).getCountry()).toString();
        s2 = mAppKey;
        s3 = getConsumerSig();
        s4 = mApiType;
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(RESTUtility.buildURL(mWebHost, 1, "/connect", new String[] {
            "locale", obj, "k", s2, "n", s1, "s", s3, "api", s4, 
            "state", s
        }))));
    }

    protected void onCreate(Bundle bundle)
    {
        if (bundle == null)
        {
            result = null;
            mAuthStateNonce = null;
            mAppKey = sAppKey;
            mAppSecret = sAppSecret;
            mWebHost = sWebHost;
            mApiType = sApiType;
            mDesiredUid = sDesiredUid;
            mAlreadyAuthedUids = sAlreadyAuthedUids;
        } else
        {
            mAuthStateNonce = bundle.getString("SIS_KEY_AUTH_STATE_NONCE");
        }
        setAuthParams(null, null, null, null);
        setTheme(0x1030010);
        super.onCreate(bundle);
    }

    protected void onNewIntent(Intent intent)
    {
        Object obj4;
        obj4 = null;
        if (mAuthStateNonce == null)
        {
            authFinished(null);
            return;
        }
        if (!intent.hasExtra("ACCESS_TOKEN")) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = intent.getStringExtra("ACCESS_TOKEN");
        obj1 = intent.getStringExtra("ACCESS_SECRET");
        obj = intent.getStringExtra("UID");
        intent = intent.getStringExtra("AUTH_STATE");
_L12:
        Object obj3 = obj4;
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        obj3 = obj4;
        if (((String) (obj2)).equals("")) goto _L4; else goto _L5
_L5:
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        obj3 = obj4;
        if (((String) (obj1)).equals("")) goto _L4; else goto _L7
_L7:
        obj3 = obj4;
        if (obj != null)
        {
            obj3 = obj4;
            if (!((String) (obj)).equals(""))
            {
                obj3 = obj4;
                if (intent != null)
                {
                    obj3 = obj4;
                    if (!intent.equals(""))
                    {
                        if (!mAuthStateNonce.equals(intent))
                        {
                            authFinished(null);
                            return;
                        }
                        obj3 = new Intent();
                        ((Intent) (obj3)).putExtra("ACCESS_TOKEN", ((String) (obj2)));
                        ((Intent) (obj3)).putExtra("ACCESS_SECRET", ((String) (obj1)));
                        ((Intent) (obj3)).putExtra("UID", ((String) (obj)));
                    }
                }
            }
        }
          goto _L4
_L2:
        obj2 = intent.getData();
        if (obj2 == null || !"/connect".equals(((Uri) (obj2)).getPath())) goto _L9; else goto _L8
_L8:
        obj1 = ((Uri) (obj2)).getQueryParameter("oauth_token");
        try
        {
            obj = ((Uri) (obj2)).getQueryParameter("oauth_token_secret");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            intent = ((Uri) (obj2)).getQueryParameter("uid");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent = null;
            continue; /* Loop/switch isn't completed */
        }
        obj3 = ((Uri) (obj2)).getQueryParameter("state");
        obj2 = obj1;
        obj1 = obj;
        obj = intent;
        intent = ((Intent) (obj3));
        continue; /* Loop/switch isn't completed */
        intent;
        intent = null;
        obj = null;
        obj1 = null;
_L10:
        obj2 = obj1;
        obj1 = obj;
        obj = intent;
        intent = null;
        continue; /* Loop/switch isn't completed */
_L4:
        authFinished(((Intent) (obj3)));
        return;
        obj2;
        if (true) goto _L10; else goto _L9
_L9:
        intent = null;
        obj = null;
        obj1 = null;
        obj2 = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected void onResume()
    {
        super.onResume();
        if (isFinishing())
        {
            return;
        }
        if (mAuthStateNonce != null || mAppKey == null)
        {
            authFinished(null);
            return;
        }
        result = null;
        if (mActivityDispatchHandlerPosted)
        {
            Log.w(TAG, "onResume called again before Handler run");
            return;
        } else
        {
            final String state = createStateNonce();
            final Intent officialAuthIntent = getOfficialAuthIntent();
            officialAuthIntent.putExtra("CONSUMER_KEY", mAppKey);
            officialAuthIntent.putExtra("CONSUMER_SIG", getConsumerSig());
            officialAuthIntent.putExtra("DESIRED_UID", mDesiredUid);
            officialAuthIntent.putExtra("ALREADY_AUTHED_UIDS", mAlreadyAuthedUids);
            officialAuthIntent.putExtra("CALLING_PACKAGE", getPackageName());
            officialAuthIntent.putExtra("CALLING_CLASS", getClass().getName());
            officialAuthIntent.putExtra("AUTH_STATE", state);
            (new Handler(Looper.getMainLooper())).post(new _cls3());
            mActivityDispatchHandlerPosted = true;
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("SIS_KEY_AUTH_STATE_NONCE", mAuthStateNonce);
    }






/*
    static String access$302(AuthActivity authactivity, String s)
    {
        authactivity.mAuthStateNonce = s;
        return s;
    }

*/

    private class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface.dismiss();
        }

        _cls2()
        {
        }
    }


    private class SecurityProvider
    {

        public abstract SecureRandom getSecureRandom();
    }


    private class _cls3
        implements Runnable
    {

        final AuthActivity this$0;
        final Intent val$officialAuthIntent;
        final String val$state;

        public void run()
        {
            AuthActivity.TAG;
            if (!hasDropboxApp(officialAuthIntent)) goto _L2; else goto _L1
_L1:
            startActivity(officialAuthIntent);
_L4:
            mAuthStateNonce = state;
            return;
_L2:
            try
            {
                startWebAuth(state);
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                Log.e(AuthActivity.TAG, "Could not launch intent. User may have restricted profile", activitynotfoundexception);
                finish();
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls3()
        {
            this$0 = AuthActivity.this;
            officialAuthIntent = intent;
            state = s;
            super();
        }
    }


    private class _cls1
        implements SecurityProvider
    {

        public final SecureRandom getSecureRandom()
        {
            return new SecureRandom();
        }

        _cls1()
        {
        }
    }

}
