// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ca

public final class cb
    implements SafeParcelable
{

    public static final ca CREATOR = new ca();
    public final String mimeType;
    public final String nN;
    public final String nO;
    public final String nP;
    public final String nQ;
    public final String nR;
    public final String packageName;
    public final int versionCode;

    public cb(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        versionCode = i;
        nN = s;
        nO = s1;
        mimeType = s2;
        packageName = s3;
        nP = s4;
        nQ = s5;
        nR = s6;
    }

    public cb(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        this(1, s, s1, s2, s3, s4, s5, s6);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ca.a(this, parcel, i);
    }

}
