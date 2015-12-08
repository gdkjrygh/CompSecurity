// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.crypto.cipher;


// Referenced classes of package com.facebook.crypto.cipher:
//            NativeCBCCipher

static final class  extends Enum
{

    private static final FINALIZED $VALUES[];
    public static final FINALIZED FINALIZED;
    public static final FINALIZED INITIALIZED;
    public static final FINALIZED UNINITIALIZED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/crypto/cipher/NativeCBCCipher$STATE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNINITIALIZED = new <init>("UNINITIALIZED", 0);
        INITIALIZED = new <init>("INITIALIZED", 1);
        FINALIZED = new <init>("FINALIZED", 2);
        $VALUES = (new .VALUES[] {
            UNINITIALIZED, INITIALIZED, FINALIZED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
