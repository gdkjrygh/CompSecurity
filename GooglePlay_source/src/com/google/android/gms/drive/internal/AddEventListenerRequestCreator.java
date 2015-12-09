// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;

// Referenced classes of package com.google.android.gms.drive.internal:
//            AddEventListenerRequest

public final class AddEventListenerRequestCreator
    implements android.os.Parcelable.Creator
{

    public AddEventListenerRequestCreator()
    {
    }

    static void writeToParcel(AddEventListenerRequest addeventlistenerrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, addeventlistenerrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, addeventlistenerrequest.mDriveId, i, false);
        SafeParcelWriter.writeInt(parcel, 3, addeventlistenerrequest.mEventType);
        SafeParcelWriter.writeParcelable(parcel, 4, addeventlistenerrequest.mChangesAvailableOptions, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        DriveId driveid = null;
        int i = 0;
        ChangesAvailableOptions changesavailableoptions = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, l, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 4: // '\004'
                    changesavailableoptions = (ChangesAvailableOptions)SafeParcelReader.createParcelable(parcel, l, ChangesAvailableOptions.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AddEventListenerRequest(i, driveid, j, changesavailableoptions);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AddEventListenerRequest[i];
    }
}
