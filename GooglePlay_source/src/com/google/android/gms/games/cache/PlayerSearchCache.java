// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;


// Referenced classes of package com.google.android.gms.games.cache:
//            BaseSearchCache

public final class PlayerSearchCache extends BaseSearchCache
{

    public PlayerSearchCache(String as[])
    {
        super(as, (byte)0);
    }

    protected final String getDebugColumn()
    {
        return "profile_name";
    }
}
