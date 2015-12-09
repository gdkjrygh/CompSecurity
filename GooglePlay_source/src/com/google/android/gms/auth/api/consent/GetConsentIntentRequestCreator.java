// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.consent:
//            GetConsentIntentRequest

public final class GetConsentIntentRequestCreator
    implements android.os.Parcelable.Creator
{

    public GetConsentIntentRequestCreator()
    {
    }

    static void writeToParcel(GetConsentIntentRequest getconsentintentrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, getconsentintentrequest.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, getconsentintentrequest.mCallingPackage, false);
        SafeParcelWriter.writeInt(parcel, 3, getconsentintentrequest.mCallingUid);
        SafeParcelWriter.writeString(parcel, 4, getconsentintentrequest.mService, false);
        SafeParcelWriter.writeParcelable(parcel, 5, getconsentintentrequest.mAccount, i, false);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 6, getconsentintentrequest.mScopeDetails, i);
        SafeParcelWriter.writeBoolean(parcel, 7, getconsentintentrequest.mHasTitle);
        SafeParcelWriter.writeInt(parcel, 8, getconsentintentrequest.mTitle);
        SafeParcelWriter.writeString(parcel, 9, getconsentintentrequest.mConsentCookieWrapper, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag = false;
        ScopeDetail ascopedetail[] = null;
        Account account = null;
        String s1 = null;
        int j = 0;
        String s2 = null;
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
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 5: // '\005'
                    account = (Account)SafeParcelReader.createParcelable(parcel, i1, Account.CREATOR);
                    break;

                case 6: // '\006'
                    ascopedetail = (ScopeDetail[])SafeParcelReader.createTypedArray(parcel, i1, ScopeDetail.CREATOR);
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 8: // '\b'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GetConsentIntentRequest(k, s2, j, s1, account, ascopedetail, flag, i, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GetConsentIntentRequest[i];
    }
}
