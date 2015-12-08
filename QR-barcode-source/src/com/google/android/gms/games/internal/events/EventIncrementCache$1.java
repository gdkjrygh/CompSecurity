// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.events;


// Referenced classes of package com.google.android.gms.games.internal.events:
//            EventIncrementCache

class aav
    implements Runnable
{

    final EventIncrementCache aav;

    public void run()
    {
        EventIncrementCache.a(aav);
    }

    (EventIncrementCache eventincrementcache)
    {
        aav = eventincrementcache;
        super();
    }
}
