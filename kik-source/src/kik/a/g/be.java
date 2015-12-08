// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.as;
import kik.a.d.aa;
import kik.a.f.f.ao;

// Referenced classes of package kik.a.g:
//            az

final class be
    implements as
{

    final boolean a;
    final az b;

    be(az az1, boolean flag)
    {
        b = az1;
        a = flag;
        super();
    }

    public final Object a(Object obj)
    {
        obj = ((ao)obj).d();
        obj.h = Boolean.valueOf(a);
        b.a(((aa) (obj)));
        return b.d();
    }
}
