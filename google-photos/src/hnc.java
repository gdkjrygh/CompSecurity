// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class hnc
    implements iwj
{

    private final hgp a = new hgp();
    private final am b;

    public hnc(am am1)
    {
        b = am1;
    }

    public final Object a(Object obj)
    {
        double d1;
        double d2;
        hil hil2;
        ArrayList arraylist;
        ArrayList arraylist1;
        int k;
        obj = (hnb)obj;
        gai gai1 = ((hnb) (obj)).a;
        List list = ((hnb) (obj)).b;
        if (gai1 == null)
        {
            return Collections.emptyList();
        }
        if (list != null)
        {
            obj = list.iterator();
            hil hil1;
            for (double d = (-1.0D / 0.0D); ((Iterator) (obj)).hasNext(); d = hil1.b())
            {
                hil1 = (hil)((Iterator) (obj)).next();
                if (hil1.b() < d)
                {
                    throw new IllegalStateException("Enrichments must be ordered by position");
                }
            }

        }
        int i;
        int j;
        int l;
        if (list != null)
        {
            i = list.size();
        } else
        {
            i = 0;
        }
        l = gai1.a();
        arraylist = new ArrayList(l + i);
        arraylist1 = new ArrayList(l + i);
        k = 0;
        j = 0;
_L7:
        if (j >= i && k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k < l)
        {
            obj = gai1.a(k);
        } else
        {
            obj = null;
        }
        if (j < i)
        {
            hil2 = (hil)list.get(j);
        } else
        {
            hil2 = null;
        }
        if (obj != null)
        {
            d1 = ((hjx)((ekp) (obj)).a(hjx)).a;
        } else
        {
            d1 = (1.0D / 0.0D);
        }
        if (hil2 != null)
        {
            d2 = hil2.b();
        } else
        {
            d2 = (1.0D / 0.0D);
        }
        if (d2 >= d1) goto _L2; else goto _L1
_L1:
        if (!(hil2 instanceof hiu)) goto _L4; else goto _L3
_L3:
        arraylist.add(new hjh((hiu)hil2, a));
_L5:
        arraylist1.add(new hlr(hil2));
        j++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (hil2 instanceof hiq)
        {
            arraylist.add(new hjd((hiq)hil2, a));
        } else
        if (hil2 instanceof his)
        {
            arraylist.add(new hjf((his)hil2, a));
        }
        if (true) goto _L5; else goto _L2
_L2:
        frj frj1 = new frj(((ekp) (obj)));
        frj1.a = a;
        arraylist.add(frj1);
        arraylist1.add(new hlr(((ekp) (obj))));
        k++;
        if (true) goto _L7; else goto _L6
_L6:
        obj = (hls)olm.b(b.G_(), hls);
        if (obj != null)
        {
            obj.a = arraylist1;
        }
        return arraylist;
    }
}
