// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import java.util.List;
import java.util.Locale;

final class ang.Object
    implements ebg
{

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
        int i = 0;
        while (i < list.size()) 
        {
            MediaBrowserItem mediabrowseritem = (MediaBrowserItem)list.get(i);
            ahb ahb1 = aahb[i];
            ahb1.a(gei.a(mediabrowseritem.c, Locale.getDefault()));
            ekq ekq1;
            if (com.spotify.mobile.android.service.media.browser.rowserItem.ActionType.b.equals(mediabrowseritem.b))
            {
                ahb1.a(ekh2.a.a(ekh2.b, ekh2.c, mediabrowseritem.a));
            } else
            if (com.spotify.mobile.android.service.media.browser.rowserItem.ActionType.a.equals(mediabrowseritem.b))
            {
                dmz.a(ekn);
                ahb1.a(ekn.b());
            }
            ahb1.a(ekh2.g);
            ekq1 = new ekq.ble();
            ekq1.a = mediabrowseritem.e;
            ekq1.b = mediabrowseritem.a;
            ekq1.c = com.spotify.mobile.android.service.media.browser.rowserItem.ActionType.a.equals(mediabrowseritem.b);
            ahb1.a(ekq1);
            i++;
        }
        ekh1.h = aahb;
        a.f.a(a.h);
        a.d.post(new Runnable() {

            private ekh._cls1 a;

            public final void run()
            {
                ekp ekp1 = a.a.i;
                ekp1.a = a.a.h;
                ekp1.a(a.a.f);
            }

            
            {
                a = ekh._cls1.this;
                super();
            }
        });
    }

    (ekh ekh1)
    {
        a = ekh1;
        super();
    }
}
