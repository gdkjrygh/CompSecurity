// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal.model:
//            ChangeList, Change

public final class ChangeListCreator
    implements android.os.Parcelable.Creator
{

    public ChangeListCreator()
    {
    }

    static void writeToParcel$6bdbd7e3(ChangeList changelist, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = changelist.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, changelist.mVersionCode);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeTypedList(parcel, 4, changelist.mItems, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeLong(parcel, 6, changelist.mLargestChangeId);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeString(parcel, 8, changelist.mNextPageToken, true);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        long l = 0L;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 2: // '\002'
                case 3: // '\003'
                case 5: // '\005'
                case 7: // '\007'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, Change.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 6: // '\006'
                    l = SafeParcelReader.readLong(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(8));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new ChangeList(hashset, i, arraylist, l, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ChangeList[i];
    }
}
