// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveSpace;

// Referenced classes of package com.google.android.gms.drive.events:
//            ChangesAvailableOptions

public final class ChangesAvailableOptionsCreator
    implements android.os.Parcelable.Creator
{

    public ChangesAvailableOptionsCreator()
    {
    }

    static void writeToParcel$621aa751(ChangesAvailableOptions changesavailableoptions, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, changesavailableoptions.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, changesavailableoptions.mChangesSizeLimit);
        SafeParcelWriter.writeBoolean(parcel, 3, changesavailableoptions.mRepeats);
        SafeParcelWriter.writeTypedList(parcel, 4, changesavailableoptions.mSpacesList, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        int j = 0;
        int i = 0;
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
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createTypedList(parcel, l, DriveSpace.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ChangesAvailableOptions(i, j, flag, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ChangesAvailableOptions[i];
    }
}
