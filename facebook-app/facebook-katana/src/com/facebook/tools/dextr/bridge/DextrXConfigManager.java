// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge;

import com.facebook.inject.InjectorLike;
import com.facebook.tools.dextr.bridge.upload.UploadConfiguration;
import com.facebook.xconfig.core.XConfigReader;

public class DextrXConfigManager
{

    private final XConfigReader a;

    public DextrXConfigManager(XConfigReader xconfigreader)
    {
        a = xconfigreader;
    }

    public static DextrXConfigManager a(InjectorLike injectorlike)
    {
        return b(injectorlike);
    }

    private static DextrXConfigManager b(InjectorLike injectorlike)
    {
        return new DextrXConfigManager((XConfigReader)XConfigReader.a(injectorlike));
    }

    public final UploadConfiguration a()
    {
        return new UploadConfiguration(a);
    }
}
