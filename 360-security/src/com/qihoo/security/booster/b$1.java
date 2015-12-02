// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.booster;

import com.qihoo.security.support.b;
import java.util.List;

// Referenced classes of package com.qihoo.security.booster:
//            b

class a
    implements Runnable
{

    final List a;
    final com.qihoo.security.booster.b b;

    public void run()
    {
        b.a(a);
        com.qihoo.security.support.b.b(11321, (int)(System.currentTimeMillis() - com.qihoo.security.booster.b.a(b)));
    }

    (com.qihoo.security.booster.b b1, List list)
    {
        b = b1;
        a = list;
        super();
    }
}
