// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ab, hk, hi, gm, 
//            hj, ag, o, cc, 
//            cf, af

public final class ad
    implements ab
{

    private final hi a;

    public ad(Context context, VersionInfoParcel versioninfoparcel, o o)
    {
        p.f();
        a = com.google.android.gms.internal.hk.a(context, new AdSizeParcel(), false, false, o, versioninfoparcel);
        a.setWillNotDraw(true);
    }

    static hi a(ad ad1)
    {
        return ad1.a;
    }

    private static void a(Runnable runnable)
    {
        n.a();
        if (com.google.android.gms.ads.internal.util.client.a.b())
        {
            runnable.run();
            return;
        } else
        {
            com.google.android.gms.internal.gm.a.post(runnable);
            return;
        }
    }

    public final void a()
    {
        a.destroy();
    }

    public final void a(com.google.android.gms.ads.internal.client.a a1, f f, cc cc, j j)
    {
        a.j().a(a1, f, cc, j, false, null, null, new e((byte)0), null);
    }

    public final void a(ab.a a1)
    {
        a.j().a(new hj.a(a1) {

            final ab.a a;
            final ad b;

            public final void a(hi hi1, boolean flag)
            {
                a.a();
            }

            
            {
                b = ad.this;
                a = a1;
                super();
            }
        });
    }

    public final void a(String s)
    {
        a(new Runnable(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
            s
        })) {

            final String a;
            final ad b;

            public final void run()
            {
                com.google.android.gms.internal.ad.a(b).loadData(a, "text/html", "UTF-8");
            }

            
            {
                b = ad.this;
                a = s;
                super();
            }
        });
    }

    public final void a(String s, cf cf)
    {
        a.j().a(s, cf);
    }

    public final void a(String s, String s1)
    {
        a(new Runnable(s, s1) {

            final String a;
            final String b;
            final ad c;

            public final void run()
            {
                com.google.android.gms.internal.ad.a(c).a(a, b);
            }

            
            {
                c = ad.this;
                a = s;
                b = s1;
                super();
            }
        });
    }

    public final void a(String s, JSONObject jsonobject)
    {
        a(new Runnable(s, jsonobject) {

            final String a;
            final JSONObject b;
            final ad c;

            public final void run()
            {
                com.google.android.gms.internal.ad.a(c).b(a, b);
            }

            
            {
                c = ad.this;
                a = s;
                b = jsonobject;
                super();
            }
        });
    }

    public final af b()
    {
        return new ag(this);
    }

    public final void b(String s)
    {
        a(new Runnable(s) {

            final String a;
            final ad b;

            public final void run()
            {
                com.google.android.gms.internal.ad.a(b).loadUrl(a);
            }

            
            {
                b = ad.this;
                a = s;
                super();
            }
        });
    }

    public final void b(String s, cf cf)
    {
        a.j().b(s, cf);
    }

    public final void b(String s, JSONObject jsonobject)
    {
        a.a(s, jsonobject);
    }

    public final void c(String s)
    {
        a(new Runnable(s) {

            final String a;
            final ad b;

            public final void run()
            {
                com.google.android.gms.internal.ad.a(b).loadData(a, "text/html", "UTF-8");
            }

            
            {
                b = ad.this;
                a = s;
                super();
            }
        });
    }
}
