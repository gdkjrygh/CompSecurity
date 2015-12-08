// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import jts;
import jyw;

public class c
    implements SafeParcelable, jyw
{

    public static final jts CREATOR = new jts();
    public Status a;
    public List b;
    public String c[];
    public final int d;

    public final Status a_()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jts.a(this, parcel, i);
    }


    public ()
    {
        d = 1;
    }

    public d(int i, Status status, List list, String as[])
    {
        d = i;
        a = status;
        b = list;
        c = as;
    }
}
