// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.f;
import com.facebook.ads.internal.adapters.p;
import com.facebook.ads.internal.dto.b;
import com.facebook.ads.internal.dto.c;
import com.facebook.ads.internal.dto.d;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.server.a;
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

    private final Context a;
    private final String b;
    private final com.facebook.ads.internal.server.a c = new com.facebook.ads.internal.server.a();
    private final e d;
    private final com.facebook.ads.internal.c e;
    private final AdSize f;
    private final int g;
    private final EnumSet h;
    private final Handler i = new Handler();
    private final Runnable j = new _cls1();
    private a k;
    private b l;

    public i(Context context, String s, e e1, AdSize adsize, com.facebook.ads.internal.c c1, int i1, EnumSet enumset)
    {
        a = context;
        b = s;
        d = e1;
        f = adsize;
        e = c1;
        g = i1;
        h = enumset;
        c.a(this);
    }

    static Context a(i i1)
    {
        return i1.a;
    }

    static Runnable b(i i1)
    {
        return i1.j;
    }

    static Handler c(i i1)
    {
        return i1.i;
    }

    private List c()
    {
        b b1 = l;
        com.facebook.ads.internal.dto.a a1 = b1.c();
        ArrayList arraylist = new ArrayList(b1.b());
        for (; a1 != null; a1 = b1.c())
        {
            AdAdapter adadapter = com.facebook.ads.internal.adapters.f.a(a1.b, AdPlacementType.NATIVE);
            if (adadapter != null && adadapter.getPlacementType() == AdPlacementType.NATIVE)
            {
                HashMap hashmap = new HashMap();
                hashmap.put("data", a1.c);
                hashmap.put("definition", b1.a());
                ((p)adadapter).a(a, new _cls2(arraylist), hashmap);
            }
        }

        return arraylist;
    }

    public void a()
    {
        d d1 = new d(a, b, f, d, e, g, AdSettings.isTestMode(a));
        c.a(a, d1);
    }

    public void a(com.facebook.ads.internal.b b1)
    {
        i.postDelayed(j, 0x1b7740L);
        if (k != null)
        {
            k.a(b1);
        }
    }

    public void a(a a1)
    {
        k = a1;
    }

    public void a(com.facebook.ads.internal.server.d d1)
    {
label0:
        {
            d1 = d1.b();
            if (d1 == null)
            {
                throw new IllegalStateException("no placement in response");
            }
            long l2 = d1.a().b();
            long l1 = l2;
            if (l2 == 0L)
            {
                l1 = 0x1b7740L;
            }
            i.postDelayed(j, l1);
            l = d1;
            d1 = c();
            if (k != null)
            {
                if (!d1.isEmpty())
                {
                    break label0;
                }
                k.a(AdErrorType.NO_FILL.getAdErrorWrapper(""));
            }
            return;
        }
        k.a(d1);
    }

    public void b()
    {
        i.removeCallbacks(j);
        c.a();
    }

    private class _cls1
        implements Runnable
    {

        final i a;

        public void run()
        {
            if (com.facebook.ads.internal.util.g.a(com.facebook.ads.internal.i.a(a)))
            {
                a.a();
                return;
            } else
            {
                com.facebook.ads.internal.i.c(a).postDelayed(com.facebook.ads.internal.i.b(a), 5000L);
                return;
            }
        }

        _cls1()
        {
            a = i.this;
            super();
        }
    }


    private class _cls2
        implements q
    {

        final List a;
        final i b;

        public void a(p p1)
        {
            a.add(p1);
        }

        public void a(p p1, AdError aderror)
        {
        }

        _cls2(List list)
        {
            b = i.this;
            a = list;
            super();
        }
    }


    private class a
    {

        public abstract void a(com.facebook.ads.internal.b b1);

        public abstract void a(List list);
    }

}
