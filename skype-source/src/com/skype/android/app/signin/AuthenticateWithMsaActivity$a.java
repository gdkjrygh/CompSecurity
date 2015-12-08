// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            AuthenticateWithMsaActivity

private static final class  extends Enum
{

    private static final MSA_SIGN_UP $VALUES[];
    public static final MSA_SIGN_UP MSA_SIGN_IN;
    public static final MSA_SIGN_UP MSA_SIGN_UP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/signin/AuthenticateWithMsaActivity$a, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MSA_SIGN_IN = new <init>("MSA_SIGN_IN", 0);
        MSA_SIGN_UP = new <init>("MSA_SIGN_UP", 1);
        $VALUES = (new .VALUES[] {
            MSA_SIGN_IN, MSA_SIGN_UP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
