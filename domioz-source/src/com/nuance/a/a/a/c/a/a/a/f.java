// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.a;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;

// Referenced classes of package com.nuance.a.a.a.c.a.a.a:
//            l, j, q, t, 
//            s, v, o, m, 
//            n

public class f extends l
{

    private static final e a = d.a(com/nuance/a/a/a/c/a/a/a/f);

    public f(j j1)
    {
        super((short)515);
        a.b();
        a("name", j1.a(), (short)193);
        if (j1.b() == 127)
        {
            a("type", 5);
        } else
        {
            a("type", j1.b());
        }
        switch (j1.b())
        {
        default:
            a.b((new StringBuilder("PDXQueryParameter() Unknown parameter type: ")).append(j1.b()).append(". ").toString());
            return;

        case 1: // '\001'
            a("buffer_id", ((q)j1).c());
            return;

        case 3: // '\003'
            a("text", ((t)j1).c(), (short)193);
            return;

        case 4: // '\004'
            a("data", ((s)j1).c(), (short)193);
            return;

        case 5: // '\005'
            a("dict", ((v)j1).c(), (short)224);
            return;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            a("dict", ((o)j1).c(), (short)224);
            return;

        case 2: // '\002'
            a("text", ((m)j1).c(), (short)193);
            return;

        case 127: // '\177'
            a("dict", ((n)j1).d(), (short)224);
            break;
        }
    }

}
