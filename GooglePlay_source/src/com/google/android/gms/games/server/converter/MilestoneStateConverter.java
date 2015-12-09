// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.GamesLog;

public final class MilestoneStateConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public MilestoneStateConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        byte byte0;
        byte byte1;
        byte1 = 3;
        obj = (String)obj;
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 4: default 56
    //                   -1391247659: 158
    //                   -1290596325: 130
    //                   -528307297: 144
    //                   1571299771: 116;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte0;
        JVM INSTR tableswitch 0 3: default 88
    //                   0 172
    //                   1 111
    //                   2 177
    //                   3 182;
           goto _L6 _L7 _L8 _L9 _L10
_L8:
        break; /* Loop/switch isn't completed */
_L6:
        GamesLog.e("MilestoneState", (new StringBuilder("Unknown milestone state string: ")).append(((String) (obj))).toString());
        byte1 = 0;
_L11:
        return Integer.valueOf(byte1);
_L5:
        if (((String) (obj)).equals("CLAIMED"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (((String) (obj)).equals("COMPLETED_NOT_CLAIMED"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (((String) (obj)).equals("NOT_COMPLETED"))
        {
            byte0 = 2;
        }
          goto _L1
_L2:
        if (((String) (obj)).equals("NOT_STARTED"))
        {
            byte0 = 3;
        }
          goto _L1
_L7:
        byte1 = 4;
          goto _L11
_L9:
        byte1 = 2;
          goto _L11
_L10:
        byte1 = 1;
          goto _L11
    }

    public final volatile Object convertBack(Object obj)
    {
        int i = ((Integer)obj).intValue();
        switch (i)
        {
        default:
            GamesLog.e("MilestoneState", (new StringBuilder("Unknown milestone state: ")).append(i).toString());
            return "UNKNOWN_STATE";

        case 4: // '\004'
            return "CLAIMED";

        case 3: // '\003'
            return "COMPLETED_NOT_CLAIMED";

        case 2: // '\002'
            return "NOT_COMPLETED";

        case 1: // '\001'
            return "NOT_STARTED";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
