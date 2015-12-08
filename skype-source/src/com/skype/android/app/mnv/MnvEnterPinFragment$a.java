// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvEnterPinFragment

private static final class  extends Enum
{

    private static final CALL_ME $VALUES[];
    public static final CALL_ME CALL_ME;
    public static final CALL_ME RESEND_CODE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/mnv/MnvEnterPinFragment$a, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        RESEND_CODE = new <init>("RESEND_CODE", 0);
        CALL_ME = new <init>("CALL_ME", 1);
        $VALUES = (new .VALUES[] {
            RESEND_CODE, CALL_ME
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
