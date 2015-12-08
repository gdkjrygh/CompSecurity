// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;
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

    public final int a()
    {
        return e;
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
            if (b != ((ActivityRecognitionResult) (obj)).b || c != ((ActivityRecognitionResult) (obj)).c || d != ((ActivityRecognitionResult) (obj)).d || !x.a(a, ((ActivityRecognitionResult) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Long.valueOf(b), Long.valueOf(c), Integer.valueOf(d), a
        });
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
