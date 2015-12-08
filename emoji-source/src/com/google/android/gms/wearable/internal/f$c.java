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

public static class alJ
    implements com.google.android.gms.wearable.Api.GetFdForAssetResult
{

    private final ParcelFileDescriptor alJ;
    private final Status yz;

    public ParcelFileDescriptor getFd()
    {
        return alJ;
    }

    public InputStream getInputStream()
    {
        return new android.os.elFileDescriptor.AutoCloseInputStream(alJ);
    }

    public Status getStatus()
    {
        return yz;
    }

    public void release()
    {
        try
        {
            alJ.close();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public tStream(Status status, ParcelFileDescriptor parcelfiledescriptor)
    {
        yz = status;
        alJ = parcelfiledescriptor;
    }
}
