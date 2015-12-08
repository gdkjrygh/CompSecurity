// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;


// Referenced classes of package com.leanplum:
//            T

final class M
    implements Runnable
{

    M()
    {
    }

    public final void run()
    {
        T.b("heartbeat", null).f();
    }
}
