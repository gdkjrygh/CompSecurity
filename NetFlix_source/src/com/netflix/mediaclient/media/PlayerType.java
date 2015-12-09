// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;


public final class PlayerType extends Enum
{

    private static final PlayerType $VALUES[];
    public static final PlayerType device10;
    public static final PlayerType device11;
    public static final PlayerType device12;
    public static final PlayerType device7;
    public static final PlayerType device8;
    private String description;
    private int value;

    private PlayerType(String s, int i, int j, String s1)
    {
        super(s, i);
        value = j;
        description = s1;
    }

    public static PlayerType toPlayerType(int i)
    {
        for (int j = 0; j < values().length; j++)
        {
            if (values()[j].value == i)
            {
                return values()[j];
            }
        }

        return null;
    }

    public static PlayerType valueOf(String s)
    {
        return (PlayerType)Enum.valueOf(com/netflix/mediaclient/media/PlayerType, s);
    }

    public static PlayerType[] values()
    {
        return (PlayerType[])$VALUES.clone();
    }

    public String getDescription()
    {
        return description;
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        device7 = new PlayerType("device7", 0, 7, "XAL");
        device8 = new PlayerType("device8", 1, 8, "XAL Main Profile");
        device10 = new PlayerType("device10", 2, 10, "JPlayer");
        device11 = new PlayerType("device11", 3, 11, "JPlayer Base");
        device12 = new PlayerType("device12", 4, 12, "JPlayer2");
        $VALUES = (new PlayerType[] {
            device7, device8, device10, device11, device12
        });
    }
}
