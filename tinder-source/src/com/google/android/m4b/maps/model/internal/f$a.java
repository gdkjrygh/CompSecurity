// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.f;
import com.google.android.m4b.maps.model.g;

// Referenced classes of package com.google.android.m4b.maps.model.internal:
//            f

public static abstract class attachInterface extends Binder
    implements com.google.android.m4b.maps.model.internal.f
{
    static final class a
        implements com.google.android.m4b.maps.model.internal.f
    {

        private IBinder a;

        public final String a()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
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

        public final void a(float f1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            parcel.writeFloat(f1);
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void a(float f1, float f2)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            parcel.writeFloat(f1);
            parcel.writeFloat(f2);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void a(b b1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            b1 = b1.asBinder();
_L1:
            parcel.writeStrongBinder(b1);
            a.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            b1 = null;
              goto _L1
            b1;
            parcel1.recycle();
            parcel.recycle();
            throw b1;
        }

        public final void a(LatLng latlng)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
        }

        public final void a(LatLngBounds latlngbounds)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            if (latlngbounds == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            latlngbounds.writeToParcel(parcel, 0);
_L1:
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            latlngbounds;
            parcel1.recycle();
            parcel.recycle();
            throw latlngbounds;
        }

        public final void a(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final boolean a(com.google.android.m4b.maps.model.internal.f f1)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            if (f1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            f1 = f1.asBinder();
_L1:
            int k;
            parcel.writeStrongBinder(f1);
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            f1 = null;
              goto _L1
            f1;
            parcel1.recycle();
            parcel.recycle();
            throw f1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(float f1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            parcel.writeFloat(f1);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void c()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void c(float f1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            parcel.writeFloat(f1);
            a.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final float d()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            f1 = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void d(float f1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            parcel.writeFloat(f1);
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final LatLngBounds f()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = LatLngBounds.CREATOR;
            obj = com.google.android.m4b.maps.model.f.a(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ((LatLngBounds) (obj));
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

        public final LatLng h()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a.transact(4, parcel, parcel1, 0);
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

        public final float i()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            f1 = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final float j()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            f1 = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final float m()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            f1 = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final float o()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            f1 = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final boolean q()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final int t()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static com.google.android.m4b.maps.model.internal.f a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
        if (iinterface != null && (iinterface instanceof com.google.android.m4b.maps.model.internal.f))
        {
            return (com.google.android.m4b.maps.model.internal.f)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj2 = null;
        Object obj = null;
        boolean flag1 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            c();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            parcel = a();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLng.CREATOR;
                obj = g.a(parcel);
            }
            a(((LatLng) (obj)));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            parcel = h();
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

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            b(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            float f1 = j();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            float f2 = i();
            parcel1.writeNoException();
            parcel1.writeFloat(f2);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            Object obj1 = obj2;
            if (parcel.readInt() != 0)
            {
                obj1 = LatLngBounds.CREATOR;
                obj1 = f.a(parcel);
            }
            a(((LatLngBounds) (obj1)));
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            parcel = f();
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

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            float f3 = d();
            parcel1.writeNoException();
            parcel1.writeFloat(f3);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            d(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            float f4 = o();
            parcel1.writeNoException();
            parcel1.writeFloat(f4);
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            boolean flag2;
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(flag2);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            boolean flag3 = q();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag3)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            c(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            float f5 = m();
            parcel1.writeNoException();
            parcel1.writeFloat(f5);
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            boolean flag4 = a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag4)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            i = t();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            a(com.google.android.m4b.maps.da.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }

    public a.a()
    {
        attachInterface(this, "com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
    }
}
