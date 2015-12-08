// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class gfj
{

    private static final oqe a = new oqe("debug.photos.moviemaker_force", "false");
    private static final ekk b = (new ekm()).a(gfn).a(gax).b(jdy).a();
    private static final ekk c = (new ekm()).a(elt).a(gax).a(hpg).b(jdy).a();
    private static final ekk d = (new ekm()).b(elt).a();

    static Uri a(Context context, int i, String s)
    {
        s = new dmb(i, Arrays.asList(new String[] {
            s
        }));
        return (new gfd(context, (ekp)((List)b.a(context, s).a(s, ekw.a, b).a()).get(0))).d();
    }

    private static ekp a(Context context, int i, String s, ekk ekk)
    {
        s = new dmb(i, Arrays.asList(new String[] {
            s
        }));
        context = (List)b.a(context, s).a(s, ekw.a, ekk).a();
        if (context == null || context.size() == 0)
        {
            return null;
        } else
        {
            return (ekp)context.get(0);
        }
    }

    public static List a(Context context)
    {
        ArrayList arraylist = new ArrayList();
        context = (mmv)olm.a(context, mmv);
        for (Iterator iterator = context.a(new String[] {
    "logged_in"
}).iterator(); iterator.hasNext(); arraylist.add(context.a(((Integer)iterator.next()).intValue()).b("gaia_id"))) { }
        return arraylist;
    }

    static Map a(Context context, int i, Collection collection)
    {
        HashMap hashmap = new HashMap();
        Object obj = b(context, i, collection);
        collection = new HashSet(collection);
        obj = ((List) (obj)).iterator();
label0:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ekp ekp1 = (ekp)((Iterator) (obj)).next();
            Iterator iterator = ((hpg)ekp1.a(hpg)).a.iterator();
            Object obj1;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    obj1 = (hpk)iterator.next();
                } while (!((hpk) (obj1)).a());
                obj1 = ((hpk) (obj1)).c;
            } while (!collection.contains(obj1));
            hashmap.put(obj1, new gfd(context, ekp1));
        } while (true);
        return hashmap;
    }

    public static boolean a()
    {
        return "TRUE".equalsIgnoreCase(a.a);
    }

    static ekp b(Context context, int i, String s)
    {
        return a(context, i, s, b);
    }

    private static List b(Context context, int i, Collection collection)
    {
_L2:
        Object obj;
        ekv ekv1;
        obj = new dmb(i, new ArrayList(collection));
        ekv1 = b.a(context, ((ekq) (obj)));
        obj = (List)ekv1.a(((ekq) (obj)), ekw.a, c).a();
        return ((List) (obj));
        ekt ekt1;
        ekt1;
        HashSet hashset = new HashSet();
        Object obj1 = ekt1.b.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            String s = ((djf)((Iterator) (obj1)).next()).a;
            if (s != null)
            {
                hashset.add(s);
            }
        } while (true);
        obj1 = new ArrayList();
        Iterator iterator = collection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (!hashset.contains(s1))
            {
                ((List) (obj1)).add(s1);
            }
        } while (true);
        if (!((List) (obj1)).isEmpty() && ((List) (obj1)).size() < collection.size())
        {
            collection = ((Collection) (obj1));
        } else
        {
            return new ArrayList();
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    static ekp c(Context context, int i, String s)
    {
        return a(context, i, s, c);
    }

    static ayn d(Context context, int i, String s)
    {
        Iterator iterator;
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        s = new dmb(i, arraylist);
        iterator = ((List)b.a(context, s).a(s, ekw.a, d).a()).iterator();
        s = null;
_L4:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_112;
        }
        s = (elt)((ekp)iterator.next()).b(elt);
        if (s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        gap gap;
        gap = s.e();
        s = gap;
        if (gap == null) goto _L4; else goto _L3
_L3:
        s = gap;
        if (s != null)
        {
            return ((amh)olm.a(context, amh)).f().a(s).a(ayt.c(context)).a(1280, 720);
        }
          goto _L1
    }

}
