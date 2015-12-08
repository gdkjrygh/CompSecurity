// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client;

import android.content.Context;
import android.os.Bundle;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.e.f;
import com.microsoft.onlineid.internal.n;
import com.microsoft.onlineid.internal.sso.e;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.microsoft.onlineid.internal.sso.client:
//            e

public final class b
{

    private final Context a;
    private final f b;
    private final com.microsoft.onlineid.internal.sso.client.e c;
    private final String d;
    private List e;

    public b(Context context)
    {
        a = context;
        b = new f(context);
        c = new com.microsoft.onlineid.internal.sso.client.e(context);
        d = n.a(context);
    }

    public final void a()
    {
        String s = b.k();
        if (s != null) goto _L2; else goto _L1
_L1:
        b.c("0");
        e = c.a();
        if (e.isEmpty()) goto _L2; else goto _L3
_L3:
        String s1;
        Iterator iterator;
        int i;
        s1 = a.getPackageName();
        iterator = e.iterator();
        i = 0;
_L9:
        int j = i;
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        String s2;
        Object obj;
        obj = (e)iterator.next();
        s2 = ((e) (obj)).a();
        j = i;
        if (s2.equals(s1)) goto _L7; else goto _L6
_L6:
        j = i + 1;
        obj = (Bundle)(new com.microsoft.onlineid.internal.sso.client.a.f(a)).a(((e) (obj)));
        i = j;
        if (((Bundle) (obj)).isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        b.a(((Bundle) (obj)));
        com.microsoft.onlineid.internal.c.d.a((new StringBuilder()).append(s1).append(" migrated backup data from ").append(s2).toString());
_L5:
        com.microsoft.onlineid.a.a.a().a("Migration and Upgrade", "Migration attempts", String.valueOf(j));
_L2:
        if (s == null || !s.equals(d))
        {
            b.c(d);
        }
        return;
        Exception exception;
        exception;
        com.microsoft.onlineid.internal.c.d.c((new StringBuilder("Encountered an error attempting to migrate storage from ")).append(s2).toString(), exception);
        com.microsoft.onlineid.a.a.a().a(exception);
_L7:
        i = j;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
