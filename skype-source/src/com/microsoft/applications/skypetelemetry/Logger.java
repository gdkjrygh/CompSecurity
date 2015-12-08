// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;


// Referenced classes of package com.microsoft.applications.skypetelemetry:
//            b, a, EventProperties

public class Logger
    implements b
{

    private static final String a = com/microsoft/applications/skypetelemetry/Logger.getSimpleName();
    private final long b;

    protected Logger(long l)
    {
        String.format("Creating logger nativeInstance with ptr: 0x%x", new Object[] {
            Long.valueOf(l)
        });
        b = l;
    }

    private native void logAppLifecycleNative(long l, int i, long l1);

    private native void logFailureInTelemetryNative(long l, String s, String s1, String s2, String s3, long l1);

    public final void a(a a1)
    {
        String.format("logAppLifeCycle|appState: %d|properties: %s", new Object[] {
            Integer.valueOf(a1.a()), null
        });
        logAppLifecycleNative(b, a1.a(), EventProperties.a());
    }

    public final void a(String s, String s1, String s2, String s3)
    {
        String.format("logFailureInTelemetry|signature: %s|detail: %s|category: %s|id: %s|properties: %s", new Object[] {
            s, s1, s2, s3, null
        });
        logFailureInTelemetryNative(b, s, s1, s2, s3, EventProperties.a());
    }

}
