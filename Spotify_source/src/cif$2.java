// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;

final class ang.Object
    implements Runnable
{

    private Context a;
    private AdRequestInfoParcel b;
    private cih c;
    private cbk d;
    private cbi e;
    private String f;
    private cau g;

    public final void run()
    {
        bkv.f();
        ckw ckw1 = clc.a(a, new AdSizeParcel(), false, false, null, b.k);
        if (bkv.h().h())
        {
            ckw1.clearCache(true);
        }
        ckw1.a().setWillNotDraw(true);
        c.e = ckw1;
        d.a(e, new String[] {
            "rwc"
        });
        Object obj = d.a();
        obj = cif.a(f, d, ((cbi) (obj)));
        ckx ckx1 = ckw1.k();
        ckx1.a("/invalidRequest", c.g);
        ckx1.a("/loadAdURL", c.h);
        ckx1.a("/log", cdh.g);
        ckx1.d = ((cky) (obj));
        bka.a("Loading the JS library.");
        ckw1.loadUrl(g.a);
    }

    (Context context, AdRequestInfoParcel adrequestinfoparcel, cih cih1, cbk cbk1, cbi cbi, String s, cau cau1)
    {
        a = context;
        b = adrequestinfoparcel;
        c = cih1;
        d = cbk1;
        e = cbi;
        f = s;
        g = cau1;
        super();
    }
}
