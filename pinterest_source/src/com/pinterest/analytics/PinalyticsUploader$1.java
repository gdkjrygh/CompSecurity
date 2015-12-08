// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;


// Referenced classes of package com.pinterest.analytics:
//            PinalyticsUploader

class ervalCallback extends com.pinterest.common.async.alCallback
{

    final PinalyticsUploader a;

    public void onInterval()
    {
        PinalyticsUploader.a(a);
        PinalyticsUploader.b(a);
    }

    public void onStop()
    {
        onInterval();
    }

    ervalCallback(PinalyticsUploader pinalyticsuploader)
    {
        a = pinalyticsuploader;
        super();
    }
}
