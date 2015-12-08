// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Map;

// Referenced classes of package b.a:
//            ek, q, et, ds, 
//            es, el, ec, eb, 
//            ab, ed

final class s extends ek
{

    final q a;
    final q b;

    s(q q1, q q2)
    {
        b = q1;
        a = q2;
        super();
    }

    public final void a()
    {
        if (a.g.b())
        {
            return;
        } else
        {
            ds ds1 = new ds(a);
            org.json.JSONObject jsonobject = a.C.a();
            ds1.a.put("metadata", jsonobject);
            (new el(ds1, new ec((new eb(b.z.k(), "/android_v2/update_user_metadata")).a()), new ed(a.C))).run();
            return;
        }
    }
}
