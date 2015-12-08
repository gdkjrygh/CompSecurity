// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.EmailSignInConfig;
import com.google.android.gms.auth.api.signin.FacebookSignInConfig;
import com.google.android.gms.auth.api.signin.GoogleSignInConfig;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

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
        int j = c.a(parcel);
        c.a(parcel, 1, signinconfiguration.a);
        c.a(parcel, 2, signinconfiguration.a(), false);
        c.a(parcel, 3, signinconfiguration.b(), false);
        c.a(parcel, 4, signinconfiguration.c(), i, false);
        c.a(parcel, 5, signinconfiguration.d(), i, false);
        c.a(parcel, 6, signinconfiguration.e(), i, false);
        c.a(parcel, 7, signinconfiguration.f(), false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 4: // '\004'
                    emailsigninconfig = (EmailSignInConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, EmailSignInConfig.CREATOR);
                    break;

                case 5: // '\005'
                    googlesigninconfig = (GoogleSignInConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, GoogleSignInConfig.CREATOR);
                    break;

                case 6: // '\006'
                    facebooksigninconfig = (FacebookSignInConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, FacebookSignInConfig.CREATOR);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
