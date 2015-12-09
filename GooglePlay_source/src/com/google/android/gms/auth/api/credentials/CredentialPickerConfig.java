// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialPickerConfigCreator

public final class CredentialPickerConfig
    implements SafeParcelable
{
    public static final class Builder
    {

        private boolean mForNewAccount;
        private boolean mShowAddAccountButton;
        boolean mShowCancelButton;

        public final CredentialPickerConfig build()
        {
            return new CredentialPickerConfig(this, (byte)0);
        }

        public Builder()
        {
            mShowAddAccountButton = false;
            mShowCancelButton = true;
            mForNewAccount = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new CredentialPickerConfigCreator();
    final boolean mForNewAccount;
    final boolean mShowAddAccountButton;
    final boolean mShowCancelButton;
    final int mVersionCode;

    CredentialPickerConfig(int i, boolean flag, boolean flag1, boolean flag2)
    {
        mVersionCode = i;
        mShowAddAccountButton = flag;
        mShowCancelButton = flag1;
        mForNewAccount = flag2;
    }

    private CredentialPickerConfig(Builder builder)
    {
        this(1, false, builder.mShowCancelButton, false);
    }

    CredentialPickerConfig(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        CredentialPickerConfigCreator.writeToParcel$13561712(this, parcel);
    }

}
