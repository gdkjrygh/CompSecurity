// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.constants;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.util.PanoUtils;

public final class DeviceType
{

    public static String fromContext(Context context)
    {
        String s;
        byte byte0;
        boolean flag;
        flag = true;
        s = (String)G.forcedDeviceType.get();
        if (s != null)
        {
            GamesLog.i("DeviceType", (new StringBuilder("Forcing device type ")).append(s).toString());
            return s;
        }
        if (PanoUtils.isPano(context))
        {
            return "PANO";
        }
        s = context.getResources().getString(0x7f100158);
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 100
    //                   -1828048282: 190
    //                   2448242: 162
    //                   76105038: 176;
           goto _L1 _L2 _L3 _L4
_L1:
        switch (byte0)
        {
        default:
            flag = false;
            // fall through

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            context = s;
            break;
        }
        if (!flag)
        {
            GamesLog.e("DeviceType", (new StringBuilder("Unknown device type string: ")).append(s).toString());
            context = "UNKNOWN_STATE";
        }
        return context;
_L3:
        if (s.equals("PANO"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s.equals("PHONE"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("TABLET"))
        {
            byte0 = 2;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
