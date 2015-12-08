// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.aa;
import com.google.a.ad;
import com.google.a.am;
import com.google.a.b.r;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import com.google.a.u;
import com.google.a.x;
import com.google.a.z;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.a.b.a:
//            az

final class ar extends am
{

    ar()
    {
    }

    private void a(f f1, x x1)
    {
        if (x1 == null || (x1 instanceof z))
        {
            f1.f();
            return;
        }
        if (x1 instanceof ad)
        {
            x1 = x1.k();
            if (x1.l())
            {
                f1.a(x1.b());
                return;
            }
            if (x1.a())
            {
                f1.a(x1.h());
                return;
            } else
            {
                f1.b(x1.c());
                return;
            }
        }
        if (x1 instanceof u)
        {
            f1.b();
            for (x1 = x1.j().iterator(); x1.hasNext(); a(f1, (x)x1.next())) { }
            f1.c();
            return;
        }
        if (x1 instanceof aa)
        {
            f1.d();
            java.util.Map.Entry entry;
            for (x1 = x1.i().a().iterator(); x1.hasNext(); a(f1, (x)entry.getValue()))
            {
                entry = (java.util.Map.Entry)x1.next();
                f1.a((String)entry.getKey());
            }

            f1.e();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Couldn't write ")).append(x1.getClass()).toString());
        }
    }

    private x b(a a1)
    {
        aa aa1;
        switch (com.google.a.b.a.az.a[a1.f().ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 3: // '\003'
            return new ad(a1.h());

        case 1: // '\001'
            return new ad(new r(a1.h()));

        case 2: // '\002'
            return new ad(Boolean.valueOf(a1.i()));

        case 4: // '\004'
            a1.j();
            return z.a;

        case 5: // '\005'
            u u1 = new u();
            a1.a();
            for (; a1.e(); u1.a(b(a1))) { }
            a1.b();
            return u1;

        case 6: // '\006'
            aa1 = new aa();
            a1.c();
            break;
        }
        for (; a1.e(); aa1.a(a1.g(), b(a1))) { }
        a1.d();
        return aa1;
    }

    public final Object a(a a1)
    {
        return b(a1);
    }

    public final volatile void a(f f1, Object obj)
    {
        a(f1, (x)obj);
    }
}
