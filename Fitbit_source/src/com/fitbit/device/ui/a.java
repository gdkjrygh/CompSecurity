// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.TextView;

public class a
{

    public a()
    {
    }

    public static void a(Activity activity, int i, String s)
    {
        ((TextView)((ViewGroup)activity.findViewById(i)).findViewById(0x7f11036e)).setText(s);
    }
}
