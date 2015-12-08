// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            bd

public final class be
    implements SafeParcelable
{

    public static final bd CREATOR = new bd();
    public final String fA;
    public final String fB;
    public final String fC;
    public final String fy;
    public final String fz;
    public final String mimeType;
    public final String packageName;
    public final int versionCode;

    public be(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        versionCode = i;
        fy = s;
        fz = s1;
        mimeType = s2;
        packageName = s3;
        fA = s4;
        fB = s5;
        fC = s6;
    }

    public be(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        this(1, s, s1, s2, s3, s4, s5, s6);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bd.a(this, parcel, i);
    }

}
