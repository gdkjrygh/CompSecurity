// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.view;

import android.view.View;
import com.nineoldandroids.view.animation.AnimatorProxy;

public final class ViewHelper
{
    private static final class Honeycomb
    {

        static void setTranslationY(View view, float f)
        {
            view.setTranslationY(f);
        }
    }


    public static void setTranslationY(View view, float f)
    {
        if (AnimatorProxy.NEEDS_PROXY)
        {
            AnimatorProxy.wrap(view).setTranslationY(f);
            return;
        } else
        {
            Honeycomb.setTranslationY(view, f);
            return;
        }
    }
}
