// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location:
//            DetectedActivity, ActivityRecognitionResult

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    public static ActivityRecognitionResult a(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int k = zza.a(parcel);
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
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
                    arraylist = zza.c(parcel, l, DetectedActivity.CREATOR);
                    break;

                case 1000: 
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = zza.f(parcel, l);
                    break;

                case 4: // '\004'
                    i = zza.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ActivityRecognitionResult(j, arraylist, l2, l1, i);
            }
        } while (true);
    }

    static void a(ActivityRecognitionResult activityrecognitionresult, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 1, activityrecognitionresult.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, activityrecognitionresult.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, activityrecognitionresult.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, activityrecognitionresult.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, activityrecognitionresult.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ActivityRecognitionResult[i];
    }
}
