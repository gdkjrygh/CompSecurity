// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge.upload;

import com.facebook.inject.InjectorLike;
import com.facebook.xconfig.core.XConfig;
import com.facebook.xconfig.core.XConfigName;
import com.facebook.xconfig.core.XConfigSetting;
import com.google.common.collect.ImmutableSet;

public class UploadXConfig extends XConfig
{

    public static final XConfigName c;
    public static final XConfigSetting d;
    public static final XConfigSetting e;
    public static final XConfigSetting f;
    public static final XConfigSetting g;
    public static final XConfigSetting h;
    private static final ImmutableSet i;

    public UploadXConfig()
    {
        super(c, i);
    }

    private static UploadXConfig a()
    {
        return new UploadXConfig();
    }

    public static UploadXConfig a(InjectorLike injectorlike)
    {
        return a();
    }

    static 
    {
        c = new XConfigName("dextr_upload_config");
        d = new XConfigSetting(c, "bytes_upper_limit");
        e = new XConfigSetting(c, "bytes_per_update");
        f = new XConfigSetting(c, "seconds_between_updates");
        g = new XConfigSetting(c, "num_retained_traces");
        h = new XConfigSetting(c, "max_scheduled_traces_age_sec");
        i = ImmutableSet.of(d, e, f, g, h);
    }
}
