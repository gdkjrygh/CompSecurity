// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class kuw extends Binder
    implements kuv
{

    public static kuv a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (iinterface != null && (iinterface instanceof kuv))
        {
            return (kuv)iinterface;
        } else
        {
            return new kux(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        android.os.IInterface iinterface = null;
        kok kok2 = null;
        String s = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            kok2 = kol.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = joe.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = jod.a(parcel);
            } else
            {
                obj1 = null;
            }
            a(kok2, ((com.google.android.gms.ads.internal.client.AdSizeParcel) (obj)), ((com.google.android.gms.ads.internal.client.AdRequestParcel) (obj1)), parcel.readString(), kuz.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj1 = a();
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj1 != null)
            {
                parcel = ((kok) (obj1)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            kok2 = kol.a(parcel.readStrongBinder());
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = jod.a(parcel);
            }
            a(kok2, ((com.google.android.gms.ads.internal.client.AdRequestParcel) (obj)), parcel.readString(), kuz.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            b();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            kok2 = kol.a(parcel.readStrongBinder());
            com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel;
            if (parcel.readInt() != 0)
            {
                obj = joe.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                adrequestparcel = jod.a(parcel);
            } else
            {
                adrequestparcel = null;
            }
            a(kok2, ((com.google.android.gms.ads.internal.client.AdSizeParcel) (obj)), adrequestparcel, parcel.readString(), parcel.readString(), kuz.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            kok kok1 = kol.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = jod.a(parcel);
            } else
            {
                obj = null;
            }
            a(kok1, ((com.google.android.gms.ads.internal.client.AdRequestParcel) (obj)), parcel.readString(), parcel.readString(), kuz.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            d();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            e();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            kok2 = kol.a(parcel.readStrongBinder());
            com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel1;
            if (parcel.readInt() != 0)
            {
                adrequestparcel1 = jod.a(parcel);
            } else
            {
                adrequestparcel1 = null;
            }
            s = parcel.readString();
            obj = parcel.readStrongBinder();
            if (obj == null)
            {
                obj = null;
            } else
            {
                iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                if (iinterface != null && (iinterface instanceof jpt))
                {
                    obj = (jpt)iinterface;
                } else
                {
                    obj = new jpv(((IBinder) (obj)));
                }
            }
            a(kok2, adrequestparcel1, s, ((jpt) (obj)), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj = iinterface;
            if (parcel.readInt() != 0)
            {
                obj = jod.a(parcel);
            }
            a(((com.google.android.gms.ads.internal.client.AdRequestParcel) (obj)), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            f();
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            boolean flag = g();
            parcel1.writeNoException();
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            kok2 = kol.a(parcel.readStrongBinder());
            com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel nativeadoptionsparcel;
            String s1;
            kuy kuy;
            if (parcel.readInt() != 0)
            {
                obj = jod.a(parcel);
            } else
            {
                obj = null;
            }
            s = parcel.readString();
            s1 = parcel.readString();
            kuy = kuz.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                nativeadoptionsparcel = jos.a(parcel);
            } else
            {
                nativeadoptionsparcel = null;
            }
            a(kok2, ((com.google.android.gms.ads.internal.client.AdRequestParcel) (obj)), s, s1, kuy, nativeadoptionsparcel, parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj = h();
            parcel1.writeNoException();
            parcel = kok2;
            if (obj != null)
            {
                parcel = ((kvb) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj = i();
            parcel1.writeNoException();
            parcel = s;
            break;
        }
        if (obj != null)
        {
            parcel = ((kve) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
