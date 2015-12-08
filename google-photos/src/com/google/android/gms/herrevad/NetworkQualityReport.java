// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.herrevad;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.Set;
import kqz;

public class NetworkQualityReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kqz();
    public final int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public int f;
    public Bundle g;
    public boolean h;

    public NetworkQualityReport()
    {
        b = -1;
        c = -1L;
        d = -1L;
        e = -1L;
        f = -1;
        g = new Bundle();
        h = false;
        a = 1;
    }

    public NetworkQualityReport(int i, int j, long l, long l1, long l2, int k, Bundle bundle, boolean flag)
    {
        b = -1;
        c = -1L;
        d = -1L;
        e = -1L;
        f = -1;
        g = new Bundle();
        h = false;
        a = i;
        b = j;
        c = l;
        d = l1;
        e = l2;
        f = k;
        g = bundle;
        h = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getName()).append("[\n");
        stringbuilder.append("mLatencyMicros: ").append(b).append("\n");
        stringbuilder.append("mDurationMicros: ").append(c).append("\n");
        stringbuilder.append("mBytesDownloaded: ").append(d).append("\n");
        stringbuilder.append("mBytesUploaded: ").append(e).append("\n");
        stringbuilder.append("mMeasurementType: ").append(f).append("\n");
        stringbuilder.append("mIsNoConnectivity: ").append(h).append("\n");
        String s;
        for (Iterator iterator = g.keySet().iterator(); iterator.hasNext(); stringbuilder.append("custom param: ").append(s).append("/").append(g.getString(s)).append("\n"))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kqz.a(this, parcel);
    }

}
