// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, mv, qp, qo, 
//            qw

public static final class nc extends qq
{

    public String NJ;
    public boolean afB;
    public long afC;
    public double afD;
    public afE afE;

    public void a(qp qp1)
        throws IOException
    {
        if (afB)
        {
            qp1.b(1, afB);
        }
        if (!NJ.equals(""))
        {
            qp1.b(2, NJ);
        }
        if (afC != 0L)
        {
            qp1.b(3, afC);
        }
        if (Double.doubleToLongBits(afD) != Double.doubleToLongBits(0.0D))
        {
            qp1.a(4, afD);
        }
        if (afE != null)
        {
            qp1.a(5, afE);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return r(qo1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (afB)
        {
            i = j + qp.c(1, afB);
        }
        j = i;
        if (!NJ.equals(""))
        {
            j = i + qp.j(2, NJ);
        }
        i = j;
        if (afC != 0L)
        {
            i = j + qp.d(3, afC);
        }
        j = i;
        if (Double.doubleToLongBits(afD) != Double.doubleToLongBits(0.0D))
        {
            j = i + qp.b(4, afD);
        }
        i = j;
        if (afE != null)
        {
            i = j + qp.c(5, afE);
        }
        return i;
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
        if (!(obj instanceof afE)) goto _L4; else goto _L3
_L3:
        obj = (afE)obj;
        flag = flag1;
        if (afB != ((afB) (obj)).afB) goto _L4; else goto _L5
_L5:
        if (NJ != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((NJ) (obj)).NJ != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (afC != ((afC) (obj)).afC) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (Double.doubleToLongBits(afD) != Double.doubleToLongBits(((afD) (obj)).afD)) goto _L4; else goto _L10
_L10:
        if (afE != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = flag1;
        if (((afE) (obj)).afE != null) goto _L4; else goto _L11
_L11:
        return a(((qq) (obj)));
_L7:
        if (!NJ.equals(((NJ) (obj)).NJ))
        {
            return false;
        }
          goto _L8
        if (!afE.equals(((equals) (obj)).afE))
        {
            return false;
        }
          goto _L11
    }

    public int hashCode()
    {
        int j = 0;
        char c1;
        int i;
        int k;
        int l;
        long l1;
        if (afB)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (NJ == null)
        {
            i = 0;
        } else
        {
            i = NJ.hashCode();
        }
        k = (int)(afC ^ afC >>> 32);
        l1 = Double.doubleToLongBits(afD);
        l = (int)(l1 ^ l1 >>> 32);
        if (afE != null)
        {
            j = afE.hashCode();
        }
        return ((((i + (c1 + 527) * 31) * 31 + k) * 31 + l) * 31 + j) * 31 + rQ();
    }

    public rQ nc()
    {
        afB = false;
        NJ = "";
        afC = 0L;
        afD = 0.0D;
        afE = null;
        ayW = null;
        azh = -1;
        return this;
    }

    public azh r(qo qo1)
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

            case 8: // '\b'
                afB = qo1.rD();
                break;

            case 18: // '\022'
                NJ = qo1.readString();
                break;

            case 24: // '\030'
                afC = qo1.rB();
                break;

            case 33: // '!'
                afD = qo1.readDouble();
                break;

            case 42: // '*'
                if (afE == null)
                {
                    afE = new <init>();
                }
                qo1.a(afE);
                break;
            }
        } while (true);
    }

    public ()
    {
        nc();
    }
}
