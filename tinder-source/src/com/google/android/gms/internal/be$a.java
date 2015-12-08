// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.g;
import com.google.android.gms.ads.internal.client.h;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.dynamic.a;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            be, bh, bi, bf

public static abstract class a.a extends Binder
    implements be
{
    private static final class a
        implements be
    {

        private IBinder a;

        public final com.google.android.gms.dynamic.a a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.gms.dynamic.a a1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            a1 = com.google.android.gms.dynamic.a.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return a1;
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

        public final void a(com.google.android.gms.dynamic.a a1, AdRequestParcel adrequestparcel, String s, com.google.android.gms.ads.internal.reward.mediation.client.a a2, String s1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            a1 = obj;
            if (a2 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            a1 = a2.asBinder();
            parcel.writeStrongBinder(a1);
            parcel.writeString(s1);
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
              goto _L5
        }

        public final void a(com.google.android.gms.dynamic.a a1, AdRequestParcel adrequestparcel, String s, bf bf1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            a1 = obj;
            if (bf1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            a1 = bf1.asBinder();
            parcel.writeStrongBinder(a1);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
              goto _L5
        }

        public final void a(com.google.android.gms.dynamic.a a1, AdRequestParcel adrequestparcel, String s, String s1, bf bf1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            a1 = obj;
            if (bf1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            a1 = bf1.asBinder();
            parcel.writeStrongBinder(a1);
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
              goto _L5
        }

        public final void a(com.google.android.gms.dynamic.a a1, AdRequestParcel adrequestparcel, String s, String s1, bf bf1, NativeAdOptionsParcel nativeadoptionsparcel, List list)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            a1 = obj;
            if (bf1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            a1 = bf1.asBinder();
            parcel.writeStrongBinder(a1);
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
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
            parcel.writeInt(0);
              goto _L7
        }

        public final void a(com.google.android.gms.dynamic.a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, bf bf1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
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
            a1 = obj;
            if (bf1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            a1 = bf1.asBinder();
            parcel.writeStrongBinder(a1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
            parcel.writeInt(0);
              goto _L7
        }

        public final void a(com.google.android.gms.dynamic.a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, bf bf1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
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
            a1 = obj;
            if (bf1 == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            a1 = bf1.asBinder();
            parcel.writeStrongBinder(a1);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
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
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        public final bh h()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            bh bh1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            bh1 = com.google.android.gms.internal.bh.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return bh1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final bi i()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            bi bi1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            bi1 = com.google.android.gms.internal.bi.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return bi1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final Bundle j()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return bundle;
_L2:
            bundle = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final Bundle k()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return bundle;
_L2:
            bundle = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final Bundle l()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return bundle;
_L2:
            bundle = null;
            if (true) goto _L4; else goto _L3
_L3:
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


    public static be a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (iinterface != null && (iinterface instanceof be))
        {
            return (be)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj7 = null;
        android.os.IInterface iinterface = null;
        com.google.android.gms.dynamic.a a2 = null;
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
            a2 = com.google.android.gms.dynamic.(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = AdSizeParcel.CREATOR;
                obj = h.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj7 = AdRequestParcel.CREATOR;
                obj7 = g.a(parcel);
            } else
            {
                obj7 = null;
            }
            a(a2, ((AdSizeParcel) (obj)), ((AdRequestParcel) (obj7)), parcel.readString(), com.google.android.gms.internal.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj7 = a();
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj7 != null)
            {
                parcel = ((com.google.android.gms.dynamic.a) (obj7)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            a2 = com.google.android.gms.dynamic.(parcel.readStrongBinder());
            Object obj1 = obj7;
            if (parcel.readInt() != 0)
            {
                obj1 = AdRequestParcel.CREATOR;
                obj1 = g.a(parcel);
            }
            a(a2, ((AdRequestParcel) (obj1)), parcel.readString(), com.google.android.gms.internal.a(parcel.readStrongBinder()));
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
            a2 = com.google.android.gms.dynamic.(parcel.readStrongBinder());
            Object obj2;
            Object obj8;
            if (parcel.readInt() != 0)
            {
                obj2 = AdSizeParcel.CREATOR;
                obj2 = h.a(parcel);
            } else
            {
                obj2 = null;
            }
            if (parcel.readInt() != 0)
            {
                obj8 = AdRequestParcel.CREATOR;
                obj8 = g.a(parcel);
            } else
            {
                obj8 = null;
            }
            a(a2, ((AdSizeParcel) (obj2)), ((AdRequestParcel) (obj8)), parcel.readString(), parcel.readString(), com.google.android.gms.internal.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            com.google.android.gms.dynamic.a a1 = com.google.android.gms.dynamic.(parcel.readStrongBinder());
            Object obj3;
            if (parcel.readInt() != 0)
            {
                obj3 = AdRequestParcel.CREATOR;
                obj3 = g.a(parcel);
            } else
            {
                obj3 = null;
            }
            a(a1, ((AdRequestParcel) (obj3)), parcel.readString(), parcel.readString(), com.google.android.gms.internal.a(parcel.readStrongBinder()));
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
            a2 = com.google.android.gms.dynamic.(parcel.readStrongBinder());
            Object obj4;
            AdRequestParcel adrequestparcel;
            if (parcel.readInt() != 0)
            {
                g g1 = AdRequestParcel.CREATOR;
                adrequestparcel = g.a(parcel);
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
                if (iinterface != null && (iinterface instanceof com.google.android.gms.ads.internal.reward.mediation.client.a))
                {
                    obj4 = (com.google.android.gms.ads.internal.reward.mediation.client.a)iinterface;
                } else
                {
                    obj4 = new com.google.android.gms.ads.internal.reward.mediation.client.(((IBinder) (obj4)));
                }
            }
            a(a2, adrequestparcel, s, ((com.google.android.gms.ads.internal.reward.mediation.client.a) (obj4)), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            Object obj5 = iinterface;
            if (parcel.readInt() != 0)
            {
                obj5 = AdRequestParcel.CREATOR;
                obj5 = g.a(parcel);
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
            a2 = com.google.android.gms.dynamic.(parcel.readStrongBinder());
            Object obj6;
            Object obj9;
            String s1;
            bf bf;
            if (parcel.readInt() != 0)
            {
                obj6 = AdRequestParcel.CREATOR;
                obj6 = g.a(parcel);
            } else
            {
                obj6 = null;
            }
            s = parcel.readString();
            s1 = parcel.readString();
            bf = com.google.android.gms.internal.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj9 = NativeAdOptionsParcel.CREATOR;
                obj9 = com.google.android.gms.ads.internal.formats.a.a(parcel);
            } else
            {
                obj9 = null;
            }
            a(a2, ((AdRequestParcel) (obj6)), s, s1, bf, ((NativeAdOptionsParcel) (obj9)), parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            bh bh1 = h();
            parcel1.writeNoException();
            parcel = a2;
            if (bh1 != null)
            {
                parcel = bh1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            bi bi1 = i();
            parcel1.writeNoException();
            parcel = s;
            if (bi1 != null)
            {
                parcel = bi1.asBinder();
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
