// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.wearable:
//            zze

public class ConnectionConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
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

    public int d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return g;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ConnectionConfiguration)
        {
            if (zzt.a(Integer.valueOf(a), Integer.valueOf(((ConnectionConfiguration) (obj = (ConnectionConfiguration)obj)).a)) && zzt.a(b, ((ConnectionConfiguration) (obj)).b) && zzt.a(c, ((ConnectionConfiguration) (obj)).c) && zzt.a(Integer.valueOf(d), Integer.valueOf(((ConnectionConfiguration) (obj)).d)) && zzt.a(Integer.valueOf(e), Integer.valueOf(((ConnectionConfiguration) (obj)).e)) && zzt.a(Boolean.valueOf(f), Boolean.valueOf(((ConnectionConfiguration) (obj)).f)) && zzt.a(Boolean.valueOf(i), Boolean.valueOf(((ConnectionConfiguration) (obj)).i)))
            {
                return true;
            }
        }
        return false;
    }

    public String f()
    {
        return h;
    }

    public boolean g()
    {
        return i;
    }

    public String h()
    {
        return j;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            Integer.valueOf(a), b, c, Integer.valueOf(d), Integer.valueOf(e), Boolean.valueOf(f), Boolean.valueOf(i)
        });
    }

    public boolean i()
    {
        return f;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder()).append("mName=").append(b).toString());
        stringbuilder.append((new StringBuilder()).append(", mAddress=").append(c).toString());
        stringbuilder.append((new StringBuilder()).append(", mType=").append(d).toString());
        stringbuilder.append((new StringBuilder()).append(", mRole=").append(e).toString());
        stringbuilder.append((new StringBuilder()).append(", mEnabled=").append(f).toString());
        stringbuilder.append((new StringBuilder()).append(", mIsConnected=").append(g).toString());
        stringbuilder.append((new StringBuilder()).append(", mPeerNodeId=").append(h).toString());
        stringbuilder.append((new StringBuilder()).append(", mBtlePriority=").append(i).toString());
        stringbuilder.append((new StringBuilder()).append(", mNodeId=").append(j).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        zze.a(this, parcel, k);
    }

}
