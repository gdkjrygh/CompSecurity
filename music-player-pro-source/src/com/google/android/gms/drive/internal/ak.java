// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.qo;
import com.google.android.gms.internal.qp;
import com.google.android.gms.internal.qq;
import com.google.android.gms.internal.qv;
import com.google.android.gms.internal.qw;
import java.io.IOException;

public final class ak extends qq
{

    public String QG;
    public long QH;
    public long QI;
    public int versionCode;

    public ak()
    {
        iK();
    }

    public static ak g(byte abyte0[])
        throws qv
    {
        return (ak)qw.a(new ak(), abyte0);
    }

    public void a(qp qp1)
        throws IOException
    {
        qp1.t(1, versionCode);
        qp1.b(2, QG);
        qp1.c(3, QH);
        qp1.c(4, QI);
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return m(qo1);
    }

    protected int c()
    {
        return super.c() + qp.v(1, versionCode) + qp.j(2, QG) + qp.e(3, QH) + qp.e(4, QI);
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
        if (!(obj instanceof ak))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (ak)obj;
        flag = flag1;
        if (versionCode != ((ak) (obj)).versionCode)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (QG != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((ak) (obj)).QG != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (QH == ((ak) (obj)).QH)
        {
            flag = flag1;
            if (QI == ((ak) (obj)).QI)
            {
                return a(((qq) (obj)));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!QG.equals(((ak) (obj)).QG))
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
        if (QG == null)
        {
            i = 0;
        } else
        {
            i = QG.hashCode();
        }
        return (((i + (j + 527) * 31) * 31 + (int)(QH ^ QH >>> 32)) * 31 + (int)(QI ^ QI >>> 32)) * 31 + rQ();
    }

    public ak iK()
    {
        versionCode = 1;
        QG = "";
        QH = -1L;
        QI = -1L;
        ayW = null;
        azh = -1;
        return this;
    }

    public ak m(qo qo1)
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
                versionCode = qo1.rC();
                break;

            case 18: // '\022'
                QG = qo1.readString();
                break;

            case 24: // '\030'
                QH = qo1.rF();
                break;

            case 32: // ' '
                QI = qo1.rF();
                break;
            }
        } while (true);
    }
}
