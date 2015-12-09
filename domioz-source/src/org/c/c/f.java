// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;

import java.net.URI;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.c.d.a;
import org.c.d.h;
import org.c.d.j;
import org.c.d.m;

// Referenced classes of package org.c.c:
//            n, a, i, c

public final class f
    implements j
{

    private static final String a[] = {
        "EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM dd HH:mm:ss yyyy"
    };
    private static TimeZone b = TimeZone.getTimeZone("GMT");
    private final Map c;

    public f()
    {
        this(((Map) (new h(8, Locale.ENGLISH))), false);
    }

    private f(Map map, boolean flag)
    {
        org.c.d.a.notNull(map, "'headers' must not be null");
        if (flag)
        {
            h h1 = new h(map.size(), Locale.ENGLISH);
            java.util.Map.Entry entry;
            List list;
            for (map = map.entrySet().iterator(); map.hasNext(); h1.put(entry.getKey(), list))
            {
                entry = (java.util.Map.Entry)map.next();
                list = Collections.unmodifiableList((List)entry.getValue());
            }

            c = Collections.unmodifiableMap(h1);
            return;
        } else
        {
            c = map;
            return;
        }
    }

    private long a(String s)
    {
        String s1;
        String as[];
        int k;
        int l;
        s1 = getFirst(s);
        if (s1 == null)
        {
            return -1L;
        }
        as = a;
        l = as.length;
        k = 0;
_L2:
        SimpleDateFormat simpledateformat;
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        simpledateformat = new SimpleDateFormat(as[k], Locale.US);
        simpledateformat.setTimeZone(b);
        long l1 = simpledateformat.parse(s1).getTime();
        return l1;
        ParseException parseexception;
        parseexception;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        throw new IllegalArgumentException((new StringBuilder("Cannot parse date value \"")).append(s1).append("\" for \"").append(s).append("\" header").toString());
    }

    private void a(String s, long l)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat(a[0], Locale.US);
        simpledateformat.setTimeZone(b);
        set(s, simpledateformat.format(new Date(l)));
    }

    public static f readOnlyHttpHeaders(f f1)
    {
        return new f(f1, true);
    }

    public final volatile void add(Object obj, Object obj1)
    {
        add((String)obj, (String)obj1);
    }

    public final void add(String s, String s1)
    {
        List list = (List)c.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new LinkedList();
            c.put(s, obj);
        }
        ((List) (obj)).add(s1);
    }

    public final void clear()
    {
        c.clear();
    }

    public final boolean containsKey(Object obj)
    {
        return c.containsKey(obj);
    }

    public final boolean containsValue(Object obj)
    {
        return c.containsValue(obj);
    }

    public final Set entrySet()
    {
        return c.entrySet();
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof f))
        {
            return false;
        } else
        {
            obj = (f)obj;
            return c.equals(((f) (obj)).c);
        }
    }

    public final volatile Object get(Object obj)
    {
        return get(obj);
    }

    public final List get(Object obj)
    {
        return (List)c.get(obj);
    }

    public final List getAccept()
    {
        String s = getFirst("Accept");
        if (s != null)
        {
            return n.parseMediaTypes(s);
        } else
        {
            return Collections.emptyList();
        }
    }

    public final List getAcceptCharset()
    {
        ArrayList arraylist = new ArrayList();
        String s = getFirst("Accept-Charset");
        if (s != null)
        {
            String as[] = s.split(",\\s*");
            int l = as.length;
            for (int k = 0; k < l; k++)
            {
                String s2 = as[k];
                int i1 = s2.indexOf(';');
                String s1 = s2;
                if (i1 != -1)
                {
                    s1 = s2.substring(0, i1);
                }
                if (!s1.equals("*"))
                {
                    arraylist.add(Charset.forName(s1));
                }
            }

        }
        return arraylist;
    }

    public final List getAcceptEncoding()
    {
        String s = getFirst("Accept-Encoding");
        if (s != null)
        {
            return org.c.c.a.parseCodingTypes(s);
        } else
        {
            return Collections.emptyList();
        }
    }

    public final String getAcceptLanguage()
    {
        return getFirst("Accept-Language");
    }

    public final Set getAllow()
    {
        String s = getFirst("Allow");
        if (s != null)
        {
            ArrayList arraylist = new ArrayList(5);
            String as[] = s.split(",\\s*");
            int l = as.length;
            for (int k = 0; k < l; k++)
            {
                arraylist.add(i.valueOf(as[k]));
            }

            return EnumSet.copyOf(arraylist);
        } else
        {
            return EnumSet.noneOf(org/c/c/i);
        }
    }

    public final String getAuthorization()
    {
        return getFirst("Authorization");
    }

    public final String getCacheControl()
    {
        return getFirst("Cache-Control");
    }

    public final List getContentEncoding()
    {
        String s = getFirst("Content-Encoding");
        if (s != null)
        {
            return org.c.c.a.parseCodingTypes(s);
        } else
        {
            return Collections.emptyList();
        }
    }

    public final long getContentLength()
    {
        String s = getFirst("Content-Length");
        if (s != null)
        {
            return Long.parseLong(s);
        } else
        {
            return -1L;
        }
    }

    public final n getContentType()
    {
        String s = getFirst("Content-Type");
        if (s != null)
        {
            return n.parseMediaType(s);
        } else
        {
            return null;
        }
    }

    public final long getDate()
    {
        return a("Date");
    }

    public final String getETag()
    {
        return getFirst("ETag");
    }

    public final long getExpires()
    {
        return a("Expires");
    }

    public final volatile Object getFirst(Object obj)
    {
        return getFirst((String)obj);
    }

    public final String getFirst(String s)
    {
        s = (List)c.get(s);
        if (s != null)
        {
            return (String)s.get(0);
        } else
        {
            return null;
        }
    }

    public final List getIfNoneMatch()
    {
        ArrayList arraylist = new ArrayList();
        String s = getFirst("If-None-Match");
        if (s != null)
        {
            String as[] = s.split(",\\s*");
            int l = as.length;
            for (int k = 0; k < l; k++)
            {
                arraylist.add(as[k]);
            }

        }
        return arraylist;
    }

    public final long getIfNotModifiedSince()
    {
        return a("If-Modified-Since");
    }

    public final long getLastModified()
    {
        return a("Last-Modified");
    }

    public final URI getLocation()
    {
        String s = getFirst("Location");
        if (s != null)
        {
            return URI.create(s);
        } else
        {
            return null;
        }
    }

    public final String getPragma()
    {
        return getFirst("Pragma");
    }

    public final String getUserAgent()
    {
        return getFirst("User-Agent");
    }

    public final int hashCode()
    {
        return c.hashCode();
    }

    public final boolean isEmpty()
    {
        return c.isEmpty();
    }

    public final Set keySet()
    {
        return c.keySet();
    }

    public final volatile Object put(Object obj, Object obj1)
    {
        return put((String)obj, (List)obj1);
    }

    public final List put(String s, List list)
    {
        return (List)c.put(s, list);
    }

    public final void putAll(Map map)
    {
        c.putAll(map);
    }

    public final volatile Object remove(Object obj)
    {
        return remove(obj);
    }

    public final List remove(Object obj)
    {
        return (List)c.remove(obj);
    }

    public final volatile void set(Object obj, Object obj1)
    {
        set((String)obj, (String)obj1);
    }

    public final void set(String s, String s1)
    {
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(s1);
        c.put(s, linkedlist);
    }

    public final void setAccept(List list)
    {
        set("Accept", n.toString(list));
    }

    public final void setAcceptCharset(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            stringbuilder.append(((Charset)list.next()).name().toLowerCase(Locale.ENGLISH));
            if (list.hasNext())
            {
                stringbuilder.append(", ");
            }
        } while (true);
        set("Accept-Charset", stringbuilder.toString());
    }

    public final void setAcceptEncoding(List list)
    {
        set("Accept-Encoding", org.c.c.a.toString(list));
    }

    public final void setAcceptEncoding(org.c.c.a a1)
    {
        setAcceptEncoding(Collections.singletonList(a1));
    }

    public final void setAcceptLanguage(String s)
    {
        set("Accept-Language", s);
    }

    public final void setAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); set((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public final void setAllow(Set set1)
    {
        set("Allow", m.collectionToCommaDelimitedString(set1));
    }

    public final void setAuthorization(c c1)
    {
        set("Authorization", c1.getHeaderValue());
    }

    public final void setCacheControl(String s)
    {
        set("Cache-Control", s);
    }

    public final void setContentDispositionFormData(String s, String s1)
    {
        org.c.d.a.notNull(s, "'name' must not be null");
        StringBuilder stringbuilder = new StringBuilder("form-data; name=\"");
        stringbuilder.append(s).append('"');
        if (s1 != null)
        {
            stringbuilder.append("; filename=\"");
            stringbuilder.append(s1).append('"');
        }
        set("Content-Disposition", stringbuilder.toString());
    }

    public final void setContentEncoding(List list)
    {
        set("Content-Encoding", org.c.c.a.toString(list));
    }

    public final void setContentEncoding(org.c.c.a a1)
    {
        setContentEncoding(Collections.singletonList(a1));
    }

    public final void setContentLength(long l)
    {
        set("Content-Length", Long.toString(l));
    }

    public final void setContentType(n n1)
    {
        boolean flag1 = true;
        boolean flag;
        if (!n1.isWildcardType())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        org.c.d.a.isTrue(flag, "'Content-Type' cannot contain wildcard type '*'");
        if (!n1.isWildcardSubtype())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        org.c.d.a.isTrue(flag, "'Content-Type' cannot contain wildcard subtype '*'");
        set("Content-Type", n1.toString());
    }

    public final void setDate(long l)
    {
        a("Date", l);
    }

    public final void setETag(String s)
    {
        if (s != null)
        {
            boolean flag;
            if (s.startsWith("\"") || s.startsWith("W/"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            org.c.d.a.isTrue(flag, "Invalid eTag, does not start with W/ or \"");
            org.c.d.a.isTrue(s.endsWith("\""), "Invalid eTag, does not end with \"");
        }
        set("ETag", s);
    }

    public final void setExpires(long l)
    {
        a("Expires", l);
    }

    public final void setIfModifiedSince(long l)
    {
        a("If-Modified-Since", l);
    }

    public final void setIfNoneMatch(String s)
    {
        set("If-None-Match", s);
    }

    public final void setIfNoneMatch(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            stringbuilder.append((String)list.next());
            if (list.hasNext())
            {
                stringbuilder.append(", ");
            }
        } while (true);
        set("If-None-Match", stringbuilder.toString());
    }

    public final void setLastModified(long l)
    {
        a("Last-Modified", l);
    }

    public final void setLocation(URI uri)
    {
        set("Location", uri.toASCIIString());
    }

    public final void setPragma(String s)
    {
        set("Pragma", s);
    }

    public final void setUserAgent(String s)
    {
        set("User-Agent", s);
    }

    public final int size()
    {
        return c.size();
    }

    public final Map toSingleValueMap()
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap(c.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); linkedhashmap.put(entry.getKey(), ((List)entry.getValue()).get(0)))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return linkedhashmap;
    }

    public final String toString()
    {
        return c.toString();
    }

    public final Collection values()
    {
        return c.values();
    }

}
