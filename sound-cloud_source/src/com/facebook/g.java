// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook:
//            c, AccessToken

final class g
    implements C.a
{

    final AccessToken a;
    final AtomicBoolean b;
    final c.a c;
    final Set d;
    final Set e;
    final c f;

    g(c c1, AccessToken accesstoken, AtomicBoolean atomicboolean, c.a a1, Set set, Set set1)
    {
        f = c1;
        a = accesstoken;
        b = atomicboolean;
        c = a1;
        d = set;
        e = set1;
        super();
    }

    public final void a()
    {
        if (com.facebook.c.a().b == null || com.facebook.c.a().b.h != a.h)
        {
            return;
        }
        int i;
        if (b.get() || c.a != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        i = c.b;
        if (i == 0)
        {
            com.facebook.c.b(f).set(false);
            return;
        }
        if (c.a == null) goto _L2; else goto _L1
_L1:
        Object obj = c.a;
_L9:
        String s;
        String s1;
        s = a.g;
        s1 = a.h;
        if (!b.get()) goto _L4; else goto _L3
_L3:
        Set set = d;
_L10:
        if (!b.get()) goto _L6; else goto _L5
_L5:
        Set set1 = e;
_L11:
        h h = a.e;
        if (c.b == 0) goto _L8; else goto _L7
_L7:
        Date date = new Date((long)c.b * 1000L);
_L12:
        obj = new AccessToken(((String) (obj)), s, s1, set, set1, h, date, new Date());
        com.facebook.c.a().a(((AccessToken) (obj)), true);
        com.facebook.c.b(f).set(false);
        return;
_L2:
        obj = a.d;
          goto _L9
_L4:
        set = a.b;
          goto _L10
_L6:
        set1 = a.c;
          goto _L11
_L8:
        date = a.a;
          goto _L12
        Exception exception;
        exception;
        com.facebook.c.b(f).set(false);
        throw exception;
          goto _L9
    }
}
