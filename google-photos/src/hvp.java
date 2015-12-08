// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class hvp extends mtf
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private final dnq b;
    private final long c;
    private final ekq j;
    private final ekw k;

    public hvp(long l, ekq ekq, ekw ekw, dnq dnq1)
    {
        super("ExpandSearchHeaders");
        c = l;
        j = ekq;
        k = ekw;
        b = dnq1;
    }

    protected final mue a(Context context)
    {
        long l = noy.a();
        noz noz1 = noz.a(context, 3, "SearchExpand", new String[] {
            "perf"
        });
        Object obj = (eto)olm.a(context, eto);
        context = mtj.b(context, new ele(j, k, a, "ExpandSearchMediaLoader"));
        if (context == null || context.c())
        {
            context = new mue(false);
        } else
        {
            context = context.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
            ArrayList arraylist = new ArrayList(context.size());
            context = context.iterator();
            do
            {
                if (!context.hasNext())
                {
                    break;
                }
                ekp ekp1 = (ekp)context.next();
                String s = ((hpg)ekp1.a(hpg)).a();
                if (s != null)
                {
                    arraylist.add(new etv(s, ekp1.d()));
                }
            } while (true);
            ((eto) (obj)).a(b.a, b.f, c, arraylist);
            obj = new mue(true);
            ((mue) (obj)).a().putLong("start_time_ms_key", c);
            context = ((Context) (obj));
            if (noz1.a())
            {
                noy.a("query", b.b);
                b.a(j);
                b.a(k);
                noy.a("total results", Integer.valueOf(arraylist.size()));
                noy.a("duration", l);
                return ((mue) (obj));
            }
        }
        return context;
    }

}
