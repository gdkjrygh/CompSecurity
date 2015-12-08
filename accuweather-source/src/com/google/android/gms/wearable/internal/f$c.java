// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            f

public static class alG
    implements com.google.android.gms.wearable.Api.GetFdForAssetResult
{

    private final ParcelFileDescriptor alG;
    private final Status yw;

    public ParcelFileDescriptor getFd()
    {
        return alG;
    }

    public InputStream getInputStream()
    {
        return new android.os.elFileDescriptor.AutoCloseInputStream(alG);
    }

    public Status getStatus()
    {
        return yw;
    }

    public void release()
    {
        try
        {
            alG.close();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public tStream(Status status, ParcelFileDescriptor parcelfiledescriptor)
    {
        yw = status;
        alG = parcelfiledescriptor;
    }
}
