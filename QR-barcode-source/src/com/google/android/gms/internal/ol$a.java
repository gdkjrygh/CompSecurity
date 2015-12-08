// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, ol, pm, pn, 
//            pg, pf

public static final class pL extends ph
{

    public long asr;
    public awU ass;
    public awU gs;

    public static pL l(byte abyte0[])
        throws pm
    {
        return (pL)pn.a(new <init>(), abyte0);
    }

    public void a(pg pg1)
        throws IOException
    {
        pg1.b(1, asr);
        if (gs != null)
        {
            pg1.a(2, gs);
        }
        if (ass != null)
        {
            pg1.a(3, ass);
        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return p(pf1);
    }

    protected int c()
    {
        int j = super.c() + pg.d(1, asr);
        int i = j;
        if (gs != null)
        {
            i = j + pg.c(2, gs);
        }
        j = i;
        if (ass != null)
        {
            j = i + pg.c(3, ass);
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
        if (!(obj instanceof ass)) goto _L4; else goto _L3
_L3:
        obj = (ass)obj;
        flag = flag1;
        if (asr != ((asr) (obj)).asr) goto _L4; else goto _L5
_L5:
        if (gs != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((gs) (obj)).gs != null) goto _L4; else goto _L8
_L8:
        if (ass != null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        flag = flag1;
        if (((ass) (obj)).ass != null) goto _L4; else goto _L9
_L9:
        return a(((ph) (obj)));
_L7:
        if (!gs.quals(((quals) (obj)).gs))
        {
            return false;
        }
          goto _L8
        if (!ass.quals(((quals) (obj)).ass))
        {
            return false;
        }
          goto _L9
    }

    public int hashCode()
    {
        int j = 0;
        int k = (int)(asr ^ asr >>> 32);
        int i;
        if (gs == null)
        {
            i = 0;
        } else
        {
            i = gs.ashCode();
        }
        if (ass != null)
        {
            j = ass.ashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + qz();
    }

    public qz p(pf pf1)
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
                asr = pf1.qk();
                break;

            case 18: // '\022'
                if (gs == null)
                {
                    gs = new init>();
                }
                pf1.a(gs);
                break;

            case 26: // '\032'
                if (ass == null)
                {
                    ass = new init>();
                }
                pf1.a(ass);
                break;
            }
        } while (true);
    }

    public ass pL()
    {
        asr = 0L;
        gs = null;
        ass = null;
        awJ = null;
        awU = -1;
        return this;
    }

    public ()
    {
        pL();
    }
}
