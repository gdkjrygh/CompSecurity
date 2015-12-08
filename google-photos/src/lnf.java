// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

final class lnf
    implements lmi
{

    private final Status a;
    private final ParcelFileDescriptor b;

    public lnf(Status status, ParcelFileDescriptor parcelfiledescriptor, boolean flag, int i, int j)
    {
        a = status;
        b = parcelfiledescriptor;
    }

    public final Status a_()
    {
        return a;
    }

    public final void b()
    {
        ParcelFileDescriptor parcelfiledescriptor;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        parcelfiledescriptor = b;
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        parcelfiledescriptor.close();
        return;
        IOException ioexception;
        ioexception;
    }

    public final ParcelFileDescriptor c()
    {
        return b;
    }
}
