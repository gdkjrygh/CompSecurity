// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.ui.components;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.KeyEvent;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;

public class UpgradeDialog
{

    private AlertDialog alertDialog;
    private boolean isForseUpgrade;
    private Context mContext;

    public UpgradeDialog(Context context)
    {
        mContext = context;
        alertDialog = (new android.app.AlertDialog.Builder(context)).create();
    }

    private void dismissDialog()
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setCurrentTimeForUpgradeAlertInterval(System.currentTimeMillis() / 1000L);
        alertDialog.dismiss();
    }

    private void openApplicationInGooglePlayStore()
    {
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse((new StringBuilder()).append(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getForceAndroidUpgradeReferenceUrl()).append(mContext.getPackageName()).toString()));
            mContext.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            activitynotfoundexception.printStackTrace();
        }
    }

    public AlertDialog getAlertDialog()
    {
        return alertDialog;
    }

    public void launchUpgradeDialog(boolean flag)
    {
        isForseUpgrade = flag;
        alertDialog.setTitle(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getForceUpgradeTitle());
        alertDialog.setMessage(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getForceUpgradeDisplayMessage());
        alertDialog.setButton(-1, mContext.getResources().getString(0x7f080530), new android.content.DialogInterface.OnClickListener() {

            final UpgradeDialog this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                openApplicationInGooglePlayStore();
                alertDialog.dismiss();
            }

            
            {
                this$0 = UpgradeDialog.this;
                super();
            }
        });
        if (flag)
        {
            alertDialog.setButton(-2, mContext.getResources().getString(0x7f08052f), new android.content.DialogInterface.OnClickListener() {

                final UpgradeDialog this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    ((Activity)mContext).finish();
                }

            
            {
                this$0 = UpgradeDialog.this;
                super();
            }
            });
            alertDialog.setCanceledOnTouchOutside(false);
        } else
        {
            alertDialog.setButton(-2, mContext.getResources().getString(0x7f0801b3), new android.content.DialogInterface.OnClickListener() {

                final UpgradeDialog this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dismissDialog();
                }

            
            {
                this$0 = UpgradeDialog.this;
                super();
            }
            });
            alertDialog.setCanceledOnTouchOutside(false);
        }
        alertDialog.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

            final UpgradeDialog this$0;

            public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
            {
                if (isForseUpgrade)
                {
                    return true;
                }
                if (i == 4)
                {
                    dismissDialog();
                }
                return false;
            }

            
            {
                this$0 = UpgradeDialog.this;
                super();
            }
        });
        alertDialog.show();
    }





}
