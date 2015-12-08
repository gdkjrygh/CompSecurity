// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            a, TextInsertedDetails, TextDeletedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails, ValuesSetDetails, ValueChangedDetails, ReferenceShiftedDetails

public class ParcelableEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final String Lj;
    final String Ln;
    final boolean Lp;
    final String Lq;
    final TextInsertedDetails Lr;
    final TextDeletedDetails Ls;
    final ValuesAddedDetails Lt;
    final ValuesRemovedDetails Lu;
    final ValuesSetDetails Lv;
    final ValueChangedDetails Lw;
    final ReferenceShiftedDetails Lx;
    final String rO;
    final int xJ;

    ParcelableEvent(int i, String s, String s1, boolean flag, String s2, String s3, TextInsertedDetails textinserteddetails, 
            TextDeletedDetails textdeleteddetails, ValuesAddedDetails valuesaddeddetails, ValuesRemovedDetails valuesremoveddetails, ValuesSetDetails valuessetdetails, ValueChangedDetails valuechangeddetails, ReferenceShiftedDetails referenceshifteddetails)
    {
        xJ = i;
        rO = s;
        Lj = s1;
        Lp = flag;
        Ln = s2;
        Lq = s3;
        Lr = textinserteddetails;
        Ls = textdeleteddetails;
        Lt = valuesaddeddetails;
        Lu = valuesremoveddetails;
        Lv = valuessetdetails;
        Lw = valuechangeddetails;
        Lx = referenceshifteddetails;
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
