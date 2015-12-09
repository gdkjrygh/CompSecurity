// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            GoogleSignInOptions

public final class GoogleSignInOptionsCreator
    implements android.os.Parcelable.Creator
{

    public GoogleSignInOptionsCreator()
    {
    }

    static void writeToParcel(GoogleSignInOptions googlesigninoptions, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, googlesigninoptions.versionCode);
        SafeParcelWriter.writeTypedList(parcel, 2, googlesigninoptions.getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, googlesigninoptions.mAccount, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, googlesigninoptions.mIdTokenRequested);
        SafeParcelWriter.writeBoolean(parcel, 5, googlesigninoptions.mServerAuthCodeRequested);
        SafeParcelWriter.writeBoolean(parcel, 6, googlesigninoptions.mForceCodeForRefreshToken);
        SafeParcelWriter.writeString(parcel, 7, googlesigninoptions.mServerClientId, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        Account account = null;
        java.util.ArrayList arraylist = null;
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
                    arraylist = SafeParcelReader.createTypedList(parcel, k, Scope.CREATOR);
                    break;

                case 3: // '\003'
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;

                case 4: // '\004'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 6: // '\006'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GoogleSignInOptions(i, arraylist, account, flag2, flag1, flag, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GoogleSignInOptions[i];
    }
}
