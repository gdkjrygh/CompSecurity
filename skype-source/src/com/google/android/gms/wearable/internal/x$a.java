// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            x, AddListenerRequest, RemoveListenerRequest, AncsNotificationParcelable, 
//            v, u

public static abstract class a.a extends Binder
    implements x
{
    private static final class a
        implements x
    {

        private IBinder a;

        public final void a(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void a(v v1, byte byte0)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeByte(byte0);
            a.transact(53, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void a(v v1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeInt(i1);
            a.transact(43, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void a(v v1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void a(v v1, Uri uri, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i1);
            a.transact(40, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void a(v v1, Asset asset)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (asset == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            asset.writeToParcel(parcel, 0);
_L6:
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void a(v v1, ConnectionConfiguration connectionconfiguration)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            connectionconfiguration.writeToParcel(parcel, 0);
_L6:
            a.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void a(v v1, PutDataRequest putdatarequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (putdatarequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            putdatarequest.writeToParcel(parcel, 0);
_L6:
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void a(v v1, AddListenerRequest addlistenerrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (addlistenerrequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            addlistenerrequest.writeToParcel(parcel, 0);
_L6:
            a.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void a(v v1, AncsNotificationParcelable ancsnotificationparcelable)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (ancsnotificationparcelable == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            ancsnotificationparcelable.writeToParcel(parcel, 0);
_L6:
            a.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void a(v v1, RemoveListenerRequest removelistenerrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (removelistenerrequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            removelistenerrequest.writeToParcel(parcel, 0);
_L6:
            a.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void a(v v1, u u1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            v1 = obj;
            if (u1 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            v1 = u1.asBinder();
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            a.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void a(v v1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            a.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void a(v v1, String s, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            a.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void a(v v1, String s, ParcelFileDescriptor parcelfiledescriptor)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
            a.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void a(v v1, String s, ParcelFileDescriptor parcelfiledescriptor, long l1, long l2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
            parcel.writeLong(l1);
            parcel.writeLong(l2);
            a.transact(39, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void a(v v1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            parcel.writeString(s1);
            a.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void a(v v1, String s, String s1, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeByteArray(abyte0);
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void a(v v1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            a.transact(48, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void b(v v1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeInt(i1);
            a.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void b(v v1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void b(v v1, Uri uri, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i1);
            a.transact(41, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void b(v v1, ConnectionConfiguration connectionconfiguration)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            connectionconfiguration.writeToParcel(parcel, 0);
_L6:
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void b(v v1, u u1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            v1 = obj;
            if (u1 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            v1 = u1.asBinder();
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            a.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void b(v v1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            a.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void b(v v1, String s, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            a.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void b(v v1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            a.transact(50, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void c(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void c(v v1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeInt(i1);
            a.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void c(v v1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null) goto _L2; else goto _L1
_L1:
            v1 = v1.asBinder();
_L5:
            parcel.writeStrongBinder(v1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            v1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
              goto _L5
        }

        public final void c(v v1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            a.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void d(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void d(v v1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            a.transact(46, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void e(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void e(v v1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            a.transact(47, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void f(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void f(v v1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            parcel.writeString(s);
            a.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void g(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void h(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void i(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void j(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void k(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(49, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void l(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(51, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void m(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(52, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void n(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void o(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public final void p(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            v1 = v1.asBinder();
_L1:
            parcel.writeStrongBinder(v1);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            v1 = null;
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static x a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (iinterface != null && (iinterface instanceof x))
        {
            return (x)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        boolean flag = false;
        v v15 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj = null;
        Object obj11 = null;
        Object obj1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wearable.internal.IWearableService");
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v15 = a(parcel.readStrongBinder());
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
            }
            a(v15, ((ConnectionConfiguration) (obj)));
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v2 = a(parcel.readStrongBinder());
            obj = v15;
            if (parcel.readInt() != 0)
            {
                obj = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(parcel);
            }
            a(v2, ((PutDataRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v3 = a(parcel.readStrongBinder());
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(v3, ((Uri) (obj)));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v4 = a(parcel.readStrongBinder());
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            b(v4, ((Uri) (obj)));
            parcel1.writeNoException();
            return true;

        case 40: // '('
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v5 = a(parcel.readStrongBinder());
            obj = obj4;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(v5, ((Uri) (obj)), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v6 = a(parcel.readStrongBinder());
            obj = obj5;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            c(v6, ((Uri) (obj)));
            parcel1.writeNoException();
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v7 = a(parcel.readStrongBinder());
            obj = obj6;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            b(v7, ((Uri) (obj)), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v8 = a(parcel.readStrongBinder());
            obj = obj7;
            if (parcel.readInt() != 0)
            {
                obj = (Asset)Asset.CREATOR.createFromParcel(parcel);
            }
            a(v8, ((Asset) (obj)));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            d(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 43: // '+'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 46: // '.'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            d(a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 47: // '/'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e(a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v9 = a(parcel.readStrongBinder());
            obj = obj8;
            if (parcel.readInt() != 0)
            {
                obj = (AddListenerRequest)AddListenerRequest.CREATOR.createFromParcel(parcel);
            }
            a(v9, ((AddListenerRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v10 = a(parcel.readStrongBinder());
            obj = obj9;
            if (parcel.readInt() != 0)
            {
                obj = (RemoveListenerRequest)RemoveListenerRequest.CREATOR.createFromParcel(parcel);
            }
            a(v10, ((RemoveListenerRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            f(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            g(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            h(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v11 = a(parcel.readStrongBinder());
            obj = obj10;
            if (parcel.readInt() != 0)
            {
                obj = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
            }
            a(v11, ((AncsNotificationParcelable) (obj)));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            i(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            f(a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(a(parcel.readStrongBinder()), a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(a(parcel.readStrongBinder()), a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v12 = a(parcel.readStrongBinder());
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                obj = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            }
            a(v12, s, ((ParcelFileDescriptor) (obj)));
            parcel1.writeNoException();
            return true;

        case 39: // '\''
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v13 = a(parcel.readStrongBinder());
            String s1 = parcel.readString();
            ParcelFileDescriptor parcelfiledescriptor;
            if (parcel.readInt() != 0)
            {
                parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            } else
            {
                parcelfiledescriptor = null;
            }
            a(v13, s1, parcelfiledescriptor, parcel.readLong(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            j(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 48: // '0'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v = a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(v, flag);
            parcel1.writeNoException();
            return true;

        case 49: // '1'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            k(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 50: // '2'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v1 = a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            b(v1, flag);
            parcel1.writeNoException();
            return true;

        case 51: // '3'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            l(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 52: // '4'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            m(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(a(parcel.readStrongBinder()), parcel.readByte());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            v v14 = a(parcel.readStrongBinder());
            ConnectionConfiguration connectionconfiguration = obj11;
            if (parcel.readInt() != 0)
            {
                connectionconfiguration = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
            }
            b(v14, connectionconfiguration);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            n(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            o(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            p(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
