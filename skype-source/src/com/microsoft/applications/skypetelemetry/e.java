// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;

import android.content.Context;
import java.io.File;

public class e
{

    private static final String i = com/microsoft/applications/skypetelemetry/e.getSimpleName();
    private static e j;
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;

    public e()
    {
        a = "";
        b = "";
        c = "";
        d = 0;
        e = 0;
        f = 0L;
        g = 0L;
        h = 0L;
    }

    public static e a(Context context)
    {
        com/microsoft/applications/skypetelemetry/e;
        JVM INSTR monitorenter ;
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        throw new IllegalArgumentException("Cannot pass in a null context when initializing the default configuration");
        context;
        com/microsoft/applications/skypetelemetry/e;
        JVM INSTR monitorexit ;
        throw context;
        e e1 = new e();
        j = e1;
        e1.a = "https://pipe.skype.com/Collector/3.0/";
        j.b = "https://pipe.skype.com/Collector/3.0/";
        j.c = (new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/offlinestorage.db").toString();
        j.d = 0x300000;
        j.e = 0x300000;
        j.f = 0L;
        j.g = 0L;
        j.h = 0L;
        (new StringBuilder("Creating default config: ")).append(j.toString());
        context = j;
        com/microsoft/applications/skypetelemetry/e;
        JVM INSTR monitorexit ;
        return context;
    }

    public String toString()
    {
        return String.format("{eventUri: %s|blobUri: %s|cacheFilePath: %s|cacheSizeFileLimit: %s|cacheSizeMemoryLimit: %s|httpStack: 0x%d|palFactory: 0x%d|configProvider: 0x%d }", new Object[] {
            a, b, c, Integer.valueOf(d), Integer.valueOf(e), Long.valueOf(f), Long.valueOf(g), Long.valueOf(h)
        });
    }

}
