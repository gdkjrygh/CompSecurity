// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class fvj
    implements iyi
{

    private final hpb a;
    private final izo b;
    private final fat c;

    public fvj(Context context)
    {
        a = (hpb)olm.a(context, hpb);
        b = (izo)olm.a(context, izo);
        c = (fat)olm.a(context, fat);
    }

    public final elb a(int i, Collection collection, gaw gaw1)
    {
        i = 0;
        if (!gaw1.a(gav.a))
        {
            return b.b(Collections.emptyList());
        }
        Object obj;
        boolean flag;
        if (!collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "cannot delete 0 medias");
        obj = a.a(collection);
        if (((List) (obj)).isEmpty())
        {
            return b.a(new eke("Failed to delete medias with 0 resolved medias"));
        }
        gaw1 = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            hpk hpk1 = (hpk)((Iterator) (obj)).next();
            if (hpk1.e())
            {
                gaw1.add(hpk1.a);
            }
        } while (true);
        Object obj1 = b.a(gaw1);
        obj = c.a(((List) (obj1)));
        obj1 = new ArrayList(((Collection) (obj1)));
        ((List) (obj1)).removeAll(((Collection) (obj)));
        if (!((List) (obj1)).isEmpty())
        {
            return b.a(new fap(((List) (obj1))));
        }
        if (!((List) (obj)).isEmpty())
        {
            i = b.b(((List) (obj)));
        }
        if (i == gaw1.size())
        {
            return b.b(collection);
        } else
        {
            int j = gaw1.size();
            return b.a(new eke((new StringBuilder(75)).append("Failed to delete local medias. Requested: ").append(j).append(", deleted: ").append(i).toString()));
        }
    }
}
