// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bog
    implements android.os.Parcelable.Creator
{

    public bog()
    {
    }

    public static void a(GoogleSignInAccount googlesigninaccount, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, googlesigninaccount.a);
        brp.a(parcel, 2, googlesigninaccount.b);
        brp.a(parcel, 3, googlesigninaccount.c);
        brp.a(parcel, 4, googlesigninaccount.d);
        brp.a(parcel, 5, googlesigninaccount.e);
        brp.a(parcel, 6, googlesigninaccount.f, i);
        brp.a(parcel, 7, googlesigninaccount.g);
        brp.a(parcel, 8, googlesigninaccount.h);
        brp.b(parcel, j);
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
                    s4 = zza.h(parcel, k);
                    break;

                case 3: // '\003'
                    s3 = zza.h(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = zza.h(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = zza.h(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)zza.a(parcel, k, Uri.CREATOR);
                    break;

                case 7: // '\007'
                    s = zza.h(parcel, k);
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
