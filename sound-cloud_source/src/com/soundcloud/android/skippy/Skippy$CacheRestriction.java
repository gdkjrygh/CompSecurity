// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;


// Referenced classes of package com.soundcloud.android.skippy:
//            Skippy

public static final class  extends Enum
{

    private static final NONE_EXPERIMENTAL $VALUES[];
    public static final NONE_EXPERIMENTAL DISABLE_CACHE;
    public static final NONE_EXPERIMENTAL NONE;
    public static final NONE_EXPERIMENTAL NONE_EXPERIMENTAL;
    public static final NONE_EXPERIMENTAL ONLINE_ONLY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/skippy/Skippy$CacheRestriction, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        ONLINE_ONLY = new <init>("ONLINE_ONLY", 1);
        DISABLE_CACHE = new <init>("DISABLE_CACHE", 2);
        NONE_EXPERIMENTAL = new <init>("NONE_EXPERIMENTAL", 3);
        $VALUES = (new .VALUES[] {
            NONE, ONLINE_ONLY, DISABLE_CACHE, NONE_EXPERIMENTAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
