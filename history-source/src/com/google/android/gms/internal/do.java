// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            dn

public final class do
    implements SafeParcelable
{

    public static final dn CREATOR = new dn();
    public final String mimeType;
    public final String packageName;
    public final String rG;
    public final String rH;
    public final String rI;
    public final String rJ;
    public final String rK;
    public final int versionCode;

    public do(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        versionCode = i;
        rG = s;
        rH = s1;
        mimeType = s2;
        packageName = s3;
        rI = s4;
        rJ = s5;
        rK = s6;
    }

    public do(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        this(1, s, s1, s2, s3, s4, s5, s6);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        dn.a(this, parcel, i);
    }

}
