// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, pu, qv, qw, 
//            qp, qo

public static final class rc extends qq
{

    public long auB;
    public auC auC;
    public auC gs;

    public static rc l(byte abyte0[])
        throws qv
    {
        return (rc)qw.a(new <init>(), abyte0);
    }

    public void a(qp qp1)
        throws IOException
    {
        qp1.b(1, auB);
        if (gs != null)
        {
            qp1.a(2, gs);
        }
        if (auC != null)
        {
            qp1.a(3, auC);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return s(qo1);
    }

    protected int c()
    {
        int j = super.c() + qp.d(1, auB);
        int i = j;
        if (gs != null)
        {
            i = j + qp.c(2, gs);
        }
        j = i;
        if (auC != null)
        {
            j = i + qp.c(3, auC);
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
        if (!(obj instanceof auC)) goto _L4; else goto _L3
_L3:
        obj = (auC)obj;
        flag = flag1;
        if (auB != ((auB) (obj)).auB) goto _L4; else goto _L5
_L5:
        if (gs != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((gs) (obj)).gs != null) goto _L4; else goto _L8
_L8:
        if (auC != null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        flag = flag1;
        if (((auC) (obj)).auC != null) goto _L4; else goto _L9
_L9:
        return a(((qq) (obj)));
_L7:
        if (!gs.quals(((quals) (obj)).gs))
        {
            return false;
        }
          goto _L8
        if (!auC.quals(((quals) (obj)).auC))
        {
            return false;
        }
          goto _L9
    }

    public int hashCode()
    {
        int j = 0;
        int k = (int)(auB ^ auB >>> 32);
        int i;
        if (gs == null)
        {
            i = 0;
        } else
        {
            i = gs.ashCode();
        }
        if (auC != null)
        {
            j = auC.ashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + rQ();
    }

    public rQ rc()
    {
        auB = 0L;
        gs = null;
        auC = null;
        ayW = null;
        azh = -1;
        return this;
    }

    public azh s(qo qo1)
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
                auB = qo1.rB();
                break;

            case 18: // '\022'
                if (gs == null)
                {
                    gs = new init>();
                }
                qo1.a(gs);
                break;

            case 26: // '\032'
                if (auC == null)
                {
                    auC = new init>();
                }
                qo1.a(auC);
                break;
            }
        } while (true);
    }

    public ()
    {
        rc();
    }
}
