// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;


// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            z

public static final class  extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i j[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tremorvideo/sdk/android/richmedia/z$b, s);
    }

    public static [] values()
    {
        return ([])j.clone();
    }

    static 
    {
        a = new <init>("Normal", 0);
        b = new <init>("ScrubLeft", 1);
        c = new <init>("ScrubRight", 2);
        d = new <init>("ScrubFreeLeft", 3);
        e = new <init>("ScrubFreeRight", 4);
        f = new <init>("SwipeLeft", 5);
        g = new <init>("SwipeRight", 6);
        h = new <init>("SwipeFreeLeft", 7);
        i = new <init>("SwipeFreeRight", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int k)
    {
        super(s, k);
    }
}
