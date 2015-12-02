// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.common.e.h;
import com.facebook.common.time.a;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.e;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.base.Charsets;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.f:
//            f, z, k

public abstract class d
{

    private static Class a = com/facebook/orca/f/d;
    private final com.facebook.prefs.shared.d b;
    private final k c;
    private final z d;
    private final h e;
    private final a f;

    public d(com.facebook.prefs.shared.d d1, k k1, z z1, h h1, a a1)
    {
        b = d1;
        c = k1;
        d = z1;
        e = h1;
        f = a1;
    }

    private String a(String s, long l)
    {
        StringBuilder stringbuilder;
        try
        {
            stringbuilder = new StringBuilder();
            stringbuilder.append("tvs1:");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        stringbuilder.append(URLEncoder.encode(s, Charsets.UTF_8.name()));
_L4:
        stringbuilder.append(",");
        stringbuilder.append(l);
        return stringbuilder.toString();
_L2:
        stringbuilder.append("<null>");
        if (true) goto _L4; else goto _L3
_L3:
    }

    private f c(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        String as[];
        if (!(obj instanceof String))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        String s = (String)obj;
        if (!s.startsWith("tvs1:"))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        as = s.substring("tvs1:".length()).split(",");
        if (as.length >= 2)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        e.a(a.getSimpleName(), "Parse error");
        return null;
        obj = as[0];
        if (!"<null>".equals(obj))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj = null;
_L1:
        try
        {
            long l = Long.parseLong(as[1]);
            obj = new f(a(((String) (obj))), l, null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            e.a(a.getSimpleName(), "Parse error", ((Throwable) (obj)));
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            e.a(a.getSimpleName(), "Parse error", ((Throwable) (obj)));
            return null;
        }
        return ((f) (obj));
        obj = URLDecoder.decode(((String) (obj)), Charsets.UTF_8.name());
          goto _L1
        obj = new f(b(obj), 0L, null);
        return ((f) (obj));
    }

    private List c(ThreadViewSpec threadviewspec)
    {
        et et1;
        if (threadviewspec.c())
        {
            return es.d();
        }
        et1 = es.e();
        if (!threadviewspec.a()) goto _L2; else goto _L1
_L1:
        threadviewspec = threadviewspec.d();
        et1.b(b(threadviewspec));
        threadviewspec = d.a(threadviewspec);
        if (threadviewspec != null)
        {
            et1.b(a(threadviewspec));
        }
_L4:
        return et1.b();
_L2:
        if (!threadviewspec.b())
        {
            break; /* Loop/switch isn't completed */
        }
        threadviewspec = UserKey.a(threadviewspec.f());
        et1.b(a(threadviewspec));
        threadviewspec = c.c(threadviewspec);
        if (threadviewspec != null)
        {
            et1.b(b(threadviewspec.a()));
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException();
    }

    protected abstract ae a(UserKey userkey);

    public Object a(ThreadViewSpec threadviewspec)
    {
        Object obj2;
        Iterator iterator;
        obj2 = null;
        iterator = c(threadviewspec).iterator();
        threadviewspec = null;
_L6:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        obj = (ae)iterator.next();
        if (!b.a(((ae) (obj)))) goto _L2; else goto _L1
_L1:
        f f1 = c(b.c(((ae) (obj))));
        if (f1 == null) goto _L2; else goto _L3
_L3:
        if (threadviewspec != null) goto _L5; else goto _L4
_L4:
        obj = f1;
_L7:
        threadviewspec = ((ThreadViewSpec) (obj));
          goto _L6
_L5:
        obj = f1;
        if (com.facebook.orca.f.f.a(f1) > com.facebook.orca.f.f.a(threadviewspec)) goto _L7; else goto _L2
_L2:
        obj = threadviewspec;
          goto _L7
        Object obj1 = obj2;
        if (threadviewspec != null)
        {
            obj1 = com.facebook.orca.f.f.b(threadviewspec);
        }
        return obj1;
    }

    protected abstract Object a(String s);

    protected abstract String a(Object obj);

    public void a(ThreadViewSpec threadviewspec, Object obj)
    {
        long l = f.a();
        Object obj1 = c(threadviewspec);
        threadviewspec = b.b();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); threadviewspec.a((ae)((Iterator) (obj1)).next(), a(a(obj), l))) { }
        threadviewspec.a();
    }

    protected abstract ae b(String s);

    protected abstract Object b(Object obj);

    public void b(ThreadViewSpec threadviewspec)
    {
        a(threadviewspec, a(threadviewspec));
    }

}
