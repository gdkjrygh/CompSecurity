// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.f;


// Referenced classes of package com.facebook.debug.f:
//            a

class e
    implements android.os.MessageQueue.IdleHandler
{

    final a a;

    e(a a1)
    {
        a = a1;
        super();
    }

    public boolean queueIdle()
    {
        com.facebook.debug.f.a.d(a);
        return com.facebook.debug.f.a.e(a);
    }
}
