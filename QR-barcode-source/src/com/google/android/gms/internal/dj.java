// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            di

public final class dj
    implements SafeParcelable
{

    public static final di CREATOR = new di();
    public final String mimeType;
    public final String packageName;
    public final String rp;
    public final String rq;
    public final String rr;
    public final String rs;
    public final String rt;
    public final int versionCode;

    public dj(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        versionCode = i;
        rp = s;
        rq = s1;
        mimeType = s2;
        packageName = s3;
        rr = s4;
        rs = s5;
        rt = s6;
    }

    public dj(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        this(1, s, s1, s2, s3, s4, s5, s6);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        di.a(this, parcel, i);
    }

}
