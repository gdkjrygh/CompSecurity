// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, c, qu, qp, 
//            qo, qw

public static final class g extends qq
{

    private static volatile rQ fu[];
    public String fv;
    public long fw;
    public long fx;
    public boolean fy;
    public long fz;

    public static g[] f()
    {
        if (fu == null)
        {
            synchronized (qu.azg)
            {
                if (fu == null)
                {
                    fu = new fu[0];
                }
            }
        }
        return fu;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(qp qp1)
        throws IOException
    {
        if (!fv.equals(""))
        {
            qp1.b(1, fv);
        }
        if (fw != 0L)
        {
            qp1.b(2, fw);
        }
        if (fx != 0x7fffffffL)
        {
            qp1.b(3, fx);
        }
        if (fy)
        {
            qp1.b(4, fy);
        }
        if (fz != 0L)
        {
            qp1.b(5, fz);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return d(qo1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (!fv.equals(""))
        {
            i = j + qp.j(1, fv);
        }
        j = i;
        if (fw != 0L)
        {
            j = i + qp.d(2, fw);
        }
        i = j;
        if (fx != 0x7fffffffL)
        {
            i = j + qp.d(3, fx);
        }
        j = i;
        if (fy)
        {
            j = i + qp.c(4, fy);
        }
        i = j;
        if (fz != 0L)
        {
            i = j + qp.d(5, fz);
        }
        return i;
    }

    public fz d(qo qo1)
        throws IOException
    {
        do
        {
            int i = qo1.rz();
            switch (i)
            {
            default:
                if (a(qo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                fv = qo1.readString();
                break;

            case 16: // '\020'
                fw = qo1.rB();
                break;

            case 24: // '\030'
                fx = qo1.rB();
                break;

            case 32: // ' '
                fy = qo1.rD();
                break;

            case 40: // '('
                fz = qo1.rB();
                break;
            }
        } while (true);
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
        if (!(obj instanceof B))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (B)obj;
        if (fv != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((fv) (obj)).fv != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (fw == ((fw) (obj)).fw)
        {
            flag = flag1;
            if (fx == ((fx) (obj)).fx)
            {
                flag = flag1;
                if (fy == ((fy) (obj)).fy)
                {
                    flag = flag1;
                    if (fz == ((fz) (obj)).fz)
                    {
                        return a(((qq) (obj)));
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!fv.equals(((fv) (obj)).fv))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public fv g()
    {
        fv = "";
        fw = 0L;
        fx = 0x7fffffffL;
        fy = false;
        fz = 0L;
        ayW = null;
        azh = -1;
        return this;
    }

    public int hashCode()
    {
        int i;
        char c1;
        int j;
        int k;
        if (fv == null)
        {
            i = 0;
        } else
        {
            i = fv.hashCode();
        }
        j = (int)(fw ^ fw >>> 32);
        k = (int)(fx ^ fx >>> 32);
        if (fy)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return ((c1 + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + (int)(fz ^ fz >>> 32)) * 31 + rQ();
    }

    public ()
    {
        g();
    }
}
