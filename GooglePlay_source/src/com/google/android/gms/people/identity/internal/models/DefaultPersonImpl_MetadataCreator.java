// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            DefaultPersonImpl

public final class DefaultPersonImpl_MetadataCreator
    implements android.os.Parcelable.Creator
{

    public DefaultPersonImpl_MetadataCreator()
    {
    }

    static void writeToParcel(DefaultPersonImpl.Metadata metadata, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = metadata.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, metadata.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeTypedList(parcel, 2, metadata.mAffinities, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeStringList(parcel, 3, metadata.mAttributions, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeStringList(parcel, 4, metadata.mBlockTypes, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeBoolean(parcel, 5, metadata.mBlocked);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeStringList(parcel, 6, metadata.mCircles, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeStringList(parcel, 7, metadata.mContacts, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeBoolean(parcel, 8, metadata.mDeleted);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeStringList(parcel, 9, metadata.mGroups, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeBoolean(parcel, 10, metadata.mInViewerDomain);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeStringList(parcel, 11, metadata.mIncomingBlockTypes, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeLong(parcel, 12, metadata.mLastUpdateTimeMicros);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            SafeParcelWriter.writeString(parcel, 13, metadata.mObjectType, true);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeString(parcel, 14, metadata.mOwnerId, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            SafeParcelWriter.writeStringList(parcel, 15, metadata.mOwnerUserTypes, true);
        }
        if (set.contains(Integer.valueOf(17)))
        {
            SafeParcelWriter.writeString(parcel, 17, metadata.mPlusPageType, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            SafeParcelWriter.writeTypedList(parcel, 16, metadata.mPeopleInCommon, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            SafeParcelWriter.writeParcelable(parcel, 18, metadata.mProfileOwnerStats, i, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        java.util.ArrayList arraylist8 = null;
        java.util.ArrayList arraylist7 = null;
        java.util.ArrayList arraylist6 = null;
        boolean flag2 = false;
        java.util.ArrayList arraylist5 = null;
        java.util.ArrayList arraylist4 = null;
        boolean flag1 = false;
        java.util.ArrayList arraylist3 = null;
        boolean flag = false;
        java.util.ArrayList arraylist2 = null;
        long l = 0L;
        String s2 = null;
        String s1 = null;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
        String s = null;
        DefaultPersonImpl.Metadata.ProfileOwnerStats profileownerstats = null;
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
                    arraylist8 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Metadata.Affinities.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist7 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    arraylist6 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    arraylist5 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    arraylist4 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    arraylist3 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    arraylist2 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    l = SafeParcelReader.readLong(parcel, k);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    arraylist1 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 17: // '\021'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 16: // '\020'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.CREATOR);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 18: // '\022'
                    profileownerstats = (DefaultPersonImpl.Metadata.ProfileOwnerStats)SafeParcelReader.createParcelable(parcel, k, DefaultPersonImpl.Metadata.ProfileOwnerStats.CREATOR);
                    hashset.add(Integer.valueOf(18));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new DefaultPersonImpl.Metadata(hashset, i, arraylist8, arraylist7, arraylist6, flag2, arraylist5, arraylist4, flag1, arraylist3, flag, arraylist2, l, s2, s1, arraylist1, arraylist, s, profileownerstats);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new DefaultPersonImpl.Metadata[i];
    }
}
