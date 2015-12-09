// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.dominos.activities.BaseActivity;

// Referenced classes of package com.dominos.utils:
//            ActivityHelper, AlertType

public final class ActivityHelper_ extends ActivityHelper
{

    private Context context_;
    private Handler handler_;

    private ActivityHelper_(Context context)
    {
        handler_ = new Handler(Looper.getMainLooper());
        context_ = context;
        init_();
    }

    public static ActivityHelper_ getInstance_(Context context)
    {
        return new ActivityHelper_(context);
    }

    private void init_()
    {
        if (context_ instanceof BaseActivity)
        {
            mActivity = (BaseActivity)context_;
            return;
        } else
        {
            Log.w("ActivityHelper_", (new StringBuilder("Due to Context class ")).append(context_.getClass().getSimpleName()).append(", the @RootContext BaseActivity won't be populated").toString());
            return;
        }
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }

    public final void showAlert(final AlertType alertType, final String extras, final String prompt, final String domCommands[], final ActivityHelper.AlertActionCallback callback)
    {
        handler_.post(new _cls2());
    }

    public final void showOptionDialog(final String title, final String message, final String positiveButtonText, final String negativeButtonText, final String neutralButtonText, final String domCommands[], final ActivityHelper.OptionAlertActionCallback callback)
    {
        handler_.post(new _cls1());
    }

    public final void showToast(final String msg, final int length)
    {
        handler_.post(new _cls3());
    }




    private class _cls2
        implements Runnable
    {

        final ActivityHelper_ this$0;
        final AlertType val$alertType;
        final ActivityHelper.AlertActionCallback val$callback;
        final String val$domCommands[];
        final String val$extras;
        final String val$prompt;

        public void run()
        {
            showAlert(alertType, extras, prompt, domCommands, callback);
        }

        _cls2()
        {
            this$0 = ActivityHelper_.this;
            alertType = alerttype;
            extras = s;
            prompt = s1;
            domCommands = as;
            callback = alertactioncallback;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final ActivityHelper_ this$0;
        final ActivityHelper.OptionAlertActionCallback val$callback;
        final String val$domCommands[];
        final String val$message;
        final String val$negativeButtonText;
        final String val$neutralButtonText;
        final String val$positiveButtonText;
        final String val$title;

        public void run()
        {
            showOptionDialog(title, message, positiveButtonText, negativeButtonText, neutralButtonText, domCommands, callback);
        }

        _cls1()
        {
            this$0 = ActivityHelper_.this;
            title = s;
            message = s1;
            positiveButtonText = s2;
            negativeButtonText = s3;
            neutralButtonText = s4;
            domCommands = as;
            callback = optionalertactioncallback;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final ActivityHelper_ this$0;
        final int val$length;
        final String val$msg;

        public void run()
        {
            showToast(msg, length);
        }

        _cls3()
        {
            this$0 = ActivityHelper_.this;
            msg = s;
            length = i;
            super();
        }
    }

}
