// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import loc;

public class LocalFolder
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new loc();
    public final int a;
    public String b;
    public String c;
    public boolean d;

    public LocalFolder(int i, String s, String s1, boolean flag)
    {
        a = i;
        b = s;
        c = s1;
        d = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(" (enabled=").append(d).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        loc.a(this, parcel);
    }

}
