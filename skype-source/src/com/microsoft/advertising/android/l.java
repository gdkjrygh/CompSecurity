// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import com.microsoft.advertising.android.a.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.microsoft.advertising.android:
//            ab, bx, z, af

final class l
    implements c
{
    private static final class a
    {

        private final com.microsoft.advertising.android.a.a.a a;
        private final long b = System.currentTimeMillis();

        static com.microsoft.advertising.android.a.a.a a(a a1)
        {
            return a1.a;
        }

        public final long a()
        {
            return b;
        }

        public a(com.microsoft.advertising.android.a.a.a a1)
        {
            a = a1;
        }
    }


    private List a;
    private final boolean b;
    private z c;

    l()
    {
        this(ab.a().b("RECORD_ADS"));
    }

    private l(boolean flag)
    {
        a = new ArrayList();
        c = new z();
        b = flag;
    }

    private static long a(Iterable iterable, com.microsoft.advertising.android.a.a.a a1, com.microsoft.advertising.android.a.a.a a2)
    {
        if (a1 != null && a2 != null) goto _L2; else goto _L1
_L1:
        return -1L;
_L2:
        long l2 = -1L;
        long l1 = -1L;
        iterable = iterable.iterator();
        do
        {
label0:
            {
                if (iterable.hasNext())
                {
                    break label0;
                }
                if (l2 >= 0L && l1 >= 0L)
                {
                    return l1 - l2;
                }
            }
            if (true)
            {
                continue;
            }
            a a3 = (a)iterable.next();
            long l3 = l2;
            if (l2 == -1L)
            {
                l3 = l2;
                if (a1 == a.a(a3))
                {
                    l3 = a3.a();
                }
            }
            l2 = l3;
            if (l1 == -1L)
            {
                l2 = l3;
                if (a2 == a.a(a3))
                {
                    l1 = a3.a();
                    l2 = l3;
                }
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final long a(int i)
    {
        switch (i)
        {
        default:
            return -1L;

        case 1: // '\001'
            return a(((Iterable) (a)), com.microsoft.advertising.android.a.a.a.a, com.microsoft.advertising.android.a.a.a.b);

        case 2: // '\002'
            return a(((Iterable) (a)), com.microsoft.advertising.android.a.a.a.g, com.microsoft.advertising.android.a.a.a.h);
        }
    }

    final void a(String s)
    {
        if (b)
        {
            c.a(s);
        }
    }

    final void a(String s, byte abyte0[])
    {
        if (b)
        {
            c.a(s, abyte0);
        }
    }

    final boolean a(long l1, TimeUnit timeunit)
    {
        if (!af.a(new Object[] {
            timeunit
        })) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        boolean flag;
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!af.a(flag)) goto _L2; else goto _L3
_L3:
        iterator = a.iterator();
_L5:
        if (iterator.hasNext())
        {
            a a1 = (a)iterator.next();
            if (a1 == null || a.a(a1) != com.microsoft.advertising.android.a.a.a.f)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (System.currentTimeMillis() - a1.a() > TimeUnit.MILLISECONDS.convert(l1, timeunit))
            {
                return true;
            }
        }
_L2:
        return false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    final boolean a(com.microsoft.advertising.android.a.a.a a1)
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }
        } while (a.a((a)iterator.next()) != a1);
        return true;
    }

    final void b(com.microsoft.advertising.android.a.a.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(new a(a1));
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    final void b(String s)
    {
        if (b)
        {
            c.b(s);
        }
    }
}
