// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crashlytics.android:
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

    public boolean a()
    {
        Fabric.g().a("Fabric", (new StringBuilder()).append("Removing report at ").append(a.getPath()).toString());
        return a.delete();
    }

    public String b()
    {
        return d().getName();
    }

    public String c()
    {
        String s = b();
        return s.substring(0, s.lastIndexOf('.'));
    }

    public File d()
    {
        return a;
    }

    public Map e()
    {
        return Collections.unmodifiableMap(b);
    }
}
