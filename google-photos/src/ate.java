// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ate
{

    private static final String d = System.getProperty("http.agent");
    private static final Map e;
    public boolean a;
    public Map b;
    public boolean c;
    private boolean f;

    public ate()
    {
        f = true;
        a = true;
        b = e;
        c = b.containsKey(d);
    }

    public List a(String s)
    {
        List list = (List)b.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            b.put(s, obj);
        }
        return ((List) (obj));
    }

    public void a()
    {
        if (f)
        {
            f = false;
            HashMap hashmap = new HashMap(b.size());
            java.util.Map.Entry entry;
            for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); hashmap.put(entry.getKey(), new ArrayList((Collection)entry.getValue())))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            b = hashmap;
        }
    }

    public final atd b()
    {
        f = true;
        return new atd(b);
    }

    static 
    {
        HashMap hashmap = new HashMap(2);
        if (!TextUtils.isEmpty(d))
        {
            hashmap.put("User-Agent", Collections.singletonList(new atf(d)));
        }
        hashmap.put("Accept-Encoding", Collections.singletonList(new atf("identity")));
        e = Collections.unmodifiableMap(hashmap);
    }
}
