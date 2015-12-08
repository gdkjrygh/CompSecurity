// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, mv, qp, qu, 
//            qo, qz, qw

public static final class nb extends qq
{

    public afA afA[];
    public String type;

    public void a(qp qp1)
        throws IOException
    {
        if (!type.equals(""))
        {
            qp1.b(1, type);
        }
        if (afA != null && afA.length > 0)
        {
            for (int i = 0; i < afA.length; i++)
            {
                nb nb1 = afA[i];
                if (nb1 != null)
                {
                    qp1.a(2, nb1);
                }
            }

        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return q(qo1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (!type.equals(""))
        {
            i = j + qp.j(1, type);
        }
        j = i;
        if (afA != null)
        {
            j = i;
            if (afA.length > 0)
            {
                for (j = 0; j < afA.length;)
                {
                    q q1 = afA[j];
                    int k = i;
                    if (q1 != null)
                    {
                        k = i + qp.c(2, q1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
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
        if (!(obj instanceof afA))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (afA)obj;
        if (type != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((type) (obj)).type != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (qu.equals(afA, ((afA) (obj)).afA))
        {
            return a(((qq) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!type.equals(((type) (obj)).type))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int i;
        if (type == null)
        {
            i = 0;
        } else
        {
            i = type.hashCode();
        }
        return ((i + 527) * 31 + qu.hashCode(afA)) * 31 + rQ();
    }

    public rQ nb()
    {
        type = "";
        afA = mZ();
        ayW = null;
        azh = -1;
        return this;
    }

    public azh q(qo qo1)
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
                type = qo1.readString();
                break;

            case 18: // '\022'
                int k = qz.b(qo1, 18);
                azh aazh[];
                int j;
                if (afA == null)
                {
                    j = 0;
                } else
                {
                    j = afA.length;
                }
                aazh = new afA[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(afA, 0, aazh, 0, j);
                    k = j;
                }
                for (; k < aazh.length - 1; k++)
                {
                    aazh[k] = new <init>();
                    qo1.a(aazh[k]);
                    qo1.rz();
                }

                aazh[k] = new <init>();
                qo1.a(aazh[k]);
                afA = aazh;
                break;
            }
        } while (true);
    }

    public ()
    {
        nb();
    }
}
