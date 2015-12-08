// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.o:
//            d

public final class a
    implements c
{

    public static final d CREATOR = new d();
    final int a;
    List b;
    long c;
    long d;
    int e;

    public a(int i, List list, long l, long l1, int j)
    {
        a = i;
        b = list;
        c = l;
        d = l1;
        e = j;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        String s = String.valueOf(b);
        long l = c;
        long l1 = d;
        return (new StringBuilder(String.valueOf(s).length() + 124)).append("ActivityRecognitionResult [probableActivities=").append(s).append(", timeMillis=").append(l).append(", elapsedRealtimeMillis=").append(l1).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.m4b.maps.o.d.a(this, parcel);
    }

}
