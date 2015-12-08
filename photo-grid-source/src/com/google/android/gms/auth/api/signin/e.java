// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            GoogleSignInConfig

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(GoogleSignInConfig googlesigninconfig, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, googlesigninconfig.e);
        c.b(parcel, 2, googlesigninconfig.a(), false);
        c.a(parcel, 3, googlesigninconfig.b(), i, false);
        c.a(parcel, 4, googlesigninconfig.c());
        c.a(parcel, 5, googlesigninconfig.d());
        c.a(parcel, 6, googlesigninconfig.e());
        c.a(parcel, 7, googlesigninconfig.f(), false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, Scope.CREATOR);
                    break;

                case 3: // '\003'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Account.CREATOR);
                    break;

                case 4: // '\004'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
