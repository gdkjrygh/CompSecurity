// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.events;


// Referenced classes of package com.google.android.gms.games.internal.events:
//            EventIncrementCache

class acp
    implements Runnable
{

    final EventIncrementCache acp;

    public void run()
    {
        EventIncrementCache.a(acp);
    }

    (EventIncrementCache eventincrementcache)
    {
        acp = eventincrementcache;
        super();
    }
}
