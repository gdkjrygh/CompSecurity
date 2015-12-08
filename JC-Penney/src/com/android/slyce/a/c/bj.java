// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.android.slyce.a.c:
//            bk, bl, bm

public class bj extends LinkedHashMap
    implements Iterable
{

    private static final bm a = new bk();
    private static final bm b = new bl();

    public bj()
    {
    }

    public String a(String s)
    {
        s = (List)get(s);
        if (s == null || s.size() == 0)
        {
            return null;
        } else
        {
            return (String)s.get(0);
        }
    }

    protected List a()
    {
        return new ArrayList();
    }

    public void a(String s, String s1)
    {
        List list1 = (List)get(s);
        List list = list1;
        if (list1 == null)
        {
            list = a();
            put(s, list);
        }
        list.add(s1);
    }

    public void b(String s, String s1)
    {
        List list = a();
        list.add(s1);
        put(s, list);
    }

    public Iterator iterator()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator1 = keySet().iterator(); iterator1.hasNext();)
        {
            String s = (String)iterator1.next();
            Iterator iterator2 = ((List)get(s)).iterator();
            while (iterator2.hasNext()) 
            {
                arraylist.add(new BasicNameValuePair(s, (String)iterator2.next()));
            }
        }

        return arraylist.iterator();
    }

}
