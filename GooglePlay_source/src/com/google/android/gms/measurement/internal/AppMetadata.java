// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            AppMetadataCreator

public class AppMetadata
    implements SafeParcelable
{

    public static final AppMetadataCreator CREATOR = new AppMetadataCreator();
    public final String appStore;
    public final String appVersion;
    public final long devCertHash;
    public final String gmpAppId;
    public final long gmpVersion;
    public final String healthMonitor;
    public final boolean measurementEnabled;
    public final String packageName;
    public final int versionCode;

    AppMetadata(int i, String s, String s1, String s2, String s3, long l, 
            long l1, String s4, boolean flag)
    {
        versionCode = i;
        packageName = s;
        gmpAppId = s1;
        appVersion = s2;
        appStore = s3;
        gmpVersion = l;
        devCertHash = l1;
        healthMonitor = s4;
        if (i >= 3)
        {
            measurementEnabled = flag;
            return;
        } else
        {
            measurementEnabled = true;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppMetadataCreator.writeToParcel$4fcb2b27(this, parcel);
    }

}
