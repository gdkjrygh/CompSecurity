// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentSectionEntity, AppContentActionEntity, AppContentCardEntity, AppContentAnnotationEntity

public final class AppContentSectionEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentSectionEntityCreator()
    {
    }

    static void writeToParcel$75c0ae2f(AppContentSectionEntity appcontentsectionentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeTypedList(parcel, 1, appcontentsectionentity.getActions(), false);
        SafeParcelWriter.writeInt(parcel, 1000, appcontentsectionentity.mVersionCode);
        SafeParcelWriter.writeTypedList(parcel, 3, appcontentsectionentity.getCards(), false);
        SafeParcelWriter.writeString(parcel, 4, appcontentsectionentity.mContentDescription, false);
        SafeParcelWriter.writeBundle(parcel, 5, appcontentsectionentity.getExtras(), false);
        SafeParcelWriter.writeString(parcel, 6, appcontentsectionentity.mSubtitle, false);
        SafeParcelWriter.writeString(parcel, 7, appcontentsectionentity.mTitle, false);
        SafeParcelWriter.writeString(parcel, 8, appcontentsectionentity.mType, false);
        SafeParcelWriter.writeString(parcel, 9, appcontentsectionentity.mId, false);
        SafeParcelWriter.writeString(parcel, 10, appcontentsectionentity.mCardType, false);
        SafeParcelWriter.writeTypedList(parcel, 14, appcontentsectionentity.getAnnotations(), false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        android.os.Bundle bundle = null;
        String s5 = null;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
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
                    arraylist2 = SafeParcelReader.createTypedList(parcel, k, AppContentActionEntity.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, AppContentCardEntity.CREATOR);
                    break;

                case 4: // '\004'
                    s5 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 6: // '\006'
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 9: // '\t'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 10: // '\n'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 14: // '\016'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, AppContentAnnotationEntity.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AppContentSectionEntity(i, arraylist2, arraylist1, s5, bundle, s4, s3, s2, s1, s, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AppContentSectionEntity[i];
    }
}
