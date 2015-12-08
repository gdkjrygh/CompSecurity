// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.exitwithrate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class EnterAndExit
    implements android.view.View.OnClickListener
{

    public static final String PREFERENCE_BASE_INFO = "APP_BASE_INFOS";
    public static final String PREFERENCE_KEY_RATE = "APP_RATE";
    public static final String PREFERENCE_OPEN_TIMES = "open_times";
    private static boolean isShowExitAd = false;
    private AlertDialog dlg;
    private Activity mActivity;
    private int opentimes;
    private View v;

    public EnterAndExit(Activity activity)
    {
        mActivity = activity;
        opentimes = activity.getSharedPreferences("APP_BASE_INFOS", 0).getInt("open_times", 0);
    }

    private void createExitAdDlg(View view)
    {
        dlg = (new android.app.AlertDialog.Builder(mActivity)).create();
        dlg.setCanceledOnTouchOutside(false);
        dlg.show();
        isShowExitAd = true;
        Object obj = dlg.getWindow();
        v = LayoutInflater.from(mActivity).inflate(net.coocent.promotionsdk.R.layout.exitad, null);
        ((Window) (obj)).setContentView(v);
        obj = (LinearLayout)v.findViewById(net.coocent.promotionsdk.R.id.exit_adview);
        try
        {
            ((LinearLayout) (obj)).addView(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        v.findViewById(net.coocent.promotionsdk.R.id.yes).setOnClickListener(this);
        v.findViewById(net.coocent.promotionsdk.R.id.no).setOnClickListener(this);
        ((ImageView)v.findViewById(net.coocent.promotionsdk.R.id.close)).setOnClickListener(this);
    }

    private void createRateDlg()
    {
        dlg = (new android.app.AlertDialog.Builder(mActivity)).create();
        dlg.setCanceledOnTouchOutside(false);
        dlg.show();
        Window window = dlg.getWindow();
        v = LayoutInflater.from(mActivity).inflate(net.coocent.promotionsdk.R.layout.show_exit, null);
        window.setContentView(v);
        ((Button)v.findViewById(net.coocent.promotionsdk.R.id.negativeButton)).setOnClickListener(this);
        ((Button)v.findViewById(net.coocent.promotionsdk.R.id.positiveButton)).setOnClickListener(this);
    }

    private boolean isRate()
    {
        return mActivity.getSharedPreferences("APP_BASE_INFOS", 0).getBoolean("APP_RATE", false);
    }

    public static void onDes(Activity activity)
    {
        activity = activity.getSharedPreferences("APP_BASE_INFOS", 0);
        int i = activity.getInt("open_times", 0);
        activity.edit().putInt("open_times", i + 1).commit();
        isShowExitAd = false;
    }

    public void enterWithRate()
    {
        if (!isRate() && opentimes % 3 == 2)
        {
            createRateDlg();
        }
    }

    public void exitWithAd(boolean flag, View view)
    {
        if (flag && !isShowExitAd)
        {
            createExitAdDlg(view);
            return;
        } else
        {
            mActivity.finish();
            return;
        }
    }

    public void exitWithRate(boolean flag, View view)
    {
        if (!isRate())
        {
            if (opentimes % 2 == 0)
            {
                createRateDlg();
                return;
            } else
            {
                exitWithAd(flag, view);
                return;
            }
        } else
        {
            exitWithAd(flag, view);
            return;
        }
    }

    public void full(boolean flag)
    {
        if (flag)
        {
            android.view.WindowManager.LayoutParams layoutparams = mActivity.getWindow().getAttributes();
            layoutparams.flags = layoutparams.flags | 0x400;
            mActivity.getWindow().setAttributes(layoutparams);
            mActivity.getWindow().addFlags(512);
            return;
        } else
        {
            android.view.WindowManager.LayoutParams layoutparams1 = mActivity.getWindow().getAttributes();
            layoutparams1.flags = layoutparams1.flags & 0xfffffbff;
            mActivity.getWindow().setAttributes(layoutparams1);
            mActivity.getWindow().clearFlags(512);
            return;
        }
    }

    public void onClick(View view)
    {
        if (view.getId() == net.coocent.promotionsdk.R.id.negativeButton)
        {
            dlg.cancel();
            mActivity.finish();
        } else
        {
            if (view.getId() == net.coocent.promotionsdk.R.id.positiveButton)
            {
                view = Uri.parse((new StringBuilder("market://details?id=")).append(mActivity.getPackageName()).toString());
                try
                {
                    Intent intent = mActivity.getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
                    intent.setData(view);
                    mActivity.startActivity(intent);
                }
                catch (Exception exception)
                {
                    view = new Intent("android.intent.action.VIEW", view);
                    mActivity.startActivity(view);
                }
                mActivity.getSharedPreferences("APP_BASE_INFOS", 0).edit().putBoolean("APP_RATE", true).commit();
                dlg.cancel();
                return;
            }
            if (view.getId() == net.coocent.promotionsdk.R.id.yes)
            {
                dlg.dismiss();
                mActivity.finish();
                return;
            }
            if (view.getId() == net.coocent.promotionsdk.R.id.no || view.getId() == net.coocent.promotionsdk.R.id.close)
            {
                dlg.dismiss();
                return;
            }
        }
    }

}
