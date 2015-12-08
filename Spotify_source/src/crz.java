// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class crz
    implements android.os.Parcelable.Creator
{

    public crz()
    {
    }

    public static void a(MessageEventParcelable messageeventparcelable, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, messageeventparcelable.a);
        brp.b(parcel, 2, messageeventparcelable.b);
        brp.a(parcel, 3, messageeventparcelable.c);
        brp.a(parcel, 4, messageeventparcelable.d);
        brp.a(parcel, 5, messageeventparcelable.e);
        brp.b(parcel, i);
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
                    s1 = zza.h(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = zza.k(parcel, l);
                    break;

                case 5: // '\005'
                    s = zza.h(parcel, l);
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
