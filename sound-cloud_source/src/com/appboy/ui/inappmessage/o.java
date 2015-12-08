// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.d.a;

// Referenced classes of package com.appboy.ui.inappmessage:
//            a

final class o
    implements Runnable
{

    final a a;
    final a.a b;

    o(a.a a1, a a2)
    {
        b = a1;
        a = a2;
        super();
    }

    public final void run()
    {
        com.appboy.ui.inappmessage.a.d();
        com.appboy.ui.inappmessage.a.a(b.a, a);
    }
}
