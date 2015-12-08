// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import csb;

public class NodeParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new csb();
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public NodeParcelable(int i, String s, String s1, int j, boolean flag)
    {
        a = i;
        b = s;
        c = s1;
        d = j;
        e = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof NodeParcelable))
        {
            return false;
        } else
        {
            return ((NodeParcelable)obj).b.equals(b);
        }
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("Node{")).append(c).append(", id=").append(b).append(", hops=").append(d).append(", isNearby=").append(e).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        csb.a(this, parcel);
    }

}
