// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionResult, DetectedActivity

public class ActivityRecognitionResultCreator
    implements android.os.Parcelable.Creator
{

    public ActivityRecognitionResultCreator()
    {
    }

    static void a(ActivityRecognitionResult activityrecognitionresult, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.c(parcel, 1, activityrecognitionresult.a, false);
        zzb.a(parcel, 1000, activityrecognitionresult.a());
        zzb.a(parcel, 2, activityrecognitionresult.b);
        zzb.a(parcel, 3, activityrecognitionresult.c);
        zzb.a(parcel, 4, activityrecognitionresult.d);
        zzb.a(parcel, i);
    }

    public ActivityRecognitionResult a(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int k = zza.b(parcel);
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
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
                    arraylist = zza.c(parcel, l, DetectedActivity.CREATOR);
                    break;

                case 1000: 
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = zza.h(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = zza.h(parcel, l);
                    break;

                case 4: // '\004'
                    i = zza.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ActivityRecognitionResult(j, arraylist, l2, l1, i);
            }
        } while (true);
    }

    public ActivityRecognitionResult[] a(int i)
    {
        return new ActivityRecognitionResult[i];
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
