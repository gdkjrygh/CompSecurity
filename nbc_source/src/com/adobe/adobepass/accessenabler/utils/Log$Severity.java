// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.utils;


// Referenced classes of package com.adobe.adobepass.accessenabler.utils:
//            Log

public static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR DEBUG;
    public static final ERROR ERROR;
    public static final ERROR INFO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/adobepass/accessenabler/utils/Log$Severity, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INFO = new <init>("INFO", 0);
        DEBUG = new <init>("DEBUG", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            INFO, DEBUG, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
