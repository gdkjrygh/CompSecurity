// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.util.Log;

// Referenced classes of package io.fabric.sdk.android:
//            k

public final class b
    implements k
{

    private int a;

    public b()
    {
        a = 3;
    }

    public b(byte byte0)
    {
        a = 4;
    }

    public final void a(int i, String s, String s1)
    {
        a(i, s, s1, false);
    }

    public final void a(int i, String s, String s1, boolean flag)
    {
        if (flag || a(i))
        {
            Log.println(i, s, s1);
        }
    }

    public final void a(String s, String s1)
    {
        a(s, s1, ((Throwable) (null)));
    }

    public final void a(String s, String s1, Throwable throwable)
    {
        if (a(3))
        {
            Log.d(s, s1, throwable);
        }
    }

    public final boolean a(int i)
    {
        return a <= i;
    }

    public final void b(String s, String s1)
    {
        if (a(2))
        {
            Log.v(s, s1, null);
        }
    }

    public final void b(String s, String s1, Throwable throwable)
    {
        if (a(5))
        {
            Log.w(s, s1, throwable);
        }
    }

    public final void c(String s, String s1)
    {
        if (a(4))
        {
            Log.i(s, s1, null);
        }
    }

    public final void c(String s, String s1, Throwable throwable)
    {
        if (a(6))
        {
            Log.e(s, s1, throwable);
        }
    }

    public final void d(String s, String s1)
    {
        b(s, s1, null);
    }

    public final void e(String s, String s1)
    {
        c(s, s1, null);
    }
}
