// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;

public final class apt
    implements aqa
{

    final boolean a;
    apu b;
    ane c;
    private int d;
    private boolean e;
    private final aqa f;

    public apt(aqa aqa1, boolean flag)
    {
        f = (aqa)b.a(aqa1, "Argument must not be null");
        a = flag;
    }

    public final Class a()
    {
        return f.a();
    }

    public final Object b()
    {
        return f.b();
    }

    public final int c()
    {
        return f.c();
    }

    public final void d()
    {
        if (d > 0)
        {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (e)
        {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else
        {
            e = true;
            f.d();
            return;
        }
    }

    public final void e()
    {
        if (e)
        {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper()))
        {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        } else
        {
            d = d + 1;
            return;
        }
    }

    public final void f()
    {
        if (d <= 0)
        {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper()))
        {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i = d - 1;
        d = i;
        if (i == 0)
        {
            b.b(c, this);
        }
    }

    public final String toString()
    {
        String s = String.valueOf("EngineResource{isCacheable=");
        boolean flag = a;
        String s1 = String.valueOf(b);
        String s2 = String.valueOf(c);
        int i = d;
        boolean flag1 = e;
        String s3 = String.valueOf(f);
        return (new StringBuilder(String.valueOf(s).length() + 74 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(flag).append(", listener=").append(s1).append(", key=").append(s2).append(", acquired=").append(i).append(", isRecycled=").append(flag1).append(", resource=").append(s3).append("}").toString();
    }
}
