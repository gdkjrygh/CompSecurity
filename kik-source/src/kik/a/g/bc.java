// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.as;
import kik.a.d.aa;
import kik.a.f.f.ao;

// Referenced classes of package kik.a.g:
//            az

final class bc
    implements as
{

    final String a;
    final String b;
    final az c;

    bc(az az1, String s, String s1)
    {
        c = az1;
        a = s;
        b = s1;
        super();
    }

    public final Object a(Object obj)
    {
        obj = ((ao)obj).d();
        obj.d = a;
        obj.e = b;
        c.a(((aa) (obj)));
        return c.d();
    }
}
