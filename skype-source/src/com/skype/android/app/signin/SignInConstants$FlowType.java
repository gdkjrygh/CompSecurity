// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            SignInConstants

public static final class  extends Enum
{

    private static final UNIFIED $VALUES[];
    public static final UNIFIED SIMPLIFIED;
    public static final UNIFIED UNIFIED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/signin/SignInConstants$FlowType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SIMPLIFIED = new <init>("SIMPLIFIED", 0);
        UNIFIED = new <init>("UNIFIED", 1);
        $VALUES = (new .VALUES[] {
            SIMPLIFIED, UNIFIED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
