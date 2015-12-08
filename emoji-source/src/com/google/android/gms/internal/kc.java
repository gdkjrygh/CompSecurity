// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            kh

public class kc extends kh
    implements com.google.android.gms.panorama.PanoramaApi.a
{

    private final int abj;

    public kc(Status status, Intent intent, int i)
    {
        super(status, intent);
        abj = i;
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
