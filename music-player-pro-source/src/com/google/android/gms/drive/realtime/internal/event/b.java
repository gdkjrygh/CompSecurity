// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableEvent, TextInsertedDetails, TextDeletedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails, ValuesSetDetails, ValueChangedDetails, ReferenceShiftedDetails, 
//            ObjectChangedDetails

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(ParcelableEvent parcelableevent, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, parcelableevent.CK);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, parcelableevent.vZ, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, parcelableevent.SJ, false);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, 4, parcelableevent.SQ, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, parcelableevent.SR);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, parcelableevent.SM, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, parcelableevent.SS, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, parcelableevent.ST, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, parcelableevent.SU, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, parcelableevent.SV, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, parcelableevent.SW, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, parcelableevent.SX, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 13, parcelableevent.SY, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 14, parcelableevent.SZ, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 15, parcelableevent.Ta, i, false);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, j);
    }

    public ParcelableEvent bh(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s3 = null;
        String s2 = null;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        String s1 = null;
        String s = null;
        TextInsertedDetails textinserteddetails = null;
        TextDeletedDetails textdeleteddetails = null;
        ValuesAddedDetails valuesaddeddetails = null;
        ValuesRemovedDetails valuesremoveddetails = null;
        ValuesSetDetails valuessetdetails = null;
        ValueChangedDetails valuechangeddetails = null;
        ReferenceShiftedDetails referenceshifteddetails = null;
        ObjectChangedDetails objectchangeddetails = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 8: // '\b'
                    textinserteddetails = (TextInsertedDetails)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, TextInsertedDetails.CREATOR);
                    break;

                case 9: // '\t'
                    textdeleteddetails = (TextDeletedDetails)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, TextDeletedDetails.CREATOR);
                    break;

                case 10: // '\n'
                    valuesaddeddetails = (ValuesAddedDetails)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ValuesAddedDetails.CREATOR);
                    break;

                case 11: // '\013'
                    valuesremoveddetails = (ValuesRemovedDetails)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ValuesRemovedDetails.CREATOR);
                    break;

                case 12: // '\f'
                    valuessetdetails = (ValuesSetDetails)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ValuesSetDetails.CREATOR);
                    break;

                case 13: // '\r'
                    valuechangeddetails = (ValueChangedDetails)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ValueChangedDetails.CREATOR);
                    break;

                case 14: // '\016'
                    referenceshifteddetails = (ReferenceShiftedDetails)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ReferenceShiftedDetails.CREATOR);
                    break;

                case 15: // '\017'
                    objectchangeddetails = (ObjectChangedDetails)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ObjectChangedDetails.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ParcelableEvent(i, s3, s2, arraylist, flag, s1, s, textinserteddetails, textdeleteddetails, valuesaddeddetails, valuesremoveddetails, valuessetdetails, valuechangeddetails, referenceshifteddetails, objectchangeddetails);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bh(parcel);
    }

    public ParcelableEvent[] cx(int i)
    {
        return new ParcelableEvent[i];
    }

    public Object[] newArray(int i)
    {
        return cx(i);
    }
}
