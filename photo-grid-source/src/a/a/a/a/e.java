// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import android.util.Log;

// Referenced classes of package a.a.a.a:
//            s

public final class e
    implements s
{

    private int a;

    public e()
    {
        a = 3;
    }

    public e(byte byte0)
    {
        a = 4;
    }

    public final void a(String s1, String s2)
    {
        if (a(4))
        {
            Log.i(s1, s2, null);
        }
    }

    public final void a(String s1, String s2, Throwable throwable)
    {
        if (a(5))
        {
            Log.w(s1, s2, throwable);
        }
    }

    public final boolean a(int i)
    {
        return a <= i;
    }

    public final void b(String s1, String s2)
    {
        a(s1, s2, null);
    }

    public final void b(String s1, String s2, Throwable throwable)
    {
        if (a(6))
        {
            Log.e(s1, s2, throwable);
        }
    }

    public final void c(String s1, String s2)
    {
        b(s1, s2, null);
    }

    public final void d(String s1, String s2)
    {
        if (a(4))
        {
            Log.println(4, s1, s2);
        }
    }
}
