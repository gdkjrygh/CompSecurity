// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.e;

import android.content.Context;
import com.microsoft.onlineid.d;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.o;
import com.microsoft.onlineid.sts.c;
import java.util.Date;

// Referenced classes of package com.microsoft.onlineid.internal.e:
//            f

public final class e
{

    private final c a;
    private f b;

    public e(Context context)
    {
        a = new c(context);
        b = new f(context);
    }

    private static void a(String s, String s1)
    {
        o.a(s, "accountId");
        o.a(s1, "appId");
    }

    private boolean a(Date date)
    {
        return a.a().compareTo(date) < 0;
    }

    public final i a(String s, String s1, d d)
    {
        a(s, s1);
        k.a(d, "scope");
        i l = b.b(s, s1, d);
        i j = l;
        if (l != null)
        {
            j = l;
            if (!a(l.b()))
            {
                b.a(s, s1, d);
                j = null;
            }
        }
        return j;
    }

    public final void a(String s, String s1, i j)
    {
        a(s, s1);
        k.a(j, "ticket");
        if (a(j.b()))
        {
            b.a(s, s1, j);
        }
    }
}
