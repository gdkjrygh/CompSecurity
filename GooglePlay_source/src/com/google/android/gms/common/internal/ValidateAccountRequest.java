// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            ValidateAccountRequestCreator, IAccountAccessor

public class ValidateAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ValidateAccountRequestCreator();
    final IBinder mAccountAccessorBinder;
    final String mCallingPackage;
    final int mClientVersion;
    final Bundle mExtraArgs;
    final Scope mScopes[];
    final int mVersionCode;

    ValidateAccountRequest(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        mVersionCode = i;
        mClientVersion = j;
        mAccountAccessorBinder = ibinder;
        mScopes = ascope;
        mExtraArgs = bundle;
        mCallingPackage = s;
    }

    public ValidateAccountRequest(IAccountAccessor iaccountaccessor, Scope ascope[], String s, Bundle bundle)
    {
        int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        if (iaccountaccessor == null)
        {
            iaccountaccessor = null;
        } else
        {
            iaccountaccessor = iaccountaccessor.asBinder();
        }
        this(1, i, ((IBinder) (iaccountaccessor)), ascope, null, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ValidateAccountRequestCreator.writeToParcel(this, parcel, i);
    }

}
