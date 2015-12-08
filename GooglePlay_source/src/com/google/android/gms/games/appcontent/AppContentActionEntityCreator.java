// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentActionEntity, AppContentConditionEntity, AppContentAnnotationEntity

public final class AppContentActionEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentActionEntityCreator()
    {
    }

    static void writeToParcel(AppContentActionEntity appcontentactionentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeTypedList(parcel, 1, appcontentactionentity.getConditions(), false);
        SafeParcelWriter.writeInt(parcel, 1000, appcontentactionentity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, appcontentactionentity.mContentDescription, false);
        SafeParcelWriter.writeBundle(parcel, 3, appcontentactionentity.getExtras(), false);
        SafeParcelWriter.writeString(parcel, 6, appcontentactionentity.mType, false);
        SafeParcelWriter.writeString(parcel, 7, appcontentactionentity.mId, false);
        SafeParcelWriter.writeParcelable(parcel, 8, appcontentactionentity.getAnnotation(), i, false);
        SafeParcelWriter.writeString(parcel, 9, appcontentactionentity.mOverflowText, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        AppContentAnnotationEntity appcontentannotationentity = null;
        String s1 = null;
        String s2 = null;
        android.os.Bundle bundle = null;
        String s3 = null;
        java.util.ArrayList arraylist = null;
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
                    arraylist = SafeParcelReader.createTypedList(parcel, k, AppContentConditionEntity.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    appcontentannotationentity = (AppContentAnnotationEntity)SafeParcelReader.createParcelable(parcel, k, AppContentAnnotationEntity.CREATOR);
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AppContentActionEntity(i, arraylist, s3, bundle, s2, s1, appcontentannotationentity, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AppContentActionEntity[i];
    }
}
