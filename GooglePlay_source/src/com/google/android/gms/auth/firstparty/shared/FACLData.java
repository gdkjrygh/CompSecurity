// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            FACLDataCreator, FACLConfig

public class FACLData
    implements SafeParcelable
{

    public static final FACLDataCreator CREATOR = new FACLDataCreator();
    String activityText;
    FACLConfig faclConfig;
    boolean isSpeedbumpNeeded;
    String speedbumpText;
    final int version;

    FACLData(int i, FACLConfig faclconfig, String s, boolean flag, String s1)
    {
        version = i;
        faclConfig = faclconfig;
        activityText = s;
        isSpeedbumpNeeded = flag;
        speedbumpText = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FACLDataCreator.writeToParcel(this, parcel, i);
    }

}
