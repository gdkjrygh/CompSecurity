// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android;

import com.kik.g.r;
import com.kik.n.a.h.a;

// Referenced classes of package com.kik.android:
//            a

final class c extends r
{

    final com.kik.android.a a;

    c(com.kik.android.a a1)
    {
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        if (obj != null)
        {
            String s = ((a) (obj)).b();
            if (s != null)
            {
                com.kik.android.a.a(a, s);
                com.kik.android.a.a(a, ((a) (obj)).c().booleanValue());
                a.a(s, true);
            }
            return;
        } else
        {
            com.kik.android.a.j(a);
            return;
        }
    }
}
