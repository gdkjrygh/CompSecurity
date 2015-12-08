// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            m, BeginCompoundOperationRequest, EndCompoundOperationRequest, ParcelableIndexReference, 
//            j, o, n, c, 
//            d, e, h, i, 
//            l, g, f, k

public static abstract class a.kq extends Binder
    implements m
{
    private static class a
        implements m
    {

        private IBinder kq;

        public void a(int i1, j j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeInt(i1);
            if (j1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            j1 = j1.asBinder();
_L1:
            parcel.writeStrongBinder(j1);
            kq.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            j1 = null;
              goto _L1
            j1;
            parcel1.recycle();
            parcel.recycle();
            throw j1;
        }

        public void a(BeginCompoundOperationRequest begincompoundoperationrequest, o o1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (begincompoundoperationrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            begincompoundoperationrequest.writeToParcel(parcel, 0);
_L3:
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            begincompoundoperationrequest = o1.asBinder();
_L4:
            parcel.writeStrongBinder(begincompoundoperationrequest);
            kq.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            begincompoundoperationrequest;
            parcel1.recycle();
            parcel.recycle();
            throw begincompoundoperationrequest;
            begincompoundoperationrequest = null;
              goto _L4
        }

        public void a(EndCompoundOperationRequest endcompoundoperationrequest, o o1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (endcompoundoperationrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            endcompoundoperationrequest.writeToParcel(parcel, 0);
_L3:
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            endcompoundoperationrequest = o1.asBinder();
_L4:
            parcel.writeStrongBinder(endcompoundoperationrequest);
            kq.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            endcompoundoperationrequest;
            parcel1.recycle();
            parcel.recycle();
            throw endcompoundoperationrequest;
            endcompoundoperationrequest = null;
              goto _L4
        }

        public void a(ParcelableIndexReference parcelableindexreference, n n1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (parcelableindexreference == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            parcelableindexreference.writeToParcel(parcel, 0);
_L3:
            if (n1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            parcelableindexreference = n1.asBinder();
_L4:
            parcel.writeStrongBinder(parcelableindexreference);
            kq.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            parcelableindexreference;
            parcel1.recycle();
            parcel.recycle();
            throw parcelableindexreference;
            parcelableindexreference = null;
              goto _L4
        }

        public void a(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            kq.transact(2, parcel, parcel1, 0);
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

        public void a(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            kq.transact(32, parcel, parcel1, 0);
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

        public void a(e e1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
            kq.transact(31, parcel, parcel1, 0);
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

        public void a(h h1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (h1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            h1 = h1.asBinder();
_L1:
            parcel.writeStrongBinder(h1);
            kq.transact(36, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            h1 = null;
              goto _L1
            h1;
            parcel1.recycle();
            parcel.recycle();
            throw h1;
        }

        public void a(i i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (i1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            i1 = i1.asBinder();
_L1:
            parcel.writeStrongBinder(i1);
            kq.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            i1 = null;
              goto _L1
            i1;
            parcel1.recycle();
            parcel.recycle();
            throw i1;
        }

        public void a(j j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (j1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            j1 = j1.asBinder();
_L1:
            parcel.writeStrongBinder(j1);
            kq.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            j1 = null;
              goto _L1
            j1;
            parcel1.recycle();
            parcel.recycle();
            throw j1;
        }

        public void a(l l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (l1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            l1 = l1.asBinder();
_L1:
            parcel.writeStrongBinder(l1);
            kq.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            l1 = null;
              goto _L1
            l1;
            parcel1.recycle();
            parcel.recycle();
            throw l1;
        }

        public void a(o o1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            o1 = o1.asBinder();
_L1:
            parcel.writeStrongBinder(o1);
            kq.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            o1 = null;
              goto _L1
            o1;
            parcel1.recycle();
            parcel.recycle();
            throw o1;
        }

        public void a(String s, int i1, int j1, g g1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            if (g1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            s = g1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, int i1, int j1, j j2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            if (j2 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            s = j2.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, int i1, DataHolder dataholder, g g1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            parcel.writeInt(i1);
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L3:
            if (g1 == null)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            s = g1.asBinder();
_L4:
            parcel.writeStrongBinder(s);
            kq.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
            s = null;
              goto _L4
        }

        public void a(String s, int i1, DataHolder dataholder, j j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            parcel.writeInt(i1);
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L3:
            if (j1 == null)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            s = j1.asBinder();
_L4:
            parcel.writeStrongBinder(s);
            kq.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
            s = null;
              goto _L4
        }

        public void a(String s, int i1, o o1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            parcel.writeInt(i1);
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            s = o1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, int i1, String s1, int j1, j j2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeInt(j1);
            if (j2 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            s = j2.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, int i1, String s1, j j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (j1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            s = j1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, DataHolder dataholder, j j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L3:
            if (j1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            s = j1.asBinder();
_L4:
            parcel.writeStrongBinder(s);
            kq.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
            s = null;
              goto _L4
        }

        public void a(String s, com.google.android.gms.drive.realtime.internal.f f1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (f1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s = f1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, j j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (j1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s = j1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, k k1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s = k1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, l l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (l1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            s = l1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, n n1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (n1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            s = n1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, o o1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s = o1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, String s1, com.google.android.gms.drive.realtime.internal.f f1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            parcel.writeString(s1);
            if (f1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            s = f1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, String s1, g g1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            parcel.writeString(s1);
            if (g1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            s = g1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(String s, String s1, j j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            parcel.writeString(s1);
            if (j1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            s = j1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void b(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            kq.transact(33, parcel, parcel1, 0);
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

        public void b(j j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (j1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            j1 = j1.asBinder();
_L1:
            parcel.writeStrongBinder(j1);
            kq.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            j1 = null;
              goto _L1
            j1;
            parcel1.recycle();
            parcel.recycle();
            throw j1;
        }

        public void b(o o1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            o1 = o1.asBinder();
_L1:
            parcel.writeStrongBinder(o1);
            kq.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            o1 = null;
              goto _L1
            o1;
            parcel1.recycle();
            parcel.recycle();
            throw o1;
        }

        public void b(String s, com.google.android.gms.drive.realtime.internal.f f1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (f1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s = f1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void b(String s, l l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (l1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s = l1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void b(String s, n n1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (n1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s = n1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void b(String s, o o1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s = o1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(39, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void c(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            kq.transact(24, parcel, parcel1, 0);
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

        public void c(String s, l l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            parcel.writeString(s);
            if (l1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s = l1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            kq.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void d(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            kq.transact(25, parcel, parcel1, 0);
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

        a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public static m ac(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (iinterface != null && (iinterface instanceof m))
        {
            return (m)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        String s = null;
        String s2 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        DataHolder dataholder = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), ad(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(S(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(ae(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            b(S(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            b(ae(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), parcel.readString(), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), ab(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                dataholder = DataHolder.CREATOR.x(parcel);
            }
            a(s, dataholder, Z(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), Z(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), parcel.readString(), W(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            b(parcel.readString(), ab(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            b(parcel.readString(), ad(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), parcel.readInt(), parcel.readString(), Z(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), parcel.readInt(), parcel.readInt(), Z(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), parcel.readString(), Z(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            b(parcel.readString(), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            c(parcel.readString(), ab(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            s2 = parcel.readString();
            i = parcel.readInt();
            Object obj = s;
            if (parcel.readInt() != 0)
            {
                obj = DataHolder.CREATOR.x(parcel);
            }
            a(s2, i, ((DataHolder) (obj)), Z(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            String s1 = parcel.readString();
            i = parcel.readInt();
            Object obj1 = s2;
            if (parcel.readInt() != 0)
            {
                obj1 = DataHolder.CREATOR.x(parcel);
            }
            a(s1, i, ((DataHolder) (obj1)), W(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), parcel.readInt(), parcel.readInt(), W(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), Z(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            BeginCompoundOperationRequest begincompoundoperationrequest = obj2;
            if (parcel.readInt() != 0)
            {
                begincompoundoperationrequest = (BeginCompoundOperationRequest)BeginCompoundOperationRequest.CREATOR.createFromParcel(parcel);
            }
            a(begincompoundoperationrequest, ae(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            EndCompoundOperationRequest endcompoundoperationrequest = obj3;
            if (parcel.readInt() != 0)
            {
                endcompoundoperationrequest = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(parcel);
            }
            a(endcompoundoperationrequest, ae(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(Z(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            b(Z(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            c(S(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            d(S(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            ParcelableIndexReference parcelableindexreference = obj4;
            if (parcel.readInt() != 0)
            {
                parcelableindexreference = (ParcelableIndexReference)ParcelableIndexReference.CREATOR.createFromParcel(parcel);
            }
            a(parcelableindexreference, ad(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), aa(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), parcel.readInt(), ae(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(ab(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readInt(), Z(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(U(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(T(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(Y(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(X(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            a(parcel.readString(), ae(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 39: // '\''
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            b(parcel.readString(), ae(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
