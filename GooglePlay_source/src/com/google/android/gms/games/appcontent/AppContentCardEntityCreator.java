// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentCardEntity, AppContentActionEntity, AppContentAnnotationEntity, AppContentConditionEntity

public final class AppContentCardEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentCardEntityCreator()
    {
    }

    static void writeToParcel$2971ee70(AppContentCardEntity appcontentcardentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeTypedList(parcel, 1, appcontentcardentity.getActions(), false);
        SafeParcelWriter.writeInt(parcel, 1000, appcontentcardentity.mVersionCode);
        SafeParcelWriter.writeTypedList(parcel, 2, appcontentcardentity.getAnnotations(), false);
        SafeParcelWriter.writeTypedList(parcel, 3, appcontentcardentity.getConditions(), false);
        SafeParcelWriter.writeString(parcel, 4, appcontentcardentity.mContentDescription, false);
        SafeParcelWriter.writeInt(parcel, 5, appcontentcardentity.mCurrentProgress);
        SafeParcelWriter.writeString(parcel, 6, appcontentcardentity.mDescription, false);
        SafeParcelWriter.writeBundle(parcel, 7, appcontentcardentity.getExtras(), false);
        SafeParcelWriter.writeString(parcel, 10, appcontentcardentity.mSubtitle, false);
        SafeParcelWriter.writeString(parcel, 11, appcontentcardentity.mTitle, false);
        SafeParcelWriter.writeInt(parcel, 12, appcontentcardentity.mTotalProgress);
        SafeParcelWriter.writeString(parcel, 13, appcontentcardentity.mType, false);
        SafeParcelWriter.writeString(parcel, 14, appcontentcardentity.mId, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int k = 0;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
        String s5 = null;
        int j = 0;
        String s4 = null;
        android.os.Bundle bundle = null;
        String s3 = null;
        String s2 = null;
        int i = 0;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    arraylist2 = SafeParcelReader.createTypedList(parcel, i1, AppContentActionEntity.CREATOR);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, i1, AppContentAnnotationEntity.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = SafeParcelReader.createTypedList(parcel, i1, AppContentConditionEntity.CREATOR);
                    break;

                case 4: // '\004'
                    s5 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 5: // '\005'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 6: // '\006'
                    s4 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 7: // '\007'
                    bundle = SafeParcelReader.createBundle(parcel, i1);
                    break;

                case 10: // '\n'
                    s3 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 11: // '\013'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 12: // '\f'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 13: // '\r'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 14: // '\016'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AppContentCardEntity(k, arraylist2, arraylist1, arraylist, s5, j, s4, bundle, s3, s2, i, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AppContentCardEntity[i];
    }
}
