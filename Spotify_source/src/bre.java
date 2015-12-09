// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bre
    implements android.os.Parcelable.Creator
{

    public bre()
    {
    }

    public static void a(Scope scope, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, scope.a);
        brp.a(parcel, 2, scope.b);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
        int i = 0;
        String s = null;
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
                    s = zza.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Scope(i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new Scope[i];
    }
}
