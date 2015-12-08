// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.operation;


// Referenced classes of package com.snapchat.android.operation:
//            ScannableOperation

public static final class  extends Enum
{

    private static final SNAPCODE $VALUES[];
    public static final SNAPCODE SNAPCODE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/operation/ScannableOperation$SCAN_CODE_TYPE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SNAPCODE = new <init>("SNAPCODE");
        $VALUES = (new .VALUES[] {
            SNAPCODE
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
