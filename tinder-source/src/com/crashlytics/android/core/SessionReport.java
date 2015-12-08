// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.core:
//            Report, ReportUploader

class SessionReport
    implements Report
{

    private final File a;
    private final Map b;

    public SessionReport(File file)
    {
        this(file, Collections.emptyMap());
    }

    public SessionReport(File file, Map map)
    {
        a = file;
        b = new HashMap(map);
        if (a.length() == 0L)
        {
            b.putAll(ReportUploader.a);
        }
    }

    public final boolean a()
    {
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Removing report at ")).append(a.getPath()).toString());
        return a.delete();
    }

    public final String b()
    {
        return a.getName();
    }

    public final String c()
    {
        String s = a.getName();
        return s.substring(0, s.lastIndexOf('.'));
    }

    public final File d()
    {
        return a;
    }

    public final Map e()
    {
        return Collections.unmodifiableMap(b);
    }
}
