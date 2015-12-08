// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, c, pf, pg, 
//            pn

public static final class b extends ph
{

    public int fn;
    public int fo;
    public int level;

    public b a(pf pf1)
        throws IOException
    {
_L6:
        int i = pf1.qi();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   16: 103
    //                   24: 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (a(pf1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = pf1.ql();
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
        fn = pf1.ql();
        continue; /* Loop/switch isn't completed */
_L5:
        fo = pf1.ql();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void a(pg pg1)
        throws IOException
    {
        if (level != 1)
        {
            pg1.s(1, level);
        }
        if (fn != 0)
        {
            pg1.s(2, fn);
        }
        if (fo != 0)
        {
            pg1.s(3, fo);
        }
        super.a(pg1);
    }

    public  b()
    {
        level = 1;
        fn = 0;
        fo = 0;
        awJ = null;
        awU = -1;
        return this;
    }

    public pn b(pf pf1)
        throws IOException
    {
        return a(pf1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (level != 1)
        {
            i = j + pg.u(1, level);
        }
        j = i;
        if (fn != 0)
        {
            j = i + pg.u(2, fn);
        }
        i = j;
        if (fo != 0)
        {
            i = j + pg.u(3, fo);
        }
        return i;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof fo)
            {
                obj = (fo)obj;
                flag = flag1;
                if (level == ((level) (obj)).level)
                {
                    flag = flag1;
                    if (fn == ((fn) (obj)).fn)
                    {
                        flag = flag1;
                        if (fo == ((fo) (obj)).fo)
                        {
                            return a(((ph) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((level + 527) * 31 + fn) * 31 + fo) * 31 + qz();
    }

    public ()
    {
        b();
    }
}
