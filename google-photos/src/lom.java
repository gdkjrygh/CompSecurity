// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.CheckServerAuthResult;

public final class lom
    implements android.os.Parcelable.Creator
{

    public lom()
    {
    }

    public static void a(CheckServerAuthResult checkserverauthresult, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, checkserverauthresult.a);
        b.a(parcel, 2, checkserverauthresult.b);
        b.c(parcel, 3, checkserverauthresult.c, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = b.b(parcel);
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
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag = b.c(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = b.c(parcel, k, Scope.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CheckServerAuthResult(i, flag, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CheckServerAuthResult[i];
    }
}
