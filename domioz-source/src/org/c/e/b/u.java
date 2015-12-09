// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.net.URI;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.c.d.a;
import org.c.d.i;
import org.c.d.j;
import org.c.d.k;
import org.c.d.m;

// Referenced classes of package org.c.e.b:
//            v, a, x, w

public final class u
{

    private static final Pattern a = Pattern.compile("([^&=]+)=?([^&=]+)?");
    private static final Pattern b = Pattern.compile("^(([^:/?#]+):)?(//(([^@/]*)@)?([^/?#:]*)(:(\\d*))?)?([^?#]*)(\\?([^#]*))?(#(.*))?");
    private static final Pattern c = Pattern.compile("^(http|https):(//(([^@/]*)@)?([^/?#:]*)(:(\\d*))?)?([^?#]*)(\\?(.*))?");
    private static x k = new v();
    private String d;
    private String e;
    private String f;
    private int g;
    private x h;
    private final j i = new i();
    private String j;

    protected u()
    {
        g = -1;
        h = k;
    }

    public static u fromHttpUrl(String s)
    {
        org.c.d.a.notNull(s, "'httpUrl' must not be null");
        Matcher matcher = c.matcher(s);
        if (matcher.matches())
        {
            s = new u();
            s.scheme(matcher.group(1));
            s.userInfo(matcher.group(4));
            s.host(matcher.group(5));
            String s1 = matcher.group(7);
            if (m.hasLength(s1))
            {
                s.port(Integer.parseInt(s1));
            }
            s.path(matcher.group(8));
            s.query(matcher.group(10));
            return s;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("[")).append(s).append("] is not a valid HTTP URL").toString());
        }
    }

    public static u fromPath(String s)
    {
        u u1 = new u();
        u1.path(s);
        return u1;
    }

    public static u fromUri(URI uri1)
    {
        u u1 = new u();
        u1.uri(uri1);
        return u1;
    }

    public static u fromUriString(String s)
    {
        org.c.d.a.hasLength(s, "'uri' must not be empty");
        Matcher matcher = b.matcher(s);
        if (matcher.matches())
        {
            s = new u();
            s.scheme(matcher.group(2));
            s.userInfo(matcher.group(5));
            s.host(matcher.group(6));
            String s1 = matcher.group(8);
            if (m.hasLength(s1))
            {
                s.port(Integer.parseInt(s1));
            }
            s.path(matcher.group(9));
            s.query(matcher.group(11));
            s.fragment(matcher.group(13));
            return s;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("[")).append(s).append("] is not a valid URI").toString());
        }
    }

    public static u newInstance()
    {
        return new u();
    }

    public final org.c.e.b.a build()
    {
        return build(false);
    }

    public final org.c.e.b.a build(boolean flag)
    {
        return new org.c.e.b.a(d, e, f, g, h.a(), i, j, flag, true);
    }

    public final org.c.e.b.a buildAndExpand(Map map)
    {
        return build(false).expand(map);
    }

    public final transient org.c.e.b.a buildAndExpand(Object aobj[])
    {
        return build(false).expand(aobj);
    }

    public final u fragment(String s)
    {
        if (s != null)
        {
            org.c.d.a.hasLength(s, "'fragment' must not be empty");
            j = s;
            return this;
        } else
        {
            j = null;
            return this;
        }
    }

    public final u host(String s)
    {
        f = s;
        return this;
    }

    public final u path(String s)
    {
        if (s != null)
        {
            h = h.a(s);
            return this;
        } else
        {
            h = k;
            return this;
        }
    }

    public final transient u pathSegment(String as[])
    {
        org.c.d.a.notNull(as, "'segments' must not be null");
        h = h.a(as);
        return this;
    }

    public final u port(int l)
    {
        boolean flag;
        if (l >= -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        org.c.d.a.isTrue(flag, "'port' must not be < -1");
        g = l;
        return this;
    }

    public final u query(String s)
    {
        if (s != null)
        {
            for (s = a.matcher(s); s.find(); queryParam(s.group(1), new Object[] {
    s.group(2)
})) { }
        } else
        {
            i.clear();
        }
        return this;
    }

    public final transient u queryParam(String s, Object aobj[])
    {
        org.c.d.a.notNull(s, "'name' must not be null");
        if (!org.c.d.k.isEmpty(aobj))
        {
            int i1 = aobj.length;
            int l = 0;
            while (l < i1) 
            {
                Object obj = aobj[l];
                if (obj != null)
                {
                    obj = obj.toString();
                } else
                {
                    obj = null;
                }
                i.add(s, obj);
                l++;
            }
        } else
        {
            i.add(s, null);
        }
        return this;
    }

    public final u replacePath(String s)
    {
        h = k;
        path(s);
        return this;
    }

    public final u replaceQuery(String s)
    {
        i.clear();
        query(s);
        return this;
    }

    public final transient u replaceQueryParam(String s, Object aobj[])
    {
        org.c.d.a.notNull(s, "'name' must not be null");
        i.remove(s);
        if (!org.c.d.k.isEmpty(aobj))
        {
            queryParam(s, aobj);
        }
        return this;
    }

    public final u scheme(String s)
    {
        d = s;
        return this;
    }

    public final u uri(URI uri1)
    {
        org.c.d.a.notNull(uri1, "'uri' must not be null");
        boolean flag;
        if (!uri1.isOpaque())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        org.c.d.a.isTrue(flag, (new StringBuilder("Opaque URI [")).append(uri1).append("] not supported").toString());
        d = uri1.getScheme();
        if (uri1.getUserInfo() != null)
        {
            e = uri1.getUserInfo();
        }
        if (uri1.getHost() != null)
        {
            f = uri1.getHost();
        }
        if (uri1.getPort() != -1)
        {
            g = uri1.getPort();
        }
        if (m.hasLength(uri1.getPath()))
        {
            h = new w(uri1.getPath(), (byte)0);
        }
        if (m.hasLength(uri1.getQuery()))
        {
            i.clear();
            query(uri1.getQuery());
        }
        if (uri1.getFragment() != null)
        {
            j = uri1.getFragment();
        }
        return this;
    }

    public final u userInfo(String s)
    {
        e = s;
        return this;
    }

}
