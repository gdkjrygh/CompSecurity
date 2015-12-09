// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAnnotationEntity

public final class AppContentAnnotationEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentAnnotationEntityCreator()
    {
    }

    static void writeToParcel(AppContentAnnotationEntity appcontentannotationentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, appcontentannotationentity.mDescription, false);
        SafeParcelWriter.writeInt(parcel, 1000, appcontentannotationentity.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, appcontentannotationentity.mImageUri, i, false);
        SafeParcelWriter.writeString(parcel, 3, appcontentannotationentity.mTitle, false);
        SafeParcelWriter.writeString(parcel, 5, appcontentannotationentity.mId, false);
        SafeParcelWriter.writeString(parcel, 6, appcontentannotationentity.mLayoutSlot, false);
        SafeParcelWriter.writeString(parcel, 7, appcontentannotationentity.mImageDefaultId, false);
        SafeParcelWriter.writeInt(parcel, 8, appcontentannotationentity.mImageHeight);
        SafeParcelWriter.writeInt(parcel, 9, appcontentannotationentity.mImageWidth);
        SafeParcelWriter.writeBundle(parcel, 10, appcontentannotationentity.getModifiers(), false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Uri uri = null;
        String s4 = null;
        int k = 0;
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
                    s4 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, i1, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    s3 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 5: // '\005'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 8: // '\b'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 9: // '\t'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 10: // '\n'
                    bundle = SafeParcelReader.createBundle(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AppContentAnnotationEntity(k, s4, uri, s3, s2, s1, s, j, i, bundle);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AppContentAnnotationEntity[i];
    }
}
