// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


// Referenced classes of package org.apache.cordova:
//            PluginResult

public static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR CLASS_NOT_FOUND_EXCEPTION;
    public static final ERROR ERROR;
    public static final ERROR ILLEGAL_ACCESS_EXCEPTION;
    public static final ERROR INSTANTIATION_EXCEPTION;
    public static final ERROR INVALID_ACTION;
    public static final ERROR IO_EXCEPTION;
    public static final ERROR JSON_EXCEPTION;
    public static final ERROR MALFORMED_URL_EXCEPTION;
    public static final ERROR NO_RESULT;
    public static final ERROR OK;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/apache/cordova/PluginResult$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NO_RESULT = new <init>("NO_RESULT", 0);
        OK = new <init>("OK", 1);
        CLASS_NOT_FOUND_EXCEPTION = new <init>("CLASS_NOT_FOUND_EXCEPTION", 2);
        ILLEGAL_ACCESS_EXCEPTION = new <init>("ILLEGAL_ACCESS_EXCEPTION", 3);
        INSTANTIATION_EXCEPTION = new <init>("INSTANTIATION_EXCEPTION", 4);
        MALFORMED_URL_EXCEPTION = new <init>("MALFORMED_URL_EXCEPTION", 5);
        IO_EXCEPTION = new <init>("IO_EXCEPTION", 6);
        INVALID_ACTION = new <init>("INVALID_ACTION", 7);
        JSON_EXCEPTION = new <init>("JSON_EXCEPTION", 8);
        ERROR = new <init>("ERROR", 9);
        $VALUES = (new .VALUES[] {
            NO_RESULT, OK, CLASS_NOT_FOUND_EXCEPTION, ILLEGAL_ACCESS_EXCEPTION, INSTANTIATION_EXCEPTION, MALFORMED_URL_EXCEPTION, IO_EXCEPTION, INVALID_ACTION, JSON_EXCEPTION, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
