// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            GetRecentContextCall, g

public static class c
    implements g, SafeParcelable
{

    public static final com.google.android.gms.appdatasearch.g CREATOR = new com.google.android.gms.appdatasearch.g();
    public Status a;
    public List b;
    public String c[];
    final int d;

    public int describeContents()
    {
        return 0;
    }

    public Status getStatus()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }


    public ()
    {
        d = 1;
    }

    d(int i, Status status, List list, String as[])
    {
        d = i;
        a = status;
        b = list;
        c = as;
    }
}
