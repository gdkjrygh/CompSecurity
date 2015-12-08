// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;


// Referenced classes of package com.skype.android.app.account:
//            MyInfoFragment

private static final class  extends Enum
{

    private static final SETTINGS $VALUES[];
    public static final SETTINGS ACCOUNT;
    public static final SETTINGS CALL_FORWARDING;
    public static final SETTINGS CREDIT;
    public static final SETTINGS SETTINGS;
    public static final SETTINGS SIGNOUT;
    public static final SETTINGS SKYPE_NUMBER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/account/MyInfoFragment$a, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ACCOUNT = new <init>("ACCOUNT", 0);
        CREDIT = new <init>("CREDIT", 1);
        SKYPE_NUMBER = new <init>("SKYPE_NUMBER", 2);
        CALL_FORWARDING = new <init>("CALL_FORWARDING", 3);
        SIGNOUT = new <init>("SIGNOUT", 4);
        SETTINGS = new <init>("SETTINGS", 5);
        $VALUES = (new .VALUES[] {
            ACCOUNT, CREDIT, SKYPE_NUMBER, CALL_FORWARDING, SIGNOUT, SETTINGS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
