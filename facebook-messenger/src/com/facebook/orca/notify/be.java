// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import com.facebook.orca.push.a;

// Referenced classes of package com.facebook.orca.notify:
//            av

class be
    implements Runnable
{

    final a a;
    final av b;

    be(av av1, a a1)
    {
        b = av1;
        a = a1;
        super();
    }

    public void run()
    {
        com.facebook.orca.notify.av.a(b, a);
    }
}
