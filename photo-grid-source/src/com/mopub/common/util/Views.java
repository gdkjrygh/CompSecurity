// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import android.view.View;
import android.view.ViewGroup;

public class Views
{

    public Views()
    {
    }

    public static void removeFromParent(View view)
    {
        while (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) 
        {
            return;
        }
        ((ViewGroup)view.getParent()).removeView(view);
    }
}
