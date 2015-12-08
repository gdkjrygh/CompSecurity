// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            az

public static final class g extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f h[];
    private String g;

    public static g a(String s)
    {
        g ag[] = values();
        int j = ag.length;
        for (int i = 0; i < j; i++)
        {
            g g1 = ag[i];
            if (g1.toString().equals(s))
            {
                return g1;
            }
        }

        return a;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/az$b, s);
    }

    public static a[] values()
    {
        return (a[])h.clone();
    }

    public String toString()
    {
        return g;
    }

    static 
    {
        a = new <init>("Unknown", 0, "unknown");
        b = new <init>("Video", 1, "video");
        c = new <init>("RichMedia", 2, "richmedia");
        d = new <init>("HTML5", 3, "html5");
        e = new <init>("VAST", 4, "vast");
        f = new <init>("Mraid", 5, "mraid");
        h = (new h[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        g = s1;
    }
}
