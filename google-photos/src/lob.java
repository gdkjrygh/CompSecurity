// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;

public final class lob
    implements android.os.Parcelable.Creator
{

    public lob()
    {
    }

    public static void a(AutoBackupStatus autobackupstatus, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, autobackupstatus.a);
        b.c(parcel, 2, autobackupstatus.b);
        b.a(parcel, 3, autobackupstatus.c, false);
        b.a(parcel, 4, autobackupstatus.d, false);
        b.a(parcel, 5, autobackupstatus.e);
        b.c(parcel, 6, autobackupstatus.f);
        b.c(parcel, 7, autobackupstatus.g);
        b.c(parcel, 8, autobackupstatus.h);
        b.a(parcel, 9, autobackupstatus.i, false);
        b.a(parcel, 10, autobackupstatus.j, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int j1 = b.b(parcel);
        float f = 0.0F;
        String as[] = null;
        int j = 0;
        int k = 0;
        String s1 = null;
        String s2 = null;
        int l = 0;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    b.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = b.e(parcel, k1);
                    break;

                case 2: // '\002'
                    l = b.e(parcel, k1);
                    break;

                case 3: // '\003'
                    s2 = b.i(parcel, k1);
                    break;

                case 4: // '\004'
                    s1 = b.i(parcel, k1);
                    break;

                case 5: // '\005'
                    f = b.g(parcel, k1);
                    break;

                case 6: // '\006'
                    k = b.e(parcel, k1);
                    break;

                case 7: // '\007'
                    j = b.e(parcel, k1);
                    break;

                case 8: // '\b'
                    i = b.e(parcel, k1);
                    break;

                case 9: // '\t'
                    as = b.n(parcel, k1);
                    break;

                case 10: // '\n'
                    s = b.i(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new AutoBackupStatus(i1, l, s2, s1, f, k, j, i, as, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AutoBackupStatus[i];
    }
}
