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
    final int CK;
    final ParcelFileDescriptor LG;
    final int Oi;
    final DriveId Oj;
    final boolean Ok;
    final int ve;

    Contents(int i, ParcelFileDescriptor parcelfiledescriptor, int j, int k, DriveId driveid, boolean flag)
    {
        CK = i;
        LG = parcelfiledescriptor;
        ve = j;
        Oi = k;
        Oj = driveid;
        Ok = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return Oj;
    }

    public InputStream getInputStream()
    {
        return new FileInputStream(LG.getFileDescriptor());
    }

    public int getMode()
    {
        return Oi;
    }

    public OutputStream getOutputStream()
    {
        return new FileOutputStream(LG.getFileDescriptor());
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        return LG;
    }

    public int getRequestId()
    {
        return ve;
    }

    public boolean ip()
    {
        return Ok;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
