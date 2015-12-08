// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.worklight.nativeandroid.common.WLUtils;

public class WLDirectUpdateProgressDialog
{

    private ProgressDialog progressDialog;

    public WLDirectUpdateProgressDialog()
    {
    }

    public boolean hide()
    {
        if (isShowing())
        {
            progressDialog.dismiss();
            progressDialog = null;
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isShowing()
    {
        return progressDialog != null && progressDialog.isShowing();
    }

    public boolean show(Context context, final Runnable onCancel, int i)
    {
        if (!isShowing())
        {
            progressDialog = new ProgressDialog(context);
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.setMessage(WLUtils.getResourceString("directUpdateDownloadingMessage", context));
            progressDialog.setIndeterminate(false);
            progressDialog.setProgressStyle(1);
            progressDialog.setMax(i);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                progressDialog.setProgressNumberFormat(WLUtils.getResourceString("kb", context));
            }
            progressDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final WLDirectUpdateProgressDialog this$0;
                final Runnable val$onCancel;

                public void onCancel(DialogInterface dialoginterface)
                {
                    dialoginterface.dismiss();
                    onCancel.run();
                }

            
            {
                this$0 = WLDirectUpdateProgressDialog.this;
                onCancel = runnable;
                super();
            }
            });
            try
            {
                progressDialog.show();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return true;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean update(int i)
    {
        if (isShowing())
        {
            progressDialog.setProgress(i);
            return true;
        } else
        {
            return false;
        }
    }
}
