// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kp, c, kr, ko, 
//            kn, kt

public static final class p extends kp
{

    private static volatile adY fG[];
    public adY fH;
    public adY fI;
    public String name;

    public static p[] o()
    {
        if (fG == null)
        {
            synchronized (kr.adX)
            {
                if (fG == null)
                {
                    fG = new fG[0];
                }
            }
        }
        return fG;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ko ko1)
        throws IOException
    {
        if (!name.equals(""))
        {
            ko1.b(1, name);
        }
        if (fH != null)
        {
            ko1.a(2, fH);
        }
        if (fI != null)
        {
            ko1.a(3, fI);
        }
        super.a(ko1);
    }

    public kt b(kn kn1)
        throws IOException
    {
        return j(kn1);
    }

    public int c()
    {
        int l = super.c();
        int k = l;
        if (!name.equals(""))
        {
            k = l + ko.g(1, name);
        }
        l = k;
        if (fH != null)
        {
            l = k + ko.b(2, fH);
        }
        k = l;
        if (fI != null)
        {
            k = l + ko.b(3, fI);
        }
        adY = k;
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
        if (!(obj instanceof adY)) goto _L4; else goto _L3
_L3:
        obj = (adY)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (fH != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((fH) (obj)).fH != null) goto _L4; else goto _L10
_L10:
        if (fI != null) goto _L12; else goto _L11
_L11:
        flag = flag1;
        if (((fI) (obj)).fI != null) goto _L4; else goto _L13
_L13:
        if (adU != null && !adU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (((adU) (obj)).adU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((adU) (obj)).adU.isEmpty()) goto _L4; else goto _L14
_L14:
        return true;
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
_L9:
        if (!fH.equals(((equals) (obj)).fH))
        {
            return false;
        }
          goto _L10
_L12:
        if (!fI.equals(((equals) (obj)).fI))
        {
            return false;
        }
          goto _L13
        return adU.equals(((adU) (obj)).adU);
          goto _L7
    }

    public int hashCode()
    {
        boolean flag = false;
        int k;
        int l;
        int i1;
        int j1;
        if (name == null)
        {
            k = 0;
        } else
        {
            k = name.hashCode();
        }
        if (fH == null)
        {
            l = 0;
        } else
        {
            l = fH.hashCode();
        }
        if (fI == null)
        {
            i1 = 0;
        } else
        {
            i1 = fI.hashCode();
        }
        j1 = ((flag) ? 1 : 0);
        if (adU != null)
        {
            if (adU.isEmpty())
            {
                j1 = ((flag) ? 1 : 0);
            } else
            {
                j1 = adU.hashCode();
            }
        }
        return (i1 + (l + (k + 527) * 31) * 31) * 31 + j1;
    }

    public adU j(kn kn1)
        throws IOException
    {
        do
        {
            int k = kn1.mh();
            switch (k)
            {
            default:
                if (a(kn1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                name = kn1.readString();
                break;

            case 18: // '\022'
                if (fH == null)
                {
                    fH = new <init>();
                }
                kn1.a(fH);
                break;

            case 26: // '\032'
                if (fI == null)
                {
                    fI = new <init>();
                }
                kn1.a(fI);
                break;
            }
        } while (true);
    }

    public fI p()
    {
        name = "";
        fH = null;
        fI = null;
        adU = null;
        adY = -1;
        return this;
    }

    public ()
    {
        p();
    }
}
