// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.config;

import com.google.android.gms.common.config.GservicesValue;

// Referenced classes of package com.google.android.gms.games.config:
//            G

public final class GamesOptions
{

    public static String formatUrl(String s, String s1)
    {
        return String.format("%s/games/%s/", new Object[] {
            s, s1
        });
    }

    public static String getBaseServer()
    {
        return (String)G.baseServerUrl.get();
    }
}
