// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            PinSettingsCreator

public class PinSettings
    implements SafeParcelable
{

    public static final PinSettingsCreator CREATOR = new PinSettingsCreator();
    public final int length;
    public final String recoveryUrl;
    public final String resetUrl;
    public final String setupUrl;
    public final String status;
    final int version;

    PinSettings(int i, String s, String s1, String s2, String s3, int j)
    {
        version = i;
        status = s;
        resetUrl = s1;
        setupUrl = s2;
        recoveryUrl = s3;
        length = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PinSettingsCreator.writeToParcel$14ac7362(this, parcel);
    }

}
