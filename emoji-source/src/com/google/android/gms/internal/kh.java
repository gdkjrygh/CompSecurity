// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            hm

class kh
    implements com.google.android.gms.panorama.PanoramaApi.PanoramaResult
{

    private final Intent abo;
    private final Status yz;

    public kh(Status status, Intent intent)
    {
        yz = (Status)hm.f(status);
        abo = intent;
    }

    public Status getStatus()
    {
        return yz;
    }

    public Intent getViewerIntent()
    {
        return abo;
    }
}
