// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;


// Referenced classes of package com.snapchat.android.util.debug:
//            ReleaseManager

public static final class  extends Enum
{

    private static final PRODUCTION $VALUES[];
    public static final PRODUCTION ALPHA;
    public static final PRODUCTION BETA;
    public static final PRODUCTION DEBUG;
    public static final PRODUCTION PERF;
    public static final PRODUCTION PRODUCTION;
    public static final PRODUCTION UNINITIALIZED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/debug/ReleaseManager$ReleaseMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNINITIALIZED = new <init>("UNINITIALIZED", 0);
        DEBUG = new <init>("DEBUG", 1);
        PERF = new <init>("PERF", 2);
        ALPHA = new <init>("ALPHA", 3);
        BETA = new <init>("BETA", 4);
        PRODUCTION = new <init>("PRODUCTION", 5);
        $VALUES = (new .VALUES[] {
            UNINITIALIZED, DEBUG, PERF, ALPHA, BETA, PRODUCTION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
