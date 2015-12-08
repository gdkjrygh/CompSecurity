// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.pf;
import com.google.android.gms.internal.pg;
import com.google.android.gms.internal.ph;
import com.google.android.gms.internal.pm;
import com.google.android.gms.internal.pn;
import java.io.IOException;

public final class ah extends ph
{

    public String Pl;
    public long Pm;
    public long Pn;
    public int versionCode;

    public ah()
    {
        ic();
    }

    public static ah g(byte abyte0[])
        throws pm
    {
        return (ah)pn.a(new ah(), abyte0);
    }

    public void a(pg pg1)
        throws IOException
    {
        pg1.s(1, versionCode);
        pg1.b(2, Pl);
        pg1.c(3, Pm);
        pg1.c(4, Pn);
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return m(pf1);
    }

    protected int c()
    {
        return super.c() + pg.u(1, versionCode) + pg.j(2, Pl) + pg.e(3, Pm) + pg.e(4, Pn);
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
        if (!(obj instanceof ah))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (ah)obj;
        flag = flag1;
        if (versionCode != ((ah) (obj)).versionCode)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Pl != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((ah) (obj)).Pl != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (Pm == ((ah) (obj)).Pm)
        {
            flag = flag1;
            if (Pn == ((ah) (obj)).Pn)
            {
                return a(((ph) (obj)));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!Pl.equals(((ah) (obj)).Pl))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j = versionCode;
        int i;
        if (Pl == null)
        {
            i = 0;
        } else
        {
            i = Pl.hashCode();
        }
        return (((i + (j + 527) * 31) * 31 + (int)(Pm ^ Pm >>> 32)) * 31 + (int)(Pn ^ Pn >>> 32)) * 31 + qz();
    }

    public ah ic()
    {
        versionCode = 1;
        Pl = "";
        Pm = -1L;
        Pn = -1L;
        awJ = null;
        awU = -1;
        return this;
    }

    public ah m(pf pf1)
        throws IOException
    {
        do
        {
            int i = pf1.qi();
            switch (i)
            {
            default:
                if (a(pf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                versionCode = pf1.ql();
                break;

            case 18: // '\022'
                Pl = pf1.readString();
                break;

            case 24: // '\030'
                Pm = pf1.qo();
                break;

            case 32: // ' '
                Pn = pf1.qo();
                break;
            }
        } while (true);
    }
}
