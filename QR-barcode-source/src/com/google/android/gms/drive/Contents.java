// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.drive:
//            a, DriveId

public class Contents
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int BR;
    final ParcelFileDescriptor KE;
    final int MV;
    final DriveId MW;
    final boolean MX;
    private boolean MY;
    private boolean MZ;
    private boolean mClosed;
    final int uQ;

    Contents(int i, ParcelFileDescriptor parcelfiledescriptor, int j, int k, DriveId driveid, boolean flag)
    {
        mClosed = false;
        MY = false;
        MZ = false;
        BR = i;
        KE = parcelfiledescriptor;
        uQ = j;
        MV = k;
        MW = driveid;
        MX = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return MW;
    }

    public InputStream getInputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if (MV != 0x10000000)
        {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if (MY)
        {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else
        {
            MY = true;
            return new FileInputStream(KE.getFileDescriptor());
        }
    }

    public int getMode()
    {
        return MV;
    }

    public OutputStream getOutputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (MV != 0x20000000)
        {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (MZ)
        {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else
        {
            MZ = true;
            return new FileOutputStream(KE.getFileDescriptor());
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else
        {
            return KE;
        }
    }

    public int getRequestId()
    {
        return uQ;
    }

    public void hJ()
    {
        mClosed = true;
    }

    public boolean hK()
    {
        return mClosed;
    }

    public boolean hL()
    {
        return MX;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
