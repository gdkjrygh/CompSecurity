// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, c

public final class FileConflictEvent
    implements SafeParcelable, DriveEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final DriveId Hz;
    final ParcelFileDescriptor Ij;
    final ParcelFileDescriptor Ik;
    final MetadataBundle Il;
    final ArrayList Im;
    private boolean In;
    private boolean Io;
    private boolean Ip;
    final int xM;
    final String yQ;

    FileConflictEvent(int i, DriveId driveid, String s, ParcelFileDescriptor parcelfiledescriptor, ParcelFileDescriptor parcelfiledescriptor1, MetadataBundle metadatabundle, ArrayList arraylist)
    {
        In = false;
        Io = false;
        Ip = false;
        xM = i;
        Hz = driveid;
        yQ = s;
        Ij = parcelfiledescriptor;
        Ik = parcelfiledescriptor1;
        Il = metadatabundle;
        Im = arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return Hz;
    }

    public int getType()
    {
        return 2;
    }

    public String toString()
    {
        return String.format("FileConflictEvent [id=%s]", new Object[] {
            Hz
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
