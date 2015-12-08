// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class hrz
{

    public static final Map a;
    private static final onj c = new onj("debug.photos.cacheSuggestions");
    private static final Uri d = Uri.parse("content://GPhotos/search/explore");
    private static HashMap e;
    private static EnumMap f;
    public Context b;
    private hru g;
    private gjr h;
    private noz i;
    private idi j;

    public hrz(Context context)
    {
        b = context;
        g = new hru(context);
        h = (gjr)olm.a(context, gjr);
        i = noz.a(context, 3, "SuggestionsStore", new String[0]);
        j = (idi)olm.a(context, idi);
    }

    public static Uri a(int k)
    {
        return d.buildUpon().appendEncodedPath(Integer.toString(k)).build();
    }

    private hsr a(int k, int l)
    {
        Object obj = gjr.b(mvj.b(b, k), l);
        hss hss1 = hsr.a();
        qav qav1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hss1.a(hsw.a, qav1))
        {
            gka gka1 = (gka)((Iterator) (obj)).next();
            qav1 = new qav();
            qav1.d = Integer.valueOf(gka1.a);
            qav1.c = gka1.b;
        }

        return hss1.a();
    }

    private static hsr a(hsr hsr1, hsr hsr2)
    {
        hss hss1 = hsr.a();
        hsw ahsw[] = hsw.values();
        int l = ahsw.length;
        int k = 0;
        while (k < l) 
        {
            hsw hsw1 = ahsw[k];
            if (hsr1.a(hsw1) != null)
            {
                hss1.a(hsw1, hsr1.a(hsw1));
            } else
            if (hsr2.a(hsw1) != null)
            {
                hss1.a(hsw1, hsr2.a(hsw1));
            }
            k++;
        }
        return hss1.a();
    }

    private static hsr a(qay qay1, hsw hsw1, int k)
    {
        hss hss1 = hsr.a();
        qay1 = qay1.a;
        int j1 = qay1.length;
        for (int l = 0; l < j1; l++)
        {
            Object obj = qay1[l];
            int k1 = Math.min(k, ((qaz) (obj)).a.length);
            for (int i1 = 0; i1 < k1; i1++)
            {
                qav qav1 = ((qaz) (obj)).a[i1];
                hsw hsw2 = (hsw)e.get(Integer.valueOf(qav1.a));
                if (hsw.f == hsw1 || hsw2 == hsw1)
                {
                    hss1.a(hsw2, qav1);
                }
            }

        }

        return hss1.a();
    }

    public final hsr a(int k, hsw hsw1)
    {
        Object obj;
        List list;
        boolean flag1;
        flag1 = true;
        obj = j.a(k);
        if (obj == null && i.a())
        {
            noy.a(k);
        }
        boolean flag2;
        if (obj != null && ((nwc) (obj)).c)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        list = hsa.a(flag2);
        if (hsw1 != hsw.d) goto _L2; else goto _L1
_L1:
        obj = hsr.a().a(hsw.d, list).a();
_L10:
        return ((hsr) (obj));
_L2:
        boolean flag;
        int j1;
        j1 = ((Integer)a.get(hsw1)).intValue();
        if (i.a())
        {
            noy.a("enableSuggestionCaching", Boolean.valueOf(true));
        }
        obj = g.a(k, hsw1);
        flag = flag1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (((qay) (obj)).a == null) goto _L4; else goto _L5
_L5:
        if (((qay) (obj)).a.length != 0) goto _L7; else goto _L6
_L6:
        flag = flag1;
_L4:
        qaz aqaz[];
        int i1;
        int k1;
        if (flag)
        {
            obj = hrt.a(b, k, j1, hsm.a(hsw1));
            ((hrt) (obj)).d();
            if (((hrt) (obj)).l() || ((hrt) (obj)).a.a == null)
            {
                if (Log.isLoggable("SuggestionsStore", 3))
                {
                    int l = ((nxx) (obj)).l;
                    (new StringBuilder(67)).append("Error while fetching ExploreSuggestions with errorCode: ").append(l);
                    obj = ((nxx) (obj)).n;
                }
                obj = null;
            } else
            {
                g.a(k, hsw1, ((hrt) (obj)).a);
                obj = ((hrt) (obj)).a;
            }
        }
        if (obj == null)
        {
            return (new hss(0)).a();
        }
        break MISSING_BLOCK_LABEL_337;
_L7:
        aqaz = ((qay) (obj)).a;
        k1 = aqaz.length;
        i1 = 0;
_L8:
        flag = flag1;
        if (i1 < k1)
        {
label0:
            {
                if (aqaz[i1].a.length <= 0)
                {
                    break label0;
                }
                flag = false;
            }
        }
          goto _L4
        i1++;
          goto _L8
        hsr hsr1 = a(((qay) (obj)), hsw1, j1);
        if (gjr.b())
        {
            return a(a(k, j1), hsr1);
        }
        obj = hsr1;
        if (hsw1 == hsw.f)
        {
            return (new hss(hsr1)).a(hsw.d, list).a();
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    static 
    {
        Object obj = new HashMap(3);
        e = ((HashMap) (obj));
        ((HashMap) (obj)).put(Integer.valueOf(1), hsw.a);
        e.put(Integer.valueOf(2), hsw.b);
        e.put(Integer.valueOf(3), hsw.c);
        obj = new EnumMap(hsw);
        f = ((EnumMap) (obj));
        ((EnumMap) (obj)).put(hsw.a, Integer.valueOf(1));
        f.put(hsw.b, Integer.valueOf(2));
        f.put(hsw.c, Integer.valueOf(3));
        obj = new HashMap(4);
        ((Map) (obj)).put(hsw.f, Integer.valueOf(20));
        ((Map) (obj)).put(hsw.a, Integer.valueOf(100));
        ((Map) (obj)).put(hsw.b, Integer.valueOf(100));
        ((Map) (obj)).put(hsw.c, Integer.valueOf(100));
        a = Collections.unmodifiableMap(((Map) (obj)));
    }
}
