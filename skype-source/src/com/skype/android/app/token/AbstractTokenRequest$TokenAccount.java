// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.token;


// Referenced classes of package com.skype.android.app.token:
//            AbstractTokenRequest

public static final class  extends Enum
{

    private static final SKYPE $VALUES[];
    public static final SKYPE MSA;
    public static final SKYPE SKYPE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/token/AbstractTokenRequest$TokenAccount, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MSA = new <init>("MSA", 0);
        SKYPE = new <init>("SKYPE", 1);
        $VALUES = (new .VALUES[] {
            MSA, SKYPE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
