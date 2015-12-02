// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.a;

import com.facebook.debug.d.e;

// Referenced classes of package com.facebook.debug.a:
//            a

class b
    implements android.os.MessageQueue.IdleHandler
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public boolean queueIdle()
    {
        if (com.facebook.debug.a.a.a(a) != null)
        {
            if (com.facebook.debug.a.a.a(a).a() > 20L)
            {
                e.a(com.facebook.debug.a.a.a());
            } else
            {
                e.b();
            }
        }
        return false;
    }
}
