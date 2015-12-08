// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;


// Referenced classes of package com.mopub.common:
//            CloseableLayout

final class c
    implements Runnable
{

    final CloseableLayout a;

    private c(CloseableLayout closeablelayout)
    {
        a = closeablelayout;
        super();
    }

    c(CloseableLayout closeablelayout, byte byte0)
    {
        this(closeablelayout);
    }

    public final void run()
    {
        CloseableLayout.a(a);
    }
}
