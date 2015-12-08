// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;


public final class ResponseHeader extends Enum
{

    public static final ResponseHeader ACCEPT_LANGUAGE;
    public static final ResponseHeader AD_TIMEOUT;
    public static final ResponseHeader AD_TYPE;
    public static final ResponseHeader CLICK_TRACKING_URL;
    public static final ResponseHeader CUSTOM_EVENT_DATA;
    public static final ResponseHeader CUSTOM_EVENT_HTML_DATA;
    public static final ResponseHeader CUSTOM_EVENT_NAME;
    public static final ResponseHeader CUSTOM_SELECTOR;
    public static final ResponseHeader DSP_CREATIVE_ID;
    public static final ResponseHeader FAIL_URL;
    public static final ResponseHeader FULL_AD_TYPE;
    public static final ResponseHeader HEIGHT;
    public static final ResponseHeader IMPRESSION_URL;
    public static final ResponseHeader LOCATION;
    public static final ResponseHeader NATIVE_PARAMS;
    public static final ResponseHeader NETWORK_TYPE;
    public static final ResponseHeader ORIENTATION;
    public static final ResponseHeader REDIRECT_URL;
    public static final ResponseHeader REFRESH_TIME;
    public static final ResponseHeader SCROLLABLE;
    public static final ResponseHeader USER_AGENT;
    public static final ResponseHeader WARMUP;
    public static final ResponseHeader WIDTH;
    private static final ResponseHeader b[];
    private final String a;

    private ResponseHeader(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static ResponseHeader valueOf(String s)
    {
        return (ResponseHeader)Enum.valueOf(com/mopub/common/util/ResponseHeader, s);
    }

    public static ResponseHeader[] values()
    {
        return (ResponseHeader[])b.clone();
    }

    public final String getKey()
    {
        return a;
    }

    static 
    {
        AD_TIMEOUT = new ResponseHeader("AD_TIMEOUT", 0, "X-AdTimeout");
        AD_TYPE = new ResponseHeader("AD_TYPE", 1, "X-Adtype");
        CLICK_TRACKING_URL = new ResponseHeader("CLICK_TRACKING_URL", 2, "X-Clickthrough");
        CUSTOM_EVENT_DATA = new ResponseHeader("CUSTOM_EVENT_DATA", 3, "X-Custom-Event-Class-Data");
        CUSTOM_EVENT_NAME = new ResponseHeader("CUSTOM_EVENT_NAME", 4, "X-Custom-Event-Class-Name");
        CUSTOM_EVENT_HTML_DATA = new ResponseHeader("CUSTOM_EVENT_HTML_DATA", 5, "X-Custom-Event-Html-Data");
        DSP_CREATIVE_ID = new ResponseHeader("DSP_CREATIVE_ID", 6, "X-DspCreativeid");
        FAIL_URL = new ResponseHeader("FAIL_URL", 7, "X-Failurl");
        FULL_AD_TYPE = new ResponseHeader("FULL_AD_TYPE", 8, "X-Fulladtype");
        HEIGHT = new ResponseHeader("HEIGHT", 9, "X-Height");
        IMPRESSION_URL = new ResponseHeader("IMPRESSION_URL", 10, "X-Imptracker");
        REDIRECT_URL = new ResponseHeader("REDIRECT_URL", 11, "X-Launchpage");
        NATIVE_PARAMS = new ResponseHeader("NATIVE_PARAMS", 12, "X-Nativeparams");
        NETWORK_TYPE = new ResponseHeader("NETWORK_TYPE", 13, "X-Networktype");
        ORIENTATION = new ResponseHeader("ORIENTATION", 14, "X-Orientation");
        REFRESH_TIME = new ResponseHeader("REFRESH_TIME", 15, "X-Refreshtime");
        SCROLLABLE = new ResponseHeader("SCROLLABLE", 16, "X-Scrollable");
        WARMUP = new ResponseHeader("WARMUP", 17, "X-Warmup");
        WIDTH = new ResponseHeader("WIDTH", 18, "X-Width");
        LOCATION = new ResponseHeader("LOCATION", 19, "Location");
        USER_AGENT = new ResponseHeader("USER_AGENT", 20, "User-Agent");
        ACCEPT_LANGUAGE = new ResponseHeader("ACCEPT_LANGUAGE", 21, "Accept-Language");
        CUSTOM_SELECTOR = new ResponseHeader("CUSTOM_SELECTOR", 22, "X-Customselector");
        b = (new ResponseHeader[] {
            AD_TIMEOUT, AD_TYPE, CLICK_TRACKING_URL, CUSTOM_EVENT_DATA, CUSTOM_EVENT_NAME, CUSTOM_EVENT_HTML_DATA, DSP_CREATIVE_ID, FAIL_URL, FULL_AD_TYPE, HEIGHT, 
            IMPRESSION_URL, REDIRECT_URL, NATIVE_PARAMS, NETWORK_TYPE, ORIENTATION, REFRESH_TIME, SCROLLABLE, WARMUP, WIDTH, LOCATION, 
            USER_AGENT, ACCEPT_LANGUAGE, CUSTOM_SELECTOR
        });
    }
}
