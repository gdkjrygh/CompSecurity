// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, ra, qu, qo, 
//            qp, qw

public static final class se extends qq
{

    private static volatile azh azI[];
    public String fv;
    public String value;

    public static se[] sd()
    {
        if (azI == null)
        {
            synchronized (qu.azg)
            {
                if (azI == null)
                {
                    azI = new azI[0];
                }
            }
        }
        return azI;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public azI B(qo qo1)
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

            case 18: // '\022'
                value = qo1.readString();
                break;
            }
        } while (true);
    }

    public void a(qp qp1)
        throws IOException
    {
        if (!fv.equals(""))
        {
            qp1.b(1, fv);
        }
        if (!value.equals(""))
        {
            qp1.b(2, value);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return B(qo1);
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
        if (!value.equals(""))
        {
            j = i + qp.j(2, value);
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
        return a(((qq) (obj)));
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
        return ((i + 527) * 31 + j) * 31 + rQ();
    }

    public rQ se()
    {
        fv = "";
        value = "";
        ayW = null;
        azh = -1;
        return this;
    }

    public ()
    {
        se();
    }
}
