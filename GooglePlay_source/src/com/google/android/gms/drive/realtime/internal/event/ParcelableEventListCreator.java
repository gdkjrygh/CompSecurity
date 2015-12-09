// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableEventList, ParcelableEvent

public final class ParcelableEventListCreator
    implements android.os.Parcelable.Creator
{

    public ParcelableEventListCreator()
    {
    }

    static void writeToParcel(ParcelableEventList parcelableeventlist, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, parcelableeventlist.mVersionCode);
        SafeParcelWriter.writeTypedList(parcel, 2, parcelableeventlist.mEvents, false);
        SafeParcelWriter.writeParcelable(parcel, 3, parcelableeventlist.mEventData, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, parcelableeventlist.mUndoRedoStateChanged);
        SafeParcelWriter.writeStringList(parcel, 5, parcelableeventlist.mAffectedObjectIds, false);
        SafeParcelWriter.writeParcelable(parcel, 6, parcelableeventlist.mPreviousChangeInfo, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        ParcelableChangeInfo parcelablechangeinfo = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        DataHolder dataholder = null;
        java.util.ArrayList arraylist1 = null;
        int i = 0;
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
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, ParcelableEvent.CREATOR);
                    break;

                case 3: // '\003'
                    dataholder = (DataHolder)SafeParcelReader.createParcelable(parcel, k, DataHolder.CREATOR);
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;

                case 6: // '\006'
                    parcelablechangeinfo = (ParcelableChangeInfo)SafeParcelReader.createParcelable(parcel, k, ParcelableChangeInfo.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ParcelableEventList(i, arraylist1, dataholder, flag, arraylist, parcelablechangeinfo);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParcelableEventList[i];
    }
}
