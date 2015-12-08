// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

public abstract class bgi extends Binder
    implements bgh
{

    public bgi()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static bgh a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (iinterface != null && (iinterface instanceof bgh))
        {
            return (bgh)iinterface;
        } else
        {
            return new bgj(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        Object obj9 = null;
        byb byb1 = null;
        Object obj10 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManager");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            byb1 = a();
            parcel1.writeNoException();
            parcel = obj;
            if (byb1 != null)
            {
                parcel = byb1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            b();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            flag2 = c();
            parcel1.writeNoException();
            if (flag2)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            Object obj1 = obj9;
            if (parcel.readInt() != 0)
            {
                obj1 = AdRequestParcel.CREATOR;
                obj1 = bfn.a(parcel);
            }
            flag2 = a(((AdRequestParcel) (obj1)));
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag2)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            d();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            f();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            a(bfw.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = byb1;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                if (iinterface != null && (iinterface instanceof bgn))
                {
                    parcel = (bgn)iinterface;
                } else
                {
                    parcel = new bgp(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            h();
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i();
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
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

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            Object obj2 = obj10;
            if (parcel.readInt() != 0)
            {
                obj2 = AdSizeParcel.CREATOR;
                obj2 = bfp.a(parcel);
            }
            a(((AdSizeParcel) (obj2)));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj4;
            } else
            {
                android.os.IInterface iinterface1 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                if (iinterface1 != null && (iinterface1 instanceof cgv))
                {
                    parcel = (cgv)iinterface1;
                } else
                {
                    parcel = new cgx(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            Object obj3 = parcel.readStrongBinder();
            if (obj3 == null)
            {
                obj3 = obj5;
            } else
            {
                android.os.IInterface iinterface5 = ((IBinder) (obj3)).queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                if (iinterface5 != null && (iinterface5 instanceof chh))
                {
                    obj3 = (chh)iinterface5;
                } else
                {
                    obj3 = new chj(((IBinder) (obj3)));
                }
            }
            a(((chh) (obj3)), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            parcel = k();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj6;
            } else
            {
                android.os.IInterface iinterface2 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                if (iinterface2 != null && (iinterface2 instanceof cbp))
                {
                    parcel = (cbp)iinterface2;
                } else
                {
                    parcel = new cbr(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj7;
            } else
            {
                android.os.IInterface iinterface3 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                if (iinterface3 != null && (iinterface3 instanceof bfs))
                {
                    parcel = (bfs)iinterface3;
                } else
                {
                    parcel = new bfu(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj8;
            } else
            {
                android.os.IInterface iinterface4 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                if (iinterface4 != null && (iinterface4 instanceof bgq))
                {
                    parcel = (bgq)iinterface4;
                } else
                {
                    parcel = new bgs(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            }
            a(flag2);
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            flag2 = l();
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            break;
        }
        if (flag2)
        {
            i = 1;
        }
        parcel1.writeInt(i);
        return true;
    }
}
