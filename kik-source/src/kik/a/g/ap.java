// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.r;
import kik.a.d.k;
import kik.a.f.f.g;

// Referenced classes of package kik.a.g:
//            aq, v

final class ap extends r
{

    final v a;

    ap(v v1)
    {
        a = v1;
        super();
    }

    public final void a(Object obj)
    {
        obj = ((g)obj).d();
        if (obj != null)
        {
            String s = ((k) (obj)).b();
            a.a(s, false, new aq(this, ((k) (obj))));
        }
    }
}
