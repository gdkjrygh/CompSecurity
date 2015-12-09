// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kp, c, ks, kt, 
//            ko, kr, kn, kw

public static final class q extends kp
{

    public adY fJ[];
    public adY fK;
    public String fL;

    public static q b(byte abyte0[])
        throws ks
    {
        return (q)kt.a(new <init>(), abyte0);
    }

    public void a(ko ko1)
        throws IOException
    {
        if (fJ != null && fJ.length > 0)
        {
            for (int i = 0; i < fJ.length; i++)
            {
                <init> <init>1 = fJ[i];
                if (<init>1 != null)
                {
                    ko1.a(1, <init>1);
                }
            }

        }
        if (fK != null)
        {
            ko1.a(2, fK);
        }
        if (!fL.equals(""))
        {
            ko1.b(3, fL);
        }
        super.a(ko1);
    }

    public kt b(kn kn1)
        throws IOException
    {
        return k(kn1);
    }

    public int c()
    {
        int i = super.c();
        int l = i;
        if (fJ != null)
        {
            l = i;
            if (fJ.length > 0)
            {
                int i1 = 0;
                do
                {
                    l = i;
                    if (i1 >= fJ.length)
                    {
                        break;
                    }
                    k k1 = fJ[i1];
                    l = i;
                    if (k1 != null)
                    {
                        l = i + ko.b(1, k1);
                    }
                    i1++;
                    i = l;
                } while (true);
            }
        }
        i = l;
        if (fK != null)
        {
            i = l + ko.b(2, fK);
        }
        l = i;
        if (!fL.equals(""))
        {
            l = i + ko.g(3, fL);
        }
        adY = l;
        return l;
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
        if (!(obj instanceof adY)) goto _L4; else goto _L3
_L3:
        obj = (adY)obj;
        flag = flag1;
        if (!kr.equals(fJ, ((fJ) (obj)).fJ)) goto _L4; else goto _L5
_L5:
        if (fK != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((fK) (obj)).fK != null) goto _L4; else goto _L8
_L8:
        if (fL != null) goto _L10; else goto _L9
_L9:
        flag = flag1;
        if (((fL) (obj)).fL != null) goto _L4; else goto _L11
_L11:
        if (adU != null && !adU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (((adU) (obj)).adU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((adU) (obj)).adU.isEmpty()) goto _L4; else goto _L12
_L12:
        return true;
_L7:
        if (!fK.equals(((equals) (obj)).fK))
        {
            return false;
        }
          goto _L8
_L10:
        if (!fL.equals(((fL) (obj)).fL))
        {
            return false;
        }
          goto _L11
        return adU.equals(((adU) (obj)).adU);
          goto _L8
    }

    public int hashCode()
    {
        boolean flag = false;
        int j1 = kr.hashCode(fJ);
        int i;
        int l;
        int i1;
        if (fK == null)
        {
            i = 0;
        } else
        {
            i = fK.hashCode();
        }
        if (fL == null)
        {
            l = 0;
        } else
        {
            l = fL.hashCode();
        }
        i1 = ((flag) ? 1 : 0);
        if (adU != null)
        {
            if (adU.isEmpty())
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = adU.hashCode();
            }
        }
        return (l + (i + (j1 + 527) * 31) * 31) * 31 + i1;
    }

    public adU k(kn kn1)
        throws IOException
    {
        do
        {
            int i = kn1.mh();
            switch (i)
            {
            default:
                if (a(kn1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int i1 = kw.b(kn1, 10);
                adU aadu[];
                int l;
                if (fJ == null)
                {
                    l = 0;
                } else
                {
                    l = fJ.length;
                }
                aadu = new fJ[i1 + l];
                i1 = l;
                if (l != 0)
                {
                    System.arraycopy(fJ, 0, aadu, 0, l);
                    i1 = l;
                }
                for (; i1 < aadu.length - 1; i1++)
                {
                    aadu[i1] = new <init>();
                    kn1.a(aadu[i1]);
                    kn1.mh();
                }

                aadu[i1] = new <init>();
                kn1.a(aadu[i1]);
                fJ = aadu;
                break;

            case 18: // '\022'
                if (fK == null)
                {
                    fK = new <init>();
                }
                kn1.a(fK);
                break;

            case 26: // '\032'
                fL = kn1.readString();
                break;
            }
        } while (true);
    }

    public eadString q()
    {
        fJ = o();
        fK = null;
        fL = "";
        adU = null;
        adY = -1;
        return this;
    }

    public ()
    {
        q();
    }
}
