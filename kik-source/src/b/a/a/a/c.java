// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.util.Log;

// Referenced classes of package b.a.a.a:
//            o

public final class c
    implements o
{

    private int a;

    public c()
    {
        a = 3;
    }

    public c(byte byte0)
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
        if (a(5))
        {
            Log.w(s, s1, throwable);
        }
    }

    public final boolean a(int i)
    {
        return a <= i;
    }

    public final void b(String s, String s1)
    {
        b(s, s1, null);
    }

    public final void b(String s, String s1, Throwable throwable)
    {
        if (a(6))
        {
            Log.e(s, s1, throwable);
        }
    }
}
