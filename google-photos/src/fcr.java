// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class fcr
    implements fbl
{

    private final Context a;
    private final noz b;
    private final noz c;
    private fbz d;

    public fcr(Context context, fbz fbz1)
    {
        d = fbz1;
        a = (Context)p.a(context);
        b = noz.a(context, 2, "PhotosDeviceMgmt", new String[0]);
        c = noz.a(context, "PhotosDeviceMgmt", new String[0]);
    }

    private static String a(fct fct1)
    {
        int i = fct1.d;
        int j = fct1.c;
        return (new StringBuilder(49)).append(i).append(" out of ").append(j).append(" server RPCs failed").toString();
    }

    private List a(fct fct1, List list, Map map)
    {
        fct1.c = fct1.c + 1;
        int i = fct1.a;
        String s = fct1.b;
        nwh nwh1 = new nwh(a, i, s);
        if (!d.b(i))
        {
            nwh1.b = true;
        }
        pll pll1;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); nwh1.a.add(pll1))
        {
            Object obj = (fcs)iterator.next();
            String s1 = ((fcs) (obj)).a;
            Integer integer = ((fcs) (obj)).b;
            obj = ((fcs) (obj)).c;
            if (integer == null && obj != null || obj == null && integer != null)
            {
                fct1 = String.valueOf(integer);
                list = String.valueOf(obj);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(fct1).length() + 66 + String.valueOf(list).length())).append("width and height must both be null or non-null (width: ").append(fct1).append(", height: ").append(list).append(")").toString());
            }
            pll1 = new pll();
            pll1.a = s1;
            pll1.b = integer;
            pll1.c = ((Integer) (obj));
        }

        nwh1.d();
        if (!nwh1.l())
        {
            ArrayList arraylist = new ArrayList(list.size());
            Iterator iterator1 = list.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                fcs fcs1 = (fcs)iterator1.next();
                if (nwh1.a(fcs1.a))
                {
                    fcj fcj1 = (fcj)map.get(fcs1.a);
                    if (b.a())
                    {
                        String s2 = String.valueOf(fcj1.a());
                        String s3 = String.valueOf(fcs1);
                        long l = nwh1.b(fcs1.a);
                        (new StringBuilder(String.valueOf(s2).length() + 56 + String.valueOf(s3).length())).append("Server has sha for: ").append(s2).append(" sha: ").append(s3).append(" photoId: ").append(l);
                    }
                    arraylist.add(fcj1);
                }
            } while (true);
            if (b.a())
            {
                list = String.valueOf(list);
                map = String.valueOf(arraylist);
                (new StringBuilder(String.valueOf(list).length() + 42 + String.valueOf(map).length())).append("Requested backup info for: ").append(list).append(" And received: ").append(map);
            }
            list = arraylist;
        } else
        {
            if (c.a())
            {
                String.format(Locale.US, "Error checking if photos exist.  Reason: %s, Error Code: %d", new Object[] {
                    ((nxx) (nwh1)).m, Integer.valueOf(((nxx) (nwh1)).l)
                });
                list = ((nxx) (nwh1)).n;
            }
            list = null;
        }
        if (list != null)
        {
            return list;
        } else
        {
            fct1.d = fct1.d + 1;
            return Collections.emptyList();
        }
    }

    public final List a(int i, Iterable iterable)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        Object obj = (fch)olm.a(a, fch);
        Object obj1 = iterable.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            fcj fcj1 = (fcj)((Iterator) (obj1)).next();
            iterable = ((fch) (obj)).a(fcj1.a());
            if (iterable != null)
            {
                iterable = iterable.a();
            } else
            {
                iterable = null;
            }
            if (b.a())
            {
                String s = String.valueOf(fcj1.a());
                (new StringBuilder(String.valueOf(s).length() + 17 + String.valueOf(iterable).length())).append("Calc'd sha for: ").append(s).append(" ").append(iterable);
            }
            if (iterable != null)
            {
                linkedhashmap.put(iterable, fcj1);
            }
        } while (true);
        iterable = new ArrayList();
        if (linkedhashmap.isEmpty())
        {
            return iterable;
        }
        obj1 = ((mmv)olm.a(a, mmv)).a(i).b("gaia_id");
        obj = new ArrayList(100);
        obj1 = new fct(i, ((String) (obj1)));
        Iterator iterator = linkedhashmap.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj2 = (fcj)entry.getValue();
            if (fck.a.equals(((fcj) (obj2)).d()))
            {
                obj2 = ((fcj) (obj2)).e();
                if (obj2 != null)
                {
                    ((List) (obj)).add(new fcs((String)entry.getKey(), Integer.valueOf(((Point) (obj2)).x), Integer.valueOf(((Point) (obj2)).y)));
                }
            } else
            {
                ((List) (obj)).add(new fcs((String)entry.getKey(), null, null));
            }
            if (((List) (obj)).size() % 100 == 0)
            {
                iterable.addAll(a(((fct) (obj1)), ((List) (obj)), ((Map) (linkedhashmap))));
                ((List) (obj)).clear();
            }
        } while (true);
        if (!((List) (obj)).isEmpty())
        {
            iterable.addAll(a(((fct) (obj1)), ((List) (obj)), ((Map) (linkedhashmap))));
        }
        if (((fct) (obj1)).c == ((fct) (obj1)).d)
        {
            throw new fbm(a(((fct) (obj1))));
        }
        if (((fct) (obj1)).d > 0 && c.a())
        {
            a(((fct) (obj1)));
        }
        return iterable;
    }
}
