// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            ne

public class mz extends ne
    implements com.google.android.gms.panorama.PanoramaApi.a
{

    private final int akx;

    public mz(Status status, Intent intent, int i)
    {
        super(status, intent);
        akx = i;
    }

    public volatile Status getStatus()
    {
        return super.getStatus();
    }

    public volatile Intent getViewerIntent()
    {
        return super.getViewerIntent();
    }
}
