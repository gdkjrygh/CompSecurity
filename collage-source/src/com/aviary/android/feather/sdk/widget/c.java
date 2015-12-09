// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

public class c
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(View view);
    }

    private class b
    {

        final Runnable a = new AviaryToast.TN._cls1(this);
        final Runnable b = new AviaryToast.TN._cls2(this);
        android.view.WindowManager.LayoutParams c;
        WindowManager d;
        final c e;

        public void a()
        {
            e.m.post(a);
        }

        public void b()
        {
            e.m.post(b);
        }

        public void c()
        {
            if (e.e != e.d)
            {
                d();
                e.e = e.d;
                int i1 = e.g;
                c.gravity = i1;
                if ((i1 & 7) == 7)
                {
                    c.horizontalWeight = 1.0F;
                }
                if ((i1 & 0x70) == 112)
                {
                    c.verticalWeight = 1.0F;
                }
                c.x = e.h;
                c.y = e.i;
                c.verticalMargin = e.l;
                c.horizontalMargin = e.k;
                if (e.e.getParent() != null)
                {
                    e.e.setVisibility(8);
                    d.removeView(e.e);
                }
                d.addView(e.e, c);
                e.e.setVisibility(0);
                if (c.a(e) != null)
                {
                    c.a(e).a(e.e);
                }
            }
        }

        public void d()
        {
            e();
            if (c.a(e) != null)
            {
                c.a(e).a();
            }
        }

        void e()
        {
            if (e.e != null)
            {
                if (e.e.getParent() != null)
                {
                    e.e.setVisibility(8);
                    d.removeView(e.e);
                }
                e.e = null;
            }
        }

        b()
        {
            e = c.this;
            super();
            c = new android.view.WindowManager.LayoutParams();
            c1 = c;
            height = -2;
            width = -2;
            flags = 152;
            format = -3;
            type = 2005;
            windowAnimations = com.aviary.android.feather.sdk.R.style.AviaryAnimations_AviaryToast;
            setTitle("Toast");
        }
    }


    final String a = "toast";
    Context b;
    WindowManager c;
    View d;
    View e;
    int f;
    int g;
    int h;
    int i;
    final b j = new b();
    float k;
    float l;
    final Handler m = new Handler();
    private a n;

    public c(Context context)
    {
        g = 17;
        b = context;
        c = (WindowManager)context.getSystemService("window");
        j.d = c;
        i = 0;
        h = 0;
    }

    static a a(c c1)
    {
        return c1.n;
    }

    public static c a(Context context, int i1, int j1)
    {
        c c1 = new c(context);
        c1.d = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(i1, null);
        c1.f = j1;
        return c1;
    }

    public void a()
    {
        if (d == null)
        {
            throw new RuntimeException("setView must be called first");
        } else
        {
            j.a();
            return;
        }
    }

    public void b()
    {
        j.b();
    }

    // Unreferenced inner class com/aviary/android/feather/sdk/widget/AviaryToast$TN$1

/* anonymous class */
    class AviaryToast.TN._cls1
        implements Runnable
    {

        final b a;

        public void run()
        {
            a.c();
        }

            
            {
                a = b1;
                super();
            }
    }


    // Unreferenced inner class com/aviary/android/feather/sdk/widget/AviaryToast$TN$2

/* anonymous class */
    class AviaryToast.TN._cls2
        implements Runnable
    {

        final b a;

        public void run()
        {
            a.d();
        }

            
            {
                a = b1;
                super();
            }
    }

}
