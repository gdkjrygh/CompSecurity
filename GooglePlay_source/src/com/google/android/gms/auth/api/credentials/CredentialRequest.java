// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialRequestCreator, CredentialPickerConfig

public final class CredentialRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CredentialRequestCreator();
    final String mAccountTypes[];
    final CredentialPickerConfig mCredentialHintPickerConfig;
    final CredentialPickerConfig mCredentialPickerConfig;
    final boolean mPasswordLoginSupported;
    final int mVersionCode;

    CredentialRequest(int i, boolean flag, String as[], CredentialPickerConfig credentialpickerconfig, CredentialPickerConfig credentialpickerconfig1)
    {
        mVersionCode = i;
        mPasswordLoginSupported = flag;
        mAccountTypes = (String[])Preconditions.checkNotNull(as);
        as = credentialpickerconfig;
        if (credentialpickerconfig == null)
        {
            as = (new CredentialPickerConfig.Builder()).build();
        }
        mCredentialPickerConfig = as;
        as = credentialpickerconfig1;
        if (credentialpickerconfig1 == null)
        {
            as = (new CredentialPickerConfig.Builder()).build();
        }
        mCredentialHintPickerConfig = as;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        CredentialRequestCreator.writeToParcel(this, parcel, i);
    }

}
