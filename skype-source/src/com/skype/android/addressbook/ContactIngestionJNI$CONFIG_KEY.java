// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.addressbook;

import android.util.SparseArray;

// Referenced classes of package com.skype.android.addressbook:
//            ContactIngestionJNI

public static final class message extends Enum
{

    private static final value $VALUES[];
    public static final value ACCOUNT_NAME;
    public static final value COUNTRY_PREFIX;
    public static final value DATABASE_PATH;
    public static final value DATABASE_TMP;
    public static final value HTTP_STACK;
    public static final value INVALID;
    public static final value SERVICE_APP_ID;
    public static final value SERVICE_BASE_URL;
    private static final SparseArray intToTypeMap;
    private final String message;
    private final int value;

    public static message fromInt(int i)
    {
        return (message)intToTypeMap.get(Integer.valueOf(i).intValue());
    }

    public static intToTypeMap valueOf(String s)
    {
        return (intToTypeMap)Enum.valueOf(com/skype/android/addressbook/ContactIngestionJNI$CONFIG_KEY, s);
    }

    public static intToTypeMap[] values()
    {
        return (intToTypeMap[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    public final String toString()
    {
        return message;
    }

    static 
    {
        INVALID = new <init>("INVALID", 0, 0, "Invalid value.  Do not use.");
        DATABASE_PATH = new <init>("DATABASE_PATH", 1, 1, "Path to local storage file.  Optional.  Defaults to ./ingestion.db.");
        DATABASE_TMP = new <init>("DATABASE_TMP", 2, 7, "Path to DBMS temp storage.  Optional.  Defaults to /var/tmp.");
        COUNTRY_PREFIX = new <init>("COUNTRY_PREFIX", 3, 2, "Local country prefix to use when normalizing phone numbers.  Optional.");
        HTTP_STACK = new <init>("HTTP_STACK", 4, 3, "Pointer to IHttpStack interface to use for HTTP requests.  Optional.  Library provides default.");
        ACCOUNT_NAME = new <init>("ACCOUNT_NAME", 5, 4, "Skype ID of the logged-in user on whose behalf the library runs.  Required for lookups.");
        SERVICE_BASE_URL = new <init>("SERVICE_BASE_URL", 6, 5, "Base URL for requests to the external lookup service.  Optional.");
        SERVICE_APP_ID = new <init>("SERVICE_APP_ID", 7, 6, "App ID of the parent application as assigned by ABCH team. Required for lookups.");
        $VALUES = (new .VALUES[] {
            INVALID, DATABASE_PATH, DATABASE_TMP, COUNTRY_PREFIX, HTTP_STACK, ACCOUNT_NAME, SERVICE_BASE_URL, SERVICE_APP_ID
        });
        intToTypeMap = new SparseArray();
        message amessage[] = values();
        int j = amessage.length;
        for (int i = 0; i < j; i++)
        {
            message message1 = amessage[i];
            intToTypeMap.put(message1.value, message1);
        }

    }

    private (String s, int i, int j, String s1)
    {
        super(s, i);
        value = j;
        message = s1;
    }
}
