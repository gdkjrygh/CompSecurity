// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.appwidget.PWidgetHelper;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;
import java.io.IOException;
import java.lang.ref.WeakReference;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            SignupConfirmDialog, SignupDialogView, BusinessSignupDialogView, SignupDialog

class _cls3 extends com.pinterest.api.remote.ponse
{

    private ApiResponseHandler landingPageDirectWriteHandler;
    private Runnable landingPageWrittenRunnable;
    final SignupConfirmDialog this$0;

    private void goToHomeFeed()
    {
        SignupConfirmDialog.access$400(SignupConfirmDialog.this).removeCallbacks(landingPageWrittenRunnable);
        SignupConfirmDialog.access$300(SignupConfirmDialog.this).quit();
        if (SignupConfirmDialog.access$200(SignupConfirmDialog.this) != null)
        {
            ActivityHelper.goPostSignup((Activity)SignupConfirmDialog.access$200(SignupConfirmDialog.this).get());
            ((Activity)SignupConfirmDialog.access$200(SignupConfirmDialog.this).get()).finish();
            SignupConfirmDialog.access$202(SignupConfirmDialog.this, null);
        }
        Events.post(new DialogEvent(null));
        SignupDialogView.onSignupSuccess();
        BusinessSignupDialogView.onSignupSuccess();
    }

    private void pollLandingPageDirectWrite()
    {
        SignupConfirmDialog.access$400(SignupConfirmDialog.this).postDelayed(landingPageWrittenRunnable, 500L);
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
        SignupConfirmDialog.access$202(SignupConfirmDialog.this, null);
    }

    public void onFinish()
    {
    }

    public void onSuccess(User user)
    {
        super.onSuccess(user);
        PWidgetHelper.notifyWidgetStateChange(Application.context());
        if (SignupConfirmDialog.access$200(SignupConfirmDialog.this) != null)
        {
            user = (Activity)SignupConfirmDialog.access$200(SignupConfirmDialog.this).get();
        } else
        {
            user = null;
        }
        if (user != null)
        {
            SignupConfirmDialog.access$300(SignupConfirmDialog.this).start();
            SignupConfirmDialog.access$402(SignupConfirmDialog.this, new Handler(SignupConfirmDialog.access$300(SignupConfirmDialog.this).getLooper()));
            pollLandingPageDirectWrite();
            class _cls1
                implements Runnable
            {

                final SignupConfirmDialog._cls4 this$1;

                public void run()
                {
                    goToHomeFeed();
                }

            _cls1()
            {
                this$1 = SignupConfirmDialog._cls4.this;
                super();
            }
            }

            SignupConfirmDialog.access$400(SignupConfirmDialog.this).postDelayed(new _cls1(), 3000L);
            return;
        } else
        {
            Events.post(new DialogEvent(null));
            SignupDialogView.onSignupSuccess();
            BusinessSignupDialogView.onSignupSuccess();
            return;
        }
    }




    _cls3.this._cls1(int i)
    {
        this$0 = SignupConfirmDialog.this;
        super(i);
        class _cls2 extends ApiResponseHandler
        {

            final SignupConfirmDialog._cls4 this$1;

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
                this$1 = SignupConfirmDialog._cls4.this;
                super();
            }
        }

        landingPageDirectWriteHandler = new _cls2();
        class _cls3
            implements Runnable
        {

            final SignupConfirmDialog._cls4 this$1;

            public void run()
            {
                MyUserApi.a("LANDING_PAGE_PINS_INJECTED", landingPageDirectWriteHandler);
            }

            _cls3()
            {
                this$1 = SignupConfirmDialog._cls4.this;
                super();
            }
        }

        landingPageWrittenRunnable = new _cls3();
    }
}
