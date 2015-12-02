// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.rewrite;

import android.net.Uri;
import com.facebook.common.w.q;
import com.facebook.debug.log.b;
import com.google.common.a.es;
import java.net.URI;
import java.util.Iterator;
import javax.inject.a;

// Referenced classes of package com.facebook.zero.rewrite:
//            ZeroUrlRewriteRule

public class f
{

    private static final Class a = com/facebook/zero/rewrite/f;
    private final com.facebook.zero.d.a b;
    private final a c;
    private final es d = es.a(new ZeroUrlRewriteRule("^https?://b-(graph|api)\\.facebook\\.com.*$", "", "always"));

    public f(com.facebook.zero.d.a a1, a a2)
    {
        b = a1;
        c = a2;
    }

    public Uri a(Uri uri)
    {
        String s = uri.toString();
        String s1 = a(s);
        if (s.equals(s1))
        {
            return uri;
        } else
        {
            return Uri.parse(s1);
        }
    }

    public String a(String s)
    {
        q q1 = (q)c.b();
        Object obj = b.e();
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            if (((ZeroUrlRewriteRule)iterator.next()).a(s))
            {
                com.facebook.debug.log.b.b(a, "Whitelisted URI: %s", new Object[] {
                    s
                });
                return s;
            }
        }

        for (obj = ((es) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            ZeroUrlRewriteRule zerourlrewriterule = (ZeroUrlRewriteRule)((Iterator) (obj)).next();
            if (zerourlrewriterule.a(q1) && zerourlrewriterule.a(s))
            {
                String s1 = zerourlrewriterule.b(s);
                com.facebook.debug.log.b.b(a, "Rewritten URI: %s %s", new Object[] {
                    s, s1
                });
                return s1;
            }
        }

        com.facebook.debug.log.b.b(a, "Unfiltered URI: %s", new Object[] {
            s
        });
        return s;
    }

    public URI a(URI uri)
    {
        String s = uri.toString();
        String s1 = a(s);
        if (s.equals(s1))
        {
            return uri;
        } else
        {
            return URI.create(s1);
        }
    }

}
