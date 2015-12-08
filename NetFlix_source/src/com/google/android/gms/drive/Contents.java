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
    final ParcelFileDescriptor Cj;
    final int Eu;
    final int Ev;
    final DriveId Ew;
    private boolean Ex;
    private boolean Ey;
    private boolean mClosed;
    final int xH;

    Contents(int i, ParcelFileDescriptor parcelfiledescriptor, int j, int k, DriveId driveid)
    {
        mClosed = false;
        Ex = false;
        Ey = false;
        xH = i;
        Cj = parcelfiledescriptor;
        Eu = j;
        Ev = k;
        Ew = driveid;
    }

    public void close()
    {
        mClosed = true;
    }

    public int describeContents()
    {
        return 0;
    }

    public int fA()
    {
        return Eu;
    }

    public DriveId getDriveId()
    {
        return Ew;
    }

    public InputStream getInputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if (Ev != 0x10000000)
        {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if (Ex)
        {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else
        {
            Ex = true;
            return new FileInputStream(Cj.getFileDescriptor());
        }
    }

    public int getMode()
    {
        return Ev;
    }

    public OutputStream getOutputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (Ev != 0x20000000)
        {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (Ey)
        {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else
        {
            Ey = true;
            return new FileOutputStream(Cj.getFileDescriptor());
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else
        {
            return Cj;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
