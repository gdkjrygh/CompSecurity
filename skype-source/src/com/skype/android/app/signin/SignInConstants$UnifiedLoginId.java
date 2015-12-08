// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            SignInConstants

public static final class A extends Enum
{

    private static final NON_MSA_EMAIL $VALUES[];
    public static final NON_MSA_EMAIL MSA_EMAIL;
    public static final NON_MSA_EMAIL NON_MSA_EMAIL;
    public static final NON_MSA_EMAIL PHONE_NUMBER;
    public static final NON_MSA_EMAIL SKYPE_ID;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/skype/android/app/signin/SignInConstants$UnifiedLoginId, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        PHONE_NUMBER = new <init>("PHONE_NUMBER", 0);
        SKYPE_ID = new <init>("SKYPE_ID", 1);
        MSA_EMAIL = new <init>("MSA_EMAIL", 2);
        NON_MSA_EMAIL = new <init>("NON_MSA_EMAIL", 3);
        $VALUES = (new .VALUES[] {
            PHONE_NUMBER, SKYPE_ID, MSA_EMAIL, NON_MSA_EMAIL
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
