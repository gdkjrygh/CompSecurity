// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            a

public class ActivityRecognitionResult
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    List a;
    long b;
    long c;
    private final int d = 1;

    public ActivityRecognitionResult(List list, long l, long l1)
    {
        a = list;
        b = l;
        c = l1;
    }

    public final int a()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder("ActivityRecognitionResult [probableActivities=")).append(a).append(", timeMillis=").append(b).append(", elapsedRealtimeMillis=").append(c).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.a.a(this, parcel);
    }

}
