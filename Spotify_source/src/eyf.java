// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.widget.ProgressBar;
import com.spotify.mobile.android.spotlets.tinkerbell.BannerItem;
import com.spotify.mobile.android.spotlets.tinkerbell.BannerView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.concurrent.TimeUnit;

final class eyf
    implements fjk
{

    final Context a;
    final Verified b;
    final BannerView c;
    eyb d;
    private final gin e;
    private final String f;

    public eyf(Context context, gin gin1, Verified verified, String s, BannerView bannerview)
    {
        a = context;
        e = gin1;
        b = verified;
        f = s;
        c = bannerview;
    }

    static void a(eyf eyf1, BannerItem banneritem)
    {
        Object obj = new ProgressBar(eyf1.a);
        int i = (int)eyf1.a.getResources().getDimension(0x7f0c0102);
        ((ProgressBar) (obj)).setPadding(0, i, 0, i);
        obj = (new dfj(eyf1.a, 0x7f0b017f)).a(0x7f08039c).a(false).a(((android.view.View) (obj))).b();
        ((dfi) (obj)).show();
        ctz.a(eyf1.d);
        eyf1.d.a(eyf1.f, eyf1. new eyc(banneritem, ((dfi) (obj))) {

            final dfi a;
            final eyf b;
            private BannerItem c;

            public final void a()
            {
                b.a(c, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aH));
                for for1 = (for)dmz.a(for);
                for.a(b.a, b.b, true);
                (new Handler()).postDelayed(new Runnable(this, for1) {

                    final _cls1 a;

                    public final void run()
                    {
                        for.a(a.b.a, a.b.b, false);
                        (new Handler()).postDelayed(new Runnable(this) {

                            private _cls1 a;

                            public final void run()
                            {
                                a.a.a.dismiss();
                                a.a.b.c.a(1000L);
                                a.a.b.a.startActivity(gms.a(a.a.b.a, ViewUri.j.toString()).a);
                            }

            
            {
                a = _pcls1;
                super();
            }
                        }, TimeUnit.SECONDS.toMillis(2L));
                    }

            
            {
                a = _pcls1;
                super();
            }
                }, TimeUnit.SECONDS.toMillis(3L));
            }

            public final void b()
            {
                eye.b(b.a, b.b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aI));
                a.dismiss();
                eyf eyf2 = b;
                BannerItem banneritem1 = c;
                (new dfj(eyf2.a, 0x7f0b017f)).a(0x7f08039b).b(0x7f080398).a(0x7f08039a, eyf2. new android.content.DialogInterface.OnClickListener(banneritem1) {

                    private BannerItem a;
                    private eyf b;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        eye.b(b.a, b.b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aF));
                        eyf.a(b, a);
                    }

            
            {
                b = eyf.this;
                a = banneritem;
                super();
            }
                }).b(0x7f080399, eyf2. new android.content.DialogInterface.OnClickListener() {

                    private eyf a;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        eye.b(a.a, a.b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aG));
                    }

            
            {
                a = eyf.this;
                super();
            }
                }).b().show();
            }

            
            {
                b = eyf.this;
                c = banneritem;
                a = dfi1;
                super();
            }
        });
    }

    public final void a(BannerItem banneritem)
    {
        eye.b(a, b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aB));
        (new dfj(a, 0x7f0b017f)).a(0x7f080397).b(0x7f080394).a(0x7f080396, new android.content.DialogInterface.OnClickListener(banneritem) {

            private BannerItem a;
            private eyf b;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                eye.b(b.a, b.b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aD));
                eyf.a(b, a);
            }

            
            {
                b = eyf.this;
                a = banneritem;
                super();
            }
        }).b(0x7f080395, new android.content.DialogInterface.OnClickListener() {

            private eyf a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                eye.b(a.a, a.b, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aE));
            }

            
            {
                a = eyf.this;
                super();
            }
        }).b().show();
    }

    final void a(BannerItem banneritem, ClientEvent clientevent)
    {
        if (banneritem.a != 0x7f110013)
        {
            return;
        } else
        {
            eye.b(a, b, clientevent);
            e.b().a(eye.a, System.currentTimeMillis()).b();
            return;
        }
    }

    public final void b(BannerItem banneritem)
    {
        a(banneritem, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aC));
    }
}
