// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableEventCreator, FieldChangedDetails, ObjectChangedDetails, ReferenceShiftedDetails, 
//            TextDeletedDetails, TextInsertedDetails, ValueChangedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails, ValuesSetDetails

public class ParcelableEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ParcelableEventCreator();
    final List mCompoundOperationNames;
    final FieldChangedDetails mFieldChangedDetails;
    final boolean mIsLocal;
    final boolean mIsRedo;
    final boolean mIsUndo;
    final ObjectChangedDetails mObjectChangedDetails;
    final String mObjectId;
    final String mObjectType;
    final ReferenceShiftedDetails mReferenceShiftedDetails;
    final String mSessionId;
    final TextDeletedDetails mTextDeletedDetails;
    final TextInsertedDetails mTextInsertedDetails;
    final String mUserId;
    final ValueChangedDetails mValueChangedDetails;
    final ValuesAddedDetails mValuesAddedDetails;
    final ValuesRemovedDetails mValuesRemovedDetails;
    final ValuesSetDetails mValuesSetDetails;
    final int mVersionCode;

    ParcelableEvent(int i, String s, String s1, List list, boolean flag, boolean flag1, boolean flag2, 
            String s2, String s3, TextInsertedDetails textinserteddetails, TextDeletedDetails textdeleteddetails, ValuesAddedDetails valuesaddeddetails, ValuesRemovedDetails valuesremoveddetails, ValuesSetDetails valuessetdetails, 
            ValueChangedDetails valuechangeddetails, ReferenceShiftedDetails referenceshifteddetails, ObjectChangedDetails objectchangeddetails, FieldChangedDetails fieldchangeddetails)
    {
        mVersionCode = i;
        mSessionId = s;
        mUserId = s1;
        mCompoundOperationNames = list;
        mIsLocal = flag;
        mIsUndo = flag1;
        mIsRedo = flag2;
        mObjectId = s2;
        mObjectType = s3;
        mTextInsertedDetails = textinserteddetails;
        mTextDeletedDetails = textdeleteddetails;
        mValuesAddedDetails = valuesaddeddetails;
        mValuesRemovedDetails = valuesremoveddetails;
        mValuesSetDetails = valuessetdetails;
        mValueChangedDetails = valuechangeddetails;
        mReferenceShiftedDetails = referenceshifteddetails;
        mObjectChangedDetails = objectchangeddetails;
        mFieldChangedDetails = fieldchangeddetails;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelableEventCreator.writeToParcel(this, parcel, i);
    }

}
