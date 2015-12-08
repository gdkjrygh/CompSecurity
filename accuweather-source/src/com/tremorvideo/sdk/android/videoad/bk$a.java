// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bk

public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    private String d;

    public static d a(String s)
    {
        d ad[] = values();
        int j = ad.length;
        for (int i = 0; i < j; i++)
        {
            d d1 = ad[i];
            if (d1.toString().equals(s))
            {
                return d1;
            }
        }

        return a;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/bk$a, s);
    }

    public static a[] values()
    {
        return (a[])e.clone();
    }

    public String toString()
    {
        return d;
    }

    static 
    {
        a = new <init>("Default", 0, "default");
        b = new <init>("AppStart", 1, "appstart");
        c = new <init>("PreRoll", 2, "preroll");
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
