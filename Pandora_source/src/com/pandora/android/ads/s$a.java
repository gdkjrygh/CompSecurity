// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;


// Referenced classes of package com.pandora.android.ads:
//            s

private static final class  extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/pandora/android/ads/s$a, s1);
    }

    public static [] values()
    {
        return ([])f.clone();
    }

    static 
    {
        a = new <init>("EmptyAdReceived", 0);
        b = new <init>("AdFailed", 1);
        c = new <init>("AdRequestTimedOut", 2);
        d = new <init>("EmptyAdInCache", 3);
        e = new <init>("OtherAdReadyType", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s1, int i)
    {
        super(s1, i);
    }
}
