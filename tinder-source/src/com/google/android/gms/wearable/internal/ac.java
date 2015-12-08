// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            MessageEventParcelable

public final class ac
    implements android.os.Parcelable.Creator
{

    public ac()
    {
    }

    static void a(MessageEventParcelable messageeventparcelable, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, messageeventparcelable.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, messageeventparcelable.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, messageeventparcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, messageeventparcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, messageeventparcelable.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = zza.a(parcel);
        byte abyte0[] = null;
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
                    i = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    s1 = zza.l(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = zza.o(parcel, l);
                    break;

                case 5: // '\005'
                    s = zza.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new MessageEventParcelable(j, i, s1, abyte0, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new MessageEventParcelable[i];
    }
}
