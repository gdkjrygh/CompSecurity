// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            AuthAccountRequestCreator, IAccountAccessor

public class AuthAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AuthAccountRequestCreator();
    final IBinder mAccountAccessorBinder;
    final Scope mScopes[];
    final int mVersionCode;

    AuthAccountRequest(int i, IBinder ibinder, Scope ascope[])
    {
        mVersionCode = i;
        mAccountAccessorBinder = ibinder;
        mScopes = ascope;
    }

    public AuthAccountRequest(IAccountAccessor iaccountaccessor, Set set)
    {
        this(1, iaccountaccessor.asBinder(), (Scope[])set.toArray(new Scope[set.size()]));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AuthAccountRequestCreator.writeToParcel(this, parcel, i);
    }

}
