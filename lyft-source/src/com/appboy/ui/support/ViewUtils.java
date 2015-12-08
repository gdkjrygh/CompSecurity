// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.support;

import android.view.View;
import android.view.ViewGroup;

public class ViewUtils
{

    public ViewUtils()
    {
    }

    public static void removeViewFromParent(View view)
    {
        if (view != null && (view.getParent() instanceof ViewGroup))
        {
            ((ViewGroup)view.getParent()).removeView(view);
        }
    }
}
