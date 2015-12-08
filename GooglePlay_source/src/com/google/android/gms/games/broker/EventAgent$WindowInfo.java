// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;


// Referenced classes of package com.google.android.gms.games.broker:
//            EventAgent

private static final class externalGameId
{

    public final String externalGameId;
    public final long requestId;
    public final long windowEnd;
    public final long windowStart;

    public final boolean isSameTimePeriod(externalGameId externalgameid)
    {
        return windowStart == externalgameid.windowStart && windowEnd == externalgameid.windowEnd;
    }

    public (String s, long l, long l1, long l2)
    {
        windowStart = l;
        windowEnd = l1;
        requestId = l2;
        externalGameId = s;
    }
}
