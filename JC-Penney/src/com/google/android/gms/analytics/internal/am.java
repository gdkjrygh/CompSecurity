// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.d.ad;
import com.google.android.gms.d.al;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            z, s, ab

public class am extends z
{

    private final al a = new al();

    am(ab ab)
    {
        super(ab);
    }

    protected void a()
    {
        r().a().a(a);
        b();
    }

    public void b()
    {
        Object obj = v();
        String s1 = ((s) (obj)).c();
        if (s1 != null)
        {
            a.a(s1);
        }
        obj = ((s) (obj)).b();
        if (obj != null)
        {
            a.b(((String) (obj)));
        }
    }

    public al c()
    {
        D();
        return a;
    }
}
