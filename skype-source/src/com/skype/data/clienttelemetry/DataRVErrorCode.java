// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;


public final class DataRVErrorCode extends Enum
{

    public static final DataRVErrorCode a;
    public static final DataRVErrorCode b;
    public static final DataRVErrorCode c;
    public static final DataRVErrorCode d;
    public static final DataRVErrorCode e;
    public static final DataRVErrorCode f;
    public static final DataRVErrorCode g;
    public static final DataRVErrorCode h;
    public static final DataRVErrorCode i;
    public static final DataRVErrorCode j;
    public static final DataRVErrorCode k;
    public static final DataRVErrorCode l;
    public static final DataRVErrorCode m;
    public static final DataRVErrorCode n;
    public static final DataRVErrorCode o;
    public static final DataRVErrorCode p;
    public static final DataRVErrorCode q;
    public static final DataRVErrorCode r;
    public static final DataRVErrorCode s;
    public static final DataRVErrorCode t;
    public static final DataRVErrorCode u;
    private static final DataRVErrorCode x[];
    private String v;
    private int w;

    private DataRVErrorCode(String s1, int i1, String s2, int j1)
    {
        super(s1, i1);
        v = s2;
        w = j1;
    }

    public static DataRVErrorCode valueOf(String s1)
    {
        return (DataRVErrorCode)Enum.valueOf(com/skype/data/clienttelemetry/DataRVErrorCode, s1);
    }

    public static DataRVErrorCode[] values()
    {
        return (DataRVErrorCode[])x.clone();
    }

    static 
    {
        a = new DataRVErrorCode("DATARV_ERROR_OK", 0, "Success", 0);
        b = new DataRVErrorCode("DATARV_ERROR_NOT_IMPLEMENTED", 1, "Not used", 1);
        c = new DataRVErrorCode("DATARV_ERROR_INVALID_EVENT", 2, "The event is invalid, perhaps there are some fields in event lost.", 2);
        d = new DataRVErrorCode("DATARV_ERROR_INVALID_CONFIG", 3, "Perhaps UI version is empty or version in config is empty.", 3);
        e = new DataRVErrorCode("DATARV_ERROR_INVALID_DEPENDENCIES", 4, "Perhaps the version in dependency is incorrect", 4);
        f = new DataRVErrorCode("DATARV_ERROR_INVALID_HTTPSTACK", 5, "Create HttpStack failed.", 5);
        g = new DataRVErrorCode("DATARV_ERROR_INVALID_ARG", 6, "", 6);
        h = new DataRVErrorCode("DATARV_ERROR_EVENT_QUEUE_EMPTY", 7, "Not used", 7);
        i = new DataRVErrorCode("DATARV_ERROR_OUTOFMEMORY", 8, "Insufficient memory", 8);
        j = new DataRVErrorCode("DATARV_ERROR_START_THREAD_FAILED", 9, "Not used", 9);
        k = new DataRVErrorCode("DATARV_ERROR_CREATE_TIMER_FAILED", 10, "Create Timer Failed", 10);
        l = new DataRVErrorCode("DATARV_ERROR_INVALID_STATUS", 11, "Invalid status in TelemetryClient", 11);
        m = new DataRVErrorCode("DATARV_ERROR_INVALID_EVENT_VERSION", 12, "Non-supported event version", 12);
        n = new DataRVErrorCode("DATARV_ERROR_DISABLED", 13, "clienttelemetry is disabled", 13);
        o = new DataRVErrorCode("DATARV_ERROR_INIT_OFFLINESTORAGE_FAILED", 14, "Init IOfflineStorage failed", 14);
        p = new DataRVErrorCode("DATARV_ERROR_START_OFFLINESTORAGE_FAILED", 15, "Start offline storage failed", 15);
        q = new DataRVErrorCode("DATARV_ERROR_SMALL_OFFLINESTORAGE_SIZE", 16, "Offline storage size too small", 16);
        r = new DataRVErrorCode("DATARV_ERROR_EVENT_BANNED", 17, "The events are banned and not allowed to be sent just now.", 17);
        s = new DataRVErrorCode("DATARV_UNEXPECT_ERROR", 18, "Fatal error", 18);
        t = new DataRVErrorCode("DATARV_ERROR_QUEUE_UPLOAD_REQUEST_FAILED", 19, "The upload request fail to be put into queue", 19);
        u = new DataRVErrorCode("DATARV_ERROR_START_UPLOADSERVICE_FAILED", 20, "Start blob upload service failed", 20);
        x = (new DataRVErrorCode[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u
        });
    }
}
