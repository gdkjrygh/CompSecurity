// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import com.facebook.ad;
import com.facebook.o;

// Referenced classes of package com.facebook.b:
//            aq, aj

final class an
    implements ad
{

    final aq a;
    final String b;

    an(aq aq1, String s)
    {
        a = aq1;
        b = s;
        super();
    }

    public void a(com.facebook.an an1)
    {
        if (an1.a() != null)
        {
            a.a(an1.a().e());
            return;
        } else
        {
            aj.a(b, an1.b());
            a.a(an1.b());
            return;
        }
    }
}
