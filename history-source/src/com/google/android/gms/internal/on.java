// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            jx

class on
    implements com.google.android.gms.panorama.PanoramaApi.PanoramaResult
{

    private final Status Eb;
    private final Intent amR;

    public on(Status status, Intent intent)
    {
        Eb = (Status)jx.i(status);
        amR = intent;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public Intent getViewerIntent()
    {
        return amR;
    }
}
