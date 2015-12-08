// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.c.b;

// Referenced classes of package com.appboy.ui.inappmessage:
//            a, p

final class c
    implements b
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (com.appboy.c.c)obj;
        if (!com.appboy.ui.inappmessage.a.c(a).onInAppMessageReceived(((com.appboy.c.c) (obj)).a()))
        {
            a.a(((com.appboy.c.c) (obj)).a());
        }
    }
}
