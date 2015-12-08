// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.events:
//            ChangesAvailableEvent, ChangesAvailableOptions

public final class ChangesAvailableEventCreator
    implements android.os.Parcelable.Creator
{

    public ChangesAvailableEventCreator()
    {
    }

    static void writeToParcel(ChangesAvailableEvent changesavailableevent, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, changesavailableevent.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, changesavailableevent.mAccountName, false);
        SafeParcelWriter.writeParcelable(parcel, 3, changesavailableevent.mChangesAvailableOptions, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        ChangesAvailableOptions changesavailableoptions = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
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
                    changesavailableoptions = (ChangesAvailableOptions)SafeParcelReader.createParcelable(parcel, k, ChangesAvailableOptions.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ChangesAvailableEvent(i, s, changesavailableoptions);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ChangesAvailableEvent[i];
    }
}
