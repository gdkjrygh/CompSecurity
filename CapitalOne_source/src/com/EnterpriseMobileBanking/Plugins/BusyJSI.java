// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Utils.Log;

public class BusyJSI
{

    private static final String TAG = "BusyJSI";
    private static Runnable hideTask = new Runnable() {

        public void run()
        {
            BusyJSI.forceHide();
        }

    };
    private static ProgressDialog spinner = null;
    private static boolean waitingToHide = false;

    public BusyJSI()
    {
        buildSpinner();
    }

    private void buildSpinner()
    {
        if (spinner == null)
        {
            Log.d("BusyJSI", "Building Spinner");
            spinner = new ProgressDialog(AppHelper.getAppView().getContext());
            spinner.setIndeterminate(true);
            spinner.setCancelable(true);
            spinner.setCanceledOnTouchOutside(false);
            spinner.setMessage(AppHelper.getAppView().getContext().getString(0x7f0900f9));
        }
    }

    public static void forceHide()
    {
        com/EnterpriseMobileBanking/Plugins/BusyJSI;
        JVM INSTR monitorenter ;
        Log.d("BusyJSI", "forceHide");
        if (spinner.isShowing())
        {
            AppHelper.runOnUiThread(new Runnable() {

                public void run()
                {
                    BusyJSI.spinner.setOnCancelListener(null);
                    BusyJSI.spinner.hide();
                }

            });
            waitingToHide = false;
        }
        com/EnterpriseMobileBanking/Plugins/BusyJSI;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void forceShow()
    {
        com/EnterpriseMobileBanking/Plugins/BusyJSI;
        JVM INSTR monitorenter ;
        forceShow(true);
        com/EnterpriseMobileBanking/Plugins/BusyJSI;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void forceShow(boolean flag)
    {
        com/EnterpriseMobileBanking/Plugins/BusyJSI;
        JVM INSTR monitorenter ;
        Log.d("BusyJSI", (new StringBuilder()).append("forceShow Cancelable:").append(flag).toString());
        AppHelper.getAppView().removeCallbacks(hideTask);
        waitingToHide = false;
        spinner.setCancelable(flag);
        AppHelper.runOnUiThread(new Runnable() {

            public void run()
            {
                BusyJSI.spinner.show();
            }

        });
        Thread.yield();
        com/EnterpriseMobileBanking/Plugins/BusyJSI;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void hide()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("BusyJSI", "hide called");
        if (!waitingToHide)
        {
            AppHelper.getAppView().postDelayed(hideTask, 200L);
            waitingToHide = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isVisible()
    {
        return spinner.isShowing();
    }

    public void setOnCancelListener(final android.content.DialogInterface.OnCancelListener onCancelListener)
    {
        if (onCancelListener != null)
        {
            spinner.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final BusyJSI this$0;
                final android.content.DialogInterface.OnCancelListener val$onCancelListener;

                public void onCancel(DialogInterface dialoginterface)
                {
                    BusyJSI.spinner.setOnCancelListener(null);
                    onCancelListener.onCancel(dialoginterface);
                }

            
            {
                this$0 = BusyJSI.this;
                onCancelListener = oncancellistener;
                super();
            }
            });
            return;
        } else
        {
            spinner.setOnCancelListener(null);
            return;
        }
    }

    public void show()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("BusyJSI", "Show called");
        worklightShow();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void show(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("BusyJSI", (new StringBuilder()).append("Show called with ").append(flag).toString());
        forceShow(flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void worklightHide()
    {
        Log.d("BusyJSI", "worklightHide");
        forceHide();
    }

    public void worklightShow()
    {
        Log.d("BusyJSI", "worklightShow");
        forceShow();
    }


}
