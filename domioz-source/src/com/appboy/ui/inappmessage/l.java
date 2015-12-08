// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.f.a;

// Referenced classes of package com.appboy.ui.inappmessage:
//            a, k

final class l
    implements Runnable
{

    final com.appboy.d.a a;
    final k b;

    l(k k1, com.appboy.d.a a1)
    {
        b = k1;
        a = a1;
        super();
    }

    public final void run()
    {
        com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "Displaying in-app message.");
        com.appboy.ui.inappmessage.a.a(b.a, a);
    }
}
