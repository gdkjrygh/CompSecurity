// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            EmailSignInConfig

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(EmailSignInConfig emailsigninconfig, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, emailsigninconfig.a);
        c.a(parcel, 2, emailsigninconfig.a(), i, false);
        c.a(parcel, 3, emailsigninconfig.c(), false);
        c.a(parcel, 4, emailsigninconfig.b(), i, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        Uri uri = null;
        int i = 0;
        Uri uri1 = null;
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
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 4: // '\004'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new EmailSignInConfig(i, uri, s, uri1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new EmailSignInConfig[i];
    }
}
