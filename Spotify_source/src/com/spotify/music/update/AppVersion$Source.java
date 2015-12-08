// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.update;

import java.util.Locale;

public final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  a(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = c;
_L4:
        return s;
_L2:
        String s1 = s.toLowerCase(Locale.US);
         a1[] = values();
        int j = a1.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                  = a1[i];
                s = ;
                if (s1.equals(.toString()))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return c;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/spotify/music/update/AppVersion$Source, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    public final String toString()
    {
        return super.toString().toLowerCase(Locale.US);
    }

    static 
    {
        a = new <init>("GOOGLE_PLAY", 0);
        b = new <init>("AMAZON", 1);
        c = new <init>("UNKNOWN", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
