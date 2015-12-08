// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            gx, cb, gt, ch, 
//            gm, gn, fm

final class ce extends gx
{

    private ce()
    {
    }

    ce(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (cb)fm;
        gn = (gt)gn;
        gn.a(((cb) (fm)).a.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = ((cb) (fm)).a.entrySet().iterator(); iterator.hasNext(); ((ch)entry.getValue()).b(gn))
        {
            entry = (java.util.Map.Entry)iterator.next();
            gn.a((String)entry.getKey());
        }

        gn.a(((cb) (fm)).b);
        gn.a(((cb) (fm)).c);
    }

    public final void b(gn gn, fm fm)
    {
        fm = (cb)fm;
        gn = (gt)gn;
        gm gm1 = new gm((byte)11, (byte)12, gn.m());
        fm.a = new HashMap(gm1.c * 2);
        for (int i = 0; i < gm1.c; i++)
        {
            String s = gn.p();
            ch ch1 = new ch();
            ch1.a(gn);
            ((cb) (fm)).a.put(s, ch1);
        }

        cb.c();
        fm.b = gn.m();
        fm.f();
        fm.c = gn.p();
        cb.h();
    }
}
