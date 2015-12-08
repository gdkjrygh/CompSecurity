// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.analytics.framework.ErrorMetric;

public final class ln
{

    private final Im mDeviceUtils;

    public ln()
    {
        this(Im.a());
    }

    private ln(Im im)
    {
        mDeviceUtils = im;
    }

    public static void a(String s, Throwable throwable)
    {
        (new ErrorMetric("OUT_OF_MEMORY")).a(throwable).a("method", s).a("memory_class", Integer.valueOf(Im.b(SnapchatApplication.get()))).e();
    }

    public static void a(Throwable throwable)
    {
        (new ErrorMetric("OUT_OF_MEMORY")).a(throwable).a("memory_class", Integer.valueOf(Im.b(SnapchatApplication.get()))).e();
    }
}
