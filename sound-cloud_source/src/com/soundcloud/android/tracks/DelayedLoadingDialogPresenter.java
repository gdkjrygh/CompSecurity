// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

// Referenced classes of package com.soundcloud.android.tracks:
//            LoadingAnimationView

public class DelayedLoadingDialogPresenter
{
    public static class Builder
    {

        private String loadingMessage;
        private android.content.DialogInterface.OnCancelListener onCancelListener;
        private String onErrorToastText;

        public DelayedLoadingDialogPresenter create()
        {
            return new DelayedLoadingDialogPresenter(loadingMessage, onErrorToastText, onCancelListener);
        }

        public Builder setLoadingMessage(String s)
        {
            loadingMessage = s;
            return this;
        }

        public Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener oncancellistener)
        {
            onCancelListener = oncancellistener;
            return this;
        }

        public Builder setOnErrorToastText(String s)
        {
            onErrorToastText = s;
            return this;
        }

        Builder()
        {
        }
    }

    private class DismissDialogRunnable
        implements Runnable
    {

        final DelayedLoadingDialogPresenter this$0;

        public void run()
        {
            loadingAnimationView.stop();
            dialog.dismiss();
            dialog = null;
        }

        private DismissDialogRunnable()
        {
            this$0 = DelayedLoadingDialogPresenter.this;
            super();
        }

        DismissDialogRunnable(_cls1 _pcls1)
        {
            this();
        }
    }

    private class ErrorDialogRunnable
        implements Runnable
    {

        private final Context context;
        final DelayedLoadingDialogPresenter this$0;

        public void run()
        {
            loadingAnimationView.stop();
            dialog.dismiss();
            dialog = null;
            Toast.makeText(context, onErrorToastText, 0).show();
        }

        private ErrorDialogRunnable(Context context1)
        {
            this$0 = DelayedLoadingDialogPresenter.this;
            super();
            context = context1;
        }

        ErrorDialogRunnable(Context context1, _cls1 _pcls1)
        {
            this(context1);
        }
    }

    private class ShowDialogRunnable
        implements Runnable
    {

        final DelayedLoadingDialogPresenter this$0;

        public void run()
        {
            timeWhenShown = System.currentTimeMillis();
            dialog.show();
            loadingAnimationView.start();
        }

        private ShowDialogRunnable()
        {
            this$0 = DelayedLoadingDialogPresenter.this;
            super();
        }

        ShowDialogRunnable(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final int MIN_TIME_ON_SCREEN = 1000;
    private static final int TIME_BEFORE_SHOWING_LOADING = 800;
    private AlertDialog dialog;
    private final Handler handler = new Handler();
    private LoadingAnimationView loadingAnimationView;
    private final String loadingMessage;
    private final android.content.DialogInterface.OnCancelListener onCancelListener;
    private final String onErrorToastText;
    private long timeWhenShown;

    DelayedLoadingDialogPresenter(String s, String s1, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        loadingMessage = s;
        onErrorToastText = s1;
        onCancelListener = oncancellistener;
    }

    private void cancelDelayedPresentation()
    {
        handler.removeCallbacksAndMessages(null);
    }

    private void delayPresentation(Runnable runnable, long l)
    {
        cancelDelayedPresentation();
        handler.postDelayed(runnable, l);
    }

    private long getRemainingTimeOnScreen()
    {
        return 1000L - (System.currentTimeMillis() - timeWhenShown);
    }

    public void onError(Context context)
    {
        delayPresentation(new ErrorDialogRunnable(context, null), getRemainingTimeOnScreen());
    }

    public void onSuccess()
    {
        delayPresentation(new DismissDialogRunnable(null), getRemainingTimeOnScreen());
    }

    public DelayedLoadingDialogPresenter show(Context context)
    {
        View view = View.inflate(context, 0x7f030060, null);
        loadingAnimationView = (LoadingAnimationView)view.findViewById(0x7f0f0161);
        ((TextView)view.findViewById(0x7f0f0162)).setText(loadingMessage);
        dialog = (new android.app.AlertDialog.Builder(context)).setOnCancelListener(new _cls1()).setView(view).create();
        delayPresentation(new ShowDialogRunnable(null), 800L);
        return this;
    }




/*
    static long access$502(DelayedLoadingDialogPresenter delayedloadingdialogpresenter, long l)
    {
        delayedloadingdialogpresenter.timeWhenShown = l;
        return l;
    }

*/



/*
    static AlertDialog access$602(DelayedLoadingDialogPresenter delayedloadingdialogpresenter, AlertDialog alertdialog)
    {
        delayedloadingdialogpresenter.dialog = alertdialog;
        return alertdialog;
    }

*/



    private class _cls1
        implements android.content.DialogInterface.OnCancelListener
    {

        final DelayedLoadingDialogPresenter this$0;

        public void onCancel(DialogInterface dialoginterface)
        {
            cancelDelayedPresentation();
            onCancelListener.onCancel(dialoginterface);
        }

        _cls1()
        {
            this$0 = DelayedLoadingDialogPresenter.this;
            super();
        }
    }

}
