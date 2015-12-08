// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.customview;

import android.app.Dialog;
import android.content.Context;
import android.widget.ProgressBar;

public class CustomProgressDialog extends Dialog
{

    public CustomProgressDialog(Context context)
    {
        super(context, 0x7f0a0187);
    }

    public static CustomProgressDialog show(Context context, CharSequence charsequence, CharSequence charsequence1)
    {
        return show(context, charsequence, charsequence1, false);
    }

    public static CustomProgressDialog show(Context context, CharSequence charsequence, CharSequence charsequence1, boolean flag)
    {
        return show(context, charsequence, charsequence1, flag, false, null);
    }

    public static CustomProgressDialog show(Context context, CharSequence charsequence, CharSequence charsequence1, boolean flag, boolean flag1)
    {
        return show(context, charsequence, charsequence1, flag, flag1, null);
    }

    public static CustomProgressDialog show(Context context, CharSequence charsequence, CharSequence charsequence1, boolean flag, boolean flag1, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        charsequence1 = new CustomProgressDialog(context);
        charsequence1.setTitle(charsequence);
        charsequence1.setCancelable(flag1);
        charsequence1.setOnCancelListener(oncancellistener);
        charsequence1.addContentView(new ProgressBar(context), new android.view.ViewGroup.LayoutParams(-2, -2));
        charsequence1.show();
        return charsequence1;
    }
}
