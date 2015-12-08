// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;

public final class jjp
    implements android.view.Choreographer.FrameCallback
{

    final boolean a;
    final long b;
    final long c;
    Choreographer d;
    long e;
    long f;
    long g;
    long h;
    boolean i;
    long j;
    long k;
    long l;

    public jjp()
    {
        this(-1F, false);
    }

    private jjp(float f1, boolean flag)
    {
        a = flag;
        if (flag)
        {
            b = (long)(1000000000D / (double)f1);
            c = (b * 80L) / 100L;
            return;
        } else
        {
            b = -1L;
            c = -1L;
            return;
        }
    }

    public jjp(Context context)
    {
        this(((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRefreshRate(), true);
    }

    static long a(long l1, long l2, long l3)
    {
        l2 = ((l1 - l2) / l3) * l3 + l2;
        long l4;
        if (l1 <= l2)
        {
            l4 = l2 - l3;
        } else
        {
            l4 = l2;
            l2 += l3;
        }
        if (l2 - l1 < l1 - l4)
        {
            return l2;
        } else
        {
            return l4;
        }
    }

    boolean a(long l1, long l2)
    {
        long l3 = k;
        return Math.abs(l2 - j - (l1 - l3)) > 0x1312d00L;
    }

    public final void doFrame(long l1)
    {
        e = l1;
        d.postFrameCallbackDelayed(this, 500L);
    }
}
