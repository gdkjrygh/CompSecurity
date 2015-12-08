// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package p.ca:
//            bf

public static class Object
{

    private WeakReference a;
    private Runnable b;

    static Runnable a(Runnable runnable, Runnable runnable1)
    {
        runnable.b = runnable1;
        return runnable1;
    }

    private Runnable a(boolean flag, long l1)
    {
        bf bf1 = (bf)a.get();
        if (bf1 == null)
        {
            return null;
        }
        if (b != null)
        {
            bf.e(bf1).removeCallbacks(b);
        }
        Runnable runnable = new Runnable(flag) {

            final boolean a;
            final bf.l b;

            public void run()
            {
                if (!a)
                {
                    bf.l.a(b, null);
                }
                bf bf2 = (bf)bf.l.a(b).get();
                if (bf2 != null)
                {
                    bf.b(bf2, a);
                }
            }

            
            {
                b = bf.l.this;
                a = flag;
                super();
            }
        };
        bf.e(bf1).postDelayed(runnable, l1);
        return runnable;
    }

    static WeakReference a(Runnable runnable)
    {
        return runnable.a;
    }

    public void a()
    {
        a(true, 0L);
    }

    public void a(long l1)
    {
        a(false, l1);
    }

    Object(bf bf1)
    {
        a = new WeakReference(bf1);
    }
}
