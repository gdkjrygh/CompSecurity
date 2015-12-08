// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.porcelain.item.PorcelainCardItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class esz
    implements esx
{

    private final List a = new ArrayList(2);
    private esy b;
    private final Context c;
    private final dpv d;
    private final List e = new LinkedList();
    private final drp f;

    public esz(Context context, drp drp1)
    {
        c = (Context)ctz.a(context);
        d = new dpv("continue-playing", com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size.a, e);
        f = drp1;
    }

    private boolean c()
    {
        return !a.isEmpty();
    }

    public final List a()
    {
        return a;
    }

    public final void a(esy esy1)
    {
        b = esy1;
    }

    public final void a(Iterable iterable, String s)
    {
        e.clear();
        Iterator iterator = iterable.iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodes.Episode episode = (com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodes.Episode)iterator.next();
            iterable = f;
            if (iterable != null)
            {
                drq drq1 = drp.a(((drp) (iterable)).a);
                drq1.c = ((drp) (iterable)).d;
                drq1.d = ((drp) (iterable)).e;
                drq1.b = ((drp) (iterable)).c;
                drq1.a = ((drp) (iterable)).b;
                drq1.c = i;
                drq1.a = s;
                iterable = drq1.a();
            }
            List list = e;
            Object obj2 = c.getString(0x7f080296, new Object[] {
                String.format(Locale.US, "%02d:%02d", new Object[] {
                    Long.valueOf(episode.getTimeLeft() / 60L), Long.valueOf((episode.getTimeLeft() + 60L) % 60L)
                }), episode.getShow().getName()
            });
            Object obj1 = episode.getShow().getCover(com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodes.Show.CoverSize.c);
            Object obj;
            if (episode.getShow().getMediaType() == com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodes.MediaType.b)
            {
                obj = PorcelainIcon.q;
            } else
            {
                obj = PorcelainIcon.m;
            }
            obj2 = (new dpd()).a((new dpn()).a(dpa.b(episode.getName())).a(dpa.b("")).a(dpa.b(((String) (obj2)))));
            obj = dpa.a(((PorcelainIcon) (obj)));
            obj.a = ((String) (obj1));
            obj = (dpd)((dpd) (obj2)).a(((dpi) (obj)));
            obj1 = dpa.a(episode.getUri());
            obj1.b = episode.getShow().getName();
            obj = (dpd)((dpd) (obj)).a(((dpk) (obj1)));
            obj1 = dpa.a(episode.getUri());
            obj1.a = com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.d;
            obj1.b = episode.getName();
            obj.a = ((dpk) (obj1)).a();
            obj = (dpd)(dpb)obj;
            obj.b = PorcelainJsonMetricsData.fromInfo(iterable);
            list.add((PorcelainCardItem)((dpd)obj).b());
            i++;
        }
        if (b != null && c())
        {
            b.a(1, 1);
        }
    }

    public final void a(String s)
    {
        boolean flag;
        boolean flag1;
        if (a.isEmpty())
        {
            List list = a;
            dpg dpg1 = new dpg();
            dpg1.a = s;
            list.add(dpg1.b());
            a.add(d);
            flag = false;
            flag1 = true;
        } else
        {
            if (!s.equals(((drd)a.get(0)).getTitle()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                List list1 = a;
                dpg dpg2 = new dpg();
                dpg2.a = s;
                list1.set(0, dpg2.b());
            }
            flag1 = false;
        }
        if (b != null)
        {
            if (flag1)
            {
                b.a(0, 2);
            } else
            if (flag)
            {
                b.a(0, 1);
                return;
            }
        }
    }

    public final void b()
    {
        boolean flag = c();
        a.clear();
        if (b != null && flag)
        {
            b.O();
        }
    }
}
