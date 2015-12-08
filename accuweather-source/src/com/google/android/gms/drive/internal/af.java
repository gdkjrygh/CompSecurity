// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.lz;
import com.google.android.gms.internal.ma;
import com.google.android.gms.internal.mb;
import com.google.android.gms.internal.me;
import com.google.android.gms.internal.mf;
import java.io.IOException;
import java.util.List;

public final class af extends mb
{

    public String Jq;
    public long Jr;
    public long Js;
    public int versionCode;

    public af()
    {
        gn();
    }

    public static af g(byte abyte0[])
        throws me
    {
        return (af)mf.a(new af(), abyte0);
    }

    public void a(ma ma1)
        throws IOException
    {
        ma1.p(1, versionCode);
        ma1.b(2, Jq);
        ma1.c(3, Jr);
        ma1.c(4, Js);
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return m(lz1);
    }

    protected int c()
    {
        return super.c() + ma.r(1, versionCode) + ma.h(2, Jq) + ma.e(3, Jr) + ma.e(4, Js);
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
        if (!(obj instanceof af)) goto _L4; else goto _L3
_L3:
        obj = (af)obj;
        flag = flag1;
        if (versionCode != ((af) (obj)).versionCode) goto _L4; else goto _L5
_L5:
        if (Jq != null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        flag = flag1;
        if (((af) (obj)).Jq != null) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (Jr != ((af) (obj)).Jr) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (Js != ((af) (obj)).Js) goto _L4; else goto _L8
_L8:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (((af) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((af) (obj)).amU.isEmpty()) goto _L4; else goto _L9
_L9:
        return true;
        if (!Jq.equals(((af) (obj)).Jq))
        {
            return false;
        }
          goto _L6
        return amU.equals(((af) (obj)).amU);
    }

    public af gn()
    {
        versionCode = 1;
        Jq = "";
        Jr = -1L;
        Js = -1L;
        amU = null;
        amY = -1;
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
        if (Jq == null)
        {
            i = 0;
        } else
        {
            i = Jq.hashCode();
        }
        l = (int)(Jr ^ Jr >>> 32);
        i1 = (int)(Js ^ Js >>> 32);
        j = ((flag) ? 1 : 0);
        if (amU != null)
        {
            if (amU.isEmpty())
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = amU.hashCode();
            }
        }
        return (((i + (k + 527) * 31) * 31 + l) * 31 + i1) * 31 + j;
    }

    public af m(lz lz1)
        throws IOException
    {
        do
        {
            int i = lz1.nw();
            switch (i)
            {
            default:
                if (a(lz1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                versionCode = lz1.nz();
                break;

            case 18: // '\022'
                Jq = lz1.readString();
                break;

            case 24: // '\030'
                Jr = lz1.nC();
                break;

            case 32: // ' '
                Js = lz1.nC();
                break;
            }
        } while (true);
    }
}
