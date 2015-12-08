// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.UserQuota;

public final class loa
    implements android.os.Parcelable.Creator
{

    public loa()
    {
    }

    public static void a(AutoBackupSettings autobackupsettings, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, autobackupsettings.a);
        b.a(parcel, 2, autobackupsettings.b, false);
        b.a(parcel, 3, autobackupsettings.c);
        b.a(parcel, 4, autobackupsettings.d);
        b.a(parcel, 5, autobackupsettings.e);
        b.a(parcel, 6, autobackupsettings.f);
        b.a(parcel, 7, autobackupsettings.g);
        b.a(parcel, 8, autobackupsettings.h);
        b.a(parcel, 9, autobackupsettings.i);
        b.a(parcel, 10, autobackupsettings.j);
        b.a(parcel, 11, autobackupsettings.k, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        UserQuota userquota = null;
        boolean flag = false;
        int j = b.b(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        boolean flag7 = false;
        String s = null;
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
                    s = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    flag7 = b.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag6 = b.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag5 = b.c(parcel, k);
                    break;

                case 6: // '\006'
                    flag4 = b.c(parcel, k);
                    break;

                case 7: // '\007'
                    flag3 = b.c(parcel, k);
                    break;

                case 8: // '\b'
                    flag2 = b.c(parcel, k);
                    break;

                case 9: // '\t'
                    flag1 = b.c(parcel, k);
                    break;

                case 10: // '\n'
                    flag = b.c(parcel, k);
                    break;

                case 11: // '\013'
                    userquota = (UserQuota)b.a(parcel, k, UserQuota.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AutoBackupSettings(i, s, flag7, flag6, flag5, flag4, flag3, flag2, flag1, flag, userquota);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AutoBackupSettings[i];
    }
}
