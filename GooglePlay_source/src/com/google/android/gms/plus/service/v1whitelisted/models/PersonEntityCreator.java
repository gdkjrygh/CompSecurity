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
//            PersonEntity

public final class PersonEntityCreator
    implements android.os.Parcelable.Creator
{

    public PersonEntityCreator()
    {
    }

    static void writeToParcel(PersonEntity personentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = personentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(16)))
        {
            SafeParcelWriter.writeParcelable(parcel, 16, personentity.mImage, i, true);
        }
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, personentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(32)))
        {
            SafeParcelWriter.writeString(parcel, 32, personentity.mUrl, true);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            SafeParcelWriter.writeParcelable(parcel, 20, personentity.mName, i, true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            SafeParcelWriter.writeString(parcel, 22, personentity.mObjectType, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeString(parcel, 9, personentity.mDisplayName, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeTypedList(parcel, 11, personentity.mEmails, true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            SafeParcelWriter.writeParcelable(parcel, 29, personentity.mStatusForViewer, i, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeString(parcel, 12, personentity.mEtag, true);
        }
        if (set.contains(Integer.valueOf(30)))
        {
            SafeParcelWriter.writeString(parcel, 30, personentity.mSuggestionId, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            SafeParcelWriter.writeString(parcel, 15, personentity.mId, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s5 = null;
        java.util.ArrayList arraylist = null;
        String s4 = null;
        String s3 = null;
        PersonEntity.ImageEntity imageentity = null;
        PersonEntity.NameEntity nameentity = null;
        String s2 = null;
        PersonEntity.StatusForViewerEntity statusforviewerentity = null;
        String s1 = null;
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

                case 16: // '\020'
                    imageentity = (PersonEntity.ImageEntity)SafeParcelReader.createParcelable(parcel, k, PersonEntity.ImageEntity.CREATOR);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 32: // ' '
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(32));
                    break;

                case 20: // '\024'
                    nameentity = (PersonEntity.NameEntity)SafeParcelReader.createParcelable(parcel, k, PersonEntity.NameEntity.CREATOR);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 22: // '\026'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 9: // '\t'
                    s5 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 11: // '\013'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, PersonEntity.EmailsEntity.CREATOR);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 29: // '\035'
                    statusforviewerentity = (PersonEntity.StatusForViewerEntity)SafeParcelReader.createParcelable(parcel, k, PersonEntity.StatusForViewerEntity.CREATOR);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 12: // '\f'
                    s4 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 30: // '\036'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(30));
                    break;

                case 15: // '\017'
                    s3 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(15));
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PersonEntity(hashset, i, s5, arraylist, s4, s3, imageentity, nameentity, s2, statusforviewerentity, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PersonEntity[i];
    }
}
