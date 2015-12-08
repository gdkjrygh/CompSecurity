// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad.a;


// Referenced classes of package com.tremorvideo.sdk.android.videoad.a:
//            a

private static final class  extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l h;
    public static final l i;
    public static final l j;
    public static final l k;
    public static final l l;
    private static final l m[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tremorvideo/sdk/android/videoad/a/a$b, s);
    }

    public static [] values()
    {
        return ([])m.clone();
    }

    static 
    {
        a = new <init>("VAST", 0);
        b = new <init>("InLine", 1);
        c = new <init>("Impression", 2);
        d = new <init>("Linear", 3);
        e = new <init>("Duration", 4);
        f = new <init>("Tracking", 5);
        g = new <init>("ClickThrough", 6);
        h = new <init>("ClickTracking", 7);
        i = new <init>("MediaFile", 8);
        j = new <init>("Wrapper", 9);
        k = new <init>("VASTAdTagURI", 10);
        l = new <init>("Invalid", 11);
        m = (new m[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
