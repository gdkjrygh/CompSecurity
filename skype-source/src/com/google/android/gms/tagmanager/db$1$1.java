// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.kd;

// Referenced classes of package com.google.android.gms.tagmanager:
//            db, bi, ak, da, 
//            a, d

final class a
    implements a
{

    final a a;

    public final void a()
    {
        if (db.e(a.a).a())
        {
            a.a.a(a.a);
        }
    }

    public final void a(String s)
    {
        a.a.b(s);
    }

    public final String b()
    {
        return a.a.c();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/google/android/gms/tagmanager/db$1

/* anonymous class */
    final class db._cls1
        implements com.google.android.gms.internal.jz.a
    {

        final String a;
        final db b;

        public final void a(kd kd1)
        {
            if (kd1.getStatus() != Status.a)
            {
                ak.a((new StringBuilder("Load request failed for the container ")).append(db.a(b)).toString());
                b.a(b.c(Status.c));
                return;
            }
            com.google.android.gms.internal.ke.c c = kd1.a().e();
            if (c == null)
            {
                ak.a("Response doesn't have the requested container");
                b.a(b.c(new Status("Response doesn't have the requested container")));
                return;
            } else
            {
                long l = kd1.a().f();
                db.a(b, new da(db.b(b), db.c(b), new a(db.d(b), db.b(b).a(), db.a(b), l, c), new db._cls1._cls1(this)));
                b.a(db.f(b));
                return;
            }
        }

            
            {
                b = db1;
                a = s;
                super();
            }
    }

}
