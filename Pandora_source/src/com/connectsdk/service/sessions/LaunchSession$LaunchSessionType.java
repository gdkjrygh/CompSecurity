// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.sessions;


// Referenced classes of package com.connectsdk.service.sessions:
//            LaunchSession

public static final class  extends Enum
{

    private static final WebApp $VALUES[];
    public static final WebApp App;
    public static final WebApp ExternalInputPicker;
    public static final WebApp Media;
    public static final WebApp Unknown;
    public static final WebApp WebApp;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/connectsdk/service/sessions/LaunchSession$LaunchSessionType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Unknown = new <init>("Unknown", 0);
        App = new <init>("App", 1);
        ExternalInputPicker = new <init>("ExternalInputPicker", 2);
        Media = new <init>("Media", 3);
        WebApp = new <init>("WebApp", 4);
        $VALUES = (new .VALUES[] {
            Unknown, App, ExternalInputPicker, Media, WebApp
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
