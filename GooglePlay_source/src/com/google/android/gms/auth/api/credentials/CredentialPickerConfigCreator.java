// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialPickerConfig

public final class CredentialPickerConfigCreator
    implements android.os.Parcelable.Creator
{

    public CredentialPickerConfigCreator()
    {
    }

    static void writeToParcel$13561712(CredentialPickerConfig credentialpickerconfig, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeBoolean(parcel, 1, credentialpickerconfig.mShowAddAccountButton);
        SafeParcelWriter.writeInt(parcel, 1000, credentialpickerconfig.mVersionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, credentialpickerconfig.mShowCancelButton);
        SafeParcelWriter.writeBoolean(parcel, 3, credentialpickerconfig.mForNewAccount);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag2 = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        boolean flag = false;
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
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 3: // '\003'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CredentialPickerConfig(i, flag, flag1, flag2);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CredentialPickerConfig[i];
    }
}
