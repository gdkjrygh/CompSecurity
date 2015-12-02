// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge.upload;

import com.facebook.xconfig.core.XConfigReader;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.tools.dextr.bridge.upload:
//            UploadXConfig

public class UploadConfiguration
{

    private final long a;
    private final long b;
    private final long c;
    private final int d;
    private final long e;

    public UploadConfiguration(XConfigReader xconfigreader)
    {
        a = xconfigreader.a(UploadXConfig.d, 10000L);
        b = xconfigreader.a(UploadXConfig.e, 416L);
        c = xconfigreader.a(UploadXConfig.f, TimeUnit.HOURS.toSeconds(1L));
        d = xconfigreader.a(UploadXConfig.g, 1);
        e = xconfigreader.a(UploadXConfig.h, TimeUnit.MINUTES.toSeconds(1L));
    }

    public final long a()
    {
        return a;
    }

    public final long b()
    {
        return b;
    }

    public final long c()
    {
        return c;
    }
}
