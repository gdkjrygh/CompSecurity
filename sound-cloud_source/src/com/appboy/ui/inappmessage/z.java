// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.ui.inappmessage.a.c;

// Referenced classes of package com.appboy.ui.inappmessage:
//            v

final class z
    implements Runnable
{

    final v a;

    z(v v1)
    {
        a = v1;
        super();
    }

    public final void run()
    {
        c c1 = com.appboy.ui.inappmessage.v.c(a);
        v.b(a);
        v.a(a);
        c1.c();
        a.a();
    }
}
