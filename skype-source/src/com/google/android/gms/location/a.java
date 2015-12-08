// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

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
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, DetectedActivity.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ActivityRecognitionResult(j, arraylist, l2, l1, i);
            }
        } while (true);
    }

    static void a(ActivityRecognitionResult activityrecognitionresult, Parcel parcel)
    {
        int i = b.a(parcel);
        b.c(parcel, 1, activityrecognitionresult.a);
        b.a(parcel, 1000, activityrecognitionresult.a());
        b.a(parcel, 2, activityrecognitionresult.b);
        b.a(parcel, 3, activityrecognitionresult.c);
        b.a(parcel, 4, activityrecognitionresult.d);
        b.a(parcel, i);
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
