// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, c, pl, pg, 
//            pf, pn

public static final class p extends ph
{

    private static volatile awU go[];
    public awU gp;
    public awU gq;
    public String name;

    public static p[] o()
    {
        if (go == null)
        {
            synchronized (pl.awT)
            {
                if (go == null)
                {
                    go = new go[0];
                }
            }
        }
        return go;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(pg pg1)
        throws IOException
    {
        if (!name.equals(""))
        {
            pg1.b(1, name);
        }
        if (gp != null)
        {
            pg1.a(2, gp);
        }
        if (gq != null)
        {
            pg1.a(3, gq);
        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return j(pf1);
    }

    protected int c()
    {
        int l = super.c();
        int k = l;
        if (!name.equals(""))
        {
            k = l + pg.j(1, name);
        }
        l = k;
        if (gp != null)
        {
            l = k + pg.c(2, gp);
        }
        k = l;
        if (gq != null)
        {
            k = l + pg.c(3, gq);
        }
        return k;
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
        if (!(obj instanceof gq)) goto _L4; else goto _L3
_L3:
        obj = (gq)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (gp != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((gp) (obj)).gp != null) goto _L4; else goto _L10
_L10:
        if (gq != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        flag = flag1;
        if (((gq) (obj)).gq != null) goto _L4; else goto _L11
_L11:
        return a(((ph) (obj)));
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
_L9:
        if (!gp.equals(((equals) (obj)).gp))
        {
            return false;
        }
          goto _L10
        if (!gq.equals(((equals) (obj)).gq))
        {
            return false;
        }
          goto _L11
    }

    public int hashCode()
    {
        int i1 = 0;
        int k;
        int l;
        if (name == null)
        {
            k = 0;
        } else
        {
            k = name.hashCode();
        }
        if (gp == null)
        {
            l = 0;
        } else
        {
            l = gp.hashCode();
        }
        if (gq != null)
        {
            i1 = gq.hashCode();
        }
        return ((l + (k + 527) * 31) * 31 + i1) * 31 + qz();
    }

    public qz j(pf pf1)
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

            case 10: // '\n'
                name = pf1.readString();
                break;

            case 18: // '\022'
                if (gp == null)
                {
                    gp = new <init>();
                }
                pf1.a(gp);
                break;

            case 26: // '\032'
                if (gq == null)
                {
                    gq = new <init>();
                }
                pf1.a(gq);
                break;
            }
        } while (true);
    }

    public gq p()
    {
        name = "";
        gp = null;
        gq = null;
        awJ = null;
        awU = -1;
        return this;
    }

    public ()
    {
        p();
    }
}
