// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.pinterest.api:
//            SimpleMultipartEntity

public class RequestParams
{

    protected final ConcurrentHashMap a;
    protected final ConcurrentHashMap b;
    protected final ConcurrentHashMap c;
    protected final ConcurrentHashMap d;
    protected String e;

    public RequestParams()
    {
        this(null);
    }

    public RequestParams(Map map)
    {
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap();
        e = "UTF-8";
        if (map != null)
        {
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); a((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
    }

    private List b(String s, Object obj)
    {
        LinkedList linkedlist = new LinkedList();
        if (obj instanceof Map)
        {
            Map map = (Map)obj;
            obj = new ArrayList(map.keySet());
            if (((List) (obj)).size() > 0 && (((List) (obj)).get(0) instanceof Comparable))
            {
                Collections.sort(((List) (obj)));
            }
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = iterator.next();
                if (obj instanceof String)
                {
                    Object obj1 = map.get(obj);
                    if (obj1 != null)
                    {
                        if (s == null)
                        {
                            obj = (String)obj;
                        } else
                        {
                            obj = String.format("%s[%s]", new Object[] {
                                s, obj
                            });
                        }
                        linkedlist.addAll(b(((String) (obj)), obj1));
                    }
                }
            } while (true);
        } else
        if (obj instanceof List)
        {
            obj = (List)obj;
            int k = ((List) (obj)).size();
            for (int i = 0; i < k; i++)
            {
                linkedlist.addAll(b(String.format("%s[%d]", new Object[] {
                    s, Integer.valueOf(i)
                }), ((List) (obj)).get(i)));
            }

        } else
        if (obj instanceof Object[])
        {
            obj = ((Object) ((Object[])obj));
            int l = obj.length;
            for (int j = 0; j < l; j++)
            {
                linkedlist.addAll(b(String.format("%s[%d]", new Object[] {
                    s, Integer.valueOf(j)
                }), obj[j]));
            }

        } else
        if (obj instanceof Set)
        {
            for (obj = ((Set)obj).iterator(); ((Iterator) (obj)).hasNext(); linkedlist.addAll(b(s, ((Iterator) (obj)).next()))) { }
        } else
        {
            linkedlist.add(new BasicNameValuePair(s, obj.toString()));
        }
        return linkedlist;
    }

    private HttpEntity d()
    {
        UrlEncodedFormEntity urlencodedformentity;
        try
        {
            urlencodedformentity = new UrlEncodedFormEntity(f(), e);
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.e("RequestParams", "createFormEntity failed", unsupportedencodingexception);
            return null;
        }
        return urlencodedformentity;
    }

    private HttpEntity e()
    {
        Object obj = new SimpleMultipartEntity();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((SimpleMultipartEntity) (obj)).a((String)entry.getKey(), (String)entry.getValue(), e))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        BasicNameValuePair basicnamevaluepair;
        for (Iterator iterator1 = b(null, d).iterator(); iterator1.hasNext(); ((SimpleMultipartEntity) (obj)).a(basicnamevaluepair.getName(), basicnamevaluepair.getValue(), e))
        {
            basicnamevaluepair = (BasicNameValuePair)iterator1.next();
        }

        Iterator iterator2 = b.entrySet().iterator();
        do
        {
            if (!iterator2.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator2.next();
            StreamWrapper streamwrapper = (StreamWrapper)entry1.getValue();
            if (streamwrapper.a != null)
            {
                try
                {
                    ((SimpleMultipartEntity) (obj)).a((String)entry1.getKey(), streamwrapper.b, streamwrapper.a, streamwrapper.c);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return null;
                }
            }
        } while (true);
        java.util.Map.Entry entry2;
        FileWrapper filewrapper;
        for (Iterator iterator3 = c.entrySet().iterator(); iterator3.hasNext(); ((SimpleMultipartEntity) (obj)).a((String)entry2.getKey(), filewrapper.a, filewrapper.b))
        {
            entry2 = (java.util.Map.Entry)iterator3.next();
            filewrapper = (FileWrapper)entry2.getValue();
        }

        return ((HttpEntity) (obj));
    }

    private List f()
    {
        LinkedList linkedlist = new LinkedList();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); linkedlist.add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        linkedlist.addAll(b(null, d));
        return linkedlist;
    }

    public final Map a()
    {
        return a;
    }

    public final void a(String s)
    {
        a.remove(s);
        b.remove(s);
        c.remove(s);
        d.remove(s);
    }

    public final void a(String s, int i)
    {
        a.put(s, String.valueOf(i));
    }

    public final void a(String s, InputStream inputstream, String s1, String s2)
    {
        if (inputstream != null)
        {
            b.put(s, StreamWrapper.a(inputstream, s1, s2));
        }
    }

    public final void a(String s, Object obj)
    {
        if (obj != null)
        {
            d.put(s, obj);
        }
    }

    public final void a(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            a.put(s, s1);
        }
    }

    public final HttpEntity b()
    {
        if (b.isEmpty() && c.isEmpty())
        {
            return d();
        } else
        {
            return e();
        }
    }

    public final boolean b(String s)
    {
        return a.get(s) != null || b.get(s) != null || c.get(s) != null || d.get(s) != null;
    }

    protected final String c()
    {
        return URLEncodedUtils.format(f(), e);
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

        for (Iterator iterator1 = b.entrySet().iterator(); iterator1.hasNext(); stringbuilder.append("STREAM"))
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator1.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append((String)entry1.getKey());
            stringbuilder.append("=");
        }

        for (Iterator iterator2 = c.entrySet().iterator(); iterator2.hasNext(); stringbuilder.append("FILE"))
        {
            java.util.Map.Entry entry2 = (java.util.Map.Entry)iterator2.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append((String)entry2.getKey());
            stringbuilder.append("=");
        }

        BasicNameValuePair basicnamevaluepair;
        for (Iterator iterator3 = b(null, d).iterator(); iterator3.hasNext(); stringbuilder.append(basicnamevaluepair.getValue()))
        {
            basicnamevaluepair = (BasicNameValuePair)iterator3.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append(basicnamevaluepair.getName());
            stringbuilder.append("=");
        }

        return stringbuilder.toString();
    }

    private class StreamWrapper
    {

        public final InputStream a;
        public final String b;
        public final String c;
        public final boolean d = true;

        static StreamWrapper a(InputStream inputstream, String s, String s1)
        {
            String s2 = s1;
            if (s1 == null)
            {
                s2 = "application/octet-stream";
            }
            return new StreamWrapper(inputstream, s, s2);
        }

        private StreamWrapper(InputStream inputstream, String s, String s1)
        {
            a = inputstream;
            b = s;
            c = s1;
        }
    }


    private class FileWrapper
    {

        public final File a;
        public final String b;
    }

}
