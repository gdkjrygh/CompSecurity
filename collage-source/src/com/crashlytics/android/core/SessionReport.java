// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.core:
//            Report, ReportUploader

class SessionReport
    implements Report
{

    private final Map customHeaders;
    private final File file;

    public SessionReport(File file1)
    {
        this(file1, Collections.emptyMap());
    }

    public SessionReport(File file1, Map map)
    {
        file = file1;
        customHeaders = new HashMap(map);
        if (file.length() == 0L)
        {
            customHeaders.putAll(ReportUploader.HEADER_INVALID_CLS_FILE);
        }
    }

    public Map getCustomHeaders()
    {
        return Collections.unmodifiableMap(customHeaders);
    }

    public File getFile()
    {
        return file;
    }

    public String getFileName()
    {
        return getFile().getName();
    }

    public String getIdentifier()
    {
        String s = getFileName();
        return s.substring(0, s.lastIndexOf('.'));
    }

    public boolean remove()
    {
        c.h().a("Fabric", (new StringBuilder()).append("Removing report at ").append(file.getPath()).toString());
        return file.delete();
    }
}
