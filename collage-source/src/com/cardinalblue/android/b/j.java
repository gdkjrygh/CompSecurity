// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class j
{

    public j()
    {
    }

    public static Dialog a(Context context)
    {
        ProgressBar progressbar = new ProgressBar(context);
        progressbar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(200, 200));
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        linearlayout.setGravity(17);
        linearlayout.addView(progressbar);
        context = new Dialog(context);
        context.requestWindowFeature(1);
        context.setContentView(linearlayout);
        context.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        return context;
    }

    public static ProgressDialog a(Context context, int i)
    {
        ProgressDialog progressdialog = new ProgressDialog(context);
        progressdialog.setMessage(context.getString(i));
        progressdialog.setProgressStyle(1);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            progressdialog.setProgressNumberFormat(null);
        }
        progressdialog.setCanceledOnTouchOutside(false);
        progressdialog.setCancelable(true);
        return progressdialog;
    }
}
