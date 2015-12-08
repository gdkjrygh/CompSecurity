// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;


public class EventProperties
{

    private static final String a = com/microsoft/applications/skypetelemetry/EventProperties.getSimpleName();
    private final long b;

    protected static long a()
    {
        return 0L;
    }

    private native void destroyNative(long l);

    public void finalize()
        throws Throwable
    {
        String.format("destroyNative: 0x%x", new Object[] {
            Long.valueOf(b)
        });
        destroyNative(b);
        super.finalize();
    }

    public String toString()
    {
        return String.format("0x%x", new Object[] {
            Long.valueOf(b)
        });
    }

}
