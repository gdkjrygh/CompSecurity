// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class hsl extends mtf
{

    private final int a;
    private final Map b;

    public hsl(int i, Map map)
    {
        super("ResyncSuggestions");
        b = map;
        a = i;
    }

    private static void a(nxx nxx1)
    {
        if (Log.isLoggable("ResyncSuggestions", 3))
        {
            int i = nxx1.l;
            (new StringBuilder(67)).append("Error while fetching ExploreSuggestions with errorCode: ").append(i);
            nxx1 = nxx1.n;
        }
    }

    public final mue a(Context context)
    {
        eto eto1 = (eto)olm.a(context, eto);
        HashMap hashmap = new HashMap(b.size());
        HashMap hashmap1 = new HashMap(b.size());
        Object obj = nzd.a(context, a);
        java.util.Map.Entry entry;
        hrt hrt1;
        for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); hashmap1.put(hrt1, Integer.valueOf(((hsw)entry.getKey()).a())))
        {
            entry = (java.util.Map.Entry)iterator.next();
            hrt1 = hrt.b(context, a, ((Integer)entry.getValue()).intValue(), hsm.a((hsw)entry.getKey()));
            ((nyp) (obj)).a(hrt1);
        }

        ((nyp) (obj)).d();
        if (((nyp) (obj)).l())
        {
            a(((nxx) (obj)));
            return new mue(false);
        }
        for (context = ((nyp) (obj)).a.iterator(); context.hasNext(); hashmap.put(hashmap1.get(obj), qlw.a(((hrt) (obj)).a)))
        {
            obj = (hrt)(nxx)context.next();
            if (((hrt) (obj)).a.a == null)
            {
                a(((nxx) (obj)));
                return new mue(false);
            }
        }

        eto1.a(a, hashmap);
        return new mue(true);
    }
}
