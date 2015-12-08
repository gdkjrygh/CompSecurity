// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.os.SystemClock;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.cq.c;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.OutputStream;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            y, q, d

public final class af extends n
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(q q1, com.google.android.m4b.maps.ac.a a1);

        public abstract void a(String s, int k, int l, int i1, int j1, byte abyte0[]);
    }


    private static int f = 0;
    final com.google.android.m4b.maps.ac.a a;
    int b;
    com.google.android.m4b.maps.ac.a c;
    boolean d;
    StringBuilder e;
    private final a g;
    private String h;
    private boolean i;
    private final m j;

    private af(a a1, m m1)
    {
        b = -1;
        d = true;
        a(a1, "listener");
        g = a1;
        a = new com.google.android.m4b.maps.ac.a(c.b);
        a.a(51, true);
        a.a(58, 4L);
        a.a(59, 3);
        a.a(59, 4);
        e = new StringBuilder("PR sending request ");
        j = m1;
    }

    public af(a a1, y y1, int k, m m1)
    {
        this(a1, m1);
        a(y1, "mapPoint");
        a1 = y1.a();
        a.a(2, a1);
        a.a(63, k);
        e.append("@ ").append(y1);
    }

    public af(a a1, y y1, m m1)
    {
        this(a1, m1);
        a(y1, "mapPoint");
        a1 = y1.a();
        a.a(2, a1);
        e.append("@ ").append(y1);
    }

    public af(a a1, String s, m m1)
    {
        this(a1, m1);
        a(s, "panoId");
        h = s;
        a.a(1, s);
        e.append(s);
    }

    private static void a(Object obj, String s)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public final void a(DataOutput dataoutput)
    {
        a.a((OutputStream)dataoutput, true);
    }

    public final boolean a(DataInput datainput)
    {
        SystemClock.uptimeMillis();
        com.google.android.m4b.maps.ac.a a1 = com.google.android.m4b.maps.ac.c.a(c.c, datainput);
        String s = a1.g(2);
        datainput = a1.f(3);
        if (datainput != null)
        {
            byte abyte0[] = new q(datainput);
            Object obj = ((q) (abyte0)).i;
            int k;
            int i1;
            int j1;
            int k1;
            int l1;
            if ((((q) (abyte0)).c & 2) != 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k == 0)
            {
                k = 0;
            } else
            if (((q) (abyte0)).d == 0)
            {
                k = 2000;
            } else
            {
                k = ((q) (abyte0)).d;
            }
            f = k;
            if (!((String) (obj)).equals(s))
            {
                com.google.android.m4b.maps.bv.d.b((new StringBuilder(String.valueOf(obj).length() + 32 + String.valueOf(s).length())).append("PR received config ").append(((String) (obj))).append(" != response ").append(s).toString());
            }
            if (h != null && !((String) (obj)).equals(h))
            {
                String s1 = h;
                com.google.android.m4b.maps.bv.d.b((new StringBuilder(String.valueOf(obj).length() + 31 + String.valueOf(s1).length())).append("PR received config ").append(((String) (obj))).append(" != request ").append(s1).toString());
            }
            g.a(abyte0, datainput);
        }
        obj = a1.f(17);
        if (obj != null)
        {
            i1 = ((com.google.android.m4b.maps.ac.a) (obj)).d(19);
            if (i1 != b)
            {
                k = b;
                com.google.android.m4b.maps.bv.d.b((new StringBuilder(51)).append("PR received zoom ").append(i1).append(" != request ").append(k).toString());
            }
            j1 = ((com.google.android.m4b.maps.ac.a) (obj)).j(22);
            k = 0;
            while (k < j1) 
            {
                datainput = ((com.google.android.m4b.maps.ac.a) (obj)).c(22, k);
                k1 = datainput.d(23);
                l1 = datainput.d(24);
                int l;
                if (datainput.i(26))
                {
                    l = datainput.d(26);
                } else
                {
                    l = -1;
                }
                abyte0 = datainput.c(25);
                datainput = abyte0;
                if (abyte0.length > 1)
                {
                    datainput = abyte0;
                    if (abyte0[0] == 67)
                    {
                        datainput = com.google.android.m4b.maps.at.c.a(abyte0);
                    }
                }
                g.a(s, i1, k1, l1, l, datainput);
                k++;
            }
        }
        a1.b(34);
        g.a();
        return true;
    }

    public final boolean c()
    {
        return d;
    }

    public final int g()
    {
        return 40;
    }

    public final af h()
    {
        e.append(" config");
        com.google.android.m4b.maps.ac.a a1 = com.google.android.m4b.maps.ac.c.b(a, 17);
        a1.a(56, true);
        a1.a(57, true);
        return this;
    }

    public final void i()
    {
        if (i)
        {
            throw new IllegalStateException("already queued");
        }
        i = true;
        com.google.android.m4b.maps.bv.d.a(e.toString());
        e = null;
        if (f > 0 && a.i(17))
        {
            try
            {
                Thread.sleep(f);
            }
            catch (InterruptedException interruptedexception) { }
            f = 0;
        }
        j.c(this);
    }

}
