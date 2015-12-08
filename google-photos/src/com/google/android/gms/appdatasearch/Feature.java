// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import jtq;

public class Feature
    implements SafeParcelable
{

    public static final jtq CREATOR = new jtq();
    public final int a;
    public final int b;
    public final Bundle c;

    public Feature(int i, int j, Bundle bundle)
    {
        a = i;
        b = j;
        c = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jtq.a(this, parcel);
    }

}
