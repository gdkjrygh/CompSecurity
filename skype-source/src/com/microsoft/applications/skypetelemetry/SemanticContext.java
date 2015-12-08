// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;

import android.util.Log;

// Referenced classes of package com.microsoft.applications.skypetelemetry:
//            c

public class SemanticContext
    implements c
{

    private static final String a = com/microsoft/applications/skypetelemetry/SemanticContext.getSimpleName();
    private final long b;

    protected SemanticContext(long l)
    {
        if (l == 0L)
        {
            Log.wtf(a, "Cannot instantiate a null SemanticContext");
            throw new IllegalArgumentException("Cannot instantiate a null SemanticContext");
        } else
        {
            b = l;
            return;
        }
    }

    private native void setOsBuildNative(long l, String s);

    private native void setUserTimeZoneNative(long l, String s);

    protected final void a(String s)
    {
        String.format("setOsBuild|deviceModel: %s", new Object[] {
            s
        });
        setOsBuildNative(b, s);
    }

    public final void b(String s)
    {
        String.format("setUserTimeZone|timeZone: %s", new Object[] {
            s
        });
        setUserTimeZoneNative(b, s);
    }

}
