// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            FacebookSignInConfig

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(FacebookSignInConfig facebooksigninconfig, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, facebooksigninconfig.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, facebooksigninconfig.b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, facebooksigninconfig.a());
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    intent = (Intent)zza.a(parcel, k, Intent.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = zza.t(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
