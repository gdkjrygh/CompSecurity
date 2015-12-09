// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.f;
import com.facebook.ads.internal.adapters.p;
import com.facebook.ads.internal.adapters.q;
import com.facebook.ads.internal.dto.c;
import com.facebook.ads.internal.dto.e;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.server.a;
import com.facebook.ads.internal.server.d;
import com.facebook.ads.internal.util.g;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal:
//            AdErrorType, e, c, b

public class i
    implements com.facebook.ads.internal.server.a.a
{
    public static interface a
    {

        public abstract void a(b b1);

        public abstract void a(List list);
    }


    private final Context a;
    private final String b;
    private final com.facebook.ads.internal.server.a c = new com.facebook.ads.internal.server.a();
    private final com.facebook.ads.internal.e d;
    private final com.facebook.ads.internal.c e;
    private final AdSize f;
    private final int g;
    private final EnumSet h;
    private boolean i;
    private final Handler j = new Handler();
    private final Runnable k = new Runnable() {

        final i a;

        public void run()
        {
            if (com.facebook.ads.internal.util.g.a(com.facebook.ads.internal.i.a(a)))
            {
                a.a();
                return;
            } else
            {
                com.facebook.ads.internal.i.c(a).postDelayed(i.b(a), 5000L);
                return;
            }
        }

            
            {
                a = i.this;
                super();
            }
    };
    private a l;
    private c m;

    public i(Context context, String s, com.facebook.ads.internal.e e1, AdSize adsize, com.facebook.ads.internal.c c1, int i1, EnumSet enumset)
    {
        a = context;
        b = s;
        d = e1;
        f = adsize;
        e = c1;
        g = i1;
        h = enumset;
        c.a(this);
        i = true;
    }

    static Context a(i i1)
    {
        return i1.a;
    }

    static Runnable b(i i1)
    {
        return i1.k;
    }

    static Handler c(i i1)
    {
        return i1.j;
    }

    private List d()
    {
        c c1 = m;
        com.facebook.ads.internal.dto.a a1 = c1.c();
        ArrayList arraylist = new ArrayList(c1.b());
        for (; a1 != null; a1 = c1.c())
        {
            AdAdapter adadapter = com.facebook.ads.internal.adapters.f.a(a1.b, AdPlacementType.NATIVE);
            if (adadapter != null && adadapter.getPlacementType() == AdPlacementType.NATIVE)
            {
                HashMap hashmap = new HashMap();
                hashmap.put("data", a1.c);
                hashmap.put("definition", c1.a());
                ((p)adadapter).a(a, new q(arraylist) {

                    final List a;
                    final i b;

                    public void a(p p1)
                    {
                        a.add(p1);
                    }

                    public void a(p p1, AdError aderror)
                    {
                    }

            
            {
                b = i.this;
                a = list;
                super();
            }
                }, hashmap);
            }
        }

        return arraylist;
    }

    public void a()
    {
        e e1 = new e(a, b, f, d, e, g, AdSettings.isTestMode(a));
        c.a(a, e1);
    }

    public void a(b b1)
    {
        if (i)
        {
            j.postDelayed(k, 0x1b7740L);
        }
        if (l != null)
        {
            l.a(b1);
        }
    }

    public void a(a a1)
    {
        l = a1;
    }

    public void a(d d1)
    {
label0:
        {
            d1 = d1.b();
            if (d1 == null)
            {
                throw new IllegalStateException("no placement in response");
            }
            if (i)
            {
                long l2 = d1.a().b();
                long l1 = l2;
                if (l2 == 0L)
                {
                    l1 = 0x1b7740L;
                }
                j.postDelayed(k, l1);
            }
            m = d1;
            d1 = d();
            if (l != null)
            {
                if (!d1.isEmpty())
                {
                    break label0;
                }
                l.a(AdErrorType.NO_FILL.getAdErrorWrapper(""));
            }
            return;
        }
        l.a(d1);
    }

    public void b()
    {
        j.removeCallbacks(k);
        c.a();
    }

    public void c()
    {
        i = false;
        j.removeCallbacks(k);
    }
}
