// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model.survey;


// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model.survey:
//            Question

public static final class Y extends Enum
{

    private static final multiselect $VALUES[];
    public static final multiselect multichoice;
    public static final multiselect multiselect;
    public static final multiselect singleline;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/apptentive/android/sdk/module/engagement/interaction/model/survey/Question$Type, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        multichoice = new <init>("multichoice", 0);
        singleline = new <init>("singleline", 1);
        multiselect = new <init>("multiselect", 2);
        $VALUES = (new .VALUES[] {
            multichoice, singleline, multiselect
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
