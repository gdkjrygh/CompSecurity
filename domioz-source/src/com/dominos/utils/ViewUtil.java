// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

public final class ViewUtil
{

    public ViewUtil()
    {
    }

    public static void setDialogStyle(Context context, Dialog dialog)
    {
        TextView textview = (TextView)dialog.findViewById(context.getResources().getIdentifier("alertTitle", "id", "android"));
        if (textview != null)
        {
            textview.setTextColor(context.getResources().getColor(0x7f0e0057));
        }
        dialog = dialog.findViewById(context.getResources().getIdentifier("titleDivider", "id", "android"));
        if (dialog != null)
        {
            dialog.setBackgroundColor(context.getResources().getColor(0x7f0e0057));
        }
    }
}
