// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            TremorVideo

public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    private String d;

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/tremorvideo/sdk/android/videoad/TremorVideo$a, s);
    }

    public static d[] values()
    {
        return (d[])e.clone();
    }

    public String toString()
    {
        return d;
    }

    static 
    {
        a = new <init>("Default", 0, "Default");
        b = new <init>("AppStart", 1, "App Start");
        c = new <init>("PreRoll", 2, "Pre Roll");
        e = (new e[] {
            a, b, c
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }
}
