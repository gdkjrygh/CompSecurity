// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.common;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import com.roidapp.cloudlib.at;

public final class d
{

    private static Typeface a = null;

    public static int a(Resources resources, float f)
    {
        return (int)(resources.getDisplayMetrics().density * f + 0.5F);
    }

    public static ProgressDialog a(Context context, String s)
    {
        context = new ProgressDialog(context);
        context.setProgressStyle(0);
        context.setMessage(s);
        context.setCancelable(true);
        return context;
    }

    public static void a(Context context, String s, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(context.getString(at.b));
        builder.setMessage((new StringBuilder()).append(s).append("\n").append(context.getString(at.as)).toString());
        builder.setPositiveButton(context.getString(at.bo), onclicklistener);
        builder.setNegativeButton(context.getString(at.ab), onclicklistener1);
        builder.create().show();
    }

}
