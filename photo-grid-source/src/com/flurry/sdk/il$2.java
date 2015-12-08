// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            kj, il, kc, jv

class it>
    implements it>
{

    final il a;

    public volatile void a(kj kj1, Object obj)
    {
        a(kj1, (Void)obj);
    }

    public void a(kj kj1, Void void1)
    {
        int i = kj1.h();
        if (i > 0)
        {
            if (i >= 200 && i < 300)
            {
                kc.a(3, il.d(), (new StringBuilder("Pulse logging report sent successfully HTTP response:")).append(i).toString());
                il.a(a).clear();
                il.b(a).a(il.a(a));
                return;
            } else
            {
                kc.a(3, il.d(), (new StringBuilder("Pulse logging report sent unsuccessfully, HTTP response:")).append(i).toString());
                return;
            }
        } else
        {
            kc.e(il.d(), (new StringBuilder("Server Error: ")).append(i).toString());
            return;
        }
    }

    der(il il1)
    {
        a = il1;
        super();
    }
}
