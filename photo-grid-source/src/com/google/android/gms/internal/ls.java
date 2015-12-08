// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            lr, lt

public abstract class ls extends Binder
    implements lr
{

    public ls()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
    }

    public static lr zzS(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
        if (iinterface != null && (iinterface instanceof lr))
        {
            return (lr)iinterface;
        } else
        {
            return new lt(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
            parcel = getProductId();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
            parcel = getPurchaseData();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
            i = getResultCode();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
            boolean flag1 = isVerified();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag1)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
            finishPurchase();
            parcel1.writeNoException();
            return true;
        }
    }
}
