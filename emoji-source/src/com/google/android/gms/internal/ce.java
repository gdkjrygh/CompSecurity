// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            cd

public final class ce
    implements SafeParcelable
{

    public static final cd CREATOR = new cd();
    public final String mimeType;
    public final String oa;
    public final String ob;
    public final String oc;
    public final String od;
    public final String oe;
    public final String packageName;
    public final int versionCode;

    public ce(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        versionCode = i;
        oa = s;
        ob = s1;
        mimeType = s2;
        packageName = s3;
        oc = s4;
        od = s5;
        oe = s6;
    }

    public ce(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        this(1, s, s1, s2, s3, s4, s5, s6);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        cd.a(this, parcel, i);
    }

}
