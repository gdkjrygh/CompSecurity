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
    final ParcelFileDescriptor Fg;
    private boolean HA;
    private boolean HB;
    final int Hv;
    final DriveId Hw;
    String Hx;
    boolean Hy;
    private boolean Hz;
    private boolean mClosed;
    final int qX;
    final int xJ;

    Contents(int i, ParcelFileDescriptor parcelfiledescriptor, int j, int k, DriveId driveid, String s, boolean flag)
    {
        mClosed = false;
        Hz = false;
        HA = false;
        HB = false;
        xJ = i;
        Fg = parcelfiledescriptor;
        qX = j;
        Hv = k;
        Hw = driveid;
        Hx = s;
        Hy = flag;
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
        return Hw;
    }

    public InputStream getInputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if (Hv != 0x10000000)
        {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if (Hz)
        {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else
        {
            Hz = true;
            return new FileInputStream(Fg.getFileDescriptor());
        }
    }

    public int getMode()
    {
        return Hv;
    }

    public OutputStream getOutputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (Hv != 0x20000000)
        {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (HA)
        {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else
        {
            HA = true;
            return new FileOutputStream(Fg.getFileDescriptor());
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else
        {
            return Fg;
        }
    }

    public int getRequestId()
    {
        return qX;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
