// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            GoogleSignInAccount

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(GoogleSignInAccount googlesigninaccount, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, googlesigninaccount.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, googlesigninaccount.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, googlesigninaccount.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, googlesigninaccount.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, googlesigninaccount.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, googlesigninaccount.g, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, googlesigninaccount.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, googlesigninaccount.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = zza.a(parcel);
        int i = 0;
        long l = 0L;
        Uri uri = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
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
                    s4 = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    s3 = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = zza.l(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = zza.l(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)zza.a(parcel, k, Uri.CREATOR);
                    break;

                case 7: // '\007'
                    s = zza.l(parcel, k);
                    break;

                case 8: // '\b'
                    l = zza.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GoogleSignInAccount(i, s4, s3, s2, s1, uri, s, l);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GoogleSignInAccount[i];
    }
}
