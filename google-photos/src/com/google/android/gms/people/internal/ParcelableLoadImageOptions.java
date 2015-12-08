// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kct;
import lnb;

public class ParcelableLoadImageOptions
    implements SafeParcelable
{

    public static final lnb CREATOR = new lnb();
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public ParcelableLoadImageOptions(int i, int j, int k, boolean flag)
    {
        a = i;
        b = j;
        c = k;
        d = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return c.b(this).a("imageSize", Integer.valueOf(b)).a("avatarOptions", Integer.valueOf(c)).a("useLargePictureForCp2Images", Boolean.valueOf(d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lnb.a(this, parcel);
    }

}
