// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.mopub.nativeads:
//            bd, ba, i, j, 
//            NativeResponse, bf

final class h
{

    private final ba a;
    private final Map b;
    private final Map c;
    private final Handler d;
    private final j e;
    private final bd f;
    private bf g;

    h(Context context)
    {
        this(((Map) (new WeakHashMap())), ((Map) (new WeakHashMap())), new bd(), new ba(context), new Handler());
    }

    private h(Map map, Map map1, bd bd1, ba ba1, Handler handler)
    {
        b = map;
        c = map1;
        f = bd1;
        a = ba1;
        g = new i(this);
        a.a(g);
        d = handler;
        e = new j(this);
    }

    static Map a(h h1)
    {
        return h1.b;
    }

    static Map b(h h1)
    {
        return h1.c;
    }

    final void a()
    {
        b.clear();
        c.clear();
        a.a();
        d.removeMessages(0);
        a.b();
        g = null;
    }

    final void a(View view)
    {
        b.remove(view);
        c.remove(view);
        a.a(view);
    }

    final void a(View view, NativeResponse nativeresponse)
    {
        if (b.get(view) != nativeresponse)
        {
            a(view);
            if (!nativeresponse.getRecordedImpression() && !nativeresponse.isDestroyed())
            {
                b.put(view, nativeresponse);
                a.a(view, nativeresponse.getImpressionMinPercentageViewed());
                return;
            }
        }
    }

    final void b()
    {
        if (d.hasMessages(0))
        {
            return;
        } else
        {
            d.postDelayed(e, 250L);
            return;
        }
    }
}
