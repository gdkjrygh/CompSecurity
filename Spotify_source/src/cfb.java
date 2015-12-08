// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;

public abstract class cfb extends Binder
    implements cfa
{

    public cfb()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static cfa a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (iinterface != null && (iinterface instanceof cfa))
        {
            return (cfa)iinterface;
        } else
        {
            return new cfc(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj7 = null;
        android.os.IInterface iinterface = null;
        byb byb2 = null;
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
            byb2 = byc.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = AdSizeParcel.CREATOR;
                obj = bfp.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj7 = AdRequestParcel.CREATOR;
                obj7 = bfn.a(parcel);
            } else
            {
                obj7 = null;
            }
            a(byb2, ((AdSizeParcel) (obj)), ((AdRequestParcel) (obj7)), parcel.readString(), cfe.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj7 = a();
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj7 != null)
            {
                parcel = ((byb) (obj7)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            byb2 = byc.a(parcel.readStrongBinder());
            Object obj1 = obj7;
            if (parcel.readInt() != 0)
            {
                obj1 = AdRequestParcel.CREATOR;
                obj1 = bfn.a(parcel);
            }
            a(byb2, ((AdRequestParcel) (obj1)), parcel.readString(), cfe.a(parcel.readStrongBinder()));
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
            byb2 = byc.a(parcel.readStrongBinder());
            Object obj2;
            Object obj8;
            if (parcel.readInt() != 0)
            {
                obj2 = AdSizeParcel.CREATOR;
                obj2 = bfp.a(parcel);
            } else
            {
                obj2 = null;
            }
            if (parcel.readInt() != 0)
            {
                obj8 = AdRequestParcel.CREATOR;
                obj8 = bfn.a(parcel);
            } else
            {
                obj8 = null;
            }
            a(byb2, ((AdSizeParcel) (obj2)), ((AdRequestParcel) (obj8)), parcel.readString(), parcel.readString(), cfe.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            byb byb1 = byc.a(parcel.readStrongBinder());
            Object obj3;
            if (parcel.readInt() != 0)
            {
                obj3 = AdRequestParcel.CREATOR;
                obj3 = bfn.a(parcel);
            } else
            {
                obj3 = null;
            }
            a(byb1, ((AdRequestParcel) (obj3)), parcel.readString(), parcel.readString(), cfe.a(parcel.readStrongBinder()));
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
            byb2 = byc.a(parcel.readStrongBinder());
            Object obj4;
            AdRequestParcel adrequestparcel;
            if (parcel.readInt() != 0)
            {
                bfn bfn1 = AdRequestParcel.CREATOR;
                adrequestparcel = bfn.a(parcel);
            } else
            {
                adrequestparcel = null;
            }
            s = parcel.readString();
            obj4 = parcel.readStrongBinder();
            if (obj4 == null)
            {
                obj4 = null;
            } else
            {
                iinterface = ((IBinder) (obj4)).queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                if (iinterface != null && (iinterface instanceof bju))
                {
                    obj4 = (bju)iinterface;
                } else
                {
                    obj4 = new bjw(((IBinder) (obj4)));
                }
            }
            a(byb2, adrequestparcel, s, ((bju) (obj4)), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            Object obj5 = iinterface;
            if (parcel.readInt() != 0)
            {
                obj5 = AdRequestParcel.CREATOR;
                obj5 = bfn.a(parcel);
            }
            a(((AdRequestParcel) (obj5)), parcel.readString());
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
            byb2 = byc.a(parcel.readStrongBinder());
            Object obj6;
            Object obj9;
            String s1;
            cfd cfd;
            if (parcel.readInt() != 0)
            {
                obj6 = AdRequestParcel.CREATOR;
                obj6 = bfn.a(parcel);
            } else
            {
                obj6 = null;
            }
            s = parcel.readString();
            s1 = parcel.readString();
            cfd = cfe.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj9 = NativeAdOptionsParcel.CREATOR;
                obj9 = bhi.a(parcel);
            } else
            {
                obj9 = null;
            }
            a(byb2, ((AdRequestParcel) (obj6)), s, s1, cfd, ((NativeAdOptionsParcel) (obj9)), parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            cfj cfj1 = h();
            parcel1.writeNoException();
            parcel = byb2;
            if (cfj1 != null)
            {
                parcel = cfj1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            cfm cfm1 = i();
            parcel1.writeNoException();
            parcel = s;
            if (cfm1 != null)
            {
                parcel = cfm1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            parcel = j();
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

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            parcel = k();
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

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            parcel = l();
            parcel1.writeNoException();
            break;
        }
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
    }
}
