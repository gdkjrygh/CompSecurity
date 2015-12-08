// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import java.util.List;
import java.util.Locale;

public final class ekh
    implements agy
{

    final eke a;
    final MediaService b;
    final ebf c;
    Handler d;
    agx e;
    aha f;
    byte g[];
    ahb h[];
    ekp i;
    private final String j;

    public ekh(eke eke, MediaService mediaservice, ebf ebf1, String s)
    {
        a = eke;
        b = mediaservice;
        c = ebf1;
        j = s;
        d = new Handler(Looper.getMainLooper());
        i = new ekp(d);
    }

    public final void a()
    {
        c.a(j, new ebg() {

            final ekh a;

            public final void a(Throwable throwable)
            {
                a.e.b("COULD_NOT_LOAD_ERROR");
            }

            public final void a(List list)
            {
                ekh ekh1 = a;
                ekh ekh2 = a;
                ahb aahb[] = (ahb[])ahu.a(ekh2.f, ahb, list.size());
                int k = 0;
                while (k < list.size()) 
                {
                    MediaBrowserItem mediabrowseritem = (MediaBrowserItem)list.get(k);
                    ahb ahb1 = aahb[k];
                    ahb1.a(gei.a(mediabrowseritem.c, Locale.getDefault()));
                    ekq ekq1;
                    if (com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b.equals(mediabrowseritem.b))
                    {
                        ahb1.a(ekh2.a.a(ekh2.b, ekh2.c, mediabrowseritem.a));
                    } else
                    if (com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.a.equals(mediabrowseritem.b))
                    {
                        dmz.a(ekn);
                        ahb1.a(ekn.b());
                    }
                    ahb1.a(ekh2.g);
                    ekq1 = new ekq();
                    ekq1.a = mediabrowseritem.e;
                    ekq1.b = mediabrowseritem.a;
                    ekq1.c = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.a.equals(mediabrowseritem.b);
                    ahb1.a(ekq1);
                    k++;
                }
                ekh1.h = aahb;
                a.f.a(a.h);
                a.d.post(new Runnable(this) {

                    private _cls1 a;

                    public final void run()
                    {
                        ekp ekp1 = a.a.i;
                        ekp1.a = a.a.h;
                        ekp1.a(a.a.f);
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                a = ekh.this;
                super();
            }
        });
    }

    public final void a(adl adl)
    {
        e = (agx)adl;
        g = eko.a(b);
        e.a();
        f = e.a(0);
    }

    public final void a(aht aht1)
    {
        aht1 = (ekq)aht1.c();
        if (((ekq) (aht1)).c)
        {
            b.a(Uri.parse(((ekq) (aht1)).b));
        }
    }

    public final void b()
    {
    }

    public final void c()
    {
    }
}
