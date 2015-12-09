// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class InstantMessagingImplCreator
    implements android.os.Parcelable.Creator
{

    public InstantMessagingImplCreator()
    {
    }

    static void writeToParcel(PersonImpl.InstantMessagingImpl instantmessagingimpl, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = instantmessagingimpl.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, instantmessagingimpl.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, instantmessagingimpl.mMetadata, i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, instantmessagingimpl.mFormattedProtocol, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, instantmessagingimpl.mFormattedType, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, instantmessagingimpl.mProtocol, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeString(parcel, 6, instantmessagingimpl.mType, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeString(parcel, 7, instantmessagingimpl.mValue, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        PersonImpl.MetadataImpl metadataimpl = null;
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

                case 2: // '\002'
                    metadataimpl = (PersonImpl.MetadataImpl)SafeParcelReader.createParcelable(parcel, k, PersonImpl.MetadataImpl.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s4 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s3 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new PersonImpl.InstantMessagingImpl(hashset, i, metadataimpl, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PersonImpl.InstantMessagingImpl[i];
    }
}
