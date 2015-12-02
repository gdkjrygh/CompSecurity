// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge;

import com.facebook.common.errorreporting.FbCustomReportDataSupplier;
import com.facebook.inject.InjectorLike;

// Referenced classes of package com.facebook.tools.dextr.bridge:
//            DextrBridge

public class DextrErrorReportDataSupplier
    implements FbCustomReportDataSupplier
{

    public DextrErrorReportDataSupplier()
    {
    }

    public static DextrErrorReportDataSupplier a(InjectorLike injectorlike)
    {
        return b();
    }

    private static DextrErrorReportDataSupplier b()
    {
        return new DextrErrorReportDataSupplier();
    }

    public final String a()
    {
        return "dextr";
    }

    public final String a(Throwable throwable)
    {
        if (DextrBridge.a())
        {
            return "true";
        } else
        {
            return "false";
        }
    }
}
