// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Toast;
import com.aviary.android.feather.sdk.widget.c;

public class e
{

    public e()
    {
    }

    public static Toast a(Context context)
    {
        return a(context, com.aviary.android.feather.sdk.R.layout.aviary_toast_layout);
    }

    public static Toast a(Context context, int i)
    {
        android.view.View view = LayoutInflater.from(context).inflate(i, null);
        context = new Toast(context);
        context.setDuration(0);
        context.setView(view);
        context.setGravity(17, 0, 0);
        return context;
    }

    public static boolean a(int i, int j)
    {
        return (i & j) == j;
    }

    public static c b(Context context)
    {
        return c.a(context, com.aviary.android.feather.sdk.R.layout.aviary_modal_progress_view, -1);
    }
}
