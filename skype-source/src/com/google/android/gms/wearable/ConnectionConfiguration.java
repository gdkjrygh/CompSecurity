// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.wearable:
//            t

public class ConnectionConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new t();
    final int a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final boolean f;
    private boolean g;
    private String h;
    private boolean i;
    private String j;

    ConnectionConfiguration(int k, String s, String s1, int l, int i1, boolean flag, boolean flag1, 
            String s2, boolean flag2, String s3)
    {
        a = k;
        b = s;
        c = s1;
        d = l;
        e = i1;
        f = flag;
        g = flag1;
        h = s2;
        i = flag2;
        j = s3;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final int d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return g;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ConnectionConfiguration)
        {
            if (x.a(Integer.valueOf(a), Integer.valueOf(((ConnectionConfiguration) (obj = (ConnectionConfiguration)obj)).a)) && x.a(b, ((ConnectionConfiguration) (obj)).b) && x.a(c, ((ConnectionConfiguration) (obj)).c) && x.a(Integer.valueOf(d), Integer.valueOf(((ConnectionConfiguration) (obj)).d)) && x.a(Integer.valueOf(e), Integer.valueOf(((ConnectionConfiguration) (obj)).e)) && x.a(Boolean.valueOf(f), Boolean.valueOf(((ConnectionConfiguration) (obj)).f)) && x.a(Boolean.valueOf(i), Boolean.valueOf(((ConnectionConfiguration) (obj)).i)))
            {
                return true;
            }
        }
        return false;
    }

    public final String f()
    {
        return h;
    }

    public final boolean g()
    {
        return i;
    }

    public final String h()
    {
        return j;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c, Integer.valueOf(d), Integer.valueOf(e), Boolean.valueOf(f), Boolean.valueOf(i)
        });
    }

    public final boolean i()
    {
        return f;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder("mName=")).append(b).toString());
        stringbuilder.append((new StringBuilder(", mAddress=")).append(c).toString());
        stringbuilder.append((new StringBuilder(", mType=")).append(d).toString());
        stringbuilder.append((new StringBuilder(", mRole=")).append(e).toString());
        stringbuilder.append((new StringBuilder(", mEnabled=")).append(f).toString());
        stringbuilder.append((new StringBuilder(", mIsConnected=")).append(g).toString());
        stringbuilder.append((new StringBuilder(", mPeerNodeId=")).append(h).toString());
        stringbuilder.append((new StringBuilder(", mBtlePriority=")).append(i).toString());
        stringbuilder.append((new StringBuilder(", mNodeId=")).append(j).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        t.a(this, parcel);
    }

}
