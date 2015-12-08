// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.app.Activity;
import android.app.AlertDialog;

public class Dialog
{

    public Dialog()
    {
    }

    public static void showDialog(String s, String s1, Activity activity, String s2, String s3, boolean flag, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1)
    {
        activity = new android.app.AlertDialog.Builder(activity);
        activity.setPositiveButton(s2, onclicklistener);
        activity.setNegativeButton(s3, onclicklistener1);
        activity.setTitle(s).setMessage(s1);
        activity.create().show();
    }

    public static void showDialog(String s, String s1, Activity activity, String s2, String s3, boolean flag, boolean flag1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setMessage(s1);
        builder.setCancelable(true);
        builder.setTitle(s);
        builder.setPositiveButton(s2, new _cls1(flag1, activity));
        if (flag)
        {
            builder.setNegativeButton(s3, new _cls2());
        }
        builder.create().show();
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
