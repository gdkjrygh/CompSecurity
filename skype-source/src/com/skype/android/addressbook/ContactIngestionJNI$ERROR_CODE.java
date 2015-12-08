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
    public static final value ABORTED;
    public static final value BUSY;
    public static final value DATABASE_ERROR;
    public static final value INTERNAL_ERROR;
    public static final value INVALID_ARG;
    public static final value INVALID_CONFIGURATION;
    public static final value INVALID_CONFIG_ITEM;
    public static final value IN_PROGRESS;
    public static final value LOOKUP_BAD_AUTH;
    public static final value LOOKUP_CLIENT_ERROR;
    public static final value LOOKUP_DATA_ERROR;
    public static final value LOOKUP_NETWORK_FAILURE;
    public static final value LOOKUP_NOT_RECOMMENDED;
    public static final value LOOKUP_QUERY_LIMIT;
    public static final value LOOKUP_SERVER_ERROR;
    public static final value NOT_FOUND;
    public static final value OK;
    private static final SparseArray intToTypeMap;
    private final String message;
    private final int value;

    public static message fromInt(int i)
    {
        return (message)intToTypeMap.get(Integer.valueOf(i).intValue());
    }

    public static intToTypeMap valueOf(String s)
    {
        return (intToTypeMap)Enum.valueOf(com/skype/android/addressbook/ContactIngestionJNI$ERROR_CODE, s);
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
        OK = new <init>("OK", 0, 0, "No error has occurred.");
        INTERNAL_ERROR = new <init>("INTERNAL_ERROR", 1, -1, "Unspecified internal error.");
        INVALID_ARG = new <init>("INVALID_ARG", 2, -2, "Invalid argument passed to a function.");
        INVALID_CONFIG_ITEM = new <init>("INVALID_CONFIG_ITEM", 3, -3, "Using an invalid/unknown config item.");
        INVALID_CONFIGURATION = new <init>("INVALID_CONFIGURATION", 4, -4, "The library was not configured properly.");
        DATABASE_ERROR = new <init>("DATABASE_ERROR", 5, -10, "Error during database query. The database file is probably corrupted and needs to be deleted externally.");
        NOT_FOUND = new <init>("NOT_FOUND", 6, -11, "No such contact has been found.");
        BUSY = new <init>("BUSY", 7, -20, "The operation has not been started because another such operation is already running.");
        IN_PROGRESS = new <init>("IN_PROGRESS", 8, -21, "The operation has been successfully started and will be finished asynchronously.");
        ABORTED = new <init>("ABORTED", 9, -22, "The lookup has been aborted.");
        LOOKUP_NETWORK_FAILURE = new <init>("LOOKUP_NETWORK_FAILURE", 10, -30, "A stable network connection could not be established to the lookup service.");
        LOOKUP_DATA_ERROR = new <init>("LOOKUP_DATA_ERROR", 11, -31, "An error occurred during remote lookup, the server response could not be parsed properly.");
        LOOKUP_SERVER_ERROR = new <init>("LOOKUP_SERVER_ERROR", 12, -32, "An error occurred during remote lookup, the server reported an error status.");
        LOOKUP_CLIENT_ERROR = new <init>("LOOKUP_CLIENT_ERROR", 13, -33, " An error occurred during remote lookup, the server said the library sent some data wrongly formatted, invalid, etc.");
        LOOKUP_BAD_AUTH = new <init>("LOOKUP_BAD_AUTH", 14, -34, "There was an authentication error.  Make sure CFG_AuthCookie is set to a valid and recent authentication cookie.");
        LOOKUP_QUERY_LIMIT = new <init>("LOOKUP_QUERY_LIMIT", 15, -35, "Query limit reached.");
        LOOKUP_NOT_RECOMMENDED = new <init>("LOOKUP_NOT_RECOMMENDED", 16, -81, "Native address book update processed correctly with no changes requiring lookup");
        $VALUES = (new .VALUES[] {
            OK, INTERNAL_ERROR, INVALID_ARG, INVALID_CONFIG_ITEM, INVALID_CONFIGURATION, DATABASE_ERROR, NOT_FOUND, BUSY, IN_PROGRESS, ABORTED, 
            LOOKUP_NETWORK_FAILURE, LOOKUP_DATA_ERROR, LOOKUP_SERVER_ERROR, LOOKUP_CLIENT_ERROR, LOOKUP_BAD_AUTH, LOOKUP_QUERY_LIMIT, LOOKUP_NOT_RECOMMENDED
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
