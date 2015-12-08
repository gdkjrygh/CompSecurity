// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.d.b;

// Referenced classes of package com.appboy.ui.inappmessage:
//            a

final class g
    implements Runnable
{

    final b a;
    final a b;

    g(a a1, b b1)
    {
        b = a1;
        a = b1;
        super();
    }

    public final void run()
    {
        if (a != null)
        {
            com.appboy.ui.d.g.a(a);
        }
    }
}
