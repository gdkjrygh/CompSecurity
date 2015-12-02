// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.facebook.analytics:
//            cd

class cf
    implements cd
{

    private IBinder a;

    cf(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(List list)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.analytics.IAnalyticsService");
        parcel.writeTypedList(list);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        list;
        parcel1.recycle();
        parcel.recycle();
        throw list;
    }

    public IBinder asBinder()
    {
        return a;
    }
}
