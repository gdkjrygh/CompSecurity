// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            qq, ra, qo, qz, 
//            qp, qu, qw

public static final class sc extends qq
{

    public azh azA[];
    public azh azB;
    public byte azC[];
    public byte azD[];
    public byte azE[];
    public azh azF;
    public String azG;
    public long azH;
    public long azw;
    public int azx;
    public int azy;
    public boolean azz;
    public String tag;

    public sc A(qo qo1)
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
                azw = qo1.rB();
                break;

            case 18: // '\022'
                tag = qo1.readString();
                break;

            case 26: // '\032'
                int k = qz.b(qo1, 26);
                sc asc[];
                int j;
                if (azA == null)
                {
                    j = 0;
                } else
                {
                    j = azA.length;
                }
                asc = new azA[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(azA, 0, asc, 0, j);
                    k = j;
                }
                for (; k < asc.length - 1; k++)
                {
                    asc[k] = new <init>();
                    qo1.a(asc[k]);
                    qo1.rz();
                }

                asc[k] = new <init>();
                qo1.a(asc[k]);
                azA = asc;
                break;

            case 50: // '2'
                azC = qo1.readBytes();
                break;

            case 58: // ':'
                if (azF == null)
                {
                    azF = new <init>();
                }
                qo1.a(azF);
                break;

            case 66: // 'B'
                azD = qo1.readBytes();
                break;

            case 74: // 'J'
                if (azB == null)
                {
                    azB = new <init>();
                }
                qo1.a(azB);
                break;

            case 80: // 'P'
                azz = qo1.rD();
                break;

            case 88: // 'X'
                azx = qo1.rC();
                break;

            case 96: // '`'
                azy = qo1.rC();
                break;

            case 106: // 'j'
                azE = qo1.readBytes();
                break;

            case 114: // 'r'
                azG = qo1.readString();
                break;

            case 120: // 'x'
                azH = qo1.rF();
                break;
            }
        } while (true);
    }

    public void a(qp qp1)
        throws IOException
    {
        if (azw != 0L)
        {
            qp1.b(1, azw);
        }
        if (!tag.equals(""))
        {
            qp1.b(2, tag);
        }
        if (azA != null && azA.length > 0)
        {
            for (int i = 0; i < azA.length; i++)
            {
                  = azA[i];
                if ( != null)
                {
                    qp1.a(3, );
                }
            }

        }
        if (!Arrays.equals(azC, qz.azq))
        {
            qp1.a(6, azC);
        }
        if (azF != null)
        {
            qp1.a(7, azF);
        }
        if (!Arrays.equals(azD, qz.azq))
        {
            qp1.a(8, azD);
        }
        if (azB != null)
        {
            qp1.a(9, azB);
        }
        if (azz)
        {
            qp1.b(10, azz);
        }
        if (azx != 0)
        {
            qp1.t(11, azx);
        }
        if (azy != 0)
        {
            qp1.t(12, azy);
        }
        if (!Arrays.equals(azE, qz.azq))
        {
            qp1.a(13, azE);
        }
        if (!azG.equals(""))
        {
            qp1.b(14, azG);
        }
        if (azH != 0L)
        {
            qp1.c(15, azH);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return A(qo1);
    }

    protected int c()
    {
        int i = super.c();
        int j = i;
        if (azw != 0L)
        {
            j = i + qp.d(1, azw);
        }
        i = j;
        if (!tag.equals(""))
        {
            i = j + qp.j(2, tag);
        }
        j = i;
        if (azA != null)
        {
            j = i;
            if (azA.length > 0)
            {
                for (j = 0; j < azA.length;)
                {
                    A a1 = azA[j];
                    int k = i;
                    if (a1 != null)
                    {
                        k = i + qp.c(3, a1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (!Arrays.equals(azC, qz.azq))
        {
            i = j + qp.b(6, azC);
        }
        j = i;
        if (azF != null)
        {
            j = i + qp.c(7, azF);
        }
        i = j;
        if (!Arrays.equals(azD, qz.azq))
        {
            i = j + qp.b(8, azD);
        }
        j = i;
        if (azB != null)
        {
            j = i + qp.c(9, azB);
        }
        i = j;
        if (azz)
        {
            i = j + qp.c(10, azz);
        }
        j = i;
        if (azx != 0)
        {
            j = i + qp.v(11, azx);
        }
        i = j;
        if (azy != 0)
        {
            i = j + qp.v(12, azy);
        }
        j = i;
        if (!Arrays.equals(azE, qz.azq))
        {
            j = i + qp.b(13, azE);
        }
        i = j;
        if (!azG.equals(""))
        {
            i = j + qp.j(14, azG);
        }
        j = i;
        if (azH != 0L)
        {
            j = i + qp.e(15, azH);
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
        if (!(obj instanceof azH)) goto _L4; else goto _L3
_L3:
        obj = (azH)obj;
        flag = flag1;
        if (azw != ((azw) (obj)).azw) goto _L4; else goto _L5
_L5:
        if (tag != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((tag) (obj)).tag != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (azx != ((azx) (obj)).azx) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (azy != ((azy) (obj)).azy) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (azz != ((azz) (obj)).azz) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!qu.equals(azA, ((azA) (obj)).azA)) goto _L4; else goto _L12
_L12:
        if (azB != null) goto _L14; else goto _L13
_L13:
        flag = flag1;
        if (((azB) (obj)).azB != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (!Arrays.equals(azC, ((azC) (obj)).azC)) goto _L4; else goto _L16
_L16:
        flag = flag1;
        if (!Arrays.equals(azD, ((azD) (obj)).azD)) goto _L4; else goto _L17
_L17:
        flag = flag1;
        if (!Arrays.equals(azE, ((azE) (obj)).azE)) goto _L4; else goto _L18
_L18:
        if (azF != null) goto _L20; else goto _L19
_L19:
        flag = flag1;
        if (((azF) (obj)).azF != null) goto _L4; else goto _L21
_L21:
        if (azG != null)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        flag = flag1;
        if (((azG) (obj)).azG != null) goto _L4; else goto _L22
_L22:
        flag = flag1;
        if (azH == ((azH) (obj)).azH)
        {
            return a(((qq) (obj)));
        }
          goto _L4
_L7:
        if (!tag.equals(((tag) (obj)).tag))
        {
            return false;
        }
          goto _L8
_L14:
        if (!azB.equals(((equals) (obj)).azB))
        {
            return false;
        }
          goto _L15
_L20:
        if (!azF.equals(((equals) (obj)).azF))
        {
            return false;
        }
          goto _L21
        if (!azG.equals(((azG) (obj)).azG))
        {
            return false;
        }
          goto _L22
    }

    public int hashCode()
    {
        int l = 0;
        int i1 = (int)(azw ^ azw >>> 32);
        int i;
        char c1;
        int j;
        int k;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (tag == null)
        {
            i = 0;
        } else
        {
            i = tag.hashCode();
        }
        j1 = azx;
        k1 = azy;
        if (azz)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        l1 = qu.hashCode(azA);
        if (azB == null)
        {
            j = 0;
        } else
        {
            j = azB.hashCode();
        }
        i2 = Arrays.hashCode(azC);
        j2 = Arrays.hashCode(azD);
        k2 = Arrays.hashCode(azE);
        if (azF == null)
        {
            k = 0;
        } else
        {
            k = azF.hashCode();
        }
        if (azG != null)
        {
            l = azG.hashCode();
        }
        return (((k + ((((j + ((c1 + (((i + (i1 + 527) * 31) * 31 + j1) * 31 + k1) * 31) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + l) * 31 + (int)(azH ^ azH >>> 32)) * 31 + rQ();
    }

    public rQ sc()
    {
        azw = 0L;
        tag = "";
        azx = 0;
        azy = 0;
        azz = false;
        azA = sd();
        azB = null;
        azC = qz.azq;
        azD = qz.azq;
        azE = qz.azq;
        azF = null;
        azG = "";
        azH = 0L;
        ayW = null;
        azh = -1;
        return this;
    }

    public ()
    {
        sc();
    }
}
