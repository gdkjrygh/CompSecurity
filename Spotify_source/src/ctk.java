// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;

public final class ctk
    implements android.os.Parcelable.Creator
{

    public ctk()
    {
    }

    public static void a(ConnectionConfiguration connectionconfiguration, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, connectionconfiguration.a);
        brp.a(parcel, 2, connectionconfiguration.b);
        brp.a(parcel, 3, connectionconfiguration.c);
        brp.b(parcel, 4, connectionconfiguration.d);
        brp.b(parcel, 5, connectionconfiguration.e);
        brp.a(parcel, 6, connectionconfiguration.f);
        brp.a(parcel, 7, connectionconfiguration.g);
        brp.a(parcel, 8, connectionconfiguration.h);
        brp.a(parcel, 9, connectionconfiguration.i);
        brp.a(parcel, 10, connectionconfiguration.j);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = zza.a(parcel);
        String s1 = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        int j = 0;
        String s2 = null;
        String s3 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = zza.h(parcel, i1);
                    break;

                case 3: // '\003'
                    s2 = zza.h(parcel, i1);
                    break;

                case 4: // '\004'
                    j = zza.e(parcel, i1);
                    break;

                case 5: // '\005'
                    i = zza.e(parcel, i1);
                    break;

                case 6: // '\006'
                    flag2 = zza.c(parcel, i1);
                    break;

                case 7: // '\007'
                    flag1 = zza.c(parcel, i1);
                    break;

                case 8: // '\b'
                    s1 = zza.h(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = zza.c(parcel, i1);
                    break;

                case 10: // '\n'
                    s = zza.h(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ConnectionConfiguration(k, s3, s2, j, i, flag2, flag1, s1, flag, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ConnectionConfiguration[i];
    }
}
