// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            kv, g, ku, kt, 
//            lb

public static final class s extends kv
{

    public int a;
    public int b;
    public int c;

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != 1)
        {
            i = j + ku.b(1, a);
        }
        j = i;
        if (b != 0)
        {
            j = i + ku.b(2, b);
        }
        i = j;
        if (c != 0)
        {
            i = j + ku.b(3, c);
        }
        return i;
    }

    public final lb a(kt kt1)
        throws IOException
    {
_L6:
        int i = kt1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   16: 103
    //                   24: 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (a(kt1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = kt1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kt1.f();
        continue; /* Loop/switch isn't completed */
_L5:
        c = kt1.f();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void a(ku ku1)
        throws IOException
    {
        if (a != 1)
        {
            ku1.a(1, a);
        }
        if (b != 0)
        {
            ku1.a(2, b);
        }
        if (c != 0)
        {
            ku1.a(3, c);
        }
        super.a(ku1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof )
            {
                obj = ()obj;
                flag = flag1;
                if (a == ((a) (obj)).a)
                {
                    flag = flag1;
                    if (b == ((b) (obj)).b)
                    {
                        flag = flag1;
                        if (c == ((c) (obj)).c)
                        {
                            return a(((kv) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (((a + 527) * 31 + b) * 31 + c) * 31 + c();
    }

    public ()
    {
        a = 1;
        b = 0;
        c = 0;
        r = null;
        s = -1;
    }
}
