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

public static class axG
    implements com.google.android.gms.wearable.Api.GetFdForAssetResult
{

    private final Status Eb;
    private volatile InputStream ZO;
    private volatile ParcelFileDescriptor axG;
    private volatile boolean mClosed;

    public ParcelFileDescriptor getFd()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Cannot access the file descriptor after release().");
        } else
        {
            return axG;
        }
    }

    public InputStream getInputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Cannot access the input stream after release().");
        }
        if (axG == null)
        {
            return null;
        }
        if (ZO == null)
        {
            ZO = new android.os.elFileDescriptor.AutoCloseInputStream(axG);
        }
        return ZO;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public void release()
    {
        if (axG == null)
        {
            return;
        }
        if (mClosed)
        {
            throw new IllegalStateException("releasing an already released result.");
        }
        if (ZO == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        ZO.close();
_L1:
        mClosed = true;
        axG = null;
        ZO = null;
        return;
        try
        {
            axG.close();
        }
        catch (IOException ioexception)
        {
            return;
        }
          goto _L1
    }

    public tStream(Status status, ParcelFileDescriptor parcelfiledescriptor)
    {
        mClosed = false;
        Eb = status;
        axG = parcelfiledescriptor;
    }
}
