// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, c, qo, qp, 
//            qw

public static final class b extends qq
{

    public int fn;
    public int fo;
    public int level;

    public b a(qo qo1)
        throws IOException
    {
_L6:
        int i = qo1.rz();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   16: 103
    //                   24: 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (a(qo1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = qo1.rC();
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
        fn = qo1.rC();
        continue; /* Loop/switch isn't completed */
_L5:
        fo = qo1.rC();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void a(qp qp1)
        throws IOException
    {
        if (level != 1)
        {
            qp1.t(1, level);
        }
        if (fn != 0)
        {
            qp1.t(2, fn);
        }
        if (fo != 0)
        {
            qp1.t(3, fo);
        }
        super.a(qp1);
    }

    public  b()
    {
        level = 1;
        fn = 0;
        fo = 0;
        ayW = null;
        azh = -1;
        return this;
    }

    public qw b(qo qo1)
        throws IOException
    {
        return a(qo1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (level != 1)
        {
            i = j + qp.v(1, level);
        }
        j = i;
        if (fn != 0)
        {
            j = i + qp.v(2, fn);
        }
        i = j;
        if (fo != 0)
        {
            i = j + qp.v(3, fo);
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
                            return a(((qq) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((level + 527) * 31 + fn) * 31 + fo) * 31 + rQ();
    }

    public ()
    {
        b();
    }
}
