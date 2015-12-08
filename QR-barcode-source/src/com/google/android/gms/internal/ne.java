// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o;

class ne
    implements com.google.android.gms.panorama.PanoramaApi.PanoramaResult
{

    private final Status CM;
    private final Intent akC;

    public ne(Status status, Intent intent)
    {
        CM = (Status)o.i(status);
        akC = intent;
    }

    public Status getStatus()
    {
        return CM;
    }

    public Intent getViewerIntent()
    {
        return akC;
    }
}
