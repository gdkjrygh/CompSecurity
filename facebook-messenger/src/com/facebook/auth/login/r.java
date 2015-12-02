// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.a.b;
import com.facebook.auth.b.d;
import com.facebook.auth.e.a;
import com.facebook.prefs.shared.e;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.auth.login:
//            o

class r
    implements Runnable
{

    final o a;

    r(o o1)
    {
        a = o1;
        super();
    }

    public void run()
    {
        for (Iterator iterator = o.f(a).iterator(); iterator.hasNext(); ((b)iterator.next()).e()) { }
        o.g(a).e();
        com.facebook.auth.login.o.a(a).b().a(a.i).a();
    }
}
