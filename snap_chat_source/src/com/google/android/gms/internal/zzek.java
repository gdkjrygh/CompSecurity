// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            zzej

public final class zzek
    implements SafeParcelable
{

    public static final zzej CREATOR = new zzej();
    public final String mimeType;
    public final String packageName;
    public final int versionCode;
    public final String zztQ;
    public final String zztR;
    public final String zztS;
    public final String zztT;
    public final String zztU;

    public zzek(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        versionCode = i;
        zztQ = s;
        zztR = s1;
        mimeType = s2;
        packageName = s3;
        zztS = s4;
        zztT = s5;
        zztU = s6;
    }

    public zzek(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        this(1, s, s1, s2, s3, s4, s5, s6);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzej.zza(this, parcel, i);
    }

}
