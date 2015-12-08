// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.model:
//            h

public final class MapsEngineLayerInfo
    implements c
{

    public static final h CREATOR = new h();
    final int a;
    public String b;
    public String c;
    public String d;
    boolean e;
    public String f;

    public MapsEngineLayerInfo()
    {
        f = "published";
        a = 1;
    }

    MapsEngineLayerInfo(int i, String s, String s1, String s2, boolean flag, String s3)
    {
        f = "published";
        a = i;
        b = s;
        c = s1;
        f = s3;
        d = s2;
        e = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel);
    }

}
