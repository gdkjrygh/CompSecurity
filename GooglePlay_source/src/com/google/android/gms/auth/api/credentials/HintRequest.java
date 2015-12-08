// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            HintRequestCreator, CredentialPickerConfig

public final class HintRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new HintRequestCreator();
    final String mAccountTypes[];
    final boolean mEmailAddressIdentifierSupported;
    final CredentialPickerConfig mHintPickerConfig;
    final boolean mPhoneNumberIdentifierSupported;
    final int mVersionCode;

    HintRequest(int i, CredentialPickerConfig credentialpickerconfig, boolean flag, boolean flag1, String as[])
    {
        mVersionCode = i;
        mHintPickerConfig = (CredentialPickerConfig)Preconditions.checkNotNull(credentialpickerconfig);
        mEmailAddressIdentifierSupported = flag;
        mPhoneNumberIdentifierSupported = flag1;
        mAccountTypes = (String[])Preconditions.checkNotNull(as);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        HintRequestCreator.writeToParcel(this, parcel, i);
    }

}
