// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.a.a;
import com.facebook.ads.internal.util.b;
import com.facebook.ads.internal.util.d;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            n, q, c

class a
    implements com.facebook.ads.internal.f.rs.n._cls1
{

    final q a;
    final n b;

    public void a()
    {
        b.c();
    }

    public void a(int i)
    {
        if (i == 0 && n.c(b) > 0L && com.facebook.ads.internal.adapters.n.d(b) != null)
        {
            d.a(com.facebook.ads.internal.util.b.a(n.c(b), com.facebook.ads.internal.adapters.n.d(b), a.h()));
            com.facebook.ads.internal.adapters.n.a(b, 0L);
            com.facebook.ads.internal.adapters.n.a(b, null);
        }
    }

    public void a(String s)
    {
        if (com.facebook.ads.internal.adapters.n.a(b) != null)
        {
            com.facebook.ads.internal.adapters.n.a(b).b(b);
        }
        s = Uri.parse(s);
        s = com.facebook.ads.internal.a.b.a(com.facebook.ads.internal.adapters.n.b(b), s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        com.facebook.ads.internal.adapters.n.a(b, s.a());
        com.facebook.ads.internal.adapters.n.a(b, System.currentTimeMillis());
        s.b();
        return;
        s;
        Log.e(com.facebook.ads.internal.adapters.n.d(), "Error executing action", s);
        return;
    }

    (n n1, q q1)
    {
        b = n1;
        a = q1;
        super();
    }
}
