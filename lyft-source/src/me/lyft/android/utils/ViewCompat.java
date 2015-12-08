// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.view.View;

public class ViewCompat
{

    public ViewCompat()
    {
    }

    public static void setSystemUiVisibility(View view, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            view.setSystemUiVisibility(i);
        }
    }
}
