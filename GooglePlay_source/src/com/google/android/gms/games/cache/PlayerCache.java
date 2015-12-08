// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.common.internal.ClientContext;

// Referenced classes of package com.google.android.gms.games.cache:
//            TransientDataHolderCache

public final class PlayerCache extends TransientDataHolderCache
{

    public PlayerCache(String as[])
    {
        super(as, 0x1b7740L, null, "external_player_id");
    }

    public static String getCacheKeyForCirclesVisibleToGame(ClientContext clientcontext)
    {
        return (new StringBuilder("visible:")).append(clientcontext.mCallingPackageName).toString();
    }

    public static String getCacheKeyForFirstPartyCollection(String s, String s1)
    {
        StringBuilder stringbuilder = (new StringBuilder("players1p:")).append(s1).append(':');
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return stringbuilder.append(s1).toString();
    }

    protected final String getDebugColumn()
    {
        return "profile_name";
    }
}
