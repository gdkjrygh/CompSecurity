// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ag;
import com.google.a.am;
import com.google.a.b.r;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;

// Referenced classes of package com.google.a.b.a:
//            az

final class ab extends am
{

    ab()
    {
    }

    public final Object a(a a1)
    {
        e e1 = a1.f();
        switch (com.google.a.b.a.az.a[e1.ordinal()])
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            throw new ag((new StringBuilder("Expecting number, got: ")).append(e1).toString());

        case 4: // '\004'
            a1.j();
            return null;

        case 1: // '\001'
            return new r(a1.h());
        }
    }

    public final volatile void a(f f1, Object obj)
    {
        f1.a((Number)obj);
    }
}
