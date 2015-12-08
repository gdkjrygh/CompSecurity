// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class blz
{

    private Map a;
    private Map b;
    private List c;
    private List d;

    protected blz()
    {
        a = new HashMap();
        b = new HashMap();
        c = new ArrayList();
        d = new ArrayList();
    }

    public final blz a(String s, String s1)
    {
        a.put(s, s1);
        return this;
    }

    public Map a()
    {
        HashMap hashmap = new HashMap(a);
        Iterator iterator = c.iterator();
        for (int i = 1; iterator.hasNext(); i++)
        {
            hashmap.putAll(((bmg)iterator.next()).a(bof.a("&promo", i)));
        }

        iterator = d.iterator();
        for (int j = 1; iterator.hasNext(); j++)
        {
            hashmap.putAll(((bme)iterator.next()).a(bof.a("&pr", j)));
        }

        iterator = b.entrySet().iterator();
        for (int k = 1; iterator.hasNext(); k++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj = (List)entry.getValue();
            String s = bof.a("&il", k);
            obj = ((List) (obj)).iterator();
            for (int l = 1; ((Iterator) (obj)).hasNext(); l++)
            {
                hashmap.putAll(((bme)((Iterator) (obj)).next()).a((new StringBuilder()).append(s).append(bof.a("pi", l)).toString()));
            }

            if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
            {
                hashmap.put((new StringBuilder()).append(s).append("nm").toString(), entry.getKey());
            }
        }

        return hashmap;
    }
}
