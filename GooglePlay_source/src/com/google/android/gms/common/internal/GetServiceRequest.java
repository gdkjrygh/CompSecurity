// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.common.internal:
//            GetServiceRequestCreator, AccountAccessor

public class GetServiceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetServiceRequestCreator();
    IBinder accountAccessorBinder;
    public String callingPackage;
    public Account clientRequestedAccount;
    public int clientVersion;
    public Bundle extraArgs;
    public Scope scopes[];
    final int serviceId;
    final int version;

    public GetServiceRequest(int i)
    {
        version = 2;
        clientVersion = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        serviceId = i;
    }

    GetServiceRequest(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
            Account account)
    {
        version = i;
        serviceId = j;
        clientVersion = k;
        callingPackage = s;
        if (i < 2)
        {
            clientRequestedAccount = getAccountFromAccessor(ibinder);
        } else
        {
            accountAccessorBinder = ibinder;
            clientRequestedAccount = account;
        }
        scopes = ascope;
        extraArgs = bundle;
    }

    static Account getAccountFromAccessor(IBinder ibinder)
    {
        Account account = null;
        if (ibinder != null)
        {
            account = AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(ibinder));
        }
        return account;
    }

    public int describeContents()
    {
        return 0;
    }

    public final GetServiceRequest setScopes(Collection collection)
    {
        scopes = (Scope[])collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetServiceRequestCreator.writeToParcel(this, parcel, i);
    }

}
