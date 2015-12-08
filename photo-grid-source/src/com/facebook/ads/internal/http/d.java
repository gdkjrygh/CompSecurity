// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.http;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.ads.internal.http:
//            e

public class d
{

    private static String d = "UTF-8";
    protected ConcurrentHashMap a;
    protected ConcurrentHashMap b;
    protected ConcurrentHashMap c;

    public d()
    {
        c();
    }

    public d(Map map)
    {
        c();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); a((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    private void c()
    {
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
    }

    public HttpEntity a()
    {
        Object obj;
        if (!b.isEmpty())
        {
            e e1 = new e();
            java.util.Map.Entry entry;
            for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); e1.a((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            int j = b.entrySet().size();
            obj = b.entrySet().iterator();
            int i = 0;
            while (((Iterator) (obj)).hasNext()) 
            {
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                a a1 = (a)entry1.getValue();
                if (a1.a != null)
                {
                    boolean flag;
                    if (i == j - 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (a1.c != null)
                    {
                        e1.a((String)entry1.getKey(), a1.a(), a1.a, a1.c, flag);
                    } else
                    {
                        e1.a((String)entry1.getKey(), a1.a(), a1.a, flag);
                    }
                }
                i++;
            }
            Iterator iterator1 = c.entrySet().iterator();
            do
            {
                obj = e1;
                if (!iterator1.hasNext())
                {
                    break;
                }
                obj = (java.util.Map.Entry)iterator1.next();
                Iterator iterator2 = ((ArrayList)((java.util.Map.Entry) (obj)).getValue()).iterator();
                while (iterator2.hasNext()) 
                {
                    String s = (String)iterator2.next();
                    e1.a((String)((java.util.Map.Entry) (obj)).getKey(), s);
                }
            } while (true);
        } else
        {
            try
            {
                obj = new UrlEncodedFormEntity(b(), d);
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                unsupportedencodingexception.printStackTrace();
                return null;
            }
        }
        return ((HttpEntity) (obj));
    }

    public void a(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            a.put(s, s1);
        }
    }

    protected List b()
    {
        LinkedList linkedlist = new LinkedList();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); linkedlist.add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        for (Iterator iterator1 = c.entrySet().iterator(); iterator1.hasNext();)
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator1.next();
            Iterator iterator2 = ((ArrayList)entry1.getValue()).iterator();
            while (iterator2.hasNext()) 
            {
                String s = (String)iterator2.next();
                linkedlist.add(new BasicNameValuePair((String)entry1.getKey(), s));
            }
        }

        return linkedlist;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); stringbuilder.append((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append((String)entry.getKey());
            stringbuilder.append("=");
        }

        for (Iterator iterator1 = b.entrySet().iterator(); iterator1.hasNext(); stringbuilder.append("FILE"))
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator1.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append((String)entry1.getKey());
            stringbuilder.append("=");
        }

        for (Iterator iterator2 = c.entrySet().iterator(); iterator2.hasNext();)
        {
            java.util.Map.Entry entry2 = (java.util.Map.Entry)iterator2.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("&");
            }
            ArrayList arraylist = (ArrayList)entry2.getValue();
            Iterator iterator3 = arraylist.iterator();
            while (iterator3.hasNext()) 
            {
                String s = (String)iterator3.next();
                if (arraylist.indexOf(s) != 0)
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append((String)entry2.getKey());
                stringbuilder.append("=");
                stringbuilder.append(s);
            }
        }

        return stringbuilder.toString();
    }


    private class a
    {

        public InputStream a;
        public String b;
        public String c;

        public String a()
        {
            if (b != null)
            {
                return b;
            } else
            {
                return "nofilename";
            }
        }
    }

}
