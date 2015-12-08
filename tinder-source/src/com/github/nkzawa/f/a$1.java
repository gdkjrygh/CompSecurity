// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.f;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.github.nkzawa.f:
//            a

static final class eadFactory
    implements ThreadFactory
{

    public final Thread newThread(Runnable runnable)
    {
        a.a(new a(runnable, (byte)0));
        a.a().setName("EventThread");
        return a.a();
    }

    eadFactory()
    {
    }
}
