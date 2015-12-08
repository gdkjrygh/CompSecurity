// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.PinterestDeepLinkMetaData;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.BusinessApi;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import java.lang.ref.WeakReference;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            BusinessSignupDialog, SignupDialog

public class SignupConfirmDialog extends BaseDialog
{

    private static final String BOARD_STRING = "/%s/";
    private static final String DIRECT_WRITE_THREAD = "DIRECT_WRITE_THREAD";
    public static final String KEY = "signup_confirm";
    private static final int LANDING_PAGE_DIRECT_WRITE_IN_PROGRESS = 1;
    private static final String LANDING_PAGE_DIRECT_WRITE_USER_STATE = "LANDING_PAGE_PINS_INJECTED";
    private static final long LANDING_PAGE_POLL_DELAY = 500L;
    private static final String PATH_KEY = "path";
    private static final String PIN_STRING = "/pin/%s/";
    private static final String TIMESTAMP_KEY = "ts";
    private static final long WAIT_FOR_HOMEFEED_WRITE_DURATION = 3000L;
    private WeakReference _activity;
    private Handler _directWriteHandler;
    private HandlerThread _directWriteThread;
    private boolean _partnerSignup;
    private com.pinterest.api.remote.AccountApi.SignupParams _signupParams;
    private BaseApiResponseHandler onEmailSignup;
    private com.pinterest.api.remote.MyUserApi.MyUserApiResponse onLoadMe;

    public SignupConfirmDialog()
    {
        _signupParams = new com.pinterest.api.remote.AccountApi.SignupParams();
        _partnerSignup = false;
        _directWriteThread = new HandlerThread("DIRECT_WRITE_THREAD");
        onEmailSignup = new _cls3(0x7f070342);
        onLoadMe = new _cls4(0x7f070342);
        _key = "signup_confirm";
    }

    private String getLandingPageData()
    {
        Object obj = PinterestDeepLinkMetaData.b();
        Object obj1 = new PinterestDeepLinkMetaData();
        obj1.getClass();
        obj = new com.pinterest.analytics.PinterestDeepLinkMetaData.MetaDataObject(((PinterestDeepLinkMetaData) (obj1)), ((PinterestJsonObject) (obj)));
        obj1 = new PinterestJsonArray();
        if (((com.pinterest.analytics.PinterestDeepLinkMetaData.MetaDataObject) (obj)).c())
        {
            PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
            pinterestjsonobject.b("path", String.format("/%s/", new Object[] {
                ((com.pinterest.analytics.PinterestDeepLinkMetaData.MetaDataObject) (obj)).d()
            }));
            pinterestjsonobject.a("ts", Integer.valueOf(0));
            ((PinterestJsonArray) (obj1)).a(pinterestjsonobject);
        }
        if (((com.pinterest.analytics.PinterestDeepLinkMetaData.MetaDataObject) (obj)).b())
        {
            PinterestJsonObject pinterestjsonobject1 = new PinterestJsonObject();
            pinterestjsonobject1.b("path", String.format("/pin/%s/", new Object[] {
                ((com.pinterest.analytics.PinterestDeepLinkMetaData.MetaDataObject) (obj)).e()
            }));
            pinterestjsonobject1.a("ts", Integer.valueOf(0));
            ((PinterestJsonArray) (obj1)).a(pinterestjsonobject1);
        }
        if (((PinterestJsonArray) (obj1)).a() > 0)
        {
            return ((PinterestJsonArray) (obj1)).toString();
        } else
        {
            return null;
        }
    }

    public void doEmailSignup()
    {
        StopWatch.get().start("signup_email");
        if (getPartnerSignup())
        {
            try
            {
                BusinessApi.a((com.pinterest.api.remote.BusinessApi.PartnerParams)_signupParams, onEmailSignup);
                return;
            }
            catch (Exception exception)
            {
                StopWatch.get().invalidate("signup_email");
                Events.post(new DialogEvent(new BusinessSignupDialog()));
                CrashReporting.a(exception);
                return;
            }
        }
        try
        {
            AccountApi.a(_signupParams, onEmailSignup);
            return;
        }
        catch (Exception exception1)
        {
            StopWatch.get().invalidate("signup_email");
            Events.post(new DialogEvent(new SignupDialog()));
            CrashReporting.a(exception1);
            return;
        }
    }

    public boolean getPartnerSignup()
    {
        return _partnerSignup;
    }

    public com.pinterest.api.remote.AccountApi.SignupParams getSignupParams()
    {
        return _signupParams;
    }

    public void make(LayoutInflater layoutinflater)
    {
        setTitle(0x7f0700dc);
        setSubTitle(0x7f07023b);
        super.make(layoutinflater);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        AnalyticsApi.a("signup_email_confirm");
        View view = LayoutInflater.from(activity).inflate(0x7f03007c, null);
        if (view == null)
        {
            return;
        }
        final EditText emailEt = (EditText)view.findViewById(0x7f0f0163);
        if (_signupParams != null && !TextUtils.isEmpty(_signupParams.c))
        {
            emailEt.setText(_signupParams.c);
        }
        emailEt.setSelected(false);
        setContent(view);
        setNegativeButton(0x7f0700af, new _cls1());
        setPositiveButton(0x7f070590, new _cls2());
        _activity = new WeakReference(activity);
    }

    public void setActivity(Activity activity)
    {
        _activity = new WeakReference(activity);
    }

    public void setPartnerSignup(boolean flag)
    {
        _partnerSignup = flag;
    }

    public void setSignupParams(com.pinterest.api.remote.AccountApi.SignupParams signupparams)
    {
        if (signupparams != null)
        {
            _signupParams = signupparams;
            if (!TextUtils.isEmpty(getLandingPageData()))
            {
                _signupParams.x = getLandingPageData();
            }
        }
    }





/*
    static WeakReference access$202(SignupConfirmDialog signupconfirmdialog, WeakReference weakreference)
    {
        signupconfirmdialog._activity = weakreference;
        return weakreference;
    }

*/




/*
    static Handler access$402(SignupConfirmDialog signupconfirmdialog, Handler handler)
    {
        signupconfirmdialog._directWriteHandler = handler;
        return handler;
    }

*/

    private class _cls3 extends ApiResponseHandler
    {

        final SignupConfirmDialog this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            StopWatch.get().invalidate("signup_email");
            int i;
            if (getPartnerSignup())
            {
                i = 6;
            } else
            {
                i = _signupParams.a();
            }
            Events.post(new DialogEvent(new SignupFailureDialog(throwable, apiresponse, i, _signupParams.u)));
        }

        public void onFinish()
        {
            ActivityHelper.setPostSignup(true);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            MyUser.setAccessToken((String)apiresponse.getData());
            if (getPartnerSignup())
            {
                apiresponse = "register_partner";
            } else
            {
                apiresponse = "register_email";
            }
            AnalyticsApi.a(apiresponse);
            (new DeepLinkLogging()).a(EventType.REFERRER_APP_SIGNUP);
            MyUserApi.a(onLoadMe, null);
        }

        _cls3(int i)
        {
            this$0 = SignupConfirmDialog.this;
            super(i);
        }
    }


    private class _cls4 extends com.pinterest.api.remote.MyUserApi.MyUserApiResponse
    {

        private ApiResponseHandler landingPageDirectWriteHandler;
        private Runnable landingPageWrittenRunnable;
        final SignupConfirmDialog this$0;

        private void goToHomeFeed()
        {
            _directWriteHandler.removeCallbacks(landingPageWrittenRunnable);
            _directWriteThread.quit();
            if (_activity != null)
            {
                ActivityHelper.goPostSignup((Activity)_activity.get());
                ((Activity)_activity.get()).finish();
                _activity = null;
            }
            Events.post(new DialogEvent(null));
            SignupDialogView.onSignupSuccess();
            BusinessSignupDialogView.onSignupSuccess();
        }

        private void pollLandingPageDirectWrite()
        {
            _directWriteHandler.postDelayed(landingPageWrittenRunnable, 500L);
        }

        public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
        {
            StopWatch.get().invalidate("signup_email");
            Events.post(new DialogEvent(new SignupDialog()));
            if (throwable instanceof IOException)
            {
                Application.showNoInternetToast();
            } else
            if (pinterestjsonobject != null)
            {
                Application.showToast(pinterestjsonobject.a("error", Resources.string(0x7f070350)), 0x7f020173);
            } else
            {
                Application.showToast(0x7f070350, 0x7f020173);
            }
            _activity = null;
        }

        public void onFinish()
        {
        }

        public void onSuccess(User user)
        {
            super.onSuccess(user);
            PWidgetHelper.notifyWidgetStateChange(Application.context());
            if (_activity != null)
            {
                user = (Activity)_activity.get();
            } else
            {
                user = null;
            }
            if (user != null)
            {
                _directWriteThread.start();
                _directWriteHandler = new Handler(_directWriteThread.getLooper());
                pollLandingPageDirectWrite();
                class _cls1
                    implements Runnable
                {

                    final _cls4 this$1;

                    public void run()
                    {
                        goToHomeFeed();
                    }

                _cls1()
                {
                    this$1 = _cls4.this;
                    super();
                }
                }

                _directWriteHandler.postDelayed(new _cls1(), 3000L);
                return;
            } else
            {
                Events.post(new DialogEvent(null));
                SignupDialogView.onSignupSuccess();
                BusinessSignupDialogView.onSignupSuccess();
                return;
            }
        }




        _cls4(int i)
        {
            this$0 = SignupConfirmDialog.this;
            super(i);
            class _cls2 extends ApiResponseHandler
            {

                final _cls4 this$1;

                public void onFailure(Throwable throwable, ApiResponse apiresponse)
                {
                    super.onFailure(throwable, apiresponse);
                    goToHomeFeed();
                }

                public void onSuccess(ApiResponse apiresponse)
                {
                    if ("1".equals(apiresponse.getData()))
                    {
                        pollLandingPageDirectWrite();
                        return;
                    } else
                    {
                        goToHomeFeed();
                        return;
                    }
                }

                _cls2()
                {
                    this$1 = _cls4.this;
                    super();
                }
            }

            landingPageDirectWriteHandler = new _cls2();
            class _cls3
                implements Runnable
            {

                final _cls4 this$1;

                public void run()
                {
                    MyUserApi.a("LANDING_PAGE_PINS_INJECTED", landingPageDirectWriteHandler);
                }

                _cls3()
                {
                    this$1 = _cls4.this;
                    super();
                }
            }

            landingPageWrittenRunnable = new _cls3();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SignupConfirmDialog this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.CANCEL_BUTTON);
            if (getPartnerSignup())
            {
                view = new BusinessSignupDialog();
            } else
            {
                view = new SignupDialog();
            }
            Events.post(new DialogEvent(view));
        }

        _cls1()
        {
            this$0 = SignupConfirmDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final SignupConfirmDialog this$0;
        final EditText val$emailEt;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.DONE_BUTTON);
            AnalyticsApi.a("email_signup_step_3_complete");
            view = emailEt.getText().toString();
            if (_signupParams != null && SignupFormUtils.isEmailValid(view))
            {
                _signupParams.c = view;
                doEmailSignup();
                return;
            } else
            {
                Application.showToast(0x7f070531);
                return;
            }
        }

        _cls2()
        {
            this$0 = SignupConfirmDialog.this;
            emailEt = edittext;
            super();
        }
    }

}
