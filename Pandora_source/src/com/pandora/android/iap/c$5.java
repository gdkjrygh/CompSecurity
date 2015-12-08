// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import p.cc.b;
import p.cc.c;
import p.cm.s;
import p.df.a;

// Referenced classes of package com.pandora.android.iap:
//            c

class a
    implements p.cc..Object
{

    final com.pandora.android.iap.c a;

    public void a(c c1)
    {
        com.pandora.android.iap.c.a(a, c.d(a).b());
        if (!c1.c())
        {
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("ERROR: Problem setting up In-app Billing: ").append(c1).toString());
            return;
        } else
        {
            p.df.a.a("GoogleInApp", "IapHelper setup complete");
            (new s()).execute(new Void[0]);
            return;
        }
    }

    (com.pandora.android.iap.c c1)
    {
        a = c1;
        super();
    }
}
