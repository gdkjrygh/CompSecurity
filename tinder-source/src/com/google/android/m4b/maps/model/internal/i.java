// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.g;

// Referenced classes of package com.google.android.m4b.maps.model.internal:
//            j

public interface i
    extends IInterface
{
    public static abstract class a extends Binder
        implements i
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int k, Parcel parcel, Parcel parcel1, int l)
        {
            j j1 = null;
            Object obj = null;
            switch (k)
            {
            default:
                return super.onTransact(k, parcel, parcel1, l);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                j1 = a();
                parcel1.writeNoException();
                parcel = obj;
                if (j1 != null)
                {
                    parcel = j1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                parcel = b();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                parcel = c();
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

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                parcel = d();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                parcel = e();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                parcel = parcel.readStrongBinder();
                boolean flag;
                if (parcel == null)
                {
                    parcel = j1;
                } else
                {
                    IInterface iinterface = parcel.queryLocalInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                    if (iinterface != null && (iinterface instanceof i))
                    {
                        parcel = (i)iinterface;
                    } else
                    {
                        parcel = new a(parcel);
                    }
                }
                flag = a(parcel);
                parcel1.writeNoException();
                if (flag)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                parcel1.writeInt(k);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                k = f();
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
        }
    }

    static final class a.a
        implements i
    {

        private IBinder a;

        public final j a()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            j j;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            j = com.google.android.m4b.maps.model.internal.j.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return j;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final boolean a(i j)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
            if (j == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            j = j.asBinder();
_L1:
            int k;
            parcel.writeStrongBinder(j);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            j = null;
              goto _L1
            j;
            parcel1.recycle();
            parcel.recycle();
            throw j;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final String b()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final LatLng c()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = LatLng.CREATOR;
            obj = g.a(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ((LatLng) (obj));
_L2:
            obj = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final String d()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final String e()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final int f()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return j;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract j a();

    public abstract boolean a(i j);

    public abstract String b();

    public abstract LatLng c();

    public abstract String d();

    public abstract String e();

    public abstract int f();
}
