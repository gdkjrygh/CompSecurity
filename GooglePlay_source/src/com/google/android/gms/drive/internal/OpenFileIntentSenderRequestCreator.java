// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OpenFileIntentSenderRequest

public final class OpenFileIntentSenderRequestCreator
    implements android.os.Parcelable.Creator
{

    public OpenFileIntentSenderRequestCreator()
    {
    }

    static void writeToParcel(OpenFileIntentSenderRequest openfileintentsenderrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, openfileintentsenderrequest.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, openfileintentsenderrequest.mTitle, false);
        SafeParcelWriter.writeStringArray(parcel, 3, openfileintentsenderrequest.mMimeTypes, false);
        SafeParcelWriter.writeParcelable(parcel, 4, openfileintentsenderrequest.mStartFolder, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, openfileintentsenderrequest.mFilterHolder, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        FilterHolder filterholder = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        DriveId driveid = null;
        String as[] = null;
        String s = null;
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
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    as = SafeParcelReader.createStringArray(parcel, k);
                    break;

                case 4: // '\004'
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, k, DriveId.CREATOR);
                    break;

                case 5: // '\005'
                    filterholder = (FilterHolder)SafeParcelReader.createParcelable(parcel, k, FilterHolder.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new OpenFileIntentSenderRequest(i, s, as, driveid, filterholder);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OpenFileIntentSenderRequest[i];
    }
}
