// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import com.facebook.ads.NativeAd;
import com.facebook.ads.g;
import com.facebook.ads.internal.d.c;
import com.facebook.ads.internal.f.a;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            v, n, c, u

class a
    implements v
{

    final c a;
    final n b;

    public void a(u u)
    {
        g g1 = new g();
        g1.b(-1);
        g1.c(0xff8bc615);
        g1.a(0xff8bc615);
        com.facebook.ads.internal.adapters.n.a(b, new a(n.b(b), new NativeAd(n.b(b), u, a), g1, new com.facebook.ads.internal.f.a.a() {

            final n._cls3 a;

            public void a()
            {
                if (com.facebook.ads.internal.adapters.n.a(a.b) != null)
                {
                    com.facebook.ads.internal.adapters.n.a(a.b).a(a.b, n.e(a.b));
                }
            }

            
            {
                a = n._cls3.this;
                super();
            }
        }));
    }

    public void a(u u, com.facebook.ads.c c1)
    {
        if (com.facebook.ads.internal.adapters.n.a(b) != null)
        {
            com.facebook.ads.internal.adapters.n.a(b).a(b, c1);
        }
    }

    _cls1.a(n n1, c c1)
    {
        b = n1;
        a = c1;
        super();
    }
}
