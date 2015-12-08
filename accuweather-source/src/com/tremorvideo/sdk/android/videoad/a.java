// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ea, az

public abstract class com.tremorvideo.sdk.android.videoad.a
{
    public static interface a
    {

        public abstract int a(ea ea);

        public abstract int a(ea ea, int i1);

        public abstract az a();

        public abstract void a(int i1);

        public abstract void a(com.tremorvideo.sdk.android.videoad.a a1);

        public abstract Context b();

        public abstract void b(int i1);

        public abstract int c();

        public abstract int d();
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/videoad/a$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("Coupon", 0);
            b = new b("SurveyInternal", 1);
            c = new b("SurveyExternal", 2);
            d = new b("Exit", 3);
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int i1)
        {
            super(s, i1);
        }
    }


    protected Activity a;
    protected a b;

    public com.tremorvideo.sdk.android.videoad.a(a a1, Activity activity)
    {
        b = a1;
        a = activity;
    }

    public void a(int i1, int j1, Intent intent)
    {
    }

    public void a(Configuration configuration)
    {
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        return false;
    }

    public boolean b()
    {
        return true;
    }

    public void c()
    {
    }

    public void d()
    {
    }

    public void e()
    {
    }

    public void f()
    {
    }

    public void g()
    {
    }

    public void h()
    {
    }

    public boolean i()
    {
        return false;
    }

    public long j()
    {
        return 0L;
    }

    public int k()
    {
        return 0;
    }

    public b l()
    {
        return b.d;
    }

    public void m()
    {
    }
}
