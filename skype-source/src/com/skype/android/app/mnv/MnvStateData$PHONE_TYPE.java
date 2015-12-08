// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvStateData

public static final class  extends Enum
{

    private static final USER_ENTERED $VALUES[];
    public static final USER_ENTERED DEVICE_ENTERED;
    public static final USER_ENTERED SERVER_ENTERED;
    public static final USER_ENTERED UNSET;
    public static final USER_ENTERED USER_ENTERED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/mnv/MnvStateData$PHONE_TYPE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNSET = new <init>("UNSET", 0);
        SERVER_ENTERED = new <init>("SERVER_ENTERED", 1);
        DEVICE_ENTERED = new <init>("DEVICE_ENTERED", 2);
        USER_ENTERED = new <init>("USER_ENTERED", 3);
        $VALUES = (new .VALUES[] {
            UNSET, SERVER_ENTERED, DEVICE_ENTERED, USER_ENTERED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
