// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import b;
import java.io.IOException;
import java.util.Locale;
import qwx;

public class mRelroFd
    implements Parcelable
{

    public static final android.os.tor CREATOR = new qwx();
    public long mLoadAddress;
    public long mLoadSize;
    public int mRelroFd;
    public long mRelroSize;
    public long mRelroStart;

    public int describeContents()
    {
        return 1;
    }

    public String toString()
    {
        return String.format(Locale.US, "[load=0x%x-0x%x relro=0x%x-0x%x fd=%d]", new Object[] {
            Long.valueOf(mLoadAddress), Long.valueOf(mLoadAddress + mLoadSize), Long.valueOf(mRelroStart), Long.valueOf(mRelroStart + mRelroSize), Integer.valueOf(mRelroFd)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (mRelroFd < 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeLong(mLoadAddress);
        parcel.writeLong(mLoadSize);
        parcel.writeLong(mRelroStart);
        parcel.writeLong(mRelroSize);
        ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.fromFd(mRelroFd);
        parcelfiledescriptor.writeToParcel(parcel, 0);
        parcelfiledescriptor.close();
        return;
        parcel;
        b.a("LibraryLoader", "Can't write LibInfo file descriptor to parcel", new Object[] {
            parcel
        });
        return;
    }


    public ()
    {
        mLoadAddress = 0L;
        mLoadSize = 0L;
        mRelroStart = 0L;
        mRelroSize = 0L;
        mRelroFd = -1;
    }

    public mRelroFd(Parcel parcel)
    {
        mLoadAddress = parcel.readLong();
        mLoadSize = parcel.readLong();
        mRelroStart = parcel.readLong();
        mRelroSize = parcel.readLong();
        parcel = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
        int i;
        if (parcel == null)
        {
            i = -1;
        } else
        {
            i = parcel.detachFd();
        }
        mRelroFd = i;
    }
}
