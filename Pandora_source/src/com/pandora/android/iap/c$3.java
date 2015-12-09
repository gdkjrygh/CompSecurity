// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import com.pandora.android.util.s;
import java.util.HashMap;
import p.cc.b;
import p.cc.c;
import p.cc.e;
import p.df.a;

// Referenced classes of package com.pandora.android.iap:
//            c, f

class b
    implements p.cm..Object
{

    final String a;
    final p.cc..String b;
    final com.pandora.android.iap.c c;

    public void a(boolean flag, String s1)
    {
        if (flag)
        {
            if (com.pandora.android.iap.c.d(c).a("inapp", a))
            {
                s1 = (e)com.pandora.android.iap.c.f(c).get(a);
                if (s1 != null)
                {
                    b.a(new c(0, null), s1);
                    return;
                } else
                {
                    com.pandora.android.iap.c.d(c).a(com.pandora.android.iap.c.a(c), a, "inapp", 130, b, null);
                    return;
                }
            } else
            {
                com.pandora.android.iap.f.a();
                p.df.a.c("GoogleInApp", "Cannot complete purchase because sku %s is invalid:", new Object[] {
                    a
                });
                s.e(com.pandora.android.iap.c.a(c));
                return;
            }
        } else
        {
            com.pandora.android.iap.f.a();
            s.e(com.pandora.android.iap.c.a(c));
            return;
        }
    }

    (com.pandora.android.iap.c c1, String s1, p.cc.ing ing)
    {
        c = c1;
        a = s1;
        b = ing;
        super();
    }
}
