// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.json.JSONObject;

// Referenced classes of package b.a:
//            ek, q, et, es

final class r extends ek
{

    final q a;
    final JSONObject b;
    final q c;

    r(q q1, q q2, JSONObject jsonobject)
    {
        c = q1;
        a = q2;
        b = jsonobject;
        super();
    }

    public final void a()
    {
        if (!a.g.b())
        {
            a.C.a(b);
            if (a.C.b())
            {
                a.E();
                return;
            }
        }
    }
}
