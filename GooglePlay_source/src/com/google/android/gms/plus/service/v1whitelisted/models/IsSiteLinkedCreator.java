// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1whitelisted.models:
//            IsSiteLinked

public final class IsSiteLinkedCreator
    implements android.os.Parcelable.Creator
{

    public IsSiteLinkedCreator()
    {
    }

    static void writeToParcel$4d5e465c(IsSiteLinked issitelinked, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        if (issitelinked.mIndicatorSet.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, issitelinked.mVersionCode);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
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
                    hashset.add(Integer.valueOf(1));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new IsSiteLinked(hashset, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new IsSiteLinked[i];
    }
}
