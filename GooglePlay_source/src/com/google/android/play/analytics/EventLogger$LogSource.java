// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;


// Referenced classes of package com.google.android.play.analytics:
//            EventLogger

public static final class mProtoValue extends Enum
{

    private static final NEWSSTAND $VALUES[];
    public static final NEWSSTAND ANDROID_IDE;
    public static final NEWSSTAND BOOKS;
    public static final NEWSSTAND CW;
    public static final NEWSSTAND GAMES;
    public static final NEWSSTAND GMS_CORE;
    public static final NEWSSTAND LB_A;
    public static final NEWSSTAND LB_P;
    public static final NEWSSTAND LB_S;
    public static final NEWSSTAND MAGAZINES;
    public static final NEWSSTAND MARKET;
    public static final NEWSSTAND MOVIES;
    public static final NEWSSTAND MUSIC;
    public static final NEWSSTAND NEWSSTAND;
    public static final NEWSSTAND UDR;
    public static final NEWSSTAND VIDEO;
    final int mProtoValue;

    public static mProtoValue valueOf(String s)
    {
        return (mProtoValue)Enum.valueOf(com/google/android/play/analytics/EventLogger$LogSource, s);
    }

    public static mProtoValue[] values()
    {
        return (mProtoValue[])$VALUES.clone();
    }

    static 
    {
        MARKET = new <init>("MARKET", 0, 0);
        MUSIC = new <init>("MUSIC", 1, 1);
        BOOKS = new <init>("BOOKS", 2, 2);
        VIDEO = new <init>("VIDEO", 3, 3);
        MOVIES = new <init>("MOVIES", 4, 74);
        MAGAZINES = new <init>("MAGAZINES", 5, 4);
        GAMES = new <init>("GAMES", 6, 5);
        LB_A = new <init>("LB_A", 7, 6);
        ANDROID_IDE = new <init>("ANDROID_IDE", 8, 7);
        LB_P = new <init>("LB_P", 9, 8);
        LB_S = new <init>("LB_S", 10, 9);
        GMS_CORE = new <init>("GMS_CORE", 11, 10);
        CW = new <init>("CW", 12, 27);
        UDR = new <init>("UDR", 13, 30);
        NEWSSTAND = new <init>("NEWSSTAND", 14, 63);
        $VALUES = (new .VALUES[] {
            MARKET, MUSIC, BOOKS, VIDEO, MOVIES, MAGAZINES, GAMES, LB_A, ANDROID_IDE, LB_P, 
            LB_S, GMS_CORE, CW, UDR, NEWSSTAND
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mProtoValue = j;
    }
}
