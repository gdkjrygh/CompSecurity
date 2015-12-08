// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableCollaborator

public final class ParcelableCollaboratorCreator
    implements android.os.Parcelable.Creator
{

    public ParcelableCollaboratorCreator()
    {
    }

    static void writeToParcel$65d9073c(ParcelableCollaborator parcelablecollaborator, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, parcelablecollaborator.mVersionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, parcelablecollaborator.mIsMe);
        SafeParcelWriter.writeBoolean(parcel, 3, parcelablecollaborator.mIsAnonymous);
        SafeParcelWriter.writeString(parcel, 4, parcelablecollaborator.mSessionId, false);
        SafeParcelWriter.writeString(parcel, 5, parcelablecollaborator.mUserId, false);
        SafeParcelWriter.writeString(parcel, 6, parcelablecollaborator.mDisplayName, false);
        SafeParcelWriter.writeString(parcel, 7, parcelablecollaborator.mColor, false);
        SafeParcelWriter.writeString(parcel, 8, parcelablecollaborator.mPhotoUrl, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        boolean flag1 = false;
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
                    break;

                case 2: // '\002'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ParcelableCollaborator(i, flag1, flag, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParcelableCollaborator[i];
    }
}
