// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            o

public static final class c extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    private final String c;

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/microsoft/advertising/android/o$a, s);
    }

    public static c[] values()
    {
        c ac[] = d;
        int i = ac.length;
        c ac1[] = new d[i];
        System.arraycopy(ac, 0, ac1, 0, i);
        return ac1;
    }

    static 
    {
        a = new <init>("WEB_VIEW", 0, "webViewResource");
        b = new <init>("BANNER_IMAGE", 1, "bannerAdImage");
        d = (new d[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }
}
