// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            a

public class ActivityRecognitionResult
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    final int a;
    List b;
    long c;
    long d;
    int e;

    public ActivityRecognitionResult(int i, List list, long l, long l1, int j)
    {
        a = i;
        b = list;
        c = l;
        d = l1;
        e = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ActivityRecognitionResult)obj;
            if (c != ((ActivityRecognitionResult) (obj)).c || d != ((ActivityRecognitionResult) (obj)).d || e != ((ActivityRecognitionResult) (obj)).e || !t.a(b, ((ActivityRecognitionResult) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Long.valueOf(c), Long.valueOf(d), Integer.valueOf(e), b
        });
    }

    public String toString()
    {
        return (new StringBuilder("ActivityRecognitionResult [probableActivities=")).append(b).append(", timeMillis=").append(c).append(", elapsedRealtimeMillis=").append(d).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.a.a(this, parcel);
    }

}
