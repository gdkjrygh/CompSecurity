// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;


// Referenced classes of package com.skype.android.inject:
//            LoginManager

public static final class  extends Enum
{

    private static final LOGINFAILEDTIMEOUT $VALUES[];
    public static final LOGINFAILEDTIMEOUT LOGGEDIN;
    public static final LOGINFAILEDTIMEOUT LOGGEDOUT;
    public static final LOGINFAILEDTIMEOUT LOGINFAILED;
    public static final LOGINFAILEDTIMEOUT LOGINFAILEDTIMEOUT;
    public static final LOGINFAILEDTIMEOUT LOGINSUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/inject/LoginManager$LoginRequiredResult, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOGGEDIN = new <init>("LOGGEDIN", 0);
        LOGGEDOUT = new <init>("LOGGEDOUT", 1);
        LOGINSUCCESS = new <init>("LOGINSUCCESS", 2);
        LOGINFAILED = new <init>("LOGINFAILED", 3);
        LOGINFAILEDTIMEOUT = new <init>("LOGINFAILEDTIMEOUT", 4);
        $VALUES = (new .VALUES[] {
            LOGGEDIN, LOGGEDOUT, LOGINSUCCESS, LOGINFAILED, LOGINFAILEDTIMEOUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
