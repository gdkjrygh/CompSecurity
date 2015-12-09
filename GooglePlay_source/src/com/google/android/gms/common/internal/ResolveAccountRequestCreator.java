// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountRequest

public final class ResolveAccountRequestCreator
    implements android.os.Parcelable.Creator
{

    public ResolveAccountRequestCreator()
    {
    }

    static void writeToParcel(ResolveAccountRequest resolveaccountrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, resolveaccountrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, resolveaccountrequest.mAccount, i, false);
        SafeParcelWriter.writeInt(parcel, 3, resolveaccountrequest.mSessionId);
        SafeParcelWriter.writeParcelable(parcel, 4, resolveaccountrequest.mSignInAccountHint, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        Account account = null;
        int i = 0;
        GoogleSignInAccount googlesigninaccount = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    account = (Account)SafeParcelReader.createParcelable(parcel, l, Account.CREATOR);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 4: // '\004'
                    googlesigninaccount = (GoogleSignInAccount)SafeParcelReader.createParcelable(parcel, l, GoogleSignInAccount.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ResolveAccountRequest(i, account, j, googlesigninaccount);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ResolveAccountRequest[i];
    }
}
