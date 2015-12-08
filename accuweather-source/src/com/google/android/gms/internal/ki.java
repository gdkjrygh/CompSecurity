// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            hn

class ki
    implements com.google.android.gms.panorama.PanoramaApi.PanoramaResult
{

    private final Intent abl;
    private final Status yw;

    public ki(Status status, Intent intent)
    {
        yw = (Status)hn.f(status);
        abl = intent;
    }

    public Status getStatus()
    {
        return yw;
    }

    public Intent getViewerIntent()
    {
        return abl;
    }
}
