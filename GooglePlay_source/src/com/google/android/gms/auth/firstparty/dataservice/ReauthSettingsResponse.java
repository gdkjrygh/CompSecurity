// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            ReauthSettingsResponseCreator, PasswordSettings, PinSettings

public class ReauthSettingsResponse
    implements SafeParcelable
{

    public static final ReauthSettingsResponseCreator CREATOR = new ReauthSettingsResponseCreator();
    public final PasswordSettings password;
    public final PinSettings pin;
    public final int status;
    final int version;

    ReauthSettingsResponse(int i, int j, PasswordSettings passwordsettings, PinSettings pinsettings)
    {
        version = i;
        status = j;
        password = passwordsettings;
        pin = pinsettings;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ReauthSettingsResponseCreator.writeToParcel(this, parcel, i);
    }

}
