// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.cast.internal:
//            d

public abstract class c extends d
{
    private final class a
        implements Runnable
    {

        final c a;

        public final void run()
        {
            a.e = false;
            long l = SystemClock.elapsedRealtime();
            boolean flag = a.a(l);
            a.a(flag);
        }

        private a()
        {
            a = c.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    protected final Handler b = new Handler(Looper.getMainLooper());
    protected final long c = 1000L;
    protected final Runnable d = new a((byte)0);
    protected boolean e;

    public c(String s, String s1)
    {
        super(s, s1);
        a(false);
    }

    protected final void a(boolean flag)
    {
label0:
        {
            if (e != flag)
            {
                e = flag;
                if (!flag)
                {
                    break label0;
                }
                b.postDelayed(d, c);
            }
            return;
        }
        b.removeCallbacks(d);
    }

    protected abstract boolean a(long l);

    public void e()
    {
        a(false);
    }
}
