// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.f;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Callable;

public class a
{

    public static final String a = "LayoutUtils";

    public a()
    {
    }

    public static void a(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        if (com.fitbit.util.b.a.a(16))
        {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(ongloballayoutlistener);
            return;
        } else
        {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(ongloballayoutlistener);
            return;
        }
    }

    public static void a(View view, Callable callable)
    {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(callable, view) {

            final Callable a;
            final View b;

            public void onGlobalLayout()
            {
                try
                {
                    if (((Boolean)a.call()).booleanValue())
                    {
                        a.a(b, this);
                    }
                    return;
                }
                catch (Exception exception)
                {
                    com.fitbit.e.a.f("LayoutUtils", exception.getMessage(), exception, new Object[0]);
                }
            }

            
            {
                a = callable;
                b = view;
                super();
            }
        });
    }
}
