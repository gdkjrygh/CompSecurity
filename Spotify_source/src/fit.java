// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.spotlets.show.model.Show;
import java.util.HashMap;
import java.util.Map;

public final class fit
{

    private static final ImmutableMap a;
    private static final ImmutableMap b;
    private static final ImmutableMap c = ImmutableMap.i().a(Integer.valueOf(1), "no").a(Integer.valueOf(4), "waiting").a(Integer.valueOf(6), "waitingOfflineMode").a(Integer.valueOf(7), "waitingSyncNotAllowed").a(Integer.valueOf(5), "waitingNoConnection").a(Integer.valueOf(3), "downloading").a(Integer.valueOf(2), "yes").a();

    public static com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder a(String s)
    {
        s = ((String) (a.get(s)));
        com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder consumptionorder = com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder.a;
        if (s == null)
        {
            s = consumptionorder;
        }
        return (com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder)s;
    }

    public static com.spotify.mobile.android.spotlets.show.model.Show.MediaType a(int i)
    {
        Object obj = b.get(Integer.valueOf(i));
        com.spotify.mobile.android.spotlets.show.model.Show.MediaType mediatype = com.spotify.mobile.android.spotlets.show.model.Show.MediaType.d;
        if (obj == null)
        {
            obj = mediatype;
        }
        return (com.spotify.mobile.android.spotlets.show.model.Show.MediaType)obj;
    }

    public static String a(Covers covers, com.spotify.mobile.android.spotlets.show.model.Covers.Size size)
    {
        if (covers == null)
        {
            return "";
        }
        if (size == com.spotify.mobile.android.spotlets.show.model.Covers.Size.d && covers.getXlargeUri().length() > 0)
        {
            return covers.getXlargeUri();
        }
        if ((size == com.spotify.mobile.android.spotlets.show.model.Covers.Size.d || size == com.spotify.mobile.android.spotlets.show.model.Covers.Size.c) && covers.getLargeUri().length() > 0)
        {
            return covers.getLargeUri();
        }
        if (size == com.spotify.mobile.android.spotlets.show.model.Covers.Size.b && covers.getSmallUri().length() > 0)
        {
            return covers.getSmallUri();
        } else
        {
            return covers.getUri();
        }
    }

    public static String a(Covers covers, Covers covers1, Show show, com.spotify.mobile.android.spotlets.show.model.Covers.Size size)
    {
label0:
        {
            String s;
            if (covers != null)
            {
                s = covers.getImageUri(size);
            } else
            {
                s = "";
            }
            covers = s;
            if (s.length() == 0)
            {
                if (covers1 != null)
                {
                    covers = covers1.getImageUri(size);
                } else
                {
                    covers = "";
                }
            }
            covers1 = covers;
            if (covers.length() == 0)
            {
                covers1 = covers;
                if (show != null)
                {
                    if (show.c() == null)
                    {
                        break label0;
                    }
                    covers1 = show.c().getImageUri(size);
                }
            }
            return covers1;
        }
        return "";
    }

    public static Map a(Covers covers, Covers covers1, String s, String s1, Show show, com.spotify.mobile.android.spotlets.show.model.Show.MediaType mediatype)
    {
        HashMap hashmap = new HashMap();
        a(((Map) (hashmap)), "image_url", com.spotify.mobile.android.spotlets.show.model.Covers.Size.a, covers, covers1, show);
        a(((Map) (hashmap)), "image_small_url", com.spotify.mobile.android.spotlets.show.model.Covers.Size.b, covers, covers1, show);
        a(((Map) (hashmap)), "image_large_url", com.spotify.mobile.android.spotlets.show.model.Covers.Size.c, covers, covers1, show);
        a(((Map) (hashmap)), "image_xlarge_url", com.spotify.mobile.android.spotlets.show.model.Covers.Size.d, covers, covers1, show);
        if (!TextUtils.isEmpty(s))
        {
            hashmap.put("title", s);
        }
        if (mediatype == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c)
        {
            hashmap.put("media.type", "video");
            hashmap.put("media.manifest_id", s1);
        } else
        {
            hashmap.put("media.type", "audio");
        }
        if (show != null && !TextUtils.isEmpty(show.a()))
        {
            hashmap.put("artist_name", show.a());
        }
        return hashmap;
    }

    private static void a(Map map, String s, com.spotify.mobile.android.spotlets.show.model.Covers.Size size, Covers covers, Covers covers1, Show show)
    {
        size = a(covers, covers1, show, size);
        if (!TextUtils.isEmpty(size))
        {
            map.put(s, size);
        }
    }

    public static String b(int i)
    {
        Object obj = c.get(Integer.valueOf(i));
        if (obj == null)
        {
            obj = "no";
        }
        return (String)obj;
    }

    static 
    {
        a = ImmutableMap.a("episodic", com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder.b, "sequential", com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder.c, "recent", com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder.d);
        b = ImmutableMap.a(Integer.valueOf(0), com.spotify.mobile.android.spotlets.show.model.Show.MediaType.a, Integer.valueOf(1), com.spotify.mobile.android.spotlets.show.model.Show.MediaType.b, Integer.valueOf(2), com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c);
    }
}
