// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.consent;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.consent:
//            ConsentResult

public final class ConsentResultCreator
    implements android.os.Parcelable.Creator
{

    public ConsentResultCreator()
    {
    }

    static void writeToParcel(ConsentResult consentresult, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, consentresult.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, consentresult.mStatus, false);
        SafeParcelWriter.writeString(parcel, 3, consentresult.mPaclBase64, false);
        SafeParcelWriter.writeParcelable(parcel, 4, consentresult.mFacl, i, false);
        SafeParcelWriter.writeString(parcel, 5, consentresult.mConsent, false);
        SafeParcelWriter.writeString(parcel, 6, consentresult.mConsentCookieWrapper, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s3 = "com.google.android.gms.auth.firstparty.shared.Status.UNKNOWN.toString()";
        String s1 = "com.google.android.gms.auth.firstparty.shared.Consent.UNKNOWN.toString()";
        FACLConfig faclconfig = null;
        String s2 = null;
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
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    faclconfig = (FACLConfig)SafeParcelReader.createParcelable(parcel, k, FACLConfig.CREATOR);
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ConsentResult(i, s3, s2, faclconfig, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ConsentResult[i];
    }
}
