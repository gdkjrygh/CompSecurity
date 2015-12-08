// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            qq, qu, qp, qo, 
//            qw

public final class p extends qq
{

    private static volatile azh go[];
    public azh gp;
    public azh gq;
    public String name;

    public static p[] o()
    {
        if (go == null)
        {
            synchronized (qu.azg)
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

    public final void a(qp qp1)
    {
        if (!name.equals(""))
        {
            qp1.b(1, name);
        }
        if (gp != null)
        {
            qp1.a(2, gp);
        }
        if (gq != null)
        {
            qp1.a(3, gq);
        }
        super.a(qp1);
    }

    public final qw b(qo qo1)
    {
        return j(qo1);
    }

    protected final int c()
    {
        int k = super.c();
        int i = k;
        if (!name.equals(""))
        {
            i = k + qp.j(1, name);
        }
        k = i;
        if (gp != null)
        {
            k = i + qp.c(2, gp);
        }
        i = k;
        if (gq != null)
        {
            i = k + qp.c(3, gq);
        }
        return i;
    }

    public final boolean equals(Object obj)
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
        return a(((qq) (obj)));
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

    public final int hashCode()
    {
        int l = 0;
        int i;
        int k;
        if (name == null)
        {
            i = 0;
        } else
        {
            i = name.hashCode();
        }
        if (gp == null)
        {
            k = 0;
        } else
        {
            k = gp.hashCode();
        }
        if (gq != null)
        {
            l = gq.hashCode();
        }
        return ((k + (i + 527) * 31) * 31 + l) * 31 + rQ();
    }

    public final rQ j(qo qo1)
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
                name = qo1.readString();
                break;

            case 18: // '\022'
                if (gp == null)
                {
                    gp = new <init>();
                }
                qo1.a(gp);
                break;

            case 26: // '\032'
                if (gq == null)
                {
                    gq = new <init>();
                }
                qo1.a(gq);
                break;
            }
        } while (true);
    }

    public final gq p()
    {
        name = "";
        gp = null;
        gq = null;
        ayW = null;
        azh = -1;
        return this;
    }

    public ()
    {
        p();
    }
}
