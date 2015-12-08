// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


// Referenced classes of package com.snapchat.android.util:
//            ExperimentUtils

public static final class  extends Enum
{

    private static final REQUIRED $VALUES[];
    public static final REQUIRED NOT_REQUIRED;
    public static final REQUIRED REQUIRED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/ExperimentUtils$PhoneVerificationExperiment, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_REQUIRED = new <init>("NOT_REQUIRED", 0);
        REQUIRED = new <init>("REQUIRED", 1);
        $VALUES = (new .VALUES[] {
            NOT_REQUIRED, REQUIRED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
