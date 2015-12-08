// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            kj, jz, ki

public static abstract class a.ld extends Binder
    implements kj
{
    static final class a
        implements kj
    {

        private IBinder ld;

        public final void a(ki ki1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            ld.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void a(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void a(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void a(ki ki1, int i1, String s1, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void a(ki ki1, int i1, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            ld.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void a(ki ki1, int i1, String s1, String s2, String s3, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeString(s3);
            parcel.writeStringArray(as);
            ld.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void a(ki ki1, int i1, String s1, String s2, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            ld.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void a(ki ki1, int i1, String s1, String s2, String as[], Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void a(ki ki1, int i1, String s1, String s2, String as[], String s3, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            parcel.writeString(s3);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void a(ki ki1, int i1, String s1, String s2, String as[], String s3, IBinder ibinder, 
                String s4, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            parcel.writeString(s3);
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s4);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void a(ki ki1, int i1, String s1, String as[], String s2, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            parcel.writeString(s2);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void a(ki ki1, jz jz1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            if (jz1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            jz1.writeToParcel(parcel, 0);
_L6:
            ld.transact(46, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final IBinder asBinder()
        {
            return ld;
        }

        public final void b(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void b(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void b(ki ki1, int i1, String s1, String s2, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            ld.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void c(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void c(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void d(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void d(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void e(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void e(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void f(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void f(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void g(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void g(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void h(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void h(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void i(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(36, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void i(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void j(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(40, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void j(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void k(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void k(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void l(ki ki1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ki1 = ki1.asBinder();
_L1:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            ld.transact(44, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ki1 = null;
              goto _L1
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
        }

        public final void l(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void m(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void n(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void o(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void p(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void q(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void r(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void s(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(41, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        public final void t(ki ki1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (ki1 == null) goto _L2; else goto _L1
_L1:
            ki1 = ki1.asBinder();
_L5:
            parcel.writeStrongBinder(ki1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ld.transact(43, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ki1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ki1;
            parcel1.recycle();
            parcel.recycle();
            throw ki1;
              goto _L5
        }

        a(IBinder ibinder)
        {
            ld = ibinder;
        }
    }


    public static kj ba(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iinterface != null && (iinterface instanceof kj))
        {
            return (kj)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj1 = null;
        Object obj2 = null;
        String as1[] = null;
        String s20 = null;
        IBinder ibinder1 = null;
        String s22 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            obj2 = parcel.readString();
            as1 = parcel.createStringArray();
            s20 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((ki) (obj)), i, ((String) (obj1)), ((String) (obj2)), as1, s20, parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            obj2 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(((ki) (obj1)), i, ((String) (obj2)), ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(aZ(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj2 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            as1 = parcel.readString();
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            b(((ki) (obj2)), i, as1, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            as1 = parcel.readString();
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            c(((ki) (obj1)), i, as1, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s = parcel.readString();
            obj = as1;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            d(((ki) (obj1)), i, s, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s1 = parcel.readString();
            obj = s20;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            e(((ki) (obj1)), i, s1, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            String s2 = parcel.readString();
            String as2[] = parcel.createStringArray();
            String s21 = parcel.readString();
            ibinder1 = parcel.readStrongBinder();
            s22 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((ki) (obj)), i, ((String) (obj1)), s2, as2, s21, ibinder1, s22, parcel);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s3 = parcel.readString();
            obj = ibinder1;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            f(((ki) (obj1)), i, s3, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s4 = parcel.readString();
            obj = s22;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            g(((ki) (obj1)), i, s4, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s5 = parcel.readString();
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            h(((ki) (obj1)), i, s5, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s6 = parcel.readString();
            obj = obj4;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            i(((ki) (obj1)), i, s6, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s7 = parcel.readString();
            obj = obj5;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            j(((ki) (obj1)), i, s7, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s8 = parcel.readString();
            obj = obj6;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            k(((ki) (obj1)), i, s8, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s9 = parcel.readString();
            obj = obj7;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            l(((ki) (obj1)), i, s9, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s10 = parcel.readString();
            obj = obj8;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            m(((ki) (obj1)), i, s10, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            IBinder ibinder = parcel.readStrongBinder();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((ki) (obj)), i, ((String) (obj1)), ibinder, parcel);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            String as[] = parcel.createStringArray();
            String s19 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((ki) (obj)), i, ((String) (obj1)), as, s19, parcel);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            b(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            c(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s11 = parcel.readString();
            obj = obj9;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            n(((ki) (obj1)), i, s11, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            d(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s12 = parcel.readString();
            obj = obj10;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            o(((ki) (obj1)), i, s12, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            e(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s13 = parcel.readString();
            obj = obj11;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            p(((ki) (obj1)), i, s13, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            b(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            String s14 = parcel.readString();
            String as3[] = parcel.createStringArray();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((ki) (obj)), i, ((String) (obj1)), s14, as3, parcel);
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            f(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            g(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            h(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            i(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s15 = parcel.readString();
            obj = obj12;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            q(((ki) (obj1)), i, s15, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s16 = parcel.readString();
            obj = obj13;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            r(((ki) (obj1)), i, s16, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 40: // '('
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            j(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s17 = parcel.readString();
            obj = obj14;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            s(((ki) (obj1)), i, s17, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            k(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 43: // '+'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            i = parcel.readInt();
            String s18 = parcel.readString();
            obj = obj15;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            t(((ki) (obj1)), i, s18, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 44: // ','
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            l(aZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 46: // '.'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = aZ(parcel.readStrongBinder());
            obj = obj16;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (jz)jz.CREATOR.createFromParcel(parcel);
        }
        a(((ki) (obj1)), ((jz) (obj)));
        parcel1.writeNoException();
        return true;
    }
}
