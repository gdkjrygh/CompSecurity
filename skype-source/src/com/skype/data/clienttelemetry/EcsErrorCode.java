// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;


public final class EcsErrorCode extends Enum
{

    public static final EcsErrorCode a;
    public static final EcsErrorCode b;
    public static final EcsErrorCode c;
    public static final EcsErrorCode d;
    public static final EcsErrorCode e;
    public static final EcsErrorCode f;
    public static final EcsErrorCode g;
    public static final EcsErrorCode h;
    public static final EcsErrorCode i;
    public static final EcsErrorCode j;
    public static final EcsErrorCode k;
    public static final EcsErrorCode l;
    public static final EcsErrorCode m;
    public static final EcsErrorCode n;
    private static final EcsErrorCode q[];
    private String o;
    private int p;

    private EcsErrorCode(String s, int i1, String s1, int j1)
    {
        super(s, i1);
        o = s1;
        p = j1;
    }

    public static EcsErrorCode valueOf(String s)
    {
        return (EcsErrorCode)Enum.valueOf(com/skype/data/clienttelemetry/EcsErrorCode, s);
    }

    public static EcsErrorCode[] values()
    {
        return (EcsErrorCode[])q.clone();
    }

    static 
    {
        a = new EcsErrorCode("ECS_ERROR_OK", 0, "Success", 0);
        b = new EcsErrorCode("ECS_ERROR_INVALID_STATUS", 1, "Invalid status in EcsClient(initialize, start, stop)", 1);
        c = new EcsErrorCode("ECS_ERROR_INVALID_PROVIDER", 2, "Not used", 2);
        d = new EcsErrorCode("ECS_ERROR_INIT_HTTPSTACK_FAILED", 3, "Create http stack failed", 3);
        e = new EcsErrorCode("ECS_ERROR_OUT_OF_MEMORY", 4, "Not used", 4);
        f = new EcsErrorCode("ECS_ERROR_THREAD_FAILED", 5, "Not used", 5);
        g = new EcsErrorCode("ECS_ERROR_INVALID_RESPONSE", 6, "Not used", 6);
        h = new EcsErrorCode("ECS_ERROR_INVALID_TOKEN", 7, "Not used", 7);
        i = new EcsErrorCode("ECS_ERROR_INVALID_CONFIG", 8, "Config version is incorrect or UI_VERSION is empty", 8);
        j = new EcsErrorCode("ECS_ERROR_INVALID_DEPENDENCIES", 9, "dependency version is incorrect", 9);
        k = new EcsErrorCode("ECS_ERROR_INVALID_PARAMETER", 10, "Not used", 10);
        l = new EcsErrorCode("ECS_ERROR_UNKNOWN_FAILED", 11, "Not used", 11);
        m = new EcsErrorCode("ECS_UNEXPECT_ERROR", 12, "Fatal error", 12);
        n = new EcsErrorCode("ECS_ERROR_LOAD_OFFLINESTORAGE_FAILED", 13, "Load config from local storage failed", 13);
        q = (new EcsErrorCode[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n
        });
    }
}
