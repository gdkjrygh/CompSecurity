// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    private static final i e[];

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/yume/android/player/i, s);
    }

    public static i[] values()
    {
        i ai[] = e;
        int j = ai.length;
        i ai1[] = new i[j];
        System.arraycopy(ai, 0, ai1, 0, j);
        return ai1;
    }

    static 
    {
        a = new i("VCALENDAR", 0);
        b = new i("VEVENT", 1);
        c = new i("VALARM", 2);
        d = new i("VTIMEZONE", 3);
        e = (new i[] {
            a, b, c, d
        });
    }
}
