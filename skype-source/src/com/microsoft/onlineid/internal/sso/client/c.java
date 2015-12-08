// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.microsoft.onlineid.b.a;
import com.microsoft.onlineid.f;
import com.microsoft.onlineid.h;
import com.microsoft.onlineid.internal.sso.client.a.b;
import com.microsoft.onlineid.internal.sso.client.a.e;
import com.microsoft.onlineid.internal.sso.client.a.g;
import com.microsoft.onlineid.sts.d;
import com.microsoft.onlineid.sts.n;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.microsoft.onlineid.internal.sso.client:
//            e, b, f, d, 
//            a

public final class c
{

    private final Context a;
    private final n b;
    private final com.microsoft.onlineid.internal.sso.client.e c;
    private final d d;
    private final com.microsoft.onlineid.internal.sso.client.b e;

    public c(Context context)
    {
        a = context;
        b = new n(context);
        c = new com.microsoft.onlineid.internal.sso.client.e(context);
        d = new d(context);
        e = new com.microsoft.onlineid.internal.sso.client.b(context);
    }

    private Object b(g g1)
        throws a
    {
        com.microsoft.onlineid.internal.c.d.a("Attempting to self-service request.");
        return g1.a(c.b());
    }

    public final PendingIntent a(f f1, Bundle bundle)
        throws a
    {
        return (PendingIntent)a(((g) (new com.microsoft.onlineid.internal.sso.client.a.d(a, bundle, f1))));
    }

    public final PendingIntent a(h h, f f1, Bundle bundle)
        throws a
    {
        return (PendingIntent)a(((g) (new b(a, bundle, h, f1))));
    }

    public final com.microsoft.onlineid.internal.sso.client.f a(String s, com.microsoft.onlineid.d d1, f f1, Bundle bundle)
        throws a
    {
        return (com.microsoft.onlineid.internal.sso.client.f)a(((g) (new e(a, bundle, s, d1, f1))));
    }

    public final com.microsoft.onlineid.sts.b a(String s, Bundle bundle)
        throws a
    {
        return (com.microsoft.onlineid.sts.b)a(((g) (new com.microsoft.onlineid.internal.sso.client.a.a(a, bundle, s))));
    }

    protected final Object a(g g1)
        throws a
    {
        Object obj;
        Iterator iterator;
        int i;
        boolean flag;
        d.c();
        e.a();
        i = b.a(com.microsoft.onlineid.sts.n.c.h);
        int k = i;
        if (i <= 0)
        {
            String s = (new StringBuilder("Invalid MaxTriesForSsoRequestWithFallback: ")).append(i).toString();
            com.microsoft.onlineid.internal.c.d.c(s);
            com.microsoft.onlineid.a.a.a().a("SDK", "SSO fallback", s);
            k = 1;
        }
        i = 0;
        flag = false;
        iterator = c.a().iterator();
        Object obj2;
        if (iterator.hasNext())
        {
            obj = (com.microsoft.onlineid.internal.sso.e)iterator.next();
        } else
        {
            obj = null;
        }
_L5:
        if (i >= k || obj == null) goto _L2; else goto _L1
_L1:
        obj2 = g1.a(((com.microsoft.onlineid.internal.sso.e) (obj)));
        return obj2;
        com.microsoft.onlineid.internal.sso.c c1;
        c1;
        Object obj3;
        int j;
        boolean flag1;
        obj = c1.a();
        obj3 = (new StringBuilder("Redirect to: ")).append(((String) (obj))).toString();
        com.microsoft.onlineid.internal.c.d.a(((String) (obj3)), c1);
        com.microsoft.onlineid.a.a.a().a("SDK", "SSO fallback", ((String) (obj3)));
        com.microsoft.onlineid.internal.sso.e e1 = c.a(((String) (obj)));
        flag1 = flag;
        obj3 = iterator;
        obj = e1;
        j = i;
        if (e1 == null)
        {
            com.microsoft.onlineid.internal.c.d.c("Cannot find redirected master", c1);
            com.microsoft.onlineid.a.a.a().a("SDK", "SSO fallback", "Cannot find redirected master");
            if (iterator.hasNext())
            {
                obj = (com.microsoft.onlineid.internal.sso.e)iterator.next();
                j = i;
                obj3 = iterator;
                flag1 = flag;
            } else
            {
                obj = null;
                flag1 = flag;
                obj3 = iterator;
                j = i;
            }
        }
_L3:
        i = j + 1;
        flag = flag1;
        iterator = ((Iterator) (obj3));
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        if (iterator.hasNext())
        {
            obj1 = (com.microsoft.onlineid.internal.sso.e)iterator.next();
        } else
        {
            obj1 = null;
        }
        flag1 = flag;
        obj3 = iterator;
        j = i;
        continue; /* Loop/switch isn't completed */
        obj1;
        return b(g1);
        obj1;
        return b(g1);
        com.microsoft.onlineid.internal.sso.client.a a1;
        a1;
        com.microsoft.onlineid.internal.c.d.a((new StringBuilder("Client needs config update: ")).append(a1.getMessage()).toString());
        flag1 = flag;
        a1 = iterator;
        j = i;
        if (d.b())
        {
            a1 = c.a().iterator();
            if (a1.hasNext())
            {
                obj1 = (com.microsoft.onlineid.internal.sso.e)a1.next();
            } else
            {
                obj1 = null;
            }
            j = i;
            if (!flag)
            {
                j = i - 1;
            }
            flag1 = true;
        }
        if (true) goto _L3; else goto _L2
_L2:
        String s1 = String.format(Locale.US, "SSO request failed after %d tries", new Object[] {
            Integer.valueOf(i)
        });
        com.microsoft.onlineid.internal.c.d.c(s1);
        com.microsoft.onlineid.a.a.a().a("SDK", "SSO fallback", s1);
        return b(g1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final PendingIntent b(String s, Bundle bundle)
        throws a
    {
        return (PendingIntent)a(new com.microsoft.onlineid.internal.sso.client.a.c(a, bundle, s));
    }
}
