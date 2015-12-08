// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.signin.GoogleSignInAccount;

public final class lpa
    implements android.os.Parcelable.Creator
{

    public lpa()
    {
    }

    public static void a(GoogleSignInAccount googlesigninaccount, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, googlesigninaccount.a);
        b.a(parcel, 2, googlesigninaccount.b, false);
        b.a(parcel, 3, googlesigninaccount.c, false);
        b.a(parcel, 4, googlesigninaccount.d, false);
        b.a(parcel, 5, googlesigninaccount.e, false);
        b.a(parcel, 6, googlesigninaccount.f, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = b.b(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = b.i(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = b.i(parcel, k);
                    break;

                case 5: // '\005'
                    s = b.i(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)b.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GoogleSignInAccount(i, s3, s2, s1, s, uri);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GoogleSignInAccount[i];
    }
}
