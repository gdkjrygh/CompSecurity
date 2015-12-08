// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.b.ah;
import a.a.a.a.a.d.m;
import a.a.a.a.a.f.a;
import a.a.a.a.s;
import android.os.Looper;

// Referenced classes of package com.b.a.a:
//            b, ac, ab, h, 
//            t, m

final class f
    implements Runnable
{

    final b a;

    f(b b1)
    {
        a = b1;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        try
        {
            obj = com.b.a.a.b.a(a).a();
            obj1 = b.b(a);
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a.a.a.f.d().b("Answers", "Failed to enable events", ((Throwable) (obj)));
            return;
        }
        ab ab1 = new ab();
        ah ah1 = new ah();
        Object obj2 = ((h) (obj1)).b.a();
        obj2 = new m(((h) (obj1)).a, ((java.io.File) (obj2)), "session_analytics.tap", "session_analytics_to_send");
        obj1 = new t(((h) (obj1)).a, ab1, ah1, ((a.a.a.a.a.d.h) (obj2)));
        ((t) (obj1)).a(a);
        a.b = new com.b.a.a.m(b.c(a), b.d(a), a.a, ((t) (obj1)), b.e(a), ((aa) (obj)));
        return;
    }
}
