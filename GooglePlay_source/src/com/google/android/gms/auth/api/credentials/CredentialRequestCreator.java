// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialRequest, CredentialPickerConfig

public final class CredentialRequestCreator
    implements android.os.Parcelable.Creator
{

    public CredentialRequestCreator()
    {
    }

    static void writeToParcel(CredentialRequest credentialrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeBoolean(parcel, 1, credentialrequest.mPasswordLoginSupported);
        SafeParcelWriter.writeInt(parcel, 1000, credentialrequest.mVersionCode);
        SafeParcelWriter.writeStringArray(parcel, 2, credentialrequest.mAccountTypes, false);
        SafeParcelWriter.writeParcelable(parcel, 3, credentialrequest.mCredentialPickerConfig, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, credentialrequest.mCredentialHintPickerConfig, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        CredentialPickerConfig credentialpickerconfig = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        CredentialPickerConfig credentialpickerconfig1 = null;
        String as[] = null;
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
                    as = SafeParcelReader.createStringArray(parcel, k);
                    break;

                case 3: // '\003'
                    credentialpickerconfig1 = (CredentialPickerConfig)SafeParcelReader.createParcelable(parcel, k, CredentialPickerConfig.CREATOR);
                    break;

                case 4: // '\004'
                    credentialpickerconfig = (CredentialPickerConfig)SafeParcelReader.createParcelable(parcel, k, CredentialPickerConfig.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CredentialRequest(i, flag, as, credentialpickerconfig1, credentialpickerconfig);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CredentialRequest[i];
    }
}
