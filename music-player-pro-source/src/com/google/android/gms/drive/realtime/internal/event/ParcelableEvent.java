// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            b, TextInsertedDetails, TextDeletedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails, ValuesSetDetails, ValueChangedDetails, ReferenceShiftedDetails, 
//            ObjectChangedDetails

public class ParcelableEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int CK;
    final String SJ;
    final String SM;
    final List SQ;
    final boolean SR;
    final String SS;
    final TextInsertedDetails ST;
    final TextDeletedDetails SU;
    final ValuesAddedDetails SV;
    final ValuesRemovedDetails SW;
    final ValuesSetDetails SX;
    final ValueChangedDetails SY;
    final ReferenceShiftedDetails SZ;
    final ObjectChangedDetails Ta;
    final String vZ;

    ParcelableEvent(int i, String s, String s1, List list, boolean flag, String s2, String s3, 
            TextInsertedDetails textinserteddetails, TextDeletedDetails textdeleteddetails, ValuesAddedDetails valuesaddeddetails, ValuesRemovedDetails valuesremoveddetails, ValuesSetDetails valuessetdetails, ValueChangedDetails valuechangeddetails, ReferenceShiftedDetails referenceshifteddetails, 
            ObjectChangedDetails objectchangeddetails)
    {
        CK = i;
        vZ = s;
        SJ = s1;
        SQ = list;
        SR = flag;
        SM = s2;
        SS = s3;
        ST = textinserteddetails;
        SU = textdeleteddetails;
        SV = valuesaddeddetails;
        SW = valuesremoveddetails;
        SX = valuessetdetails;
        SY = valuechangeddetails;
        SZ = referenceshifteddetails;
        Ta = objectchangeddetails;
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
