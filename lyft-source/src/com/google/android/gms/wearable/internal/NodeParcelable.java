// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzay

public class NodeParcelable
    implements SafeParcelable, Node
{

    public static final android.os.Parcelable.Creator CREATOR = new zzay();
    final int a;
    private final String b;
    private final String c;
    private final int d;
    private final boolean e;

    NodeParcelable(int i, String s, String s1, int j, boolean flag)
    {
        a = i;
        b = s;
        c = s1;
        d = j;
        e = flag;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public boolean d()
    {
        return e;
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
        return (new StringBuilder()).append("Node{").append(c).append(", id=").append(b).append(", hops=").append(d).append(", isNearby=").append(e).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzay.a(this, parcel, i);
    }

}
