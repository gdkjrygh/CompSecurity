// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            FacebookSignInConfig

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(FacebookSignInConfig facebooksigninconfig, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, facebooksigninconfig.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, facebooksigninconfig.a(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, facebooksigninconfig.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Intent intent = null;
        int i = 0;
        java.util.ArrayList arraylist = null;
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
                    intent = (Intent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Intent.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FacebookSignInConfig(i, intent, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new FacebookSignInConfig[i];
    }
}
