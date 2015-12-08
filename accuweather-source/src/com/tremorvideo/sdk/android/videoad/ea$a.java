// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ea

public static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d f[];
    private String e;

    public static e a(String s)
    {
        e ae[] = values();
        int j = ae.length;
        for (int i = 0; i < j; i++)
        {
            e e1 = ae[i];
            if (e1.toString().equalsIgnoreCase(s))
            {
                return e1;
            }
        }

        return d;
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/tremorvideo/sdk/android/videoad/ea$a, s);
    }

    public static d[] values()
    {
        return (d[])f.clone();
    }

    public String toString()
    {
        return e;
    }

    static 
    {
        a = new <init>("ClickToAppStore", 0, "click-to-appstore");
        b = new <init>("ClickToBlackberryMarket", 1, "click-to-blackberrymarket");
        c = new <init>("ClickToITunes", 2, "click-to-itunes");
        d = new <init>("None", 3, "none");
        f = (new f[] {
            a, b, c, d
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }
}
