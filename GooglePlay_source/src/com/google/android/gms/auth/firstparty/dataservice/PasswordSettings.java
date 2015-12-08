// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            PasswordSettingsCreator

public class PasswordSettings
    implements SafeParcelable
{

    public static final PasswordSettingsCreator CREATOR = new PasswordSettingsCreator();
    public final String status;
    final int version;

    PasswordSettings(int i, String s)
    {
        version = i;
        status = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PasswordSettingsCreator.writeToParcel$4bf7505c(this, parcel);
    }

}
