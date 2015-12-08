// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.text.TextUtils;

public final class GamesConstants
{

    public static boolean isFirstPartyAppId(String s, boolean flag)
    {
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            return flag;
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 40
    //                   -802894941: 80
    //                   943476232: 66;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_80;
_L4:
        switch (byte0)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
            return true;
        }
_L3:
        if (s.equals("593950602418"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("232243143311"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public static boolean isPackagePlayGamesApp(String s)
    {
        if ("com.google.android.play.games".equals(s))
        {
            return true;
        } else
        {
            return "com.google.android.gms".equals(s);
        }
    }
}
