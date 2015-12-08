// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.LinkedHashSet;

final class lang.Object
    implements Comparator
{

    private vr a;

    public final int compare(Object obj, Object obj1)
    {
        vq vq1 = (vq)obj;
        vq vq2 = (vq)obj1;
        LinkedHashSet linkedhashset = vq1.b;
        LinkedHashSet linkedhashset1 = vq2.b;
        obj = (new als(System.currentTimeMillis())).aj_().a(3);
        obj1 = a.b.a(vq1.a);
        Object obj2;
        vo vo1;
        if (obj1 != null && ((vo) (obj1)).a() != null)
        {
            obj1 = ((vo) (obj1)).a();
        } else
        {
            obj1 = obj;
        }
        vo1 = a.b.a(vq2.a);
        obj2 = obj;
        if (vo1 != null)
        {
            obj2 = obj;
            if (vo1.a() != null)
            {
                obj2 = vo1.a();
            }
        }
        return dI.a().b(linkedhashset.isEmpty(), linkedhashset1.isEmpty()).a(vq2.b(((als) (obj2))), vq1.b(((als) (obj1)))).b();
    }

    >(vr vr1)
    {
        a = vr1;
        super();
    }
}
