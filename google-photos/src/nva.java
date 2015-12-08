// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class nva extends nux
    implements nvl
{

    private static Context b;
    nvi a;
    private zb c;
    private yz d;
    private Runnable e;
    private nuy f;
    private lxf g;
    private final List h;
    private final List i;
    private nve j;

    public nva(Context context)
    {
        this(context, new nve());
    }

    private nva(Context context, nve nve1)
    {
        h = new ArrayList();
        i = new ArrayList();
        j = nve1;
        b = context;
        d = (new za()).a(((lxn)olm.a(b, lxn)).a("5FD0CDC9")).a();
        context = new nvf(this);
        Object obj = b;
        nve1 = d;
        obj = zb.a(((Context) (obj)));
        ((zb) (obj)).a(nve1, context, 1);
        c = ((zb) (obj));
        e = new nvb(this);
    }

    private String a(nuy nuy1)
    {
        int l = 0;
        if (nuy1 == null || TextUtils.isEmpty(nuy1.a))
        {
            return null;
        }
        nvi nvi1;
        byte byte0;
        int k;
        if (nuy1.b.equals(njx.b))
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        if (a == null) goto _L2; else goto _L1
_L1:
        nvi1 = a;
        k = l;
        if (nvi1.d != 0)
        {
            k = l;
            if (nvi1.c != 0)
            {
                k = 1;
            }
        }
        if (!k) goto _L2; else goto _L3
_L3:
        l = a.c;
        k = a.d;
_L5:
        return nkj.a(nuy1.a, byte0, l, k);
_L2:
        k = 720;
        l = 1280;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static k a(nva nva1)
    {
        return null;
    }

    static void a(nva nva1, lxl lxl)
    {
        if (lxl != null)
        {
            nva1.g = ((lxk)olm.a(b, lxk)).a();
            nva1.g.a(b, lxl, new nvc(nva1));
            nva1.g.a();
            return;
        } else
        {
            nva1.i();
            return;
        }
    }

    static void b(nva nva1)
    {
    }

    static Runnable c(nva nva1)
    {
        return nva1.e;
    }

    static void d(nva nva1)
    {
        nva1.i();
    }

    static lxf e(nva nva1)
    {
        return nva1.g;
    }

    static nvi f(nva nva1)
    {
        return nva1.a;
    }

    static Context g()
    {
        return b;
    }

    static List g(nva nva1)
    {
        return nva1.h;
    }

    private void h()
    {
        if (a != null && a.b)
        {
            Runnable runnable = e;
            b.w().removeCallbacks(runnable);
            b.a(e, 33L);
            return;
        } else
        {
            Object obj = new Intent(b, ((nuz)olm.a(b, nuz)).getClass());
            ((Intent) (obj)).putExtra("notification_video_playing", false);
            b.startService(((Intent) (obj)));
            obj = e;
            b.w().removeCallbacks(((Runnable) (obj)));
            return;
        }
    }

    private void i()
    {
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        h();
        f = null;
        if (a != null)
        {
            a.a("invalidateSession", null);
            a = null;
        }
        g.b();
        a(false);
        b.stopService(new Intent(b, ((nuz)olm.a(b, nuz)).getClass()));
        g = null;
        return;
        Object obj;
        obj;
        Log.e("CastApi", "Disconnecting from a device we are not connected to.", ((Throwable) (obj)));
        g = null;
        return;
        obj;
        g = null;
        throw obj;
    }

    public final void a(Bundle bundle, int k, nuy nuy1, nuy nuy2)
    {
        nvi nvi1;
        String s;
        JSONObject jsonobject;
        if (nuy1 == null || a == null || TextUtils.isEmpty(nuy1.a))
        {
            return;
        }
        nvi1 = a;
        s = a(nuy1);
        nuy2 = a(nuy2);
        jsonobject = new JSONObject();
        jsonobject.put("asset", nvi.a(s, "image", "remote"));
        if (nuy2 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(nvi.a(nuy2, "image", "remote"));
        jsonobject.put("precache", jsonarray);
        nvi1.a("newAsset", jsonobject);
        nvi1.a(false);
_L2:
        f = nuy1;
        nuy2 = new Intent(b, ((nuz)olm.a(b, nuz)).getClass());
        nuy2.putExtra("notification_bundle", bundle);
        nuy2.putExtra("notification_media", nuy1.a);
        nuy2.putExtra("notification_index", k);
        nuy2.putExtra("notification_video_playing", false);
        b.startService(nuy2);
        return;
        nuy2;
        if (Log.isLoggable("RemoteMediaController", 5))
        {
            Log.w("RemoteMediaController", "Error constructing remote asset", nuy2);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    final void a(boolean flag)
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public final boolean a()
    {
        return g != null && g.c();
    }

    public final void b()
    {
        zb.a(zb.b());
    }

    public final void c()
    {
        double d1;
        nvi nvi1;
        nvi1 = a;
        d1 = nvi1.f.d();
        if (d1 >= 1.0D)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        nvi1.f.a(d1 + 0.10000000000000001D);
        return;
        IOException ioexception;
        ioexception;
        Log.w("RemoteMediaController", "Error sending setVolume", ioexception);
        return;
    }

    public final void d()
    {
        double d1;
        nvi nvi1;
        nvi1 = a;
        d1 = nvi1.f.d();
        if (d1 <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        nvi1.f.a(d1 - 0.10000000000000001D);
        return;
        IOException ioexception;
        ioexception;
        Log.w("RemoteMediaController", "Error sending setVolume", ioexception);
        return;
    }

    final void e()
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public final void f()
    {
        h();
    }
}
