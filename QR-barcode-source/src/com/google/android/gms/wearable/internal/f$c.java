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

public static class avu
    implements com.google.android.gms.wearable.Api.GetFdForAssetResult
{

    private final Status CM;
    private volatile InputStream XX;
    private volatile ParcelFileDescriptor avu;
    private volatile boolean mClosed;

    public ParcelFileDescriptor getFd()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Cannot access the file descriptor after release().");
        } else
        {
            return avu;
        }
    }

    public InputStream getInputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Cannot access the input stream after release().");
        }
        if (avu == null)
        {
            return null;
        }
        if (XX == null)
        {
            XX = new android.os.elFileDescriptor.AutoCloseInputStream(avu);
        }
        return XX;
    }

    public Status getStatus()
    {
        return CM;
    }

    public void release()
    {
        if (avu == null)
        {
            return;
        }
        if (mClosed)
        {
            throw new IllegalStateException("releasing an already released result.");
        }
        if (XX == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        XX.close();
_L1:
        mClosed = true;
        avu = null;
        XX = null;
        return;
        try
        {
            avu.close();
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
        CM = status;
        avu = parcelfiledescriptor;
    }
}
