// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package p.bu:
//            c

public class d
{

    private Map a;

    public d(Map map)
    {
        a = map;
    }

    private long a(String s)
    {
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1L;
        }
        return l;
    }

    public long a()
    {
        if (a.containsKey("Content-Length"))
        {
            return a((String)((List)a.get("Content-Length")).get(0));
        } else
        {
            return -1L;
        }
    }

    public String a(c c1)
    {
        Object obj;
        boolean flag;
        if (c1 != null && c1.a() > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new HashMap();
        ((Map) (obj)).putAll(a);
        if (flag)
        {
            ((Map) (obj)).put(null, Arrays.asList(new String[] {
                "HTTP/1.1 206 Partial Content"
            }));
            ((Map) (obj)).remove("Content-Length");
            ((Map) (obj)).put("Content-Range", Arrays.asList(new String[] {
                c1.b()
            }));
        } else
        {
            ((Map) (obj)).put(null, Arrays.asList(new String[] {
                "HTTP/1.1 200 OK"
            }));
            ((Map) (obj)).remove("Content-Range");
        }
        c1 = new StringBuilder();
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (entry.getKey() == null)
            {
                c1.append((String)((List)entry.getValue()).get(0)).append("\r\n");
            } else
            {
                c1.append((String)entry.getKey()).append(": ").append((String)((List)entry.getValue()).get(0)).append("\r\n");
            }
        }

        c1.append("\r\n");
        return c1.toString();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getKey() == null)
            {
                stringbuilder.append((String)((List)entry.getValue()).get(0)).append("\r\n");
            } else
            {
                stringbuilder.append((String)entry.getKey()).append(": ").append((String)((List)entry.getValue()).get(0)).append("\r\n");
            }
        }

        stringbuilder.append("\r\n");
        return stringbuilder.toString();
    }
}
