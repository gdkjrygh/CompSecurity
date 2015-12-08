// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, c, pl, pg, 
//            pf, pn

public static final class j extends ph
{

    private static volatile awU fD[];
    public int key;
    public int value;

    public static j[] i()
    {
        if (fD == null)
        {
            synchronized (pl.awT)
            {
                if (fD == null)
                {
                    fD = new fD[0];
                }
            }
        }
        return fD;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(pg pg1)
        throws IOException
    {
        pg1.s(1, key);
        pg1.s(2, value);
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return f(pf1);
    }

    protected int c()
    {
        return super.c() + pg.u(1, key) + pg.u(2, value);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof value)
            {
                obj = (value)obj;
                flag = flag1;
                if (key == ((key) (obj)).key)
                {
                    flag = flag1;
                    if (value == ((value) (obj)).value)
                    {
                        return a(((ph) (obj)));
                    }
                }
            }
        }
        return flag;
    }

    public a f(pf pf1)
        throws IOException
    {
        do
        {
            int k = pf1.qi();
            switch (k)
            {
            default:
                if (a(pf1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                key = pf1.ql();
                break;

            case 16: // '\020'
                value = pf1.ql();
                break;
            }
        } while (true);
    }

    public int hashCode()
    {
        return ((key + 527) * 31 + value) * 31 + qz();
    }

    public qz j()
    {
        key = 0;
        value = 0;
        awJ = null;
        awU = -1;
        return this;
    }

    public ()
    {
        j();
    }
}
