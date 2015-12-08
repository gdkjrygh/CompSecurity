// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionResultCreator

public class ActivityRecognitionResult
    implements SafeParcelable
{

    public static final ActivityRecognitionResultCreator CREATOR = new ActivityRecognitionResultCreator();
    List a;
    long b;
    long c;
    int d;
    private final int e;

    public ActivityRecognitionResult(int i, List list, long l, long l1, int j)
    {
        e = i;
        a = list;
        b = l;
        c = l1;
        d = j;
    }

    public int a()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActivityRecognitionResult [probableActivities=").append(a).append(", timeMillis=").append(b).append(", elapsedRealtimeMillis=").append(c).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ActivityRecognitionResultCreator.a(this, parcel, i);
    }

}
