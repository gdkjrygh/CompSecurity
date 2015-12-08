// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            b, ValuesSetDetails, ValueChangedDetails, ReferenceShiftedDetails, 
//            ObjectChangedDetails, TextInsertedDetails, TextDeletedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails

public class ParcelableEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int BR;
    final ValuesSetDetails RA;
    final ValueChangedDetails RB;
    final ReferenceShiftedDetails RC;
    final ObjectChangedDetails RD;
    final String Rm;
    final String Rp;
    final List Rt;
    final boolean Ru;
    final String Rv;
    final TextInsertedDetails Rw;
    final TextDeletedDetails Rx;
    final ValuesAddedDetails Ry;
    final ValuesRemovedDetails Rz;
    final String vL;

    ParcelableEvent(int i, String s, String s1, List list, boolean flag, String s2, String s3, 
            TextInsertedDetails textinserteddetails, TextDeletedDetails textdeleteddetails, ValuesAddedDetails valuesaddeddetails, ValuesRemovedDetails valuesremoveddetails, ValuesSetDetails valuessetdetails, ValueChangedDetails valuechangeddetails, ReferenceShiftedDetails referenceshifteddetails, 
            ObjectChangedDetails objectchangeddetails)
    {
        BR = i;
        vL = s;
        Rm = s1;
        Rt = list;
        Ru = flag;
        Rp = s2;
        Rv = s3;
        Rw = textinserteddetails;
        Rx = textdeleteddetails;
        Ry = valuesaddeddetails;
        Rz = valuesremoveddetails;
        RA = valuessetdetails;
        RB = valuechangeddetails;
        RC = referenceshifteddetails;
        RD = objectchangeddetails;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
