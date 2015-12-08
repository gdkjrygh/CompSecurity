// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            iv, ix, iy, ja

public abstract class iw extends Binder
    implements iv
{

    public iw()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static iv a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (iinterface != null && (iinterface instanceof iv))
        {
            return (iv)iinterface;
        } else
        {
            return new ix(ibinder);
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
            parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
            b();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
            c();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
            d();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
            e();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
            parcel = parcel.readStrongBinder();
            break;
        }
        if (parcel == null)
        {
            parcel = null;
        } else
        {
            android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
            if (iinterface != null && (iinterface instanceof iy))
            {
                parcel = (iy)iinterface;
            } else
            {
                parcel = new ja(parcel);
            }
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
