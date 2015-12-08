// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;


// Referenced classes of package com.skype.android.app.calling:
//            CallQualityFeedbackRating

public static final class  extends Enum
{

    private static final UPLOADED $VALUES[];
    public static final UPLOADED PENDING;
    public static final UPLOADED SUBMITTED;
    public static final UPLOADED UPLOADED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/calling/CallQualityFeedbackRating$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PENDING = new <init>("PENDING", 0);
        SUBMITTED = new <init>("SUBMITTED", 1);
        UPLOADED = new <init>("UPLOADED", 2);
        $VALUES = (new .VALUES[] {
            PENDING, SUBMITTED, UPLOADED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
