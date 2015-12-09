// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionResult, DetectedActivity

public final class ActivityRecognitionResultCreator
    implements android.os.Parcelable.Creator
{

    public ActivityRecognitionResultCreator()
    {
    }

    static void writeToParcel$193b9a6d(ActivityRecognitionResult activityrecognitionresult, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeTypedList(parcel, 1, activityrecognitionresult.probableActivities, false);
        SafeParcelWriter.writeInt(parcel, 1000, activityrecognitionresult.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, activityrecognitionresult.timeMillis);
        SafeParcelWriter.writeLong(parcel, 3, activityrecognitionresult.elapsedRealtimeMillis);
        SafeParcelWriter.writeInt(parcel, 4, activityrecognitionresult.detectorInfoId);
        SafeParcelWriter.writeBundle(parcel, 5, activityrecognitionresult.extras, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        android.os.Bundle bundle = null;
        int i = 0;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        long l2 = 0L;
        java.util.ArrayList arraylist = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist = SafeParcelReader.createTypedList(parcel, l, DetectedActivity.CREATOR);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 5: // '\005'
                    bundle = SafeParcelReader.createBundle(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ActivityRecognitionResult(j, arraylist, l2, l1, i, bundle);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ActivityRecognitionResult[i];
    }
}
