// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.c;

// Referenced classes of package com.google.android.gms.internal:
//            g, i, z, a, 
//            d, f, m, o, 
//            ab, b

public abstract class h extends Binder
    implements g
{

    public h()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static g a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (iinterface != null && (iinterface instanceof g))
        {
            return (g)iinterface;
        } else
        {
            return new i(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
    {
        boolean flag = false;
        Object obj2 = null;
        c c1 = null;
        Object obj1 = null;
        Object obj3 = null;
        Object obj = null;
        switch (j)
        {
        default:
            return super.onTransact(j, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManager");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c1 = a();
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (c1 != null)
            {
                parcel = c1.asBinder();
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
            boolean flag1 = c();
            parcel1.writeNoException();
            if (flag1)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel1.writeInt(j);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = z.a;
                obj = com.google.android.gms.internal.a.a(parcel);
            }
            boolean flag2 = a(((z) (obj)));
            parcel1.writeNoException();
            j = ((flag) ? 1 : 0);
            if (flag2)
            {
                j = 1;
            }
            parcel1.writeInt(j);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            d();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            e();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = c1;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                if (obj != null && (obj instanceof d))
                {
                    parcel = (d)obj;
                } else
                {
                    parcel = new f(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj1;
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                if (obj != null && (obj instanceof m))
                {
                    parcel = (m)obj;
                } else
                {
                    parcel = new o(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            f();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g();
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            h();
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
            parcel = i();
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
            obj = obj3;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = ab.a;
            obj = b.a(parcel);
        }
        a(((ab) (obj)));
        parcel1.writeNoException();
        return true;
    }
}
