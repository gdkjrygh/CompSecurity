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
    final ParcelFileDescriptor Fj;
    String HA;
    boolean HB;
    private boolean HC;
    private boolean HD;
    private boolean HE;
    final int Hy;
    final DriveId Hz;
    private boolean mClosed;
    final int ra;
    final int xM;

    Contents(int i, ParcelFileDescriptor parcelfiledescriptor, int j, int k, DriveId driveid, String s, boolean flag)
    {
        mClosed = false;
        HC = false;
        HD = false;
        HE = false;
        xM = i;
        Fj = parcelfiledescriptor;
        ra = j;
        Hy = k;
        Hz = driveid;
        HA = s;
        HB = flag;
    }

    public void close()
    {
        mClosed = true;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return Hz;
    }

    public InputStream getInputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if (Hy != 0x10000000)
        {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if (HC)
        {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else
        {
            HC = true;
            return new FileInputStream(Fj.getFileDescriptor());
        }
    }

    public int getMode()
    {
        return Hy;
    }

    public OutputStream getOutputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (Hy != 0x20000000)
        {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (HD)
        {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else
        {
            HD = true;
            return new FileOutputStream(Fj.getFileDescriptor());
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else
        {
            return Fj;
        }
    }

    public int getRequestId()
    {
        return ra;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
