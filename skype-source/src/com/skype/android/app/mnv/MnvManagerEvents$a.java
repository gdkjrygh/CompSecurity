// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvManagerEvents

private static final class  extends Enum
{

    private static final IS_SKYPE_SOURCE $VALUES[];
    public static final IS_SKYPE_SOURCE IS_FIRST_TIME;
    public static final IS_SKYPE_SOURCE IS_MNV_COMPLETED;
    public static final IS_SKYPE_SOURCE IS_MSA_SOURCE;
    public static final IS_SKYPE_SOURCE IS_SKYPE_SOURCE;
    public static final IS_SKYPE_SOURCE IS_VERIFICATION_QOS_ALERT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/mnv/MnvManagerEvents$a, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IS_VERIFICATION_QOS_ALERT = new <init>("IS_VERIFICATION_QOS_ALERT", 0);
        IS_FIRST_TIME = new <init>("IS_FIRST_TIME", 1);
        IS_MNV_COMPLETED = new <init>("IS_MNV_COMPLETED", 2);
        IS_MSA_SOURCE = new <init>("IS_MSA_SOURCE", 3);
        IS_SKYPE_SOURCE = new <init>("IS_SKYPE_SOURCE", 4);
        $VALUES = (new .VALUES[] {
            IS_VERIFICATION_QOS_ALERT, IS_FIRST_TIME, IS_MNV_COMPLETED, IS_MSA_SOURCE, IS_SKYPE_SOURCE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
