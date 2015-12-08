// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            a

public final class ApplicationParameters
    implements SafeParcelable
{
    public final class a
    {

        final ApplicationParameters aVx;

        public final a A(Bundle bundle)
        {
            aVx.mArgs = bundle;
            return this;
        }

        public final a d(Account account)
        {
            aVx.aVv = account;
            return this;
        }

        public final a ln(int i)
        {
            aVx.aUz = i;
            return this;
        }

        public final a lo(int i)
        {
            aVx.mTheme = i;
            return this;
        }

        public final ApplicationParameters uZ()
        {
            return aVx;
        }

        private a()
        {
            aVx = ApplicationParameters.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.wallet.shared.a();
    int aUz;
    Account aVv;
    boolean aVw;
    Bundle mArgs;
    int mTheme;
    final int mVersionCode;

    ApplicationParameters()
    {
        aVw = false;
        mVersionCode = 2;
        aUz = 1;
        mTheme = 0;
    }

    ApplicationParameters(int i, int j, Account account, Bundle bundle, boolean flag, int k)
    {
        aVw = false;
        mVersionCode = i;
        aUz = j;
        aVv = account;
        mArgs = bundle;
        aVw = flag;
        mTheme = k;
    }

    public static a newBuilder()
    {
        ApplicationParameters applicationparameters = new ApplicationParameters();
        applicationparameters.getClass();
        return applicationparameters. new a();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Account getBuyerAccount()
    {
        return aVv;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.shared.a.a(this, parcel, i);
    }

}
