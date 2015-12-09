// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.nielsen.app.sdk.AppSdk;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

public final class eel
    implements fli, fll
{

    private int a;
    private final Queue b = new LinkedList();
    private final TreeSet c = new TreeSet();
    private long d;
    private final String e;
    private final dwg f;
    private final String g;
    private final AdEventReporter h;
    private boolean i;
    private boolean j;

    public eel(String s, int k, AdEventReporter adeventreporter, dwg dwg1, String s1, boolean flag)
    {
        c.add(Integer.valueOf(1));
        c.add(Integer.valueOf(k));
        e = s;
        h = adeventreporter;
        f = dwg1;
        g = s1;
        j = flag;
    }

    public final void a()
    {
    }

    public final void a(long l)
    {
        if (b.isEmpty() || (long)((Integer)b.peek()).intValue() > l) goto _L2; else goto _L1
_L1:
        a;
        JVM INSTR tableswitch 1 3: default 64
    //                   1 156
    //                   2 178
    //                   3 200;
           goto _L3 _L4 _L5 _L6
_L3:
        a = a + 1;
        b.remove();
_L2:
        if (!c.isEmpty())
        {
            int k = ((Integer)c.first()).intValue();
            if ((long)k <= l)
            {
                String s = e;
                if (k == 1)
                {
                    h.a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.b, e);
                }
                c.remove(Integer.valueOf(k));
            }
        }
        return;
_L4:
        String s1 = e;
        h.a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.d, e);
        continue; /* Loop/switch isn't completed */
_L5:
        String s2 = e;
        h.a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.e, e);
        continue; /* Loop/switch isn't completed */
_L6:
        String s3 = e;
        h.a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.f, e);
        if (true) goto _L3; else goto _L7
_L7:
    }

    public final void a(com.spotify.mobile.android.spotlets.video.LegacyAdsVideoPlayerService.AdsVideoPlaybackState adsvideoplaybackstate)
    {
    }

    public final void a(Map map)
    {
label0:
        {
            String s = e;
            if (j)
            {
                h.a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.c, e);
                h.a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.g, e, map);
            }
            if (g != null && g.length() > 0)
            {
                map = f;
                String s1 = g;
                if (map.b())
                {
                    if (!((dwg) (map)).c)
                    {
                        break label0;
                    }
                    JSONObject jsonobject = new JSONObject();
                    try
                    {
                        jsonobject.put("type", "ad");
                        jsonobject.put("ocrtag", s1);
                    }
                    catch (JSONException jsonexception)
                    {
                        Logger.b(jsonexception, "Unable to create JSON for loading metadata", new Object[0]);
                    }
                    ((dwg) (map)).b.loadMetadata(jsonobject.toString());
                }
            }
            return;
        }
        Logger.c("SDK not ready yet", new Object[0]);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            String s = e;
            if (i && j)
            {
                h.a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.i, e);
            }
            return;
        }
        String s1 = e;
        if (j)
        {
            h.a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.h, e);
        }
        i = true;
    }

    public final void b()
    {
    }

    public final void b(long l)
    {
        int k = 0;
        String s = e;
        d = l;
        int i1 = (int)(d / 4L);
        for (; k < 4; k++)
        {
            b.add(Integer.valueOf(k * i1));
        }

    }

    public final void b(Map map)
    {
        h.a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.j, e, map);
    }
}
