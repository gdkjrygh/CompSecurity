// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ma, c, ly, lz, 
//            me

public static final class b extends ma
{

    public int eE;
    public int eF;
    public int level;

    public b a(ly ly1)
        throws IOException
    {
_L6:
        int i = ly1.nB();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   16: 103
    //                   24: 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (a(ly1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = ly1.nE();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            level = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        eE = ly1.nE();
        continue; /* Loop/switch isn't completed */
_L5:
        eF = ly1.nE();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void a(lz lz1)
        throws IOException
    {
        if (level != 1)
        {
            lz1.p(1, level);
        }
        if (eE != 0)
        {
            lz1.p(2, eE);
        }
        if (eF != 0)
        {
            lz1.p(3, eF);
        }
        super.a(lz1);
    }

    public  b()
    {
        level = 1;
        eE = 0;
        eF = 0;
        amX = null;
        anb = -1;
        return this;
    }

    public me b(ly ly1)
        throws IOException
    {
        return a(ly1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (level != 1)
        {
            i = j + lz.r(1, level);
        }
        j = i;
        if (eE != 0)
        {
            j = i + lz.r(2, eE);
        }
        i = j;
        if (eF != 0)
        {
            i = j + lz.r(3, eF);
        }
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
        if (!(obj instanceof eF)) goto _L4; else goto _L3
_L3:
        obj = (eF)obj;
        flag = flag1;
        if (level != ((level) (obj)).level) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (eE != ((eE) (obj)).eE) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (eF != ((eF) (obj)).eF) goto _L4; else goto _L7
_L7:
        if (amX != null && !amX.isEmpty())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (((amX) (obj)).amX == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amX) (obj)).amX.isEmpty()) goto _L4; else goto _L8
_L8:
        return true;
        return amX.equals(((amX) (obj)).amX);
    }

    public int hashCode()
    {
        int j = level;
        int k = eE;
        int l = eF;
        int i;
        if (amX == null || amX.isEmpty())
        {
            i = 0;
        } else
        {
            i = amX.hashCode();
        }
        return i + (((j + 527) * 31 + k) * 31 + l) * 31;
    }

    public ()
    {
        b();
    }
}
