// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.events;


// Referenced classes of package com.google.android.gms.games.internal.events:
//            EventIncrementCache

class Ro
    implements Runnable
{

    final EventIncrementCache Ro;

    public void run()
    {
        EventIncrementCache.a(Ro);
    }

    (EventIncrementCache eventincrementcache)
    {
        Ro = eventincrementcache;
        super();
    }
}
