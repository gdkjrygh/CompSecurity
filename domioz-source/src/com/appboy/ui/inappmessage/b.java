// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.d.a;

// Referenced classes of package com.appboy.ui.inappmessage:
//            k, a

final class b
    implements Runnable
{

    final a a;
    final com.appboy.ui.inappmessage.a b;

    b(com.appboy.ui.inappmessage.a a1, a a2)
    {
        b = a1;
        a = a2;
        super();
    }

    public final void run()
    {
        (new k(b, (byte)0)).execute(new a[] {
            a
        });
    }
}
