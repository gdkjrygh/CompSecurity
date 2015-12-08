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
    final DriveId Hw;
    final ParcelFileDescriptor Ig;
    final ParcelFileDescriptor Ih;
    final MetadataBundle Ii;
    final ArrayList Ij;
    private boolean Ik;
    private boolean Il;
    private boolean Im;
    final int xJ;
    final String yN;

    FileConflictEvent(int i, DriveId driveid, String s, ParcelFileDescriptor parcelfiledescriptor, ParcelFileDescriptor parcelfiledescriptor1, MetadataBundle metadatabundle, ArrayList arraylist)
    {
        Ik = false;
        Il = false;
        Im = false;
        xJ = i;
        Hw = driveid;
        yN = s;
        Ig = parcelfiledescriptor;
        Ih = parcelfiledescriptor1;
        Ii = metadatabundle;
        Ij = arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return Hw;
    }

    public int getType()
    {
        return 2;
    }

    public String toString()
    {
        return String.format("FileConflictEvent [id=%s]", new Object[] {
            Hw
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
