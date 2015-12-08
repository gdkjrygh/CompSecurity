// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class csa
    implements crz
{

    private static final String b = csa.getSimpleName();
    AtomicInteger a;
    private final boolean c;

    protected csa()
    {
        this(false);
    }

    private csa(boolean flag)
    {
        a = new AtomicInteger();
        c = false;
        a.set(1);
        if (c)
        {
            String s = String.valueOf(Integer.toHexString(hashCode()));
            if (s.length() != 0)
            {
                "CONSTRUCT: ".concat(s);
            } else
            {
                new String("CONSTRUCT: ");
            }
            Thread.dumpStack();
        }
    }

    public final void a()
    {
        int i = a.getAndIncrement();
        if (c)
        {
            String s = String.valueOf(Integer.toHexString(hashCode()));
            (new StringBuilder(String.valueOf(s).length() + 38)).append("ACQUIRE: (").append(i).append(" -> ").append(i + 1).append(") ").append(s);
            Thread.dumpStack();
        }
        if (i == 0)
        {
            a.set(0);
            throw new ao();
        } else
        {
            return;
        }
    }

    public final void b()
    {
        int i = a.decrementAndGet();
        if (c)
        {
            String s = String.valueOf(Integer.toHexString(hashCode()));
            (new StringBuilder(String.valueOf(s).length() + 38)).append("RELEASE: (").append(i + 1).append(" -> ").append(i).append(") ").append(s);
            Thread.dumpStack();
        }
        if (i == 0)
        {
            c();
        } else
        if (i < 0)
        {
            a.set(0);
            throw new ao();
        }
    }

    protected abstract void c();

    public void finalize()
    {
        if (a.get() != 0)
        {
            String s = b;
            String s1 = String.valueOf(Integer.toHexString(hashCode()));
            String s2 = String.valueOf(a);
            Log.e(s, (new StringBuilder(String.valueOf(s1).length() + 52 + String.valueOf(s2).length())).append("Reference leak for ").append(s1).append(". Finalized with a ref-count of: ").append(s2).toString());
        }
        super.finalize();
    }

}
