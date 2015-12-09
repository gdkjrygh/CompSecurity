// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.signin.internal:
//            RecordConsentRequest

public final class RecordConsentRequestCreator
    implements android.os.Parcelable.Creator
{

    public RecordConsentRequestCreator()
    {
    }

    static void writeToParcel(RecordConsentRequest recordconsentrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, recordconsentrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, recordconsentrequest.mAccount, i, false);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 3, recordconsentrequest.mScopesToConsent, i);
        SafeParcelWriter.writeString(parcel, 4, recordconsentrequest.mServerClientId, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        Scope ascope[] = null;
        Account account = null;
        int i = 0;
        String s = null;
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
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;

                case 3: // '\003'
                    ascope = (Scope[])SafeParcelReader.createTypedArray(parcel, k, Scope.CREATOR);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RecordConsentRequest(i, account, ascope, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new RecordConsentRequest[i];
    }
}
