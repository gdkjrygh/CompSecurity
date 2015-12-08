// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.a;

// Referenced classes of package com.google.android.gms.internal:
//            ek, em, dw

public abstract class el extends Binder
    implements ek
{

    public el()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public static ek zzx(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        if (iinterface != null && (iinterface instanceof ek))
        {
            return (ek)iinterface;
        } else
        {
            return new em(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        a a1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            a1 = zzdx();
            parcel1.writeNoException();
            parcel = obj;
            if (a1 != null)
            {
                parcel = a1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            parcel = getHeadline();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            parcel = getImages();
            parcel1.writeNoException();
            parcel1.writeList(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            parcel = getBody();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            dw dw1 = zzdA();
            parcel1.writeNoException();
            parcel = a1;
            if (dw1 != null)
            {
                parcel = dw1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            parcel = getCallToAction();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            parcel = getAdvertiser();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            parcel = getExtras();
            parcel1.writeNoException();
            break;
        }
        if (parcel != null)
        {
            parcel1.writeInt(1);
            parcel.writeToParcel(parcel1, 1);
        } else
        {
            parcel1.writeInt(0);
        }
        return true;
    }
}
