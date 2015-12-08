// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;


public class RoomStatusConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public RoomStatusConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        int i;
        if (((String) (obj)).equals("ROOM_INVITING"))
        {
            i = 0;
        } else
        if (((String) (obj)).equals("ROOM_AUTO_MATCHING"))
        {
            i = 1;
        } else
        if (((String) (obj)).equals("ROOM_CONNECTING"))
        {
            i = 2;
        } else
        if (((String) (obj)).equals("ROOM_ACTIVE"))
        {
            i = 3;
        } else
        if (((String) (obj)).equals("ROOM_DELETED"))
        {
            i = 4;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown room state string: ")).append(((String) (obj))).toString());
        }
        return Integer.valueOf(i);
    }

    public final volatile Object convertBack(Object obj)
    {
        int i = ((Integer)obj).intValue();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown room state: ")).append(i).toString());

        case 0: // '\0'
            return "ROOM_INVITING";

        case 1: // '\001'
            return "ROOM_AUTO_MATCHING";

        case 2: // '\002'
            return "ROOM_CONNECTING";

        case 3: // '\003'
            return "ROOM_ACTIVE";

        case 4: // '\004'
            return "ROOM_DELETED";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
