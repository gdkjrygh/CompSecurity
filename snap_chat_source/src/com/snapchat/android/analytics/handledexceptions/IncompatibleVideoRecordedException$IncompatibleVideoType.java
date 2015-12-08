// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.handledexceptions;


// Referenced classes of package com.snapchat.android.analytics.handledexceptions:
//            IncompatibleVideoRecordedException

public static final class  extends Enum
{

    private static final H263 $VALUES[];
    public static final H263 AMR_NB;
    public static final H263 H263;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/handledexceptions/IncompatibleVideoRecordedException$IncompatibleVideoType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AMR_NB = new <init>("AMR_NB", 0);
        H263 = new <init>("H263", 1);
        $VALUES = (new .VALUES[] {
            AMR_NB, H263
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
