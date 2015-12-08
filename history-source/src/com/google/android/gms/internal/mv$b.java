// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, mv, qu, qp, 
//            qo, qw

public static final class na extends qq
{

    private static volatile afz afy[];
    public afz afz;
    public String name;

    public static na[] mZ()
    {
        if (afy == null)
        {
            synchronized (qu.azg)
            {
                if (afy == null)
                {
                    afy = new afy[0];
                }
            }
        }
        return afy;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(qp qp1)
        throws IOException
    {
        if (!name.equals(""))
        {
            qp1.b(1, name);
        }
        if (afz != null)
        {
            qp1.a(2, afz);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return p(qo1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (!name.equals(""))
        {
            i = j + qp.j(1, name);
        }
        j = i;
        if (afz != null)
        {
            j = i + qp.c(2, afz);
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
        if (!(obj instanceof afz)) goto _L4; else goto _L3
_L3:
        obj = (afz)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (afz != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((afz) (obj)).afz != null) goto _L4; else goto _L8
_L8:
        return a(((qq) (obj)));
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
        if (!afz.equals(((equals) (obj)).afz))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (name == null)
        {
            i = 0;
        } else
        {
            i = name.hashCode();
        }
        if (afz != null)
        {
            j = afz.hashCode();
        }
        return ((i + 527) * 31 + j) * 31 + rQ();
    }

    public rQ na()
    {
        name = "";
        afz = null;
        ayW = null;
        azh = -1;
        return this;
    }

    public azh p(qo qo1)
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
                name = qo1.readString();
                break;

            case 18: // '\022'
                if (afz == null)
                {
                    afz = new <init>();
                }
                qo1.a(afz);
                break;
            }
        } while (true);
    }

    public ()
    {
        na();
    }
}
