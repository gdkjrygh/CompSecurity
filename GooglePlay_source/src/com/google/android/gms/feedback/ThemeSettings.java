// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.feedback:
//            ThemeSettingsCreator

public class ThemeSettings
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ThemeSettingsCreator();
    public int mPrimaryColor;
    public int mThemeId;
    final int mVersionCode;

    public ThemeSettings()
    {
        this(1, 0, 0);
    }

    ThemeSettings(int i, int j, int k)
    {
        mVersionCode = i;
        mThemeId = j;
        mPrimaryColor = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ThemeSettingsCreator.writeToParcel$2c435116(this, parcel);
    }

}
