// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;

public final class lgp
    implements android.os.Parcelable.Creator
{

    public lgp()
    {
    }

    public static ActivityRecognitionResult a(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int k = b.b(parcel);
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
                    b.b(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist = b.c(parcel, l, DetectedActivity.CREATOR);
                    break;

                case 1000: 
                    j = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = b.f(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = b.f(parcel, l);
                    break;

                case 4: // '\004'
                    i = b.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ActivityRecognitionResult(j, arraylist, l2, l1, i);
            }
        } while (true);
    }

    public static void a(ActivityRecognitionResult activityrecognitionresult, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, activityrecognitionresult.b, false);
        b.c(parcel, 1000, activityrecognitionresult.a);
        b.a(parcel, 2, activityrecognitionresult.c);
        b.a(parcel, 3, activityrecognitionresult.d);
        b.c(parcel, 4, activityrecognitionresult.e);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ActivityRecognitionResult[i];
    }
}
