// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvUtil

public static final class verifyMethod extends Enum
{

    private static final VOICE $VALUES[];
    public static final VOICE SMS;
    public static final VOICE VOICE;
    private final String verifyMethod;

    public static verifyMethod valueOf(String s)
    {
        return (verifyMethod)Enum.valueOf(com/skype/android/app/mnv/MnvUtil$VERIFY_METHOD, s);
    }

    public static verifyMethod[] values()
    {
        return (verifyMethod[])$VALUES.clone();
    }

    public final String toString()
    {
        return name();
    }

    public final String verifyMethod()
    {
        return verifyMethod;
    }

    static 
    {
        SMS = new <init>("SMS", 0, "Sms");
        VOICE = new <init>("VOICE", 1, "Voice");
        $VALUES = (new .VALUES[] {
            SMS, VOICE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        verifyMethod = s1;
    }
}
