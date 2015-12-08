// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.i;
import com.google.android.gms.ads.internal.client.k;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.a;
import com.google.android.gms.b.c;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            dj, dk, dl

public interface di
    extends IInterface
{
    public static abstract class a extends Binder
        implements di
    {

        public static di a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (iinterface != null && (iinterface instanceof di))
            {
                return (di)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int l)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj4 = null;
            c c3 = null;
            String s = null;
            Object obj = null;
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, l);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                c3 = com.google.android.gms.b.c.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdSizeParcel.CREATOR;
                    obj = k.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = AdRequestParcel.CREATOR;
                    obj1 = com.google.android.gms.ads.internal.client.i.a(parcel);
                } else
                {
                    obj1 = null;
                }
                a(c3, ((AdSizeParcel) (obj)), ((AdRequestParcel) (obj1)), parcel.readString(), com.google.android.gms.internal.dj.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj1 = a();
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (obj1 != null)
                {
                    parcel = ((c) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                c3 = com.google.android.gms.b.c.a.a(parcel.readStrongBinder());
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR;
                    obj = com.google.android.gms.ads.internal.client.i.a(parcel);
                }
                a(c3, ((AdRequestParcel) (obj)), parcel.readString(), com.google.android.gms.internal.dj.a.a(parcel.readStrongBinder()));
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
                c3 = com.google.android.gms.b.c.a.a(parcel.readStrongBinder());
                Object obj2;
                if (parcel.readInt() != 0)
                {
                    obj = AdSizeParcel.CREATOR;
                    obj = k.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj2 = AdRequestParcel.CREATOR;
                    obj2 = com.google.android.gms.ads.internal.client.i.a(parcel);
                } else
                {
                    obj2 = null;
                }
                a(c3, ((AdSizeParcel) (obj)), ((AdRequestParcel) (obj2)), parcel.readString(), parcel.readString(), com.google.android.gms.internal.dj.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                c c1 = com.google.android.gms.b.c.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR;
                    obj = com.google.android.gms.ads.internal.client.i.a(parcel);
                } else
                {
                    obj = null;
                }
                a(c1, ((AdRequestParcel) (obj)), parcel.readString(), parcel.readString(), com.google.android.gms.internal.dj.a.a(parcel.readStrongBinder()));
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
                c c2 = com.google.android.gms.b.c.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR;
                    obj = com.google.android.gms.ads.internal.client.i.a(parcel);
                } else
                {
                    obj = null;
                }
                a(c2, ((AdRequestParcel) (obj)), parcel.readString(), com.google.android.gms.ads.internal.reward.mediation.client.a.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR;
                    obj = com.google.android.gms.ads.internal.client.i.a(parcel);
                }
                a(((AdRequestParcel) (obj)), parcel.readString());
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
                    j = 1;
                } else
                {
                    j = 0;
                }
                parcel1.writeInt(j);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                c3 = com.google.android.gms.b.c.a.a(parcel.readStrongBinder());
                Object obj3;
                String s1;
                dj dj;
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestParcel.CREATOR;
                    obj = com.google.android.gms.ads.internal.client.i.a(parcel);
                } else
                {
                    obj = null;
                }
                s = parcel.readString();
                s1 = parcel.readString();
                dj = com.google.android.gms.internal.dj.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj3 = NativeAdOptionsParcel.CREATOR;
                    obj3 = com.google.android.gms.ads.internal.formats.i.a(parcel);
                } else
                {
                    obj3 = null;
                }
                a(c3, ((AdRequestParcel) (obj)), s, s1, dj, ((NativeAdOptionsParcel) (obj3)), parcel.createStringArrayList());
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj = h();
                parcel1.writeNoException();
                parcel = c3;
                if (obj != null)
                {
                    parcel = ((dk) (obj)).asBinder();
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
                parcel = ((dl) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
    }

    private static final class a.a
        implements di
    {

        private IBinder a;

        public final c a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            c c1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            c1 = com.google.android.gms.b.c.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return c1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void a(AdRequestParcel adrequestparcel, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L1:
            parcel.writeString(s);
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            adrequestparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adrequestparcel;
        }

        public final void a(c c1, AdRequestParcel adrequestparcel, String s, com.google.android.gms.ads.internal.reward.mediation.client.a a1, String s1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            c1 = c1.asBinder();
_L5:
            parcel.writeStrongBinder(c1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            c1 = obj;
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            c1 = a1.asBinder();
            parcel.writeStrongBinder(c1);
            parcel.writeString(s1);
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            c1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
              goto _L5
        }

        public final void a(c c1, AdRequestParcel adrequestparcel, String s, dj dj1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            c1 = c1.asBinder();
_L5:
            parcel.writeStrongBinder(c1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            c1 = obj;
            if (dj1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            c1 = dj1.asBinder();
            parcel.writeStrongBinder(c1);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            c1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
              goto _L5
        }

        public final void a(c c1, AdRequestParcel adrequestparcel, String s, String s1, dj dj1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            c1 = c1.asBinder();
_L5:
            parcel.writeStrongBinder(c1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            c1 = obj;
            if (dj1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            c1 = dj1.asBinder();
            parcel.writeStrongBinder(c1);
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            c1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
              goto _L5
        }

        public final void a(c c1, AdRequestParcel adrequestparcel, String s, String s1, dj dj1, NativeAdOptionsParcel nativeadoptionsparcel, List list)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            c1 = c1.asBinder();
_L5:
            parcel.writeStrongBinder(c1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            c1 = obj;
            if (dj1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            c1 = dj1.asBinder();
            parcel.writeStrongBinder(c1);
            if (nativeadoptionsparcel == null)
            {
                break MISSING_BLOCK_LABEL_175;
            }
            parcel.writeInt(1);
            nativeadoptionsparcel.writeToParcel(parcel, 0);
_L7:
            parcel.writeStringList(list);
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            c1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
            parcel.writeInt(0);
              goto _L7
        }

        public final void a(c c1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, dj dj1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            c1 = c1.asBinder();
_L5:
            parcel.writeStrongBinder(c1);
            if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            c1 = obj;
            if (dj1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            c1 = dj1.asBinder();
            parcel.writeStrongBinder(c1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            c1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
            parcel.writeInt(0);
              goto _L7
        }

        public final void a(c c1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, dj dj1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            c1 = c1.asBinder();
_L5:
            parcel.writeStrongBinder(c1);
            if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_167;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            parcel.writeString(s1);
            c1 = obj;
            if (dj1 == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            c1 = dj1.asBinder();
            parcel.writeStrongBinder(c1);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            c1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
            parcel.writeInt(0);
              goto _L7
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

        public final void c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

        public final void d()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(8, parcel, parcel1, 0);
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

        public final void e()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(9, parcel, parcel1, 0);
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

        public final void f()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(12, parcel, parcel1, 0);
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

        public final boolean g()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(13, parcel, parcel1, 0);
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

        public final dk h()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            dk dk;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            dk = com.google.android.gms.internal.dk.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return dk;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final dl i()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            dl dl;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            dl = com.google.android.gms.internal.dl.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return dl;
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


    public abstract c a()
        throws RemoteException;

    public abstract void a(AdRequestParcel adrequestparcel, String s)
        throws RemoteException;

    public abstract void a(c c1, AdRequestParcel adrequestparcel, String s, com.google.android.gms.ads.internal.reward.mediation.client.a a1, String s1)
        throws RemoteException;

    public abstract void a(c c1, AdRequestParcel adrequestparcel, String s, dj dj)
        throws RemoteException;

    public abstract void a(c c1, AdRequestParcel adrequestparcel, String s, String s1, dj dj)
        throws RemoteException;

    public abstract void a(c c1, AdRequestParcel adrequestparcel, String s, String s1, dj dj, NativeAdOptionsParcel nativeadoptionsparcel, List list)
        throws RemoteException;

    public abstract void a(c c1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, dj dj)
        throws RemoteException;

    public abstract void a(c c1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, dj dj)
        throws RemoteException;

    public abstract void b()
        throws RemoteException;

    public abstract void c()
        throws RemoteException;

    public abstract void d()
        throws RemoteException;

    public abstract void e()
        throws RemoteException;

    public abstract void f()
        throws RemoteException;

    public abstract boolean g()
        throws RemoteException;

    public abstract dk h()
        throws RemoteException;

    public abstract dl i()
        throws RemoteException;
}
