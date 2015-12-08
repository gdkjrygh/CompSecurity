// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.kn;
import com.google.android.gms.internal.ko;
import com.google.android.gms.internal.kp;
import com.google.android.gms.internal.ks;
import com.google.android.gms.internal.kt;
import java.io.IOException;
import java.util.List;

public final class y extends kp
{

    public String FC;
    public long FD;
    public long FE;
    public int versionCode;

    public y()
    {
        fH();
    }

    public static y g(byte abyte0[])
        throws ks
    {
        return (y)kt.a(new y(), abyte0);
    }

    public void a(ko ko1)
        throws IOException
    {
        ko1.i(1, versionCode);
        ko1.b(2, FC);
        ko1.c(3, FD);
        ko1.c(4, FE);
        super.a(ko1);
    }

    public kt b(kn kn1)
        throws IOException
    {
        return m(kn1);
    }

    public int c()
    {
        int i = super.c() + ko.j(1, versionCode) + ko.g(2, FC) + ko.e(3, FD) + ko.e(4, FE);
        adY = i;
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
        if (!(obj instanceof y)) goto _L4; else goto _L3
_L3:
        obj = (y)obj;
        flag = flag1;
        if (versionCode != ((y) (obj)).versionCode) goto _L4; else goto _L5
_L5:
        if (FC != null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        flag = flag1;
        if (((y) (obj)).FC != null) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (FD != ((y) (obj)).FD) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (FE != ((y) (obj)).FE) goto _L4; else goto _L8
_L8:
        if (adU != null && !adU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (((y) (obj)).adU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((y) (obj)).adU.isEmpty()) goto _L4; else goto _L9
_L9:
        return true;
        if (!FC.equals(((y) (obj)).FC))
        {
            return false;
        }
          goto _L6
        return adU.equals(((y) (obj)).adU);
    }

    public y fH()
    {
        versionCode = 1;
        FC = "";
        FD = -1L;
        FE = -1L;
        adU = null;
        adY = -1;
        return this;
    }

    public int hashCode()
    {
        boolean flag = false;
        int k = versionCode;
        int i;
        int j;
        int l;
        int i1;
        if (FC == null)
        {
            i = 0;
        } else
        {
            i = FC.hashCode();
        }
        l = (int)(FD ^ FD >>> 32);
        i1 = (int)(FE ^ FE >>> 32);
        j = ((flag) ? 1 : 0);
        if (adU != null)
        {
            if (adU.isEmpty())
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = adU.hashCode();
            }
        }
        return (((i + (k + 527) * 31) * 31 + l) * 31 + i1) * 31 + j;
    }

    public y m(kn kn1)
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

            case 8: // '\b'
                versionCode = kn1.mk();
                break;

            case 18: // '\022'
                FC = kn1.readString();
                break;

            case 24: // '\030'
                FD = kn1.mm();
                break;

            case 32: // ' '
                FE = kn1.mm();
                break;
            }
        } while (true);
    }
}
