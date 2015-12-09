// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.GamesLog;

public final class QuestStateConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public QuestStateConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        byte byte0;
        int i;
        i = 1;
        obj = (String)obj;
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 7: default 80
    //                   -2026521607: 194
    //                   -1363898457: 222
    //                   -591252731: 208
    //                   2432586: 166
    //                   1383663147: 180
    //                   2066319421: 236
    //                   2089318684: 152;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        byte0;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 147
    //                   1 251
    //                   2 256
    //                   3 261
    //                   4 267
    //                   5 272
    //                   6 277;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L10:
        break; /* Loop/switch isn't completed */
_L9:
        GamesLog.e("QuestState", (new StringBuilder("Unknown quest state string: ")).append(((String) (obj))).toString());
        i = 0;
_L17:
        return Integer.valueOf(i);
_L8:
        if (((String) (obj)).equals("UPCOMING"))
        {
            byte0 = 0;
        }
          goto _L1
_L5:
        if (((String) (obj)).equals("OPEN"))
        {
            byte0 = 1;
        }
          goto _L1
_L6:
        if (((String) (obj)).equals("COMPLETED"))
        {
            byte0 = 2;
        }
          goto _L1
_L2:
        if (((String) (obj)).equals("DELETED"))
        {
            byte0 = 3;
        }
          goto _L1
_L4:
        if (((String) (obj)).equals("EXPIRED"))
        {
            byte0 = 4;
        }
          goto _L1
_L3:
        if (((String) (obj)).equals("ACCEPTED"))
        {
            byte0 = 5;
        }
          goto _L1
_L7:
        if (((String) (obj)).equals("FAILED"))
        {
            byte0 = 6;
        }
          goto _L1
_L11:
        i = 2;
          goto _L17
_L12:
        i = 4;
          goto _L17
_L13:
        i = 7;
          goto _L17
_L14:
        i = 5;
          goto _L17
_L15:
        i = 3;
          goto _L17
_L16:
        i = 6;
          goto _L17
    }

    public final volatile Object convertBack(Object obj)
    {
        int i = ((Integer)obj).intValue();
        switch (i)
        {
        default:
            GamesLog.e("QuestState", (new StringBuilder("Unknown quest state: ")).append(i).toString());
            return "UNKNOWN_STATE";

        case 1: // '\001'
            return "UPCOMING";

        case 2: // '\002'
            return "OPEN";

        case 4: // '\004'
            return "COMPLETED";

        case 7: // '\007'
            return "DELETED";

        case 5: // '\005'
            return "EXPIRED";

        case 3: // '\003'
            return "ACCEPTED";

        case 6: // '\006'
            return "FAILED";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
