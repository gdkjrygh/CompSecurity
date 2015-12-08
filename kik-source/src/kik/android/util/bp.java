// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import com.kik.g.i;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.s;
import kik.android.net.a.c;
import kik.android.net.a.e;

// Referenced classes of package kik.android.util:
//            bo

final class bp extends i
{

    final bo a;

    bp(bo bo1)
    {
        a = bo1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (s)obj1;
        obj1 = g.a(((s) (obj)), kik/a/d/a/a);
        if (obj1 != null)
        {
            obj1 = (a)obj1;
            java.io.File file = ((a) (obj1)).k();
            String s1 = ((a) (obj1)).g("int-file-state");
            if (file != null && !"1".equals(s1))
            {
                obj1 = new c(((a) (obj1)), ((s) (obj)).i(), ((s) (obj)).b(), ((s) (obj)).o(), kik.android.util.bo.a(a), bo.b(a), kik.android.util.bo.c(a), bo.d(a), kik.android.util.bo.e(a), bo.f(a));
                e.a().a(((kik.android.net.a.b) (obj1)));
            }
            a.b(((s) (obj)));
        }
    }
}
