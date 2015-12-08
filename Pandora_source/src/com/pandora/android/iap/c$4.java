// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import p.cc.c;
import p.cc.e;
import p.df.a;

// Referenced classes of package com.pandora.android.iap:
//            c

class a
    implements p.cc..Object
{

    final com.pandora.android.iap.c a;

    public void a(e e, c c1)
    {
        if (c1.c())
        {
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("Consumed purchase: ").append(e).toString());
            return;
        } else
        {
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("Failed to consumed purchase: ").append(e).toString());
            return;
        }
    }

    (com.pandora.android.iap.c c1)
    {
        a = c1;
        super();
    }
}
