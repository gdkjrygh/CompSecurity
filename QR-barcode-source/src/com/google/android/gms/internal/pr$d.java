// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, pr, pl, pg, 
//            pf, pn

public static final class qN extends ph
{

    private static volatile adString axu[];
    public String fv;
    public String value;

    public static qN[] qM()
    {
        if (axu == null)
        {
            synchronized (pl.awT)
            {
                if (axu == null)
                {
                    axu = new axu[0];
                }
            }
        }
        return axu;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(pg pg1)
        throws IOException
    {
        if (!fv.equals(""))
        {
            pg1.b(1, fv);
        }
        if (!value.equals(""))
        {
            pg1.b(2, value);
        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return y(pf1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (!fv.equals(""))
        {
            i = j + pg.j(1, fv);
        }
        j = i;
        if (!value.equals(""))
        {
            j = i + pg.j(2, value);
        }
        return j;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof value)) goto _L4; else goto _L3
_L3:
        obj = (value)obj;
        if (fv != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((fv) (obj)).fv != null) goto _L4; else goto _L7
_L7:
        if (value != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((value) (obj)).value != null) goto _L4; else goto _L8
_L8:
        return a(((ph) (obj)));
_L6:
        if (!fv.equals(((fv) (obj)).fv))
        {
            return false;
        }
          goto _L7
        if (!value.equals(((value) (obj)).value))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (fv == null)
        {
            i = 0;
        } else
        {
            i = fv.hashCode();
        }
        if (value != null)
        {
            j = value.hashCode();
        }
        return ((i + 527) * 31 + j) * 31 + qz();
    }

    public qz qN()
    {
        fv = "";
        value = "";
        awJ = null;
        awU = -1;
        return this;
    }

    public awU y(pf pf1)
        throws IOException
    {
        do
        {
            int i = pf1.qi();
            switch (i)
            {
            default:
                if (a(pf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                fv = pf1.readString();
                break;

            case 18: // '\022'
                value = pf1.readString();
                break;
            }
        } while (true);
    }

    public ()
    {
        qN();
    }
}
