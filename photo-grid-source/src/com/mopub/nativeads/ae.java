// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.mopub.nativeads:
//            af, ag, MoPubNative, ax, 
//            NativeResponse, ah, RequestParameters

final class ae
{

    boolean a;
    boolean b;
    int c;
    int d;
    private final List e;
    private final Handler f;
    private final Runnable g;
    private final MoPubNative.MoPubNativeNetworkListener h;
    private ah i;
    private RequestParameters j;
    private MoPubNative k;

    ae()
    {
        this(((List) (new ArrayList(3))), new Handler());
    }

    private ae(List list, Handler handler)
    {
        e = list;
        f = handler;
        g = new af(this);
        h = new ag(this);
        c = 0;
        d = 1000;
    }

    static MoPubNative a(ae ae1)
    {
        return ae1.k;
    }

    static List b(ae ae1)
    {
        return ae1.e;
    }

    static ah c(ae ae1)
    {
        return ae1.i;
    }

    static Runnable d(ae ae1)
    {
        return ae1.g;
    }

    static Handler e(ae ae1)
    {
        return ae1.f;
    }

    final void a()
    {
        if (k != null)
        {
            k.destroy();
            k = null;
        }
        j = null;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((NativeResponse)((ax)iterator.next()).a).destroy()) { }
        e.clear();
        f.removeMessages(0);
        a = false;
        c = 0;
        d = 1000;
    }

    final void a(Context context, String s, RequestParameters requestparameters)
    {
        context = new MoPubNative(context, s, h);
        a();
        j = requestparameters;
        k = context;
        c();
    }

    final void a(ah ah)
    {
        i = ah;
    }

    final NativeResponse b()
    {
        long l = SystemClock.uptimeMillis();
        if (!a && !b)
        {
            f.post(g);
        }
        while (!e.isEmpty()) 
        {
            ax ax1 = (ax)e.remove(0);
            if (l - ax1.b < 0xdbba0L)
            {
                return (NativeResponse)ax1.a;
            }
        }
        return null;
    }

    final void c()
    {
        if (!a && k != null && e.size() < 3)
        {
            a = true;
            k.makeRequest(j, Integer.valueOf(c));
        }
    }
}
