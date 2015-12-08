// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class dka
    implements iyj
{

    private static final ekk a = (new ekm()).a(gax).a(izm).a();
    private final Context b;
    private final hpb c;
    private final noz d;
    private final izu e;
    private final izo f;
    private final fat g;

    public dka(Context context)
    {
        b = context;
        c = (hpb)olm.a(context, hpb);
        e = (izu)olm.a(context, izu);
        f = (izo)olm.a(context, izo);
        d = noz.a(context, 3, "AllMoveToTrash", new String[0]);
        g = (fat)olm.a(context, fat);
    }

    private long a(Collection collection)
    {
        long l;
        collection = collection.iterator();
        l = 0L;
_L2:
        ekp ekp1;
        Object obj;
        if (!collection.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ekp1 = (ekp)collection.next();
        obj = b.a(b, ekp1);
        long l1;
        ekp1 = (ekp)((ekv) (obj)).a(ekp1, a).a();
        obj = (izm)ekp1.a(izm);
        if (!((gax)ekp1.a(gax)).q().contains(gav.a))
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = ((izm) (obj)).a;
        l = l1 + l;
        continue; /* Loop/switch isn't completed */
        eke eke1;
        eke1;
        if (d.a())
        {
            noy.a("error", eke1);
        }
        if (true) goto _L2; else goto _L1
_L1:
        return l;
    }

    public final elb a(int i, Collection collection, gaw gaw1, int j)
    {
        List list;
        boolean flag;
        if (!collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "cannot move 0 medias to trash.");
        list = c.a(collection);
        if (list.isEmpty())
        {
            return b.a(new eke("Failed to move medias to trash."));
        }
        if (gaw1.a(gav.a))
        {
            Object obj = new ArrayList();
            Object obj1 = list.iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                hpk hpk1 = (hpk)((Iterator) (obj1)).next();
                if (hpk1.e())
                {
                    ((List) (obj)).add(hpk1.a);
                }
            } while (true);
            obj1 = f.a(((List) (obj)));
            obj = g.a(((List) (obj1)));
            obj1 = new ArrayList(((Collection) (obj1)));
            ((List) (obj1)).removeAll(((Collection) (obj)));
            if (!((List) (obj1)).isEmpty())
            {
                return b.a(new fap(((List) (obj1))));
            }
            long l = a(collection);
            if (d.a())
            {
                long l1 = oqm.c.a(l, oqm.e);
                (new StringBuilder(47)).append("All local files size in MB ").append(l1);
            }
            long l2 = izu.a();
            if (l2 < l)
            {
                return b.a(new izv(l, l2));
            }
            obj = e;
            b.v();
            long l3 = noy.a();
            l2 = ((izu) (obj)).c.b();
            if (((izu) (obj)).d.a())
            {
                noy.a("currentSizeBytes in MB", Long.valueOf(oqm.c.a(l2, oqm.e)));
                noy.a("duration", l3);
            }
            l3 = noy.a();
            obj1 = new StatFs(izu.b.getAbsolutePath());
            long l4 = (long)((StatFs) (obj1)).getAvailableBlocks() * (long)((StatFs) (obj1)).getBlockSize();
            if (((izu) (obj)).d.a())
            {
                noy.a("block", Integer.valueOf(((StatFs) (obj1)).getAvailableBlocks()));
                noy.a("block size", Integer.valueOf(((StatFs) (obj1)).getBlockSize()));
                noy.a("free space in data partition in MB", Long.valueOf(oqm.c.a(l4, oqm.e)));
                noy.a("duration", l3);
            }
            l2 = Math.min(izu.a - l2, l4);
            if (l2 < l)
            {
                return b.a(new izw(l, l2));
            }
        }
        dd.a(b, i, list, gaw1, j);
        return b.b(new iyk(collection, new dok(i, list)));
    }

}
