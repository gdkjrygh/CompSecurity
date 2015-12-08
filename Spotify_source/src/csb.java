// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class csb
    implements android.os.Parcelable.Creator
{

    public csb()
    {
    }

    public static void a(NodeParcelable nodeparcelable, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, nodeparcelable.a);
        brp.a(parcel, 2, nodeparcelable.b);
        brp.a(parcel, 3, nodeparcelable.c);
        brp.b(parcel, 4, nodeparcelable.d);
        brp.a(parcel, 5, nodeparcelable.e);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int k = zza.a(parcel);
        int i = 0;
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = zza.h(parcel, l);
                    break;

                case 3: // '\003'
                    s = zza.h(parcel, l);
                    break;

                case 4: // '\004'
                    i = zza.e(parcel, l);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NodeParcelable(j, s1, s, i, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new NodeParcelable[i];
    }
}
