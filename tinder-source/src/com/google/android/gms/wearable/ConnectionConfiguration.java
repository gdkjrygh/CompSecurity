// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.wearable:
//            v

public class ConnectionConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new v();
    final int a;
    final String b;
    final String c;
    final int d;
    final int e;
    final boolean f;
    boolean g;
    String h;
    boolean i;
    String j;

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

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ConnectionConfiguration)
        {
            if (t.a(Integer.valueOf(a), Integer.valueOf(((ConnectionConfiguration) (obj = (ConnectionConfiguration)obj)).a)) && t.a(b, ((ConnectionConfiguration) (obj)).b) && t.a(c, ((ConnectionConfiguration) (obj)).c) && t.a(Integer.valueOf(d), Integer.valueOf(((ConnectionConfiguration) (obj)).d)) && t.a(Integer.valueOf(e), Integer.valueOf(((ConnectionConfiguration) (obj)).e)) && t.a(Boolean.valueOf(f), Boolean.valueOf(((ConnectionConfiguration) (obj)).f)) && t.a(Boolean.valueOf(i), Boolean.valueOf(((ConnectionConfiguration) (obj)).i)))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c, Integer.valueOf(d), Integer.valueOf(e), Boolean.valueOf(f), Boolean.valueOf(i)
        });
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
        v.a(this, parcel);
    }

}
