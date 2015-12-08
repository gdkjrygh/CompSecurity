// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;

public abstract class bpj extends bpl
{

    protected boolean a;
    private Handler e;
    private long f;
    private Runnable g;

    public bpj(String s, String s1)
    {
        super(s, s1);
        e = new Handler(Looper.getMainLooper());
        g = new bpk(this, (byte)0);
        f = 1000L;
        a(false);
    }

    public void a()
    {
        a(false);
    }

    protected final void a(boolean flag)
    {
label0:
        {
            if (a != flag)
            {
                a = flag;
                if (!flag)
                {
                    break label0;
                }
                e.postDelayed(g, f);
            }
            return;
        }
        e.removeCallbacks(g);
    }

    protected abstract boolean a(long l);
}
