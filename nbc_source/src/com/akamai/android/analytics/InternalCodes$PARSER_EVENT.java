// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            InternalCodes

public static final class  extends Enum
{

    public static final DEBUG DEBUG;
    private static final DEBUG ENUM$VALUES[];
    public static final DEBUG GENERAL_PARSING_ERROR;
    public static final DEBUG LOG_LINE_METRICS_NOT_DEFINED;
    public static final DEBUG MALFORMED_URL_EXCEPTION;
    public static final DEBUG NO_BEACON_ID;
    public static final DEBUG NO_HOST_DATA;
    public static final DEBUG NO_STAT_DATA;
    public static final DEBUG PARSER_CONFIG_EXCEPTION;
    public static final DEBUG SAX_EXCEPTION;
    public static final DEBUG XML_LOADED;
    public static final DEBUG XML_NOT_LOADED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/akamai/android/analytics/InternalCodes$PARSER_EVENT, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        XML_LOADED = new <init>("XML_LOADED", 0);
        XML_NOT_LOADED = new <init>("XML_NOT_LOADED", 1);
        PARSER_CONFIG_EXCEPTION = new <init>("PARSER_CONFIG_EXCEPTION", 2);
        MALFORMED_URL_EXCEPTION = new <init>("MALFORMED_URL_EXCEPTION", 3);
        SAX_EXCEPTION = new <init>("SAX_EXCEPTION", 4);
        GENERAL_PARSING_ERROR = new <init>("GENERAL_PARSING_ERROR", 5);
        NO_BEACON_ID = new <init>("NO_BEACON_ID", 6);
        NO_HOST_DATA = new <init>("NO_HOST_DATA", 7);
        NO_STAT_DATA = new <init>("NO_STAT_DATA", 8);
        LOG_LINE_METRICS_NOT_DEFINED = new <init>("LOG_LINE_METRICS_NOT_DEFINED", 9);
        DEBUG = new <init>("DEBUG", 10);
        ENUM$VALUES = (new ENUM.VALUES[] {
            XML_LOADED, XML_NOT_LOADED, PARSER_CONFIG_EXCEPTION, MALFORMED_URL_EXCEPTION, SAX_EXCEPTION, GENERAL_PARSING_ERROR, NO_BEACON_ID, NO_HOST_DATA, NO_STAT_DATA, LOG_LINE_METRICS_NOT_DEFINED, 
            DEBUG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
