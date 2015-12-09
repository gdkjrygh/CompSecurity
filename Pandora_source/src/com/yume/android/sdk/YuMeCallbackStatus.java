// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeCallbackStatus extends Enum
{

    public static final YuMeCallbackStatus ERROR;
    public static final YuMeCallbackStatus NONE;
    public static final YuMeCallbackStatus NOT_IMPLEMENTED;
    public static final YuMeCallbackStatus OK;
    private static final YuMeCallbackStatus a[];

    private YuMeCallbackStatus(String s, int i)
    {
        super(s, i);
    }

    public static YuMeCallbackStatus valueOf(String s)
    {
        return (YuMeCallbackStatus)Enum.valueOf(com/yume/android/sdk/YuMeCallbackStatus, s);
    }

    public static YuMeCallbackStatus[] values()
    {
        YuMeCallbackStatus ayumecallbackstatus[] = a;
        int i = ayumecallbackstatus.length;
        YuMeCallbackStatus ayumecallbackstatus1[] = new YuMeCallbackStatus[i];
        System.arraycopy(ayumecallbackstatus, 0, ayumecallbackstatus1, 0, i);
        return ayumecallbackstatus1;
    }

    static 
    {
        NONE = new YuMeCallbackStatus("NONE", 0);
        OK = new YuMeCallbackStatus("OK", 1);
        ERROR = new YuMeCallbackStatus("ERROR", 2);
        NOT_IMPLEMENTED = new YuMeCallbackStatus("NOT_IMPLEMENTED", 3);
        a = (new YuMeCallbackStatus[] {
            NONE, OK, ERROR, NOT_IMPLEMENTED
        });
    }
}
