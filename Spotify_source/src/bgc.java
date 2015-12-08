// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;

public abstract class bgc extends Binder
    implements bgb
{

    public bgc()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public static bgb a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (iinterface != null && (iinterface instanceof bgb))
        {
            return (bgb)iinterface;
        } else
        {
            return new bgd(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj2 = null;
        Object obj1 = null;
        android.os.IInterface iinterface1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            parcel = a();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            a(bfw.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = ((Parcel) (obj));
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                if (obj != null && (obj instanceof ccn))
                {
                    parcel = (ccn)obj;
                } else
                {
                    parcel = new ccp(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj2;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                if (obj != null && (obj instanceof ccq))
                {
                    parcel = (ccq)obj;
                } else
                {
                    parcel = new ccs(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            String s = parcel.readString();
            obj = parcel.readStrongBinder();
            if (obj == null)
            {
                obj = null;
            } else
            {
                iinterface1 = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                if (iinterface1 != null && (iinterface1 instanceof ccw))
                {
                    obj = (ccw)iinterface1;
                } else
                {
                    obj = new ccy(((IBinder) (obj)));
                }
            }
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj1;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                if (iinterface != null && (iinterface instanceof cct))
                {
                    parcel = (cct)iinterface;
                } else
                {
                    parcel = new ccv(parcel);
                }
            }
            a(s, ((ccw) (obj)), parcel);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            obj = iinterface1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = NativeAdOptionsParcel.CREATOR;
            obj = bhi.a(parcel);
        }
        a(((NativeAdOptionsParcel) (obj)));
        parcel1.writeNoException();
        return true;
    }
}
