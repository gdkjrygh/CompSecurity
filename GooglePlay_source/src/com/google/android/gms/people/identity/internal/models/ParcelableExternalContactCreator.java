// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            ParcelableExternalContact

public final class ParcelableExternalContactCreator
    implements android.os.Parcelable.Creator
{

    public ParcelableExternalContactCreator()
    {
    }

    static void writeToParcel$efa4e56(ParcelableExternalContact parcelableexternalcontact, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, parcelableexternalcontact.getDataUriString(), false);
        SafeParcelWriter.writeInt(parcel, 1000, parcelableexternalcontact.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, parcelableexternalcontact.getHeader(), false);
        SafeParcelWriter.writeInt(parcel, 3, parcelableexternalcontact.getIconRes());
        SafeParcelWriter.writeString(parcel, 4, parcelableexternalcontact.getDetail(), false);
        SafeParcelWriter.writeString(parcel, 5, parcelableexternalcontact.getResourcePackageName(), false);
        SafeParcelWriter.writeString(parcel, 6, parcelableexternalcontact.getMimeType(), false);
        SafeParcelWriter.writeInt(parcel, 7, parcelableexternalcontact.getTitleRes());
        SafeParcelWriter.writeString(parcel, 8, parcelableexternalcontact.getAccountType(), false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int j = 0;
        String s4 = null;
        String s5 = null;
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
                    s5 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    s4 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    s3 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 5: // '\005'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 7: // '\007'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ParcelableExternalContact(k, s5, s4, j, s3, s2, s1, i, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParcelableExternalContact[i];
    }
}
