// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ce

public final class cf
    implements SafeParcelable
{

    public static final ce CREATOR = new ce();
    public final String mimeType;
    public final String nY;
    public final String nZ;
    public final String oa;
    public final String ob;
    public final String oc;
    public final String packageName;
    public final int versionCode;

    public cf(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        versionCode = i;
        nY = s;
        nZ = s1;
        mimeType = s2;
        packageName = s3;
        oa = s4;
        ob = s5;
        oc = s6;
    }

    public cf(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        this(1, s, s1, s2, s3, s4, s5, s6);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ce.a(this, parcel, i);
    }

}
