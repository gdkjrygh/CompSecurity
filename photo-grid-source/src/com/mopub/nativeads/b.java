// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import com.mopub.common.logging.MoPubLog;
import com.mopub.volley.VolleyError;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.mopub.nativeads:
//            NativeErrorCode

final class b
    implements com.mopub.volley.toolbox.ImageLoader.ImageListener
{

    final AtomicInteger a;
    final AtomicBoolean b;
    final CustomEventNative.ImageListener c;

    b(AtomicInteger atomicinteger, AtomicBoolean atomicboolean, CustomEventNative.ImageListener imagelistener)
    {
        a = atomicinteger;
        b = atomicboolean;
        c = imagelistener;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        MoPubLog.d("Failed to download a native ads image:", volleyerror);
        boolean flag = b.getAndSet(true);
        a.decrementAndGet();
        if (!flag)
        {
            c.onImagesFailedToCache(NativeErrorCode.IMAGE_DOWNLOAD_FAILURE);
        }
    }

    public final void onResponse(com.mopub.volley.toolbox.ImageLoader.ImageContainer imagecontainer, boolean flag)
    {
        if (imagecontainer.getBitmap() != null && a.decrementAndGet() == 0 && !b.get())
        {
            c.onImagesCached();
        }
    }
}
