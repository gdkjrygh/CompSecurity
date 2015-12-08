// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class DataRVErrorCode extends Enum
{

    private static final DataRVErrorCode $VALUES[];
    public static final DataRVErrorCode DATARV_ERROR_CREATE_TIMER_FAILED;
    public static final DataRVErrorCode DATARV_ERROR_DATA_SERIALIZATION_FAILED;
    public static final DataRVErrorCode DATARV_ERROR_DISABLED;
    public static final DataRVErrorCode DATARV_ERROR_EVENT_BANNED;
    public static final DataRVErrorCode DATARV_ERROR_FAIL;
    public static final DataRVErrorCode DATARV_ERROR_FILE_DATA_TOOLARGE;
    public static final DataRVErrorCode DATARV_ERROR_FILE_DOESNOTEXIST;
    public static final DataRVErrorCode DATARV_ERROR_FILE_EMPTY;
    public static final DataRVErrorCode DATARV_ERROR_FILE_NOMOREITEMS;
    public static final DataRVErrorCode DATARV_ERROR_FILE_NOTOPEN;
    public static final DataRVErrorCode DATARV_ERROR_INIT_OFFLINESTORAGE_FAILED;
    public static final DataRVErrorCode DATARV_ERROR_INVALID_ARG;
    public static final DataRVErrorCode DATARV_ERROR_INVALID_CONFIG;
    public static final DataRVErrorCode DATARV_ERROR_INVALID_DEPENDENCIES;
    public static final DataRVErrorCode DATARV_ERROR_INVALID_EVENT;
    public static final DataRVErrorCode DATARV_ERROR_INVALID_EVENT_VERSION;
    public static final DataRVErrorCode DATARV_ERROR_INVALID_HTTPSTACK;
    public static final DataRVErrorCode DATARV_ERROR_INVALID_STATUS;
    public static final DataRVErrorCode DATARV_ERROR_NOT_IMPLEMENTED;
    public static final DataRVErrorCode DATARV_ERROR_OK;
    public static final DataRVErrorCode DATARV_ERROR_OUTOFMEMORY;
    public static final DataRVErrorCode DATARV_ERROR_SMALL_OFFLINESTORAGE_SIZE;
    public static final DataRVErrorCode DATARV_ERROR_START_OFFLINESTORAGE_FAILED;
    public static final DataRVErrorCode DATARV_ERROR_UNEXPECTED;
    private String errorCodeStr;
    private int errorCodeValue;

    private DataRVErrorCode(String s, int i, String s1, int j)
    {
        super(s, i);
        errorCodeStr = s1;
        errorCodeValue = j;
    }

    public static DataRVErrorCode valueOf(String s)
    {
        return (DataRVErrorCode)Enum.valueOf(com/microsoft/applications/telemetry/DataRVErrorCode, s);
    }

    public static DataRVErrorCode[] values()
    {
        return (DataRVErrorCode[])$VALUES.clone();
    }

    public final String getErrorCodeStr()
    {
        return errorCodeStr;
    }

    public final String getErrorCodeStr(int i)
    {
        DataRVErrorCode adatarverrorcode[] = values();
        int k = adatarverrorcode.length;
        for (int j = 0; j < k; j++)
        {
            DataRVErrorCode datarverrorcode = adatarverrorcode[j];
            if (datarverrorcode.errorCodeValue == i)
            {
                return datarverrorcode.errorCodeStr;
            }
        }

        return null;
    }

    public final int getErrorCodeValue()
    {
        return errorCodeValue;
    }

    static 
    {
        DATARV_ERROR_OK = new DataRVErrorCode("DATARV_ERROR_OK", 0, "Success", 0);
        DATARV_ERROR_FAIL = new DataRVErrorCode("DATARV_ERROR_FAIL", 1, "Failure", 1);
        DATARV_ERROR_NOT_IMPLEMENTED = new DataRVErrorCode("DATARV_ERROR_NOT_IMPLEMENTED", 2, "Not used", 2);
        DATARV_ERROR_INVALID_ARG = new DataRVErrorCode("DATARV_ERROR_INVALID_ARG", 3, "", 3);
        DATARV_ERROR_INVALID_CONFIG = new DataRVErrorCode("DATARV_ERROR_INVALID_CONFIG", 4, "Perhaps UI version is empty or version in config is empty.", 4);
        DATARV_ERROR_INVALID_DEPENDENCIES = new DataRVErrorCode("DATARV_ERROR_INVALID_DEPENDENCIES", 5, "Perhaps the version in dependency is incorrect", 5);
        DATARV_ERROR_INVALID_HTTPSTACK = new DataRVErrorCode("DATARV_ERROR_INVALID_HTTPSTACK", 6, "Create HttpStack failed.", 6);
        DATARV_ERROR_INVALID_STATUS = new DataRVErrorCode("DATARV_ERROR_INVALID_STATUS", 7, "Invalid status in TelemetryClient", 7);
        DATARV_ERROR_INVALID_EVENT = new DataRVErrorCode("DATARV_ERROR_INVALID_EVENT", 8, "The event is invalid, perhaps there are some fields in event lost.", 8);
        DATARV_ERROR_INVALID_EVENT_VERSION = new DataRVErrorCode("DATARV_ERROR_INVALID_EVENT_VERSION", 9, "Non-supported event version", 9);
        DATARV_ERROR_DISABLED = new DataRVErrorCode("DATARV_ERROR_DISABLED", 10, "clienttelemetry is disabled", 10);
        DATARV_ERROR_OUTOFMEMORY = new DataRVErrorCode("DATARV_ERROR_OUTOFMEMORY", 11, "Insufficient memory", 11);
        DATARV_ERROR_UNEXPECTED = new DataRVErrorCode("DATARV_ERROR_UNEXPECTED", 12, "Fatal error", 12);
        DATARV_ERROR_EVENT_BANNED = new DataRVErrorCode("DATARV_ERROR_EVENT_BANNED", 13, "The events are banned and not allowed to be sent just now.", 13);
        DATARV_ERROR_CREATE_TIMER_FAILED = new DataRVErrorCode("DATARV_ERROR_CREATE_TIMER_FAILED", 14, "Create Timer Failed", 14);
        DATARV_ERROR_INIT_OFFLINESTORAGE_FAILED = new DataRVErrorCode("DATARV_ERROR_INIT_OFFLINESTORAGE_FAILED", 15, "Init IOfflineStorage failed", 15);
        DATARV_ERROR_START_OFFLINESTORAGE_FAILED = new DataRVErrorCode("DATARV_ERROR_START_OFFLINESTORAGE_FAILED", 16, "Start offline storage failed", 16);
        DATARV_ERROR_SMALL_OFFLINESTORAGE_SIZE = new DataRVErrorCode("DATARV_ERROR_SMALL_OFFLINESTORAGE_SIZE", 17, "Offline storage size too small", 17);
        DATARV_ERROR_FILE_DATA_TOOLARGE = new DataRVErrorCode("DATARV_ERROR_FILE_DATA_TOOLARGE", 18, "Data too large", 18);
        DATARV_ERROR_FILE_NOTOPEN = new DataRVErrorCode("DATARV_ERROR_FILE_NOTOPEN", 19, "File not open", 19);
        DATARV_ERROR_FILE_DOESNOTEXIST = new DataRVErrorCode("DATARV_ERROR_FILE_DOESNOTEXIST", 20, "File does not exist", 20);
        DATARV_ERROR_FILE_EMPTY = new DataRVErrorCode("DATARV_ERROR_FILE_EMPTY", 21, "File empty", 21);
        DATARV_ERROR_FILE_NOMOREITEMS = new DataRVErrorCode("DATARV_ERROR_FILE_NOMOREITEMS", 22, "No more items", 22);
        DATARV_ERROR_DATA_SERIALIZATION_FAILED = new DataRVErrorCode("DATARV_ERROR_DATA_SERIALIZATION_FAILED", 23, "Data serialization failed", 23);
        $VALUES = (new DataRVErrorCode[] {
            DATARV_ERROR_OK, DATARV_ERROR_FAIL, DATARV_ERROR_NOT_IMPLEMENTED, DATARV_ERROR_INVALID_ARG, DATARV_ERROR_INVALID_CONFIG, DATARV_ERROR_INVALID_DEPENDENCIES, DATARV_ERROR_INVALID_HTTPSTACK, DATARV_ERROR_INVALID_STATUS, DATARV_ERROR_INVALID_EVENT, DATARV_ERROR_INVALID_EVENT_VERSION, 
            DATARV_ERROR_DISABLED, DATARV_ERROR_OUTOFMEMORY, DATARV_ERROR_UNEXPECTED, DATARV_ERROR_EVENT_BANNED, DATARV_ERROR_CREATE_TIMER_FAILED, DATARV_ERROR_INIT_OFFLINESTORAGE_FAILED, DATARV_ERROR_START_OFFLINESTORAGE_FAILED, DATARV_ERROR_SMALL_OFFLINESTORAGE_SIZE, DATARV_ERROR_FILE_DATA_TOOLARGE, DATARV_ERROR_FILE_NOTOPEN, 
            DATARV_ERROR_FILE_DOESNOTEXIST, DATARV_ERROR_FILE_EMPTY, DATARV_ERROR_FILE_NOMOREITEMS, DATARV_ERROR_DATA_SERIALIZATION_FAILED
        });
    }
}
