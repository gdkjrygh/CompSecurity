// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;


// Referenced classes of package com.google.android.gms.games.broker:
//            AchievementAgent

public static final class xpGained
{

    public final int statusCode;
    public final long xpGained;

    public (int i)
    {
        this(i, 0L);
    }

    public <init>(int i, long l)
    {
        statusCode = i;
        xpGained = l;
    }
}
