// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.FileConflictEvent;

// Referenced classes of package com.google.android.gms.drive.internal:
//            aj

public class OnEventResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aj();
    final int Iq;
    final ChangeEvent Jy;
    final FileConflictEvent Jz;
    final int xM;

    OnEventResponse(int i, int j, ChangeEvent changeevent, FileConflictEvent fileconflictevent)
    {
        xM = i;
        Iq = j;
        Jy = changeevent;
        Jz = fileconflictevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getEventType()
    {
        return Iq;
    }

    public ChangeEvent gw()
    {
        return Jy;
    }

    public FileConflictEvent gx()
    {
        return Jz;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aj.a(this, parcel, i);
    }

}
