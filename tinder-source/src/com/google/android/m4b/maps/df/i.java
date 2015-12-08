// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;
import com.google.android.m4b.maps.model.StreetViewPanoramaOrientation;
import com.google.android.m4b.maps.model.g;
import com.google.android.m4b.maps.model.o;
import com.google.android.m4b.maps.model.q;
import com.google.android.m4b.maps.model.r;

// Referenced classes of package com.google.android.m4b.maps.df:
//            b, c, d, e

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

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
        {
            Object obj6 = null;
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj = null;
            Object obj4 = null;
            Object obj5 = null;
            boolean flag12 = false;
            boolean flag13 = false;
            boolean flag14 = false;
            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0)
                {
                    flag4 = true;
                }
                a(flag4);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag5 = flag12;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                }
                b(flag5);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag6 = flag13;
                if (parcel.readInt() != 0)
                {
                    flag6 = true;
                }
                c(flag6);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag7 = flag14;
                if (parcel.readInt() != 0)
                {
                    flag7 = true;
                }
                d(flag7);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag8 = d();
                parcel1.writeNoException();
                j = ((flag) ? 1 : 0);
                if (flag8)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag9 = e();
                parcel1.writeNoException();
                j = ((flag1) ? 1 : 0);
                if (flag9)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag10 = f();
                parcel1.writeNoException();
                j = ((flag2) ? 1 : 0);
                if (flag10)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag11 = g();
                parcel1.writeNoException();
                j = ((flag3) ? 1 : 0);
                if (flag11)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0)
                {
                    obj = StreetViewPanoramaCamera.CREATOR;
                    obj = o.a(parcel);
                } else
                {
                    obj = null;
                }
                a(((StreetViewPanoramaCamera) (obj)), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
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

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                a(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR;
                    obj = com.google.android.m4b.maps.model.g.a(parcel);
                }
                a(((LatLng) (obj)));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR;
                    obj = com.google.android.m4b.maps.model.g.a(parcel);
                }
                a(((LatLng) (obj)), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
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

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj1;
                } else
                {
                    obj = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaChangeListener");
                    if (obj != null && (obj instanceof c))
                    {
                        parcel = (c)obj;
                    } else
                    {
                        parcel = new c.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj2;
                } else
                {
                    obj = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    if (obj != null && (obj instanceof com.google.android.m4b.maps.df.b))
                    {
                        parcel = (com.google.android.m4b.maps.df.b)obj;
                    } else
                    {
                        parcel = new b.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj3;
                } else
                {
                    obj = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaClickListener");
                    if (obj != null && (obj instanceof d))
                    {
                        parcel = (d)obj;
                    } else
                    {
                        parcel = new d.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                parcel = a(com.google.android.m4b.maps.da.b.a.a(parcel.readStrongBinder()));
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
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                b b1;
                if (parcel.readInt() != 0)
                {
                    r r1 = StreetViewPanoramaOrientation.CREATOR;
                    parcel = r.a(parcel);
                } else
                {
                    parcel = null;
                }
                b1 = a(parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (b1 != null)
                {
                    parcel = b1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                parcel = parcel.readStrongBinder();
                break;
            }
            if (parcel == null)
            {
                parcel = obj4;
            } else
            {
                IInterface iinterface = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaLongClickListener");
                if (iinterface != null && (iinterface instanceof e))
                {
                    parcel = (e)iinterface;
                } else
                {
                    parcel = new e.a.a(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
        }
    }

    static final class a.a
        implements i
    {

        private IBinder a;

        public final b a(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (streetviewpanoramaorientation == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            streetviewpanoramaorientation.writeToParcel(parcel, 0);
_L1:
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            streetviewpanoramaorientation = com.google.android.m4b.maps.da.b.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return streetviewpanoramaorientation;
            parcel.writeInt(0);
              goto _L1
            streetviewpanoramaorientation;
            parcel1.recycle();
            parcel.recycle();
            throw streetviewpanoramaorientation;
        }

        public final StreetViewPanoramaOrientation a(b b1)
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_85;
            }
            b1 = b1.asBinder();
_L1:
            parcel.writeStrongBinder(b1);
            a.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            b1 = obj;
            if (parcel1.readInt() != 0)
            {
                b1 = StreetViewPanoramaOrientation.CREATOR;
                b1 = r.a(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return b1;
            b1 = null;
              goto _L1
            b1;
            parcel1.recycle();
            parcel.recycle();
            throw b1;
        }

        public final void a(com.google.android.m4b.maps.df.b b1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            b1 = b1.asBinder();
_L1:
            parcel.writeStrongBinder(b1);
            a.transact(16, parcel, parcel1, 0);
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

        public final void a(c c1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final void a(d d1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            a.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public final void a(e e1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
            a.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            e1 = null;
              goto _L1
            e1;
            parcel1.recycle();
            parcel.recycle();
            throw e1;
        }

        public final void a(LatLng latlng)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            a.transact(12, parcel, parcel1, 0);
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

        public final void a(LatLng latlng, int j)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(j);
            a.transact(13, parcel, parcel1, 0);
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

        public final void a(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (streetviewpanoramacamera == null)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            parcel.writeInt(1);
            streetviewpanoramacamera.writeToParcel(parcel, 0);
_L1:
            parcel.writeLong(l);
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            streetviewpanoramacamera;
            parcel1.recycle();
            parcel.recycle();
            throw streetviewpanoramacamera;
        }

        public final void a(String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            parcel.writeString(s);
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void a(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (!flag)
            {
                j = 0;
            }
            parcel.writeInt(j);
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

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
            a.transact(2, parcel, parcel1, 0);
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

        public final void c(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
            a.transact(3, parcel, parcel1, 0);
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

        public final void d(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
            a.transact(4, parcel, parcel1, 0);
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

        public final boolean d()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            if (j != 0)
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

        public final boolean e()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            if (j != 0)
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

        public final boolean f()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            if (j != 0)
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

        public final boolean g()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            if (j != 0)
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

        public final StreetViewPanoramaCamera h()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = StreetViewPanoramaCamera.CREATOR;
            obj = o.a(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ((StreetViewPanoramaCamera) (obj));
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

        public final StreetViewPanoramaLocation i()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = StreetViewPanoramaLocation.CREATOR;
            obj = q.a(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ((StreetViewPanoramaLocation) (obj));
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

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract b a(StreetViewPanoramaOrientation streetviewpanoramaorientation);

    public abstract StreetViewPanoramaOrientation a(b b1);

    public abstract void a(com.google.android.m4b.maps.df.b b1);

    public abstract void a(c c1);

    public abstract void a(d d1);

    public abstract void a(e e1);

    public abstract void a(LatLng latlng);

    public abstract void a(LatLng latlng, int j);

    public abstract void a(StreetViewPanoramaCamera streetviewpanoramacamera, long l);

    public abstract void a(String s);

    public abstract void a(boolean flag);

    public abstract void b(boolean flag);

    public abstract void c(boolean flag);

    public abstract void d(boolean flag);

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract StreetViewPanoramaCamera h();

    public abstract StreetViewPanoramaLocation i();
}
