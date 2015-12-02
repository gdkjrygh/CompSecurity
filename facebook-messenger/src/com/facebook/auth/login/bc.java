// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.a.c;
import com.facebook.auth.b.b;
import com.facebook.auth.b.d;
import com.facebook.auth.protocol.h;
import com.facebook.http.protocol.l;
import com.facebook.http.protocol.m;
import com.facebook.http.protocol.w;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.auth.login:
//            be

public class bc
{

    private final b a;
    private final w b;
    private final h c;
    private final Set d;

    public bc(b b1, w w1, h h, Set set)
    {
        a = b1;
        b = w1;
        c = h;
        d = set;
    }

    static h a(bc bc1)
    {
        return bc1.c;
    }

    static b b(bc bc1)
    {
        return bc1.a;
    }

    public void a()
    {
        Preconditions.checkState(a instanceof d, "handleLogin can only be used with LoggedInUserSessionManager");
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new be(this, null));
        Object obj = d.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.facebook.http.protocol.v v = ((c)((Iterator) (obj)).next()).b();
            if (v != null)
            {
                arraylist.add(v);
            }
        } while (true);
        obj = new l();
        ((l) (obj)).a(m.BOOTSTRAP);
        b.a("handleLogin", arraylist, ((l) (obj)));
    }
}
