// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.ads.model.Sponsorship;
import com.spotify.mobile.android.spotlets.ads.model.Sponsorships;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class efg
    implements dmx
{

    public efi a;
    public Sponsorships b;
    public efh c;
    public boolean d;
    private final geq e = ggb.b();
    private Runnable f;

    public efg(Context context)
    {
        f = new Runnable() {

            private efg a;

            public final void run()
            {
                efg.a(a);
            }

            
            {
                a = efg.this;
                super();
            }
        };
        dmz.a(ggb);
        dmz.a(efk);
        a = efk.a(context);
        c = new efh();
        d = false;
    }

    static Sponsorships a(efg efg1, Sponsorships sponsorships)
    {
        efg1.b = sponsorships;
        return sponsorships;
    }

    static void a(efg efg1)
    {
        efg1.a();
    }

    static void a(efg efg1, long l)
    {
        efg1.b();
        geq geq1 = efg1.e;
        efg1 = efg1.f;
        Object obj = TimeUnit.SECONDS;
        ger ger1 = new ger(geq1, efg1);
        obj = geq1.a.schedule(ger1, l, ((TimeUnit) (obj)));
        geq1.c.put(efg1, obj);
    }

    static Sponsorships b(efg efg1)
    {
        return efg1.b;
    }

    public final Sponsorship a(String s)
    {
        if (d) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        boolean flag;
        efh efh1;
        long l;
        if (b != null)
        {
            s = b.getSponsorship(s);
        } else
        {
            s = null;
        }
        efh1 = c;
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        l = efh1.a + (gcf.b() / 1000L - efh1.b);
        if (s.getEndTimeSeconds() == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s.getStartTimeSeconds() > l || !flag && s.getEndTimeSeconds() <= l)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
_L4:
        if (flag)
        {
            return s;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void a()
    {
        efi efi1 = a;
        efj efj = new efj() {

            private efg a;

            public final void a(Response response, Object obj1)
            {
                obj1 = (Sponsorships)obj1;
                ((Sponsorships) (obj1)).preserveDisplayState(efg.b(a));
                efg.a(a, ((Sponsorships) (obj1)));
                try
                {
                    efg.b(a).setTTLSeconds(Long.parseLong((String)response.getHeaders().get("MC-TTL")));
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    response.getMessage();
                }
                efg.a(a, efg.b(a).getTTLSeconds());
            }

            public final void a(com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                errorcause.name();
                efg.a(a, 1800L);
            }

            
            {
                a = efg.this;
                super();
            }
        };
        if (!efi1.c)
        {
            efi1.c = true;
            synchronized (efi1.b)
            {
                efi1.a = efi1.a + 1;
            }
            obj = RequestBuilder.get("hm://sponsoredplaylist/v1/sponsored").build();
            efi1.a().resolve(((com.spotify.cosmos.router.Request) (obj)), new efi._cls2(efi1, efi1.b(), com/spotify/mobile/android/spotlets/ads/model/Sponsorships, efj));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        e.b(f);
    }
}
