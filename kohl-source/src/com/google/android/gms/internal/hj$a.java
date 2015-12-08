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
//            hj, hi

public static abstract class a.ko extends Binder
    implements hj
{
    private static class a
        implements hj
    {

        private IBinder ko;

        public void a(hi hi1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            ko.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void a(hi hi1, int i1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            ko.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void a(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void a(hi hi1, int i1, String s, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void a(hi hi1, int i1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            parcel.writeString(s1);
            ko.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void a(hi hi1, int i1, String s, String s1, String s2, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            ko.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void a(hi hi1, int i1, String s, String s1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            ko.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void a(hi hi1, int i1, String s, String s1, String as[], Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void a(hi hi1, int i1, String s, String s1, String as[], String s2, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            parcel.writeString(s2);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void a(hi hi1, int i1, String s, String s1, String as[], String s2, IBinder ibinder, 
                String s3, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            parcel.writeString(s2);
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s3);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void a(hi hi1, int i1, String s, String as[], String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            parcel.writeStringArray(as);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public IBinder asBinder()
        {
            return ko;
        }

        public void b(hi hi1, int i1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            ko.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void b(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void b(hi hi1, int i1, String s, String s1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            ko.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void c(hi hi1, int i1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            ko.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void c(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void d(hi hi1, int i1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            ko.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void d(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void e(hi hi1, int i1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            ko.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void e(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void f(hi hi1, int i1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            ko.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void f(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void g(hi hi1, int i1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            ko.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void g(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void h(hi hi1, int i1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            ko.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void h(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void i(hi hi1, int i1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hi1 = hi1.asBinder();
_L1:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            ko.transact(36, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hi1 = null;
              goto _L1
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
        }

        public void i(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void j(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void k(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void l(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void m(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void n(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void o(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        public void p(hi hi1, int i1, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (hi1 == null) goto _L2; else goto _L1
_L1:
            hi1 = hi1.asBinder();
_L5:
            parcel.writeStrongBinder(hi1);
            parcel.writeInt(i1);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            ko.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            hi1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            hi1;
            parcel1.recycle();
            parcel.recycle();
            throw hi1;
              goto _L5
        }

        a(IBinder ibinder)
        {
            ko = ibinder;
        }
    }


    public static hj L(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iinterface != null && (iinterface instanceof hj))
        {
            return (hj)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj7 = null;
        Object obj8 = null;
        String as1[] = null;
        String s20 = null;
        IBinder ibinder1 = null;
        String s22 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
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
            obj = K(parcel.readStrongBinder());
            i = parcel.readInt();
            obj7 = parcel.readString();
            obj8 = parcel.readString();
            as1 = parcel.createStringArray();
            s20 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((hi) (obj)), i, ((String) (obj7)), ((String) (obj8)), as1, s20, parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj7 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            obj8 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(((hi) (obj7)), i, ((String) (obj8)), ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(K(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj8 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            as1 = parcel.readString();
            Object obj1 = obj7;
            if (parcel.readInt() != 0)
            {
                obj1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            b(((hi) (obj8)), i, as1, ((Bundle) (obj1)));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi4 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            as1 = parcel.readString();
            Object obj2 = obj8;
            if (parcel.readInt() != 0)
            {
                obj2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            c(hi4, i, as1, ((Bundle) (obj2)));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi5 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s4 = parcel.readString();
            Object obj3 = as1;
            if (parcel.readInt() != 0)
            {
                obj3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            d(hi5, i, s4, ((Bundle) (obj3)));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi6 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s5 = parcel.readString();
            Object obj4 = s20;
            if (parcel.readInt() != 0)
            {
                obj4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            e(hi6, i, s5, ((Bundle) (obj4)));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s = parcel.readString();
            String s6 = parcel.readString();
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
            a(hi, i, s, s6, as2, s21, ibinder1, s22, parcel);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi7 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s7 = parcel.readString();
            Object obj5 = ibinder1;
            if (parcel.readInt() != 0)
            {
                obj5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            f(hi7, i, s7, ((Bundle) (obj5)));
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi8 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s8 = parcel.readString();
            Object obj6 = s22;
            if (parcel.readInt() != 0)
            {
                obj6 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            g(hi8, i, s8, ((Bundle) (obj6)));
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi9 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s9 = parcel.readString();
            Bundle bundle = obj9;
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            h(hi9, i, s9, bundle);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi10 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s10 = parcel.readString();
            Bundle bundle1 = obj10;
            if (parcel.readInt() != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            i(hi10, i, s10, bundle1);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi11 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s11 = parcel.readString();
            Bundle bundle2 = obj11;
            if (parcel.readInt() != 0)
            {
                bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            j(hi11, i, s11, bundle2);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi12 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s12 = parcel.readString();
            Bundle bundle3 = obj12;
            if (parcel.readInt() != 0)
            {
                bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            k(hi12, i, s12, bundle3);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi13 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s13 = parcel.readString();
            Bundle bundle4 = obj13;
            if (parcel.readInt() != 0)
            {
                bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            l(hi13, i, s13, bundle4);
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi14 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s14 = parcel.readString();
            Bundle bundle5 = obj14;
            if (parcel.readInt() != 0)
            {
                bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            m(hi14, i, s14, bundle5);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi1 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s1 = parcel.readString();
            IBinder ibinder = parcel.readStrongBinder();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(hi1, i, s1, ibinder, parcel);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi2 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s2 = parcel.readString();
            String as[] = parcel.createStringArray();
            String s19 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(hi2, i, s2, as, s19, parcel);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            b(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            c(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi15 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s15 = parcel.readString();
            Bundle bundle6 = obj15;
            if (parcel.readInt() != 0)
            {
                bundle6 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            n(hi15, i, s15, bundle6);
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            d(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi16 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s16 = parcel.readString();
            Bundle bundle7 = obj16;
            if (parcel.readInt() != 0)
            {
                bundle7 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            o(hi16, i, s16, bundle7);
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            e(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi17 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s17 = parcel.readString();
            Bundle bundle8 = obj17;
            if (parcel.readInt() != 0)
            {
                bundle8 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            p(hi17, i, s17, bundle8);
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            b(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hi hi3 = K(parcel.readStrongBinder());
            i = parcel.readInt();
            String s3 = parcel.readString();
            String s18 = parcel.readString();
            String as3[] = parcel.createStringArray();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(hi3, i, s3, s18, as3, parcel);
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            f(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            g(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            h(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            i(K(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }
}
