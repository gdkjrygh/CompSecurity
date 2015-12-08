// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.content.Context;
import android.os.Looper;
import b.a.a.a.a.b.b;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.t;
import b.a.a.a.a.b.z;
import b.a.a.a.a.d.l;
import b.a.a.a.a.f.a;
import b.a.a.a.d;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.a.a.a:
//            e, E, C, D, 
//            k, x, q

final class i
    implements Runnable
{

    final e a;

    i(e e1)
    {
        a = e1;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        E e1;
        String s;
        String s1;
        String s2;
        String s3;
        Object obj3;
        Object obj4;
        String s4;
        try
        {
            e1 = a.d;
            obj3 = e1.b.d();
            s = e1.a.getPackageName();
            s1 = e1.b.a();
            s2 = (String)((Map) (obj3)).get(b.a.a.a.a.b.t.a.d);
            s3 = (String)((Map) (obj3)).get(b.a.a.a.a.b.t.a.g);
            obj4 = e1.b;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d.a();
            return;
        }
        obj1 = null;
        obj = obj1;
        if (!((t) (obj4)).a)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj4 = ((t) (obj4)).f();
        obj = obj1;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj = Boolean.valueOf(((b) (obj4)).b);
        obj1 = (String)((Map) (obj3)).get(b.a.a.a.a.b.t.a.c);
        obj3 = j.m(e1.a);
        obj4 = t.b();
        s4 = t.c();
        obj = new C(s, UUID.randomUUID().toString(), s1, s2, s3, ((Boolean) (obj)), ((String) (obj1)), ((String) (obj3)), ((String) (obj4)), s4, e1.c, e1.d);
        obj1 = a.c;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
        }
        D d1 = new D();
        z z1 = new z();
        Object obj2 = ((k) (obj1)).b.a();
        obj2 = new l(((k) (obj1)).a, ((java.io.File) (obj2)), "session_analytics.tap", "session_analytics_to_send");
        obj1 = new x(((k) (obj1)).a, d1, z1, ((b.a.a.a.a.d.g) (obj2)));
        ((x) (obj1)).a(a);
        a.g = new q(a.a, a.b, a.f, ((x) (obj1)), a.e, ((C) (obj)));
        return;
    }
}
