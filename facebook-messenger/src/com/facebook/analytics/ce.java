// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.facebook.analytics:
//            cd, cf, AnalyticsServiceEvent

public abstract class ce extends Binder
    implements cd
{

    public ce()
    {
        attachInterface(this, "com.facebook.analytics.IAnalyticsService");
    }

    public static cd a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.facebook.analytics.IAnalyticsService");
        if (iinterface != null && (iinterface instanceof cd))
        {
            return (cd)iinterface;
        } else
        {
            return new cf(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.facebook.analytics.IAnalyticsService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.facebook.analytics.IAnalyticsService");
            a(parcel.createTypedArrayList(AnalyticsServiceEvent.CREATOR));
            parcel1.writeNoException();
            return true;
        }
    }
}
