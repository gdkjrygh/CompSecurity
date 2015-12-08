// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            z, ab, db, cd

public final class cz
    implements android.os.Parcelable.Creator
{

    public cz()
    {
    }

    public static cd a(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        db db1 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        PackageInfo packageinfo = null;
        ApplicationInfo applicationinfo = null;
        String s3 = null;
        ab ab1 = null;
        z z1 = null;
        android.os.Bundle bundle1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 3: // '\003'
                    z1 = (z)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, com.google.android.gms.internal.z.a);
                    break;

                case 4: // '\004'
                    ab1 = (ab)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, com.google.android.gms.internal.ab.a);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 11: // '\013'
                    db1 = (db)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, com.google.android.gms.internal.db.a);
                    break;

                case 12: // '\f'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new cd(i, bundle1, z1, ab1, s3, applicationinfo, packageinfo, s2, s1, s, db1, bundle);
            }
        } while (true);
    }

    static void a(cd cd1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, cd1.b);
        c.a(parcel, 2, cd1.c);
        c.a(parcel, 3, cd1.d, i, false);
        c.a(parcel, 4, cd1.e, i, false);
        c.a(parcel, 5, cd1.f, false);
        c.a(parcel, 6, cd1.g, i, false);
        c.a(parcel, 7, cd1.h, i, false);
        c.a(parcel, 8, cd1.i, false);
        c.a(parcel, 9, cd1.j, false);
        c.a(parcel, 10, cd1.k, false);
        c.a(parcel, 11, cd1.l, i, false);
        c.a(parcel, 12, cd1.m);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new cd[i];
    }
}
