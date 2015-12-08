// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import btj;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ctk;
import java.util.Arrays;

public class ConnectionConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ctk();
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public boolean g;
    public String h;
    public boolean i;
    public String j;

    public ConnectionConfiguration(int k, String s, String s1, int l, int i1, boolean flag, boolean flag1, 
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
            if (btj.a(Integer.valueOf(a), Integer.valueOf(((ConnectionConfiguration) (obj = (ConnectionConfiguration)obj)).a)) && btj.a(b, ((ConnectionConfiguration) (obj)).b) && btj.a(c, ((ConnectionConfiguration) (obj)).c) && btj.a(Integer.valueOf(d), Integer.valueOf(((ConnectionConfiguration) (obj)).d)) && btj.a(Integer.valueOf(e), Integer.valueOf(((ConnectionConfiguration) (obj)).e)) && btj.a(Boolean.valueOf(f), Boolean.valueOf(((ConnectionConfiguration) (obj)).f)) && btj.a(Boolean.valueOf(i), Boolean.valueOf(((ConnectionConfiguration) (obj)).i)))
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
        ctk.a(this, parcel);
    }

}
