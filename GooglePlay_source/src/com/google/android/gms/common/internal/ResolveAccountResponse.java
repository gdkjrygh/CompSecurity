// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountResponseCreator

public class ResolveAccountResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ResolveAccountResponseCreator();
    public IBinder mAccountAccessorBinder;
    public ConnectionResult mConnectionResult;
    public boolean mIsFromCrossClientAuth;
    public boolean mSaveDefaultAccount;
    final int mVersionCode;

    public ResolveAccountResponse()
    {
        this(new ConnectionResult(8, null));
    }

    ResolveAccountResponse(int i, IBinder ibinder, ConnectionResult connectionresult, boolean flag, boolean flag1)
    {
        mVersionCode = i;
        mAccountAccessorBinder = ibinder;
        mConnectionResult = connectionresult;
        mSaveDefaultAccount = flag;
        mIsFromCrossClientAuth = flag1;
    }

    private ResolveAccountResponse(ConnectionResult connectionresult)
    {
        this(1, null, connectionresult, false, false);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ResolveAccountResponse))
            {
                return false;
            }
            obj = (ResolveAccountResponse)obj;
            if (!mConnectionResult.equals(((ResolveAccountResponse) (obj)).mConnectionResult) || !IAccountAccessor.Stub.asInterface(mAccountAccessorBinder).equals(IAccountAccessor.Stub.asInterface(((ResolveAccountResponse) (obj)).mAccountAccessorBinder)))
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ResolveAccountResponseCreator.writeToParcel(this, parcel, i);
    }

}
