// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;


// Referenced classes of package com.apptentive.android.sdk.model:
//            Event

public static final class labelName extends Enum
{

    private static final error $VALUES[];
    public static final error app__exit;
    public static final error app__launch;
    public static final error error;
    public static final error message_center__attach;
    public static final error message_center__close;
    public static final error message_center__intro__cancel;
    public static final error message_center__intro__launch;
    public static final error message_center__intro__send;
    public static final error message_center__launch;
    public static final error message_center__read;
    public static final error message_center__thank_you__close;
    public static final error message_center__thank_you__launch;
    public static final error message_center__thank_you__messages;
    private final String labelName;

    public static labelName valueOf(String s)
    {
        return (labelName)Enum.valueOf(com/apptentive/android/sdk/model/Event$EventLabel, s);
    }

    public static labelName[] values()
    {
        return (labelName[])$VALUES.clone();
    }

    public String getLabelName()
    {
        return labelName;
    }

    static 
    {
        app__launch = new <init>("app__launch", 0, "launch");
        app__exit = new <init>("app__exit", 1, "exit");
        message_center__launch = new <init>("message_center__launch", 2, "message_center.launch");
        message_center__close = new <init>("message_center__close", 3, "message_center.close");
        message_center__attach = new <init>("message_center__attach", 4, "message_center.attach");
        message_center__read = new <init>("message_center__read", 5, "message_center.read");
        message_center__intro__launch = new <init>("message_center__intro__launch", 6, "message_center.intro.launch");
        message_center__intro__send = new <init>("message_center__intro__send", 7, "message_center.intro.send");
        message_center__intro__cancel = new <init>("message_center__intro__cancel", 8, "message_center.intro.cancel");
        message_center__thank_you__launch = new <init>("message_center__thank_you__launch", 9, "message_center.thank_you.launch");
        message_center__thank_you__messages = new <init>("message_center__thank_you__messages", 10, "message_center.thank_you.messages");
        message_center__thank_you__close = new <init>("message_center__thank_you__close", 11, "message_center.thank_you.close");
        error = new <init>("error", 12, "error");
        $VALUES = (new .VALUES[] {
            app__launch, app__exit, message_center__launch, message_center__close, message_center__attach, message_center__read, message_center__intro__launch, message_center__intro__send, message_center__intro__cancel, message_center__thank_you__launch, 
            message_center__thank_you__messages, message_center__thank_you__close, error
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        labelName = s1;
    }
}
