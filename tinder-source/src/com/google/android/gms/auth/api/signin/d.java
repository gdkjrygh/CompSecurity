// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            GoogleSignInConfig

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(GoogleSignInConfig googlesigninconfig, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, googlesigninconfig.e);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 2, googlesigninconfig.a());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, googlesigninconfig.f, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, googlesigninconfig.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, googlesigninconfig.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, googlesigninconfig.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, googlesigninconfig.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = zza.c(parcel, k, Scope.CREATOR);
                    break;

                case 3: // '\003'
                    account = (Account)zza.a(parcel, k, Account.CREATOR);
                    break;

                case 4: // '\004'
                    flag2 = zza.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag1 = zza.c(parcel, k);
                    break;

                case 6: // '\006'
                    flag = zza.c(parcel, k);
                    break;

                case 7: // '\007'
                    s = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GoogleSignInConfig(i, arraylist, account, flag2, flag1, flag, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GoogleSignInConfig[i];
    }
}
