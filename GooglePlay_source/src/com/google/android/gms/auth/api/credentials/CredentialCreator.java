// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            Credential, IdToken

public final class CredentialCreator
    implements android.os.Parcelable.Creator
{

    public CredentialCreator()
    {
    }

    static void writeToParcel(Credential credential, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, credential.mId, false);
        SafeParcelWriter.writeInt(parcel, 1000, credential.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, credential.mName, false);
        SafeParcelWriter.writeParcelable(parcel, 3, credential.mProfilePictureUri, i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, credential.mIdTokens, false);
        SafeParcelWriter.writeString(parcel, 5, credential.mPassword, false);
        SafeParcelWriter.writeString(parcel, 6, credential.mAccountType, false);
        SafeParcelWriter.writeString(parcel, 7, credential.mGeneratedPassword, false);
        SafeParcelWriter.writeString(parcel, 8, credential.mGeneratedHintId, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        java.util.ArrayList arraylist = null;
        Uri uri = null;
        String s4 = null;
        String s5 = null;
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
                    s5 = SafeParcelReader.createString(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, IdToken.CREATOR);
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
                return new Credential(i, s5, s4, uri, arraylist, s3, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Credential[i];
    }
}
