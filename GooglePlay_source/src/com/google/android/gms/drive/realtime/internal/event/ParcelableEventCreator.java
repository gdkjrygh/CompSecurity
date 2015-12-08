// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableEvent, TextInsertedDetails, TextDeletedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails, ValuesSetDetails, ValueChangedDetails, ReferenceShiftedDetails, 
//            ObjectChangedDetails, FieldChangedDetails

public final class ParcelableEventCreator
    implements android.os.Parcelable.Creator
{

    public ParcelableEventCreator()
    {
    }

    static void writeToParcel(ParcelableEvent parcelableevent, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, parcelableevent.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, parcelableevent.mSessionId, false);
        SafeParcelWriter.writeString(parcel, 3, parcelableevent.mUserId, false);
        SafeParcelWriter.writeStringList(parcel, 4, parcelableevent.mCompoundOperationNames, false);
        SafeParcelWriter.writeBoolean(parcel, 5, parcelableevent.mIsLocal);
        SafeParcelWriter.writeString(parcel, 6, parcelableevent.mObjectId, false);
        SafeParcelWriter.writeString(parcel, 7, parcelableevent.mObjectType, false);
        SafeParcelWriter.writeParcelable(parcel, 8, parcelableevent.mTextInsertedDetails, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, parcelableevent.mTextDeletedDetails, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, parcelableevent.mValuesAddedDetails, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, parcelableevent.mValuesRemovedDetails, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, parcelableevent.mValuesSetDetails, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, parcelableevent.mValueChangedDetails, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, parcelableevent.mReferenceShiftedDetails, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, parcelableevent.mObjectChangedDetails, i, false);
        SafeParcelWriter.writeBoolean(parcel, 17, parcelableevent.mIsRedo);
        SafeParcelWriter.writeBoolean(parcel, 16, parcelableevent.mIsUndo);
        SafeParcelWriter.writeParcelable(parcel, 18, parcelableevent.mFieldChangedDetails, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s3 = null;
        String s2 = null;
        java.util.ArrayList arraylist = null;
        boolean flag2 = false;
        boolean flag1 = false;
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
        FieldChangedDetails fieldchangeddetails = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;

                case 5: // '\005'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    textinserteddetails = (TextInsertedDetails)SafeParcelReader.createParcelable(parcel, k, TextInsertedDetails.CREATOR);
                    break;

                case 9: // '\t'
                    textdeleteddetails = (TextDeletedDetails)SafeParcelReader.createParcelable(parcel, k, TextDeletedDetails.CREATOR);
                    break;

                case 10: // '\n'
                    valuesaddeddetails = (ValuesAddedDetails)SafeParcelReader.createParcelable(parcel, k, ValuesAddedDetails.CREATOR);
                    break;

                case 11: // '\013'
                    valuesremoveddetails = (ValuesRemovedDetails)SafeParcelReader.createParcelable(parcel, k, ValuesRemovedDetails.CREATOR);
                    break;

                case 12: // '\f'
                    valuessetdetails = (ValuesSetDetails)SafeParcelReader.createParcelable(parcel, k, ValuesSetDetails.CREATOR);
                    break;

                case 13: // '\r'
                    valuechangeddetails = (ValueChangedDetails)SafeParcelReader.createParcelable(parcel, k, ValueChangedDetails.CREATOR);
                    break;

                case 14: // '\016'
                    referenceshifteddetails = (ReferenceShiftedDetails)SafeParcelReader.createParcelable(parcel, k, ReferenceShiftedDetails.CREATOR);
                    break;

                case 15: // '\017'
                    objectchangeddetails = (ObjectChangedDetails)SafeParcelReader.createParcelable(parcel, k, ObjectChangedDetails.CREATOR);
                    break;

                case 17: // '\021'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 16: // '\020'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 18: // '\022'
                    fieldchangeddetails = (FieldChangedDetails)SafeParcelReader.createParcelable(parcel, k, FieldChangedDetails.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ParcelableEvent(i, s3, s2, arraylist, flag2, flag1, flag, s1, s, textinserteddetails, textdeleteddetails, valuesaddeddetails, valuesremoveddetails, valuessetdetails, valuechangeddetails, referenceshifteddetails, objectchangeddetails, fieldchangeddetails);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParcelableEvent[i];
    }
}
