// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a.a;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

// Referenced classes of package com.a.a.a.a:
//            a, d

public final class b extends a
{

    HashMap a;
    private String b;
    private String c;

    public b(Context context, String s)
    {
        super(context);
        a = new HashMap();
        b = s;
        j();
    }

    private String h()
    {
        return (new StringBuilder()).append(b()).append(b).toString();
    }

    private String i()
    {
        return (new StringBuilder()).append(h()).append(".version").toString();
    }

    private void j()
    {
        String as[] = b(h(), "").split(Pattern.quote("#####"));
        int j1 = as.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            String s = as[i1];
            if (!TextUtils.isEmpty(s))
            {
                String as1[] = s.split(Pattern.quote(">>>>>"));
                if (as1.length > 2)
                {
                    a.put(as1[0], new d(as1[1], as1[2]));
                } else
                if (as1.length > 1)
                {
                    a.put(as1[0], new d(as1[1], null));
                }
            }
            i1++;
        }
        c = l();
    }

    private void k()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        d d1;
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); arraylist.add((new StringBuilder()).append(s).append(">>>>>").append(d1.a).append(">>>>>").append(d1.b).toString()))
        {
            s = (String)iterator.next();
            d1 = (d)a.get(s);
        }

        a(h(), TextUtils.join("#####", arraylist));
        c = Long.toString((new Date()).getTime());
        a(i(), c);
    }

    private String l()
    {
        return b(i(), "0");
    }

    public final void a(String s, String s1, String s2)
    {
        f();
        if (!a.containsKey(s))
        {
            a.put(s, new d(s1, s2));
            k();
        }
    }

    public final boolean a(String s)
    {
        f();
        return a.containsKey(s);
    }

    public final void e()
    {
        f();
        a.clear();
        k();
    }

    final void f()
    {
        if (!c.equalsIgnoreCase(l()))
        {
            a.clear();
            j();
        }
    }

    public final List g()
    {
        return new ArrayList(a.keySet());
    }

    public final String toString()
    {
        return TextUtils.join(", ", a.keySet());
    }
}
