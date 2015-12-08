// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import com.pandora.android.util.p;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import p.df.a;

// Referenced classes of package com.pandora.android.tablet:
//            TabletHome

public static final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final Map j;
    private static final i k[];
    public p i;

    public static String a(List list)
    {
        JSONArray jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext(); jsonarray.put(((i)list.next()).toString())) { }
        return jsonarray.toString();
    }

    public static List a(String s)
    {
        ArrayList arraylist;
        int l;
        try
        {
            arraylist = new ArrayList();
            s = new JSONArray(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.c("TabletHome", "Invalid stationPanes array string", s);
            return null;
        }
        l = 0;
        if (l >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add((toString)Enum.valueOf(com/pandora/android/tablet/TabletHome$c, s.getString(l)));
        l++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_19;
_L1:
        return arraylist;
    }

    public static toString valueOf(String s)
    {
        return (toString)Enum.valueOf(com/pandora/android/tablet/TabletHome$c, s);
    }

    public static toString[] values()
    {
        return (toString[])k.clone();
    }

    static 
    {
        int l = 0;
        a = new <init>("STATION_LIST", 0, p.a);
        b = new <init>("GENRE_CATEGEORIES", 1, p.h);
        c = new <init>("GENRE_STATIONS_LIST", 2, p.i);
        d = new <init>("SHUFFLE_LIST_EDIT", 3);
        e = new <init>("SEARCH_ADD_MUSIC_SEED", 4, p.d);
        f = new <init>("SEARCH_CREATE_STATION", 5, p.c);
        g = new <init>("SEARCH_RESULTS", 6, p.b);
        h = new <init>("ALL_RECOMMENDATIONS", 7);
        k = (new k[] {
            a, b, c, d, e, f, g, h
        });
        j = new EnumMap(com/pandora/android/util/p);
        c_3B_.clone aclone[] = values();
        for (int i1 = aclone.length; l < i1; l++)
        {
            c_3B_.clone clone = aclone[l];
            if (clone.i == null)
            {
                continue;
            }
            if (com.pandora.android.tablet.TabletHome.a(clone.i))
            {
                throw new RuntimeException((new StringBuilder()).append("PageName used more than once in a pane enum: ").append(clone.i).toString());
            }
            j.put(clone.i, clone);
        }

    }

    private (String s, int l)
    {
        super(s, l);
        i = null;
    }

    private i(String s, int l, p p1)
    {
        super(s, l);
        i = null;
        i = p1;
    }
}
