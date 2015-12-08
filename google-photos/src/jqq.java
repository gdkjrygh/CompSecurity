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

public class jqq
{

    public Map a;
    public jrb b;
    public Map c;
    public List d;
    public List e;

    protected jqq()
    {
        a = new HashMap();
        c = new HashMap();
        d = new ArrayList();
        e = new ArrayList();
    }

    public Map a()
    {
        HashMap hashmap = new HashMap(a);
        if (b != null)
        {
            hashmap.putAll(b.a());
        }
        Iterator iterator = d.iterator();
        for (int i = 1; iterator.hasNext(); i++)
        {
            hashmap.putAll(((jrc)iterator.next()).a(b.a("&promo", i)));
        }

        iterator = e.iterator();
        for (int j = 1; iterator.hasNext(); j++)
        {
            hashmap.putAll(((jra)iterator.next()).a(b.a("&pr", j)));
        }

        iterator = c.entrySet().iterator();
        for (int k = 1; iterator.hasNext(); k++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj = (List)entry.getValue();
            String s = b.a("&il", k);
            obj = ((List) (obj)).iterator();
            for (int l = 1; ((Iterator) (obj)).hasNext(); l++)
            {
                hashmap.putAll(((jra)((Iterator) (obj)).next()).a((new StringBuilder()).append(s).append(b.a("pi", l)).toString()));
            }

            if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
            {
                hashmap.put((new StringBuilder()).append(s).append("nm").toString(), entry.getKey());
            }
        }

        return hashmap;
    }

    public final jqq a(String s, String s1)
    {
        a.put(s, s1);
        return this;
    }
}
