// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.ly;
import com.google.android.gms.internal.lz;
import com.google.android.gms.internal.ma;
import com.google.android.gms.internal.md;
import com.google.android.gms.internal.me;
import java.io.IOException;
import java.util.List;

public final class af extends ma
{

    public String Jt;
    public long Ju;
    public long Jv;
    public int versionCode;

    public af()
    {
        gs();
    }

    public static af g(byte abyte0[])
        throws md
    {
        return (af)me.a(new af(), abyte0);
    }

    public void a(lz lz1)
        throws IOException
    {
        lz1.p(1, versionCode);
        lz1.b(2, Jt);
        lz1.c(3, Ju);
        lz1.c(4, Jv);
        super.a(lz1);
    }

    public me b(ly ly1)
        throws IOException
    {
        return m(ly1);
    }

    protected int c()
    {
        return super.c() + lz.r(1, versionCode) + lz.h(2, Jt) + lz.e(3, Ju) + lz.e(4, Jv);
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
        if (Jt != null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        flag = flag1;
        if (((af) (obj)).Jt != null) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (Ju != ((af) (obj)).Ju) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (Jv != ((af) (obj)).Jv) goto _L4; else goto _L8
_L8:
        if (amX != null && !amX.isEmpty())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (((af) (obj)).amX == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((af) (obj)).amX.isEmpty()) goto _L4; else goto _L9
_L9:
        return true;
        if (!Jt.equals(((af) (obj)).Jt))
        {
            return false;
        }
          goto _L6
        return amX.equals(((af) (obj)).amX);
    }

    public af gs()
    {
        versionCode = 1;
        Jt = "";
        Ju = -1L;
        Jv = -1L;
        amX = null;
        anb = -1;
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
        if (Jt == null)
        {
            i = 0;
        } else
        {
            i = Jt.hashCode();
        }
        l = (int)(Ju ^ Ju >>> 32);
        i1 = (int)(Jv ^ Jv >>> 32);
        j = ((flag) ? 1 : 0);
        if (amX != null)
        {
            if (amX.isEmpty())
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = amX.hashCode();
            }
        }
        return (((i + (k + 527) * 31) * 31 + l) * 31 + i1) * 31 + j;
    }

    public af m(ly ly1)
        throws IOException
    {
        do
        {
            int i = ly1.nB();
            switch (i)
            {
            default:
                if (a(ly1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                versionCode = ly1.nE();
                break;

            case 18: // '\022'
                Jt = ly1.readString();
                break;

            case 24: // '\030'
                Ju = ly1.nH();
                break;

            case 32: // ' '
                Jv = ly1.nH();
                break;
            }
        } while (true);
    }
}
