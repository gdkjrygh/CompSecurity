// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;


public final class TelemetryErrorCode extends Enum
{

    public static final TelemetryErrorCode a;
    public static final TelemetryErrorCode b;
    public static final TelemetryErrorCode c;
    public static final TelemetryErrorCode d;
    public static final TelemetryErrorCode e;
    private static final TelemetryErrorCode h[];
    private String f;
    private int g;

    private TelemetryErrorCode(String s, int i, String s1, int j)
    {
        super(s, i);
        f = s1;
        g = j;
    }

    public static TelemetryErrorCode valueOf(String s)
    {
        return (TelemetryErrorCode)Enum.valueOf(com/skype/data/clienttelemetry/TelemetryErrorCode, s);
    }

    public static TelemetryErrorCode[] values()
    {
        return (TelemetryErrorCode[])h.clone();
    }

    public final void a(String s)
    {
        f = (new StringBuilder()).append(f).append(s).toString();
    }

    static 
    {
        a = new TelemetryErrorCode("TELEMETRY_ERROR_OK", 0, "Success", 0);
        b = new TelemetryErrorCode("TELEMETRY_ERROR_CREATE_HTTPSTACK_FAILED", 1, "Create httpstack failed, error reason: ", 1);
        c = new TelemetryErrorCode("TELEMETRY_ERROR_INIT_SCT_FAILED", 2, "Init SCT client failed", 2);
        d = new TelemetryErrorCode("TELEMETRY_ERROR_INIT_ECS_FAILED", 3, "Init ECS client failed", 3);
        e = new TelemetryErrorCode("TELEMETRY_ERROR_UNEXPECT_ERROR", 4, "Unexpect error : ", 4);
        h = (new TelemetryErrorCode[] {
            a, b, c, d, e
        });
    }
}
