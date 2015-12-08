// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.EmailSignInConfig;
import com.google.android.gms.auth.api.signin.FacebookSignInConfig;
import com.google.android.gms.auth.api.signin.GoogleSignInConfig;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//            SignInConfiguration

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(SignInConfiguration signinconfiguration, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, signinconfiguration.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, signinconfiguration.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, signinconfiguration.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, signinconfiguration.d, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, signinconfiguration.e, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, signinconfiguration.f, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, signinconfiguration.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = zza.a(parcel);
        int i = 0;
        FacebookSignInConfig facebooksigninconfig = null;
        GoogleSignInConfig googlesigninconfig = null;
        EmailSignInConfig emailsigninconfig = null;
        String s1 = null;
        String s2 = null;
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
                    s2 = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    emailsigninconfig = (EmailSignInConfig)zza.a(parcel, k, EmailSignInConfig.CREATOR);
                    break;

                case 5: // '\005'
                    googlesigninconfig = (GoogleSignInConfig)zza.a(parcel, k, GoogleSignInConfig.CREATOR);
                    break;

                case 6: // '\006'
                    facebooksigninconfig = (FacebookSignInConfig)zza.a(parcel, k, FacebookSignInConfig.CREATOR);
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
                return new SignInConfiguration(i, s2, s1, emailsigninconfig, googlesigninconfig, facebooksigninconfig, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new SignInConfiguration[i];
    }
}
