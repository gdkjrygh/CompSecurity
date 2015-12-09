// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.EnterpriseMobileBanking.Utils.Log;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            BusyIndicatorCallback

public class COFBusy
{

    private static final String TAG = "COFBusy";
    private boolean bCanceled;
    private Runnable hideTask;
    private Activity mActivity;
    private ImageButton mCancelButton;
    private BusyIndicatorCallback mCancelCallback;
    private int mCancelTimeoutSecs;
    private boolean mCancelable;
    private View mCurrentView;
    private boolean mDisableHWBackButton;
    private boolean mShowOnCreate;
    private String mTextMsg;
    private Runnable showCancel;
    private AlertDialog spinner;
    private TextView txt;
    private boolean waitingToHide;

    public COFBusy(Activity activity, View view, JSONArray jsonarray, BusyIndicatorCallback busyindicatorcallback, boolean flag)
    {
        spinner = null;
        waitingToHide = false;
        hideTask = new Runnable() {

            final COFBusy this$0;

            public void run()
            {
                forceHide();
            }

            
            {
                this$0 = COFBusy.this;
                super();
            }
        };
        showCancel = new Runnable() {

            final COFBusy this$0;

            public void run()
            {
                if (spinner != null)
                {
                    mCancelButton.setVisibility(0);
                }
            }

            
            {
                this$0 = COFBusy.this;
                super();
            }
        };
        mActivity = activity;
        mCurrentView = view;
        mShowOnCreate = flag;
        bCanceled = false;
        mDisableHWBackButton = false;
        parseOptions(jsonarray);
        mCancelCallback = busyindicatorcallback;
        buildSpinner();
    }

    private void _buildSpinner()
    {
        Log.d("COFBusy", "Building Spinner");
        bCanceled = false;
        Object obj;
        obj = new android.app.AlertDialog.Builder(mActivity);
        RelativeLayout relativelayout = (RelativeLayout)LayoutInflater.from(mActivity).inflate(0x7f030008, null);
        txt = (TextView)relativelayout.findViewById(0x7f080059);
        mCancelButton = (ImageButton)relativelayout.findViewById(0x7f08005a);
        mCancelButton.setVisibility(4);
        txt.setText(mTextMsg);
        ((android.app.AlertDialog.Builder) (obj)).setView(relativelayout);
        spinner = ((android.app.AlertDialog.Builder) (obj)).create();
        obj = spinner;
        boolean flag;
        if (!mDisableHWBackButton)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            ((AlertDialog) (obj)).setCancelable(flag);
            spinner.setCanceledOnTouchOutside(false);
            spinner.requestWindowFeature(1);
            spinner.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final COFBusy this$0;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    Log.d("COFBusy", "Cancelled dialog...");
                    bCanceled = true;
                    if (mCancelCallback != null)
                    {
                        mCancelCallback.callbackCall();
                    }
                }

            
            {
                this$0 = COFBusy.this;
                super();
            }
            });
            mCancelButton.setOnClickListener(new android.view.View.OnClickListener() {

                final COFBusy this$0;

                public void onClick(View view)
                {
                    Log.d("COFBusy", "setOnClickListener called...");
                    if (mCancelCallback != null)
                    {
                        mCancelCallback.callbackCall();
                    }
                    spinner.dismiss();
                    bCanceled = true;
                }

            
            {
                this$0 = COFBusy.this;
                super();
            }
            });
            spinner.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

                final COFBusy this$0;

                public void onShow(DialogInterface dialoginterface)
                {
                    mCancelButton.setVisibility(4);
                }

            
            {
                this$0 = COFBusy.this;
                super();
            }
            });
            if (mShowOnCreate)
            {
                spinner.show();
            }
            if (mCancelable)
            {
                mCurrentView.postDelayed(showCancel, mCancelTimeoutSecs * 1000);
            }
            Log.d("COFBusy", "Built Spinner");
            return;
        }
        catch (Exception exception)
        {
            Log.e("COFBusy", exception.toString());
        }
        return;
    }

    private void _show()
    {
        Log.d("COFBusy", "_show()");
        mCurrentView.removeCallbacks(hideTask);
        mCurrentView.removeCallbacks(showCancel);
        waitingToHide = false;
        mActivity.runOnUiThread(new Runnable() {

            final COFBusy this$0;

            public void run()
            {
                Log.d("COFBusy", "show spinner");
                if (spinner != null)
                {
                    if (bCanceled)
                    {
                        reset();
                    } else
                    {
                        spinner.show();
                        mCancelButton.setVisibility(4);
                        if (mCancelable)
                        {
                            mCurrentView.postDelayed(showCancel, mCancelTimeoutSecs * 1000);
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = COFBusy.this;
                super();
            }
        });
        Thread.yield();
    }

    private void buildSpinner()
    {
        if (spinner == null)
        {
            mActivity.runOnUiThread(new Runnable() {

                final COFBusy this$0;

                public void run()
                {
                    _buildSpinner();
                }

            
            {
                this$0 = COFBusy.this;
                super();
            }
            });
        }
    }

    private void parseOptions(JSONArray jsonarray)
    {
        try
        {
            Log.d("COFBusy", (new StringBuilder()).append("Parse args...").append(jsonarray).toString());
            mTextMsg = jsonarray.getString(0);
            mCancelable = jsonarray.getBoolean(1);
            mCancelTimeoutSecs = jsonarray.getInt(2);
            if (jsonarray.length() >= 4)
            {
                mDisableHWBackButton = jsonarray.getBoolean(3);
            }
            Log.d("COFBusy", "end Parse args...");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Log.e("COFBusy", "parseOptions() : Missing arguments.");
        }
    }

    private void reset()
    {
        spinner = null;
        bCanceled = false;
        buildSpinner();
    }

    private void updateSpinner()
    {
        if (spinner != null)
        {
            txt.setText(mTextMsg);
            AlertDialog alertdialog;
            boolean flag;
            if (mCancelable)
            {
                mCurrentView.removeCallbacks(showCancel);
                mCurrentView.postDelayed(showCancel, mCancelTimeoutSecs * 1000);
            } else
            {
                mCurrentView.removeCallbacks(showCancel);
            }
            alertdialog = spinner;
            if (!mDisableHWBackButton)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            alertdialog.setCancelable(flag);
        }
    }

    public void forceHide()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("COFBusy", "forceHide");
        if (spinner != null && spinner.isShowing())
        {
            mActivity.runOnUiThread(new Runnable() {

                final COFBusy this$0;

                public void run()
                {
                    spinner.setOnCancelListener(null);
                    spinner.hide();
                }

            
            {
                this$0 = COFBusy.this;
                super();
            }
            });
            waitingToHide = false;
        }
        this;
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
        Log.d("COFBusy", "hide called");
        if (!waitingToHide)
        {
            mCurrentView.postDelayed(hideTask, 200L);
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

    public void show(JSONArray jsonarray, BusyIndicatorCallback busyindicatorcallback)
    {
        this;
        JVM INSTR monitorenter ;
        parseOptions(jsonarray);
        mActivity.runOnUiThread(new Runnable() {

            final COFBusy this$0;

            public void run()
            {
                updateSpinner();
            }

            
            {
                this$0 = COFBusy.this;
                super();
            }
        });
        mCancelCallback = busyindicatorcallback;
        _show();
        this;
        JVM INSTR monitorexit ;
        return;
        jsonarray;
        throw jsonarray;
    }





/*
    static boolean access$102(COFBusy cofbusy, boolean flag)
    {
        cofbusy.bCanceled = flag;
        return flag;
    }

*/








}
