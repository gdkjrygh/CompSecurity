// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.crypto;


// Referenced classes of package com.snapchat.android.util.crypto:
//            CbcEncryptionAlgorithm

public static final class  extends Enum
{

    private static final DECRYPT $VALUES[];
    public static final DECRYPT DECRYPT;
    public static final DECRYPT ENCRYPT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/crypto/CbcEncryptionAlgorithm$MODE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ENCRYPT = new <init>("ENCRYPT", 0);
        DECRYPT = new <init>("DECRYPT", 1);
        $VALUES = (new .VALUES[] {
            ENCRYPT, DECRYPT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
