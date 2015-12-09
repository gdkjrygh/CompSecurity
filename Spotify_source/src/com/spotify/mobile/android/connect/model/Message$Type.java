// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.connect.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public final class mValue extends Enum
    implements JacksonModel
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN ADD_USER;
    public static final UNKNOWN ADD_USER_ERROR;
    public static final UNKNOWN ADD_USER_RESPONSE;
    public static final UNKNOWN GET_INFO;
    public static final UNKNOWN GET_INFO_RESPONSE;
    public static final UNKNOWN LOGGED_OUT;
    public static final UNKNOWN UNKNOWN;
    private final String mValue;

    public static mValue fromString(String s)
    {
        if (s != null)
        {
            mValue amvalue[] = values();
            int j = amvalue.length;
            for (int i = 0; i < j; i++)
            {
                mValue mvalue = amvalue[i];
                if (s.equalsIgnoreCase(mvalue.mValue))
                {
                    return mvalue;
                }
            }

        }
        return UNKNOWN;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/spotify/mobile/android/connect/model/Message$Type, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    public final String getValue()
    {
        return mValue;
    }

    static 
    {
        GET_INFO = new <init>("GET_INFO", 0, "getInfo");
        GET_INFO_RESPONSE = new <init>("GET_INFO_RESPONSE", 1, "getInfoResponse");
        ADD_USER = new <init>("ADD_USER", 2, "addUser");
        ADD_USER_RESPONSE = new <init>("ADD_USER_RESPONSE", 3, "addUserResponse");
        ADD_USER_ERROR = new <init>("ADD_USER_ERROR", 4, "addUserError");
        LOGGED_OUT = new <init>("LOGGED_OUT", 5, "loggedOut");
        UNKNOWN = new <init>("UNKNOWN", 6, "unknown");
        $VALUES = (new .VALUES[] {
            GET_INFO, GET_INFO_RESPONSE, ADD_USER, ADD_USER_RESPONSE, ADD_USER_ERROR, LOGGED_OUT, UNKNOWN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mValue = s1;
    }
}
