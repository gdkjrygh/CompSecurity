// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter;


// Referenced classes of package com.apptentive.android.sdk.module.messagecenter:
//            ApptentiveMessageCenter

static final class  extends Enum
{

    private static final message_center $VALUES[];
    public static final message_center enjoyment_dialog;
    public static final message_center message_center;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/apptentive/android/sdk/module/messagecenter/ApptentiveMessageCenter$Trigger, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        enjoyment_dialog = new <init>("enjoyment_dialog", 0);
        message_center = new <init>("message_center", 1);
        $VALUES = (new .VALUES[] {
            enjoyment_dialog, message_center
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
