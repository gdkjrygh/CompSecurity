// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.lyft.scoop;

import android.view.View;
import android.view.ViewTreeObserver;

final class Utils
{

    public static Class a(Object obj)
    {
        return obj.getClass();
    }

    public static void a(View view, OnMeasuredCallback onmeasuredcallback)
    {
        int i = view.getWidth();
        int j = view.getHeight();
        if (i > 0 && j > 0)
        {
            onmeasuredcallback.a(view, i, j);
            return;
        } else
        {
            view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(view, onmeasuredcallback) {

                final View a;
                final OnMeasuredCallback b;

                public boolean onPreDraw()
                {
                    ViewTreeObserver viewtreeobserver = a.getViewTreeObserver();
                    if (viewtreeobserver.isAlive())
                    {
                        viewtreeobserver.removeOnPreDrawListener(this);
                    }
                    b.a(a, a.getWidth(), a.getHeight());
                    return true;
                }

            
            {
                a = view;
                b = onmeasuredcallback;
                super();
            }
            });
            return;
        }
    }

    public static void a(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    private class OnMeasuredCallback
    {

        public abstract void a(View view, int i, int j);
    }

}
