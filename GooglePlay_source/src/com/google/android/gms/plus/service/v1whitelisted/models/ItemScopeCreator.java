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
//            ItemScope

public final class ItemScopeCreator
    implements android.os.Parcelable.Creator
{

    public ItemScopeCreator()
    {
    }

    static void writeToParcel$d462135(ItemScope itemscope, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = itemscope.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, itemscope.mVersionCode);
        }
        if (set.contains(Integer.valueOf(33)))
        {
            SafeParcelWriter.writeString(parcel, 33, itemscope.mImage, true);
        }
        if (set.contains(Integer.valueOf(54)))
        {
            SafeParcelWriter.writeString(parcel, 54, itemscope.mUrl, true);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s1 = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
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
                    hashset.add(Integer.valueOf(1));
                    break;

                case 33: // '!'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(33));
                    break;

                case 54: // '6'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(54));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new ItemScope(hashset, i, s, s1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ItemScope[i];
    }
}
