// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvBaseFragment

public static final class  extends Enum
{

    private static final CODE_HAS_EXPIRED $VALUES[];
    public static final CODE_HAS_EXPIRED ALREADY_VERIFIED;
    public static final CODE_HAS_EXPIRED CODE_HAS_EXPIRED;
    public static final CODE_HAS_EXPIRED CODE_WAS_INCORRECT;
    public static final CODE_HAS_EXPIRED INVALID_PHONE_NUMBER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/mnv/MnvBaseFragment$ERROR, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INVALID_PHONE_NUMBER = new <init>("INVALID_PHONE_NUMBER", 0);
        ALREADY_VERIFIED = new <init>("ALREADY_VERIFIED", 1);
        CODE_WAS_INCORRECT = new <init>("CODE_WAS_INCORRECT", 2);
        CODE_HAS_EXPIRED = new <init>("CODE_HAS_EXPIRED", 3);
        $VALUES = (new .VALUES[] {
            INVALID_PHONE_NUMBER, ALREADY_VERIFIED, CODE_WAS_INCORRECT, CODE_HAS_EXPIRED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
