// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer:
//            MediaClock

public abstract class TrackRenderer
    implements ExoPlayer.ExoPlayerComponent
{

    private int a;

    public TrackRenderer()
    {
    }

    protected abstract int a(long l);

    public void a(int j, Object obj)
    {
    }

    protected abstract void a(long l, long l1);

    protected void a(long l, boolean flag)
    {
    }

    protected abstract boolean a();

    protected abstract void b(long l);

    final void b(long l, boolean flag)
    {
        boolean flag1 = true;
        if (a != 1)
        {
            flag1 = false;
        }
        Assertions.b(flag1);
        a = 2;
        a(l, flag);
    }

    protected abstract boolean b();

    final int c(long l)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (a == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertions.b(flag);
            a = a(l);
            if (a != 0 && a != 1)
            {
                flag = flag1;
                if (a != -1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        Assertions.b(flag);
        return a;
    }

    protected abstract long d();

    protected abstract void d_();

    protected abstract long e();

    protected MediaClock f()
    {
        return null;
    }

    protected void g()
    {
    }

    protected void h()
    {
    }

    protected void i()
    {
    }

    protected void n()
    {
    }

    protected final int p()
    {
        return a;
    }

    final void q()
    {
        boolean flag;
        if (a == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        a = 3;
        g();
    }

    final void r()
    {
        boolean flag;
        if (a == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        a = 2;
        h();
    }

    final void s()
    {
        boolean flag;
        if (a == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        a = 1;
        i();
    }

    final void t()
    {
        boolean flag;
        if (a != 2 && a != 3 && a != -2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        a = -2;
        n();
    }
}
