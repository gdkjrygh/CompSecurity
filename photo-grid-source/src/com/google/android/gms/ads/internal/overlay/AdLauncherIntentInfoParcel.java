// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzb

public final class AdLauncherIntentInfoParcel
    implements SafeParcelable
{

    public static final zzb CREATOR = new zzb();
    public final String intentAction;
    public final String mimeType;
    public final String packageName;
    public final String url;
    public final int versionCode;
    public final String zzAL;
    public final String zzAM;
    public final String zzAN;

    public AdLauncherIntentInfoParcel(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        versionCode = i;
        intentAction = s;
        url = s1;
        mimeType = s2;
        packageName = s3;
        zzAL = s4;
        zzAM = s5;
        zzAN = s6;
    }

    public AdLauncherIntentInfoParcel(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        this(1, s, s1, s2, s3, s4, s5, s6);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzb.a(this, parcel);
    }

}
