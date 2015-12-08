// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;


public class EventVisibilityConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public EventVisibilityConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        byte byte0;
        boolean flag1;
        flag1 = false;
        obj = (String)obj;
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 2: default 40
    //                   517612844: 90
    //                   2130809258: 76;
           goto _L1 _L2 _L3
_L1:
        boolean flag;
        flag = flag1;
        switch (byte0)
        {
        default:
            flag = flag1;
            break;

        case 0: // '\0'
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_104;
        }
_L4:
        return Boolean.valueOf(flag);
_L3:
        if (((String) (obj)).equals("HIDDEN"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (((String) (obj)).equals("REVEALED"))
        {
            byte0 = 1;
        }
          goto _L1
        flag = true;
          goto _L4
    }

    public final volatile Object convertBack(Object obj)
    {
        if (((Boolean)obj).booleanValue())
        {
            return "REVEALED";
        } else
        {
            return "HIDDEN";
        }
    }

    public final int getTypeOut()
    {
        return 6;
    }
}
