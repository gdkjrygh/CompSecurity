// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//            ClientContext

public final class ClientContextCreator
    implements android.os.Parcelable.Creator
{

    public ClientContextCreator()
    {
    }

    static void writeToParcel(ClientContext clientcontext, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, clientcontext.mVersion);
        SafeParcelWriter.writeInt(parcel, 2, clientcontext.mCallingUid);
        SafeParcelWriter.writeParcelable(parcel, 3, clientcontext.mResolvedAccount, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, clientcontext.mRequestedAccount, i, false);
        SafeParcelWriter.writeString(parcel, 5, clientcontext.mCallingPackageName, false);
        SafeParcelWriter.writeString(parcel, 6, clientcontext.mAuthPackageName, false);
        SafeParcelWriter.writeStringList(parcel, 7, clientcontext.mGrantedScopes, false);
        SafeParcelWriter.writeStringList(parcel, 8, clientcontext.mVisibleActions, false);
        SafeParcelWriter.writeBundle(parcel, 9, clientcontext.mExtras, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        java.util.ArrayList arraylist1 = null;
        String s = null;
        String s1 = null;
        Account account = null;
        Account account1 = null;
        int j = 0;
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
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    account1 = (Account)SafeParcelReader.createParcelable(parcel, l, Account.CREATOR);
                    break;

                case 4: // '\004'
                    account = (Account)SafeParcelReader.createParcelable(parcel, l, Account.CREATOR);
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 7: // '\007'
                    arraylist1 = SafeParcelReader.createStringList(parcel, l);
                    break;

                case 8: // '\b'
                    arraylist = SafeParcelReader.createStringList(parcel, l);
                    break;

                case 9: // '\t'
                    bundle = SafeParcelReader.createBundle(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ClientContext(j, i, account1, account, s1, s, arraylist1, arraylist, bundle);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ClientContext[i];
    }
}
