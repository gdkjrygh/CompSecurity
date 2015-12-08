// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            MessageEventParcelable

public class zzaw
    implements android.os.Parcelable.Creator
{

    public zzaw()
    {
    }

    static void a(MessageEventParcelable messageeventparcelable, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, messageeventparcelable.a);
        zzb.a(parcel, 2, messageeventparcelable.b());
        zzb.a(parcel, 3, messageeventparcelable.a(), false);
        zzb.a(parcel, 4, messageeventparcelable.c(), false);
        zzb.a(parcel, 5, messageeventparcelable.d(), false);
        zzb.a(parcel, i);
    }

    public MessageEventParcelable a(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = zza.b(parcel);
        byte abyte0[] = null;
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    i = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    s1 = zza.m(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = zza.p(parcel, l);
                    break;

                case 5: // '\005'
                    s = zza.m(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new MessageEventParcelable(j, i, s1, abyte0, s);
            }
        } while (true);
    }

    public MessageEventParcelable[] a(int i)
    {
        return new MessageEventParcelable[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
