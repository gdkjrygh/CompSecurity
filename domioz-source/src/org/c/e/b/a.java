// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.c.d.d;
import org.c.d.i;
import org.c.d.j;
import org.c.d.m;

// Referenced classes of package org.c.e.b:
//            b, h, e, s, 
//            d, t, c

public final class a
{

    static final e a = new b();
    private static final Pattern b = Pattern.compile("\\{([^/]+?)\\}");
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final e g;
    private final j h;
    private final String i;
    private final boolean j;

    a(String s1, String s2, String s3, int k, e e1, j j1, String s4, 
            boolean flag, boolean flag1)
    {
        c = s1;
        d = s2;
        e = s3;
        f = k;
        if (e1 == null)
        {
            e1 = a;
        }
        g = e1;
        if (j1 == null)
        {
            j1 = new i(0);
        }
        h = org.c.d.d.unmodifiableMultiValueMap(j1);
        i = s4;
        j = flag;
        if (flag1)
        {
            a();
        }
    }

    static String a(String s1, String s2, h h1)
    {
        if (s1 == null)
        {
            return null;
        }
        org.c.d.a.hasLength(s2, "'encoding' must not be empty");
        s1 = s1.getBytes(s2);
        org.c.d.a.notNull(s1, "'source' must not be null");
        org.c.d.a.notNull(h1, "'type' must not be null");
        s2 = new ByteArrayOutputStream(s1.length);
        int k = 0;
        while (k < s1.length) 
        {
            byte byte0 = s1[k];
            int l = byte0;
            if (byte0 < 0)
            {
                l = byte0 + 256;
            }
            if (h1.a(l))
            {
                s2.write(l);
            } else
            {
                s2.write(37);
                char c1 = Character.toUpperCase(Character.forDigit(l >> 4 & 0xf, 16));
                l = Character.toUpperCase(Character.forDigit(l & 0xf, 16));
                s2.write(c1);
                s2.write(l);
            }
            k++;
        }
        return new String(s2.toByteArray(), "US-ASCII");
    }

    static String a(String s1, s s2)
    {
        return b(s1, s2);
    }

    private a a(s s1)
    {
        String s2;
        String s3;
        String s4;
        e e1;
        i k;
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        org.c.d.a.state(flag, "Cannot expand an already encoded UriComponents object");
        s2 = b(c, s1);
        s3 = b(d, s1);
        s4 = b(e, s1);
        e1 = g.a(s1);
        k = new i(h.size());
        String s5;
        ArrayList arraylist;
        for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); k.put(s5, arraylist))
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            s5 = b((String)((java.util.Map.Entry) (obj)).getKey(), s1);
            arraylist = new ArrayList(((List)((java.util.Map.Entry) (obj)).getValue()).size());
            for (obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(b((String)((Iterator) (obj)).next(), s1))) { }
        }

        s1 = b(i, s1);
        return new a(s2, s3, s4, f, e1, k, s1, false, false);
    }

    private void a()
    {
        if (!j)
        {
            return;
        }
        b(c, h.a);
        b(d, h.c);
        b(e, org.c.e.b.h.d);
        g.c();
        for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            b((String)((java.util.Map.Entry) (obj)).getKey(), org.c.e.b.h.i);
            obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                b((String)((Iterator) (obj)).next(), org.c.e.b.h.i);
            }
        }

        b(i, org.c.e.b.h.j);
    }

    static void a(String s1, h h1)
    {
        b(s1, h1);
    }

    private static String b(String s1, s s2)
    {
        String s3;
        if (s1 == null)
        {
            s3 = null;
        } else
        {
            s3 = s1;
            if (s1.indexOf('{') != -1)
            {
                Matcher matcher = b.matcher(s1);
                StringBuffer stringbuffer = new StringBuffer();
                while (matcher.find()) 
                {
                    s1 = matcher.group(1);
                    int k = s1.indexOf(':');
                    if (k != -1)
                    {
                        s1 = s1.substring(0, k);
                    }
                    s1 = ((String) (s2.a(s1)));
                    if (s1 != null)
                    {
                        s1 = s1.toString();
                    } else
                    {
                        s1 = "";
                    }
                    matcher.appendReplacement(stringbuffer, Matcher.quoteReplacement(s1));
                }
                matcher.appendTail(stringbuffer);
                return stringbuffer.toString();
            }
        }
        return s3;
    }

    private static void b(String s1, h h1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
        int l;
        l = s1.length();
        k = 0;
_L6:
        if (k >= l) goto _L1; else goto _L3
_L3:
        char c1;
        c1 = s1.charAt(k);
        if (c1 != '%')
        {
            break MISSING_BLOCK_LABEL_176;
        }
        if (k + 2 >= l) goto _L5; else goto _L4
_L4:
        c1 = s1.charAt(k + 1);
        char c2 = s1.charAt(k + 2);
        int i1 = Character.digit(c1, 16);
        int j1 = Character.digit(c2, 16);
        if (i1 == -1 || j1 == -1)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid encoded sequence \"")).append(s1.substring(k)).append("\"").toString());
        }
        k += 2;
_L7:
        k++;
          goto _L6
_L5:
        throw new IllegalArgumentException((new StringBuilder("Invalid encoded sequence \"")).append(s1.substring(k)).append("\"").toString());
        if (!h1.a(c1))
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid character '")).append(c1).append("' for ").append(h1.name()).append(" in \"").append(s1).append("\"").toString());
        }
          goto _L7
    }

    public final a encode()
    {
        a a1;
        try
        {
            a1 = encode("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new InternalError("\"UTF-8\" not supported");
        }
        return a1;
    }

    public final a encode(String s1)
    {
        org.c.d.a.hasLength(s1, "'encoding' must not be empty");
        if (j)
        {
            return this;
        }
        String s2 = a(c, s1, h.a);
        String s3 = a(d, s1, h.c);
        String s4 = a(e, s1, org.c.e.b.h.d);
        e e1 = g.a(s1);
        i k = new i(h.size());
        String s5;
        ArrayList arraylist;
        for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); k.put(s5, arraylist))
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            s5 = a((String)((java.util.Map.Entry) (obj)).getKey(), s1, org.c.e.b.h.i);
            arraylist = new ArrayList(((List)((java.util.Map.Entry) (obj)).getValue()).size());
            for (obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(a((String)((Iterator) (obj)).next(), s1, org.c.e.b.h.i))) { }
        }

        s1 = a(i, s1, org.c.e.b.h.j);
        return new a(s2, s3, s4, f, e1, k, s1, true, false);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof a)
            {
                obj = (a)obj;
                if (c == null ? ((a) (obj)).c != null : !c.equals(((a) (obj)).c))
                {
                    return false;
                }
                if (d == null ? ((a) (obj)).d != null : !d.equals(((a) (obj)).d))
                {
                    return false;
                }
                if (e == null ? ((a) (obj)).e != null : !e.equals(((a) (obj)).e))
                {
                    return false;
                }
                if (f != ((a) (obj)).f)
                {
                    return false;
                }
                if (!g.equals(((a) (obj)).g))
                {
                    return false;
                }
                if (!h.equals(((a) (obj)).h))
                {
                    return false;
                }
                if (i == null ? ((a) (obj)).i != null : !i.equals(((a) (obj)).i))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final a expand(Map map)
    {
        org.c.d.a.notNull(map, "'uriVariables' must not be null");
        return a(new org.c.e.b.d(map));
    }

    public final transient a expand(Object aobj[])
    {
        org.c.d.a.notNull(((Object) (aobj)), "'uriVariableValues' must not be null");
        return a(new t(aobj));
    }

    public final String getFragment()
    {
        return i;
    }

    public final String getHost()
    {
        return e;
    }

    public final String getPath()
    {
        return g.a();
    }

    public final List getPathSegments()
    {
        return g.b();
    }

    public final int getPort()
    {
        return f;
    }

    public final String getQuery()
    {
        if (!h.isEmpty())
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext();)
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = (List)((java.util.Map.Entry) (obj)).getValue();
                if (org.c.d.d.isEmpty(((java.util.Collection) (obj))))
                {
                    if (stringbuilder.length() != 0)
                    {
                        stringbuilder.append('&');
                    }
                    stringbuilder.append(s1);
                } else
                {
                    obj = ((List) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        if (stringbuilder.length() != 0)
                        {
                            stringbuilder.append('&');
                        }
                        stringbuilder.append(s1);
                        if (s2 != null)
                        {
                            stringbuilder.append('=');
                            stringbuilder.append(s2.toString());
                        }
                    }
                }
            }

            return stringbuilder.toString();
        } else
        {
            return null;
        }
    }

    public final j getQueryParams()
    {
        return h;
    }

    public final String getScheme()
    {
        return c;
    }

    public final String getUserInfo()
    {
        return d;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int k;
        int l;
        int i1;
        int k1;
        int l1;
        int i2;
        if (c != null)
        {
            k = c.hashCode();
        } else
        {
            k = 0;
        }
        if (d != null)
        {
            l = d.hashCode();
        } else
        {
            l = 0;
        }
        if (e != null)
        {
            i1 = e.hashCode();
        } else
        {
            i1 = 0;
        }
        k1 = f;
        l1 = g.hashCode();
        i2 = h.hashCode();
        if (i != null)
        {
            j1 = i.hashCode();
        }
        return ((((i1 + (l + k * 31) * 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j1;
    }

    public final a normalize()
    {
        String s1 = m.cleanPath(getPath());
        return new a(c, d, e, f, new c(s1), h, i, j, false);
    }

    public final String toString()
    {
        return toUriString();
    }

    public final URI toUri()
    {
        Object obj;
        String s1;
        try
        {
            if (j)
            {
                return new URI(toUriString());
            }
            s1 = getPath();
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new IllegalStateException((new StringBuilder("Could not create URI object: ")).append(urisyntaxexception.getMessage()).toString(), urisyntaxexception);
        }
        obj = s1;
        if (!m.hasLength(s1))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = s1;
        if (s1.charAt(0) != '/')
        {
            obj = (new StringBuilder("/")).append(s1).toString();
        }
        obj = new URI(getScheme(), getUserInfo(), getHost(), getPort(), ((String) (obj)), getQuery(), getFragment());
        return ((URI) (obj));
    }

    public final String toUriString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (c != null)
        {
            stringbuilder.append(c);
            stringbuilder.append(':');
        }
        if (d != null || e != null)
        {
            stringbuilder.append("//");
            if (d != null)
            {
                stringbuilder.append(d);
                stringbuilder.append('@');
            }
            if (e != null)
            {
                stringbuilder.append(e);
            }
            if (f != -1)
            {
                stringbuilder.append(':');
                stringbuilder.append(f);
            }
        }
        String s1 = getPath();
        if (m.hasLength(s1))
        {
            if (stringbuilder.length() != 0 && s1.charAt(0) != '/')
            {
                stringbuilder.append('/');
            }
            stringbuilder.append(s1);
        }
        s1 = getQuery();
        if (s1 != null)
        {
            stringbuilder.append('?');
            stringbuilder.append(s1);
        }
        if (i != null)
        {
            stringbuilder.append('#');
            stringbuilder.append(i);
        }
        return stringbuilder.toString();
    }

}
