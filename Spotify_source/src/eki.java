// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.MediaService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class eki
    implements agy
{

    final ekp a;
    aha b;
    ahb c[];
    private final MediaService d;
    private Handler e;

    public eki(MediaService mediaservice)
    {
        d = mediaservice;
        e = new Handler(Looper.getMainLooper());
        a = new ekp(e);
    }

    private ahb[] a(PlayerTrack aplayertrack[])
    {
        int i = Math.min(aplayertrack.length, 100);
        ahb aahb[] = (ahb[])ahu.a(b, ahb, i);
        i = 0;
        while (i < aahb.length) 
        {
            Object obj = aplayertrack[i];
            ahb ahb1 = aahb[i];
            ahb1.a(eko.a(d));
            Object obj1 = (String)((PlayerTrack) (obj)).metadata().get("title");
            String s = (String)((PlayerTrack) (obj)).metadata().get("artist_name");
            ahb1.a((new StringBuilder()).append(((String) (obj1))).append(" - ").append(s).toString());
            dmz.a(ekn);
            ahb1.a(ekn.b());
            obj1 = new ekq();
            if (((PlayerTrack) (obj)).metadata().containsKey("image_small_url"))
            {
                obj = (String)((PlayerTrack) (obj)).metadata().get("image_small_url");
            } else
            if (((PlayerTrack) (obj)).metadata().containsKey("image_url"))
            {
                obj = (String)((PlayerTrack) (obj)).metadata().get("image_url");
            } else
            {
                obj = "";
            }
            obj1.a = dto.a(((String) (obj)));
            obj1.d = i;
            ahb1.a(obj1);
            i++;
        }
        return aahb;
    }

    public final void a()
    {
        boolean flag = false;
        Object obj = d.g;
        if (obj != null)
        {
            PlayerTrack aplayertrack[] = ((PlayerState) (obj)).future();
            obj = ((PlayerState) (obj)).track();
            int j = aplayertrack.length;
            ArrayList arraylist;
            int i;
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = 1;
            }
            arraylist = new ArrayList(i + j);
            if (obj != null)
            {
                arraylist.add(obj);
            }
            arraylist.addAll(Arrays.asList(aplayertrack));
            j = aplayertrack.length;
            if (obj == null)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 1;
            }
            c = a((PlayerTrack[])arraylist.toArray(new PlayerTrack[j + i]));
            b.a(c);
            e.post(new Runnable() {

                private eki a;

                public final void run()
                {
                    ekp ekp1 = a.a;
                    ekp1.a = a.c;
                    ekp1.a(a.b);
                }

            
            {
                a = eki.this;
                super();
            }
            });
        }
    }

    public final void a(adl adl)
    {
        adl = (agx)adl;
        adl.a();
        b = adl.a(0);
    }

    public final void a(aht aht1)
    {
        int i = ((ekq)aht1.c()).d;
        fos.a(d, Integer.valueOf(i).intValue());
    }

    public final void b()
    {
    }

    public final void c()
    {
    }
}
