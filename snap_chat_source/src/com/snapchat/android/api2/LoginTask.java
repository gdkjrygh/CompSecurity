// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;

import Br;
import Bt;
import CJ;
import IC;
import II;
import IJ;
import IK;
import IN;
import IO;
import KO;
import Mf;
import Ow;
import PE;
import PG;
import Qd;
import RJ;
import RK;
import Ti;
import UT;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.security.SCPluginWrapper;
import com.snapchat.android.util.crypto.DeviceToken;
import com.snapchat.android.util.crypto.DeviceTokenManager;
import com.snapchat.android.util.debug.ScApplicationInfo;
import com.squareup.otto.Bus;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.inject.Provider;
import kr;
import mB;
import oD;
import oO;
import oS;
import org.apache.commons.lang3.StringUtils;
import pi;
import pn;

public class LoginTask extends oD
    implements oS.a
{
    public static interface a
    {

        public abstract void R_();

        public abstract void a();

        public abstract void a(int i, String s);

        public abstract void a(RK rk);

        public abstract void b(RK rk);

        public abstract void c();
    }

    public static final class b extends RJ
    {

        b()
        {
            oS.buildStaticAuthPayload(this);
        }
    }


    static final boolean $assertionsDisabled;
    private static final String IO_EXCEPTION = "ie";
    static final int MAX_RETRIES = 3;
    protected static final String PATH = "/loq/login";
    private static final int ROOT_FLAG = 1;
    public static final int SC_LOGIN_FAILED_CANNOT_FIND_ACCOUNT_CODE = -101;
    public static final int SC_LOGIN_FAILED_INVALID_PASSWORD_CODE = -100;
    public static final int SC_LOGIN_FAILED_UNKNOWN_ERROR = 0x7ffffffa;
    private static final String TAG = "LoginTask";
    public static int b044C044C044C044C044C044C = 2;
    public static int b044C044C044C044C044C044C = 0;
    public static int b044C044C044C044C044C044C = 1;
    public static int b044C044C044C044C044C044C = 20;
    private final Bus mBus;
    private final DeviceTokenManager mDeviceTokenManager;
    private final ExecutorService mExecutorService;
    private final kr mGoogleAuthManager;
    private final GoogleCloudMessaging mGoogleCloudMessage;
    private final Handler mHandler;
    private final a mLoginCallback;
    protected final String mLoginName;
    private int mNumRetries;
    private final String mPassword;
    private String mPreAuthToken;
    private long mRetryMillis;
    private final IN mRetryUtil;
    private final PE mRootDetector;
    private final mB mScreenParameterProvider;
    private final KO mSlightlySecurePreferences;
    private final Bt mUserPrefs;
    private final Provider mUserProvider;

    public LoginTask(String s, String s1, a a1, String s2, KO ko, Provider provider)
    {
        this(s, s1, a1, s2, DeviceTokenManager.getInstance(), mB.a(), GoogleCloudMessaging.getInstance(SnapchatApplication.get().getApplicationContext()), kr.a(), new IN(), IO.NETWORK_EXECUTOR, PE.a(), new Handler(Looper.getMainLooper()), ko, Mf.a(), provider, Bt.a());
    }

    protected LoginTask(String s, String s1, a a1, String s2, DeviceTokenManager devicetokenmanager, mB mb, GoogleCloudMessaging googlecloudmessaging, 
            kr kr1, IN in, ExecutorService executorservice, PE pe, Handler handler, KO ko, Bus bus, 
            Provider provider, Bt bt)
    {
        mNumRetries = 0;
        mRetryMillis = 500L;
        mLoginName = s;
        mPassword = s1;
        mLoginCallback = a1;
        mPreAuthToken = s2;
        mDeviceTokenManager = devicetokenmanager;
        mScreenParameterProvider = mb;
        mGoogleCloudMessage = googlecloudmessaging;
        mGoogleAuthManager = kr1;
        mRetryUtil = in;
        mExecutorService = executorservice;
        mRootDetector = pe;
        mHandler = handler;
        mSlightlySecurePreferences = ko;
        mBus = bus;
        mUserProvider = provider;
        mUserPrefs = bt;
        registerCallback(RK, this);
    }

    public static int b044C044C044C044C044C044C()
    {
        return 0;
    }

    public static int b044C044C044C044C044C044C()
    {
        return 8;
    }

    private void onLoginUsernameNeeded(RK rk)
    {
        saveLoginNameAndPurgePrefsIfDifferentUser();
        Bt.a(rk.d());
        Br br = (Br)mUserProvider.get();
        if (br != null)
        {
            br.i();
        }
        saveDeviceTokenIfServerProvided(rk.p(), rk.q());
    }

    private void onLoginVerificationNeeded(RK rk, String s)
    {
        boolean flag1 = true;
        saveLoginNameAndPurgePrefsIfDifferentUser();
        Bt.a(rk.d());
        Bt.b(s);
        s = (Br)mUserProvider.get();
        if (s != null)
        {
            s.i();
        }
        saveDeviceTokenIfServerProvided(rk.p(), rk.q());
        boolean flag;
        if (rk.y() && rk.x().a() == UT.a.NEEDS_PHONE_VERIFIED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Bt.c(flag);
        if (rk.y() && rk.x().a() == UT.a.NEEDS_CAPTCHA)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Bt.d(flag);
    }

    private void saveDeviceTokenIfServerProvided(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            mDeviceTokenManager.onGetDeviceTokenTaskCompleted(new DeviceToken(s, s1));
        }
    }

    private void saveLoginNameAndPurgePrefsIfDifferentUser()
    {
        String s = II.a(SharedPreferenceKey.LAST_SUCCESSFUL_LOGIN_USERNAME.getKey());
        II.a(SharedPreferenceKey.LAST_SUCCESSFUL_LOGIN_USERNAME.getKey(), mLoginName);
        if (!TextUtils.equals(s, mLoginName))
        {
            mSlightlySecurePreferences.e();
        }
    }

    public pi executeSynchronously()
    {
        EasyMetric easymetric = new EasyMetric("LOGIN_LATENCY");
        easymetric.b();
        pi pi1 = super.executeSynchronously();
        easymetric.b(true);
        return pi1;
    }

    protected String getGcmRegistrationId()
    {
        android.content.Context context = SnapchatApplication.get().getApplicationContext();
        String s;
        try
        {
            s = (String)mRetryUtil.a(new Callable() {

                final LoginTask this$0;

                public final Object call()
                {
                    return mGoogleCloudMessage.register(new String[] {
                        "191410808405"
                    });
                }

            
            {
                this$0 = LoginTask.this;
                super();
            }
            }).call();
            CJ.a(context, s);
            Timber.c("LoginTask", (new StringBuilder("GcmRegistrationId: ")).append(s).toString(), new Object[0]);
        }
        catch (Exception exception)
        {
            Timber.e("LoginTask", (new StringBuilder("getGcmRegistrationId IOException: ")).append(exception.getMessage()).toString(), new Object[0]);
            return "ie";
        }
        return s;
    }

    public Map getHeaders(pn pn)
    {
        Map map;
        int i;
        try
        {
            map = super.getHeaders(pn);
            pn = (oO)pn;
        }
        // Misplaced declaration of an exception variable
        catch (pn pn)
        {
            throw pn;
        }
        if (((b044C044C044C044C044C044C + b044C044C044C044C044C044C) * b044C044C044C044C044C044C) % b044C044C044C044C044C044C != b044C044C044C044C044C044C())
        {
            b044C044C044C044C044C044C = 49;
            b044C044C044C044C044C044C = b044C044C044C044C044C044C();
        }
        try
        {
            pn = SCPluginWrapper.generateHeader(((oO) (pn)).mPayload, "/loq/login");
        }
        // Misplaced declaration of an exception variable
        catch (pn pn)
        {
            throw pn;
        }
        if (pn == null) goto _L2; else goto _L1
_L1:
        if (((b044C044C044C044C044C044C + b044C044C044C044C044C044C) * b044C044C044C044C044C044C) % b044C044C044C044C044C044C != b044C044C044C044C044C044C)
        {
label0:
            do
            {
                switch (1)
                {
                default:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
            b044C044C044C044C044C044C = b044C044C044C044C044C044C();
            b044C044C044C044C044C044C = 38;
            i = b044C044C044C044C044C044C;
            switch ((i * (b044C044C044C044C044C044C + i)) % b044C044C044C044C044C044C)
            {
            default:
                b044C044C044C044C044C044C = b044C044C044C044C044C044C();
                b044C044C044C044C044C044C = 52;
                break;

            case 0: // '\0'
                break;
            }
        }
_L4:
        1;
        JVM INSTR tableswitch 0 1: default 208
    //                   0 183
    //                   1 267;
           goto _L3 _L4 _L5
_L3:
        if (((b044C044C044C044C044C044C + b044C044C044C044C044C044C) * b044C044C044C044C044C044C) % b044C044C044C044C044C044C != b044C044C044C044C044C044C)
        {
            b044C044C044C044C044C044C = 68;
            b044C044C044C044C044C044C = b044C044C044C044C044C044C();
        }
        1;
        JVM INSTR tableswitch 0 1: default 264
    //                   0 183
    //                   1 267;
           goto _L3 _L4 _L5
_L5:
        map.put("X-Snapchat-Client-Auth", pn);
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (pn pn) { }
_L2:
        return map;
    }

    protected String getPath()
    {
        return "/loq/login";
    }

    public b getPayload()
    {
        final b payload;
        payload = new b();
        if (!$assertionsDisabled && (((Qd) (payload)).timestamp == null || ((Qd) (payload)).reqToken == null))
        {
            throw new AssertionError();
        }
        payload.g(ScApplicationInfo.a());
        payload.username = mLoginName;
        payload.b(mPassword);
        payload.a(mPreAuthToken);
        payload.c(getGcmRegistrationId());
        Future future = mExecutorService.submit(new Callable() {

            final LoginTask this$0;
            final b val$payload;

            public final Object call()
            {
                return mGoogleAuthManager.a(new String[] {
                    mLoginName, mPassword, ((Qd) (payload)).timestamp, "/loq/login"
                });
            }

            
            {
                this$0 = LoginTask.this;
                payload = b1;
                super();
            }
        });
        DeviceToken devicetoken = mDeviceTokenManager.getDeviceToken1(false);
        if (devicetoken != null && devicetoken.getId() != null && devicetoken.getValue() != null)
        {
            payload.d(devicetoken.getId());
            payload.e(mDeviceTokenManager.getDeviceSignature(devicetoken, mLoginName, mPassword, ((Qd) (payload)).timestamp, ((Qd) (payload)).reqToken));
        } else
        {
            payload.f("1");
        }
        payload.h((String)future.get());
_L1:
        PG.a(new Runnable() {

            final LoginTask this$0;

            public final void run()
            {
                mLoginCallback.a();
            }

            
            {
                this$0 = LoginTask.this;
                super();
            }
        });
        payload.a(Integer.valueOf(mScreenParameterProvider.mResolution.b()));
        payload.b(Integer.valueOf(mScreenParameterProvider.mResolution.a()));
        payload.c(Integer.valueOf(mScreenParameterProvider.mMaxVideoHeight));
        payload.d(Integer.valueOf(mScreenParameterProvider.mMaxVideoWidth));
        payload.b(Float.valueOf(mScreenParameterProvider.mScreenFullHeightIn));
        payload.a(Float.valueOf(mScreenParameterProvider.mScreenFullWidthIn));
        payload.f(Integer.valueOf(mScreenParameterProvider.mScreenFullHeightPx));
        payload.e(Integer.valueOf(mScreenParameterProvider.mScreenFullWidthPx));
        Object obj;
        int i;
        if (PE.b() || PE.c() || PE.d() || PE.e())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        payload.i(Integer.toString(i));
        return payload;
        obj;
_L2:
        Timber.e("LoginTask", (new StringBuilder("getAttestation exception: ")).append(((Exception) (obj)).getMessage()).toString(), new Object[0]);
        payload.h("ie");
          goto _L1
        obj;
          goto _L2
    }

    public pn getRequestPayload()
    {
        return new oO(getPayload());
    }

    public void onJsonResult(final RK responsePayload, final pi networkResult)
    {
        PG.a(new Runnable() {

            final LoginTask this$0;
            final pi val$networkResult;
            final RK val$responsePayload;

            public final void run()
            {
                onJsonResultMainThread(responsePayload, networkResult);
            }

            
            {
                this$0 = LoginTask.this;
                responsePayload = rk;
                networkResult = pi1;
                super();
            }
        });
    }

    public volatile void onJsonResult(Object obj, pi pi1)
    {
        onJsonResult((RK)obj, pi1);
    }

    void onJsonResultMainThread(RK rk, pi pi1)
    {
        if (rk == null)
        {
            rk = IC.a(null, 0x7f0801fb, new Object[0]);
            mLoginCallback.a(pi1.mResponseCode, rk);
            return;
        }
        if (!StringUtils.isEmpty(rk.n()))
        {
            mLoginCallback.a(IJ.a(rk.o()), rk.n());
            return;
        }
        if (rk.e() && TextUtils.isEmpty(rk.d().p()))
        {
            onLoginUsernameNeeded(rk);
            mLoginCallback.R_();
            return;
        }
        if (rk.e() && rk.y())
        {
            onLoginVerificationNeeded(rk, rk.d().p());
            mLoginCallback.c();
            return;
        }
        if (IJ.a(rk.r()))
        {
            Bt.b(rk.s());
            Bt.x(rk.t());
            mLoginCallback.a(rk);
            return;
        } else
        {
            onLoginSuccess(rk);
            mLoginCallback.b(rk);
            return;
        }
    }

    protected void onLoginSuccess(RK rk)
    {
        if (rk.m())
        {
            mUserPrefs.a(rk.l());
        }
        saveLoginNameAndPurgePrefsIfDifferentUser();
        Bt.e(false);
        Br br = (Br)mUserProvider.get();
        if (br != null)
        {
            br.a(rk, true, mRequestStartTimeMillis);
            br.i();
        }
        saveDeviceTokenIfServerProvided(rk.p(), rk.q());
        Bt.E();
        AnalyticsEvents.l();
        mBus.a(new Ow(mUUID, true, true, new Br.a(true, true, true, true)));
    }

    public void onResult(pi pi1)
    {
        if (pi1.mResponseCode != 401) goto _L2; else goto _L1
_L1:
        int i;
        i = mNumRetries;
        mNumRetries = i + 1;
        if (i >= 3) goto _L2; else goto _L3
_L3:
        boolean flag;
        flag = true;
        Timber.d("LoginTask", "Retry login after receiving SC_UNAUTHORIZED result.", new Object[0]);
        mHandler.postDelayed(new Runnable() {

            final LoginTask this$0;

            public final void run()
            {
                mRetryMillis = mRetryMillis << 1;
                execute();
            }

            
            {
                this$0 = LoginTask.this;
                super();
            }
        }, mRetryMillis);
_L5:
        if (!flag)
        {
            super.onResult(pi1);
        }
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        boolean flag;
        if (!com/snapchat/android/api2/LoginTask.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }







/*
    static long access$402(LoginTask logintask, long l)
    {
        logintask.mRetryMillis = l;
        return l;
    }

*/
}
