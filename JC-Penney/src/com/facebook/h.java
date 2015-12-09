// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook:
//            al, d, AccessToken, i, 
//            ak

class h
    implements al
{

    final AccessToken a;
    final AtomicBoolean b;
    final i c;
    final Set d;
    final Set e;
    final d f;

    h(d d1, AccessToken accesstoken, AtomicBoolean atomicboolean, i j, Set set, Set set1)
    {
        f = d1;
        a = accesstoken;
        b = atomicboolean;
        c = j;
        d = set;
        e = set1;
        super();
    }

    public void a(ak ak)
    {
        if (com.facebook.d.a().b() == null || com.facebook.d.a().b().i() != a.i())
        {
            return;
        }
        int k;
        if (b.get() || c.a != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        k = c.b;
        if (k == 0)
        {
            com.facebook.d.b(f).set(false);
            return;
        }
        if (c.a == null) goto _L2; else goto _L1
_L1:
        ak = c.a;
_L9:
        String s;
        String s1;
        s = a.h();
        s1 = a.i();
        if (!b.get()) goto _L4; else goto _L3
_L3:
        Set set = d;
_L10:
        if (!b.get()) goto _L6; else goto _L5
_L5:
        Set set1 = e;
_L11:
        j j = a.f();
        if (c.b == 0) goto _L8; else goto _L7
_L7:
        Date date = new Date((long)c.b * 1000L);
_L12:
        ak = new AccessToken(ak, s, s1, set, set1, j, date, new Date());
        com.facebook.d.a().a(ak);
        com.facebook.d.b(f).set(false);
        return;
_L2:
        ak = a.b();
          goto _L9
_L4:
        set = a.d();
          goto _L10
_L6:
        set1 = a.e();
          goto _L11
_L8:
        date = a.c();
          goto _L12
        ak;
        com.facebook.d.b(f).set(false);
        throw ak;
          goto _L9
    }
}
