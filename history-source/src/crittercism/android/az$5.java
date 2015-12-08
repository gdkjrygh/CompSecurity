// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.json.JSONArray;

// Referenced classes of package crittercism.android:
//            di, az, dw, bk, 
//            cv, dj, cu, bq, 
//            dc, db, bb

final class nit> extends di
{

    final Throwable a;
    final long b;
    final az c;

    public final void a()
    {
        if (c.f.b())
        {
            return;
        }
        synchronized (c.q)
        {
            if (c.C < 10)
            {
                Object obj = new bk(a, b);
                ((bk) (obj)).a("current_session", c.k);
                ((bk) (obj)).a(c.m);
                obj.d = "he";
                if (c.q.a())
                {
                    obj = (new JSONArray()).put(((bk) (obj)).b());
                    (new dj((new cu(az.a)).a(bq.b.f(), ((JSONArray) (obj))), new dc((new db(c.v.b(), "/android_v2/handle_exceptions")).a()), null)).run();
                    obj = c;
                    obj.C = ((az) (obj)).C + 1;
                    c.q.b();
                }
            }
        }
    }

    (az az1, Throwable throwable, long l)
    {
        c = az1;
        a = throwable;
        b = l;
        super();
    }
}
