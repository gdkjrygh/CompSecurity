// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model;

import com.apptentive.android.sdk.Log;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model:
//            Interaction

public static final class  extends Enum
{

    private static final unknown $VALUES[];
    public static final unknown AppStoreRating;
    public static final unknown EnjoymentDialog;
    public static final unknown FeedbackDialog;
    public static final unknown MessageCenter;
    public static final unknown RatingDialog;
    public static final unknown Survey;
    public static final unknown UpgradeMessage;
    public static final unknown unknown;

    public static  parse(String s)
    {
         ;
        try
        {
             = valueOf(s);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.v((new StringBuilder()).append("Error parsing unknown Interaction.Type: ").append(s).toString(), new Object[0]);
            return unknown;
        }
        return ;
    }

    public static unknown valueOf(String s)
    {
        return (unknown)Enum.valueOf(com/apptentive/android/sdk/module/engagement/interaction/model/Interaction$Type, s);
    }

    public static unknown[] values()
    {
        return (unknown[])$VALUES.clone();
    }

    static 
    {
        UpgradeMessage = new <init>("UpgradeMessage", 0);
        EnjoymentDialog = new <init>("EnjoymentDialog", 1);
        RatingDialog = new <init>("RatingDialog", 2);
        FeedbackDialog = new <init>("FeedbackDialog", 3);
        MessageCenter = new <init>("MessageCenter", 4);
        AppStoreRating = new <init>("AppStoreRating", 5);
        Survey = new <init>("Survey", 6);
        unknown = new <init>("unknown", 7);
        $VALUES = (new .VALUES[] {
            UpgradeMessage, EnjoymentDialog, RatingDialog, FeedbackDialog, MessageCenter, AppStoreRating, Survey, unknown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
