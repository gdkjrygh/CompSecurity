// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            SignInButtonConfigCreator

public class SignInButtonConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new SignInButtonConfigCreator();
    final int mButtonSize;
    final int mColorScheme;
    final Scope mScopes[];
    final int mVersionCode;

    SignInButtonConfig(int i, int j, int k, Scope ascope[])
    {
        mVersionCode = i;
        mButtonSize = j;
        mColorScheme = k;
        mScopes = ascope;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SignInButtonConfigCreator.writeToParcel(this, parcel, i);
    }

}
