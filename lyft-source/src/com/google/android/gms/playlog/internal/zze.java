// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(PlayLoggerContext playloggercontext, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, playloggercontext.a);
        zzb.a(parcel, 2, playloggercontext.b, false);
        zzb.a(parcel, 3, playloggercontext.c);
        zzb.a(parcel, 4, playloggercontext.d);
        zzb.a(parcel, 5, playloggercontext.e, false);
        zzb.a(parcel, 6, playloggercontext.f, false);
        zzb.a(parcel, 7, playloggercontext.g);
        zzb.a(parcel, 8, playloggercontext.h, false);
        zzb.a(parcel, 9, playloggercontext.i);
        zzb.a(parcel, i);
    }

    public PlayLoggerContext a(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = zza.b(parcel);
        boolean flag1 = true;
        String s1 = null;
        String s2 = null;
        int i = 0;
        int j = 0;
        String s3 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = zza.a(parcel);
                switch (zza.a(i1))
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = zza.m(parcel, i1);
                    break;

                case 3: // '\003'
                    j = zza.f(parcel, i1);
                    break;

                case 4: // '\004'
                    i = zza.f(parcel, i1);
                    break;

                case 5: // '\005'
                    s2 = zza.m(parcel, i1);
                    break;

                case 6: // '\006'
                    s1 = zza.m(parcel, i1);
                    break;

                case 7: // '\007'
                    flag1 = zza.c(parcel, i1);
                    break;

                case 8: // '\b'
                    s = zza.m(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = zza.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new PlayLoggerContext(k, s3, j, i, s2, s1, flag1, s, flag);
            }
        } while (true);
    }

    public PlayLoggerContext[] a(int i)
    {
        return new PlayLoggerContext[i];
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
