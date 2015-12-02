// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d BIRTHDAY;
    public static final d CELEBRATION;
    public static final d CHECKIN;
    public static final d LISTENING;
    public static final d NEARBY;
    public static final d NEIGHBORHOOD;
    public static final d OTHER;
    public static final d PRESENCE;
    public static final d VISITING;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/user/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        NEARBY = new d("NEARBY", 0);
        VISITING = new d("VISITING", 1);
        BIRTHDAY = new d("BIRTHDAY", 2);
        CHECKIN = new d("CHECKIN", 3);
        CELEBRATION = new d("CELEBRATION", 4);
        NEIGHBORHOOD = new d("NEIGHBORHOOD", 5);
        LISTENING = new d("LISTENING", 6);
        PRESENCE = new d("PRESENCE", 7);
        OTHER = new d("OTHER", 8);
        $VALUES = (new d[] {
            NEARBY, VISITING, BIRTHDAY, CHECKIN, CELEBRATION, NEIGHBORHOOD, LISTENING, PRESENCE, OTHER
        });
    }
}
