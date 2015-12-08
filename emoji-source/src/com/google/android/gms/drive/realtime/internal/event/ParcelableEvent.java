// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            a, ReferenceShiftedDetails, TextInsertedDetails, TextDeletedDetails, 
//            ValuesAddedDetails, ValuesRemovedDetails, ValuesSetDetails, ValueChangedDetails

public class ParcelableEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final ReferenceShiftedDetails LA;
    final String Lm;
    final String Lq;
    final boolean Ls;
    final String Lt;
    final TextInsertedDetails Lu;
    final TextDeletedDetails Lv;
    final ValuesAddedDetails Lw;
    final ValuesRemovedDetails Lx;
    final ValuesSetDetails Ly;
    final ValueChangedDetails Lz;
    final String rR;
    final int xM;

    ParcelableEvent(int i, String s, String s1, boolean flag, String s2, String s3, TextInsertedDetails textinserteddetails, 
            TextDeletedDetails textdeleteddetails, ValuesAddedDetails valuesaddeddetails, ValuesRemovedDetails valuesremoveddetails, ValuesSetDetails valuessetdetails, ValueChangedDetails valuechangeddetails, ReferenceShiftedDetails referenceshifteddetails)
    {
        xM = i;
        rR = s;
        Lm = s1;
        Ls = flag;
        Lq = s2;
        Lt = s3;
        Lu = textinserteddetails;
        Lv = textdeleteddetails;
        Lw = valuesaddeddetails;
        Lx = valuesremoveddetails;
        Ly = valuessetdetails;
        Lz = valuechangeddetails;
        LA = referenceshifteddetails;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
