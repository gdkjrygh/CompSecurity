// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server;

import android.text.TextUtils;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.config.G;

public final class GamesServerFactory
{

    public static String getTraceToken()
    {
        String s = (String)G.apiaryTraceToken.get();
        if (!TextUtils.isEmpty(s))
        {
            return (new StringBuilder("token:")).append(s).toString();
        } else
        {
            return null;
        }
    }
}
