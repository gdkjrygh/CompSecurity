// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ab, ao, b

public interface ad
    extends IInterface
{
    public static abstract class a extends Binder
        implements ad
    {

        public static ad by(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            if (iinterface != null && (iinterface instanceof ad))
            {
                return (ad)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            ab ab = null;
            ab ab7 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            c c1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.IWearableService");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                ab = com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    c1 = (c)c.CREATOR.createFromParcel(parcel);
                }
                a(ab, c1);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                c(com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                ab7 = com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder());
                Object obj = ab;
                if (parcel.readInt() != 0)
                {
                    obj = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(parcel);
                }
                a(ab7, ((PutDataRequest) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                ab ab1 = com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder());
                Object obj1 = ab7;
                if (parcel.readInt() != 0)
                {
                    obj1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                a(ab1, ((Uri) (obj1)));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                d(com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                ab ab2 = com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder());
                Uri uri = obj2;
                if (parcel.readInt() != 0)
                {
                    uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                b(ab2, uri);
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                ab ab3 = com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder());
                Uri uri1 = obj3;
                if (parcel.readInt() != 0)
                {
                    uri1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                c(ab3, uri1);
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                ab ab4 = com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder());
                Asset asset = obj4;
                if (parcel.readInt() != 0)
                {
                    asset = (Asset)Asset.CREATOR.createFromParcel(parcel);
                }
                a(ab4, asset);
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                e(com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                f(com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                ab ab5 = com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder());
                b b1 = obj5;
                if (parcel.readInt() != 0)
                {
                    b1 = (b)b.CREATOR.createFromParcel(parcel);
                }
                a(ab5, b1);
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                ab ab6 = com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder());
                ao ao1 = obj6;
                if (parcel.readInt() != 0)
                {
                    ao1 = (ao)ao.CREATOR.createFromParcel(parcel);
                }
                a(ab6, ao1);
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                g(com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                h(com.google.android.gms.wearable.internal.ab.a.bw(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class a.a
        implements ad
    {

        private IBinder kq;

        public void a(ab ab1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            kq.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ab1 = null;
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        public void a(ab ab1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null) goto _L2; else goto _L1
_L1:
            ab1 = ab1.asBinder();
_L5:
            parcel.writeStrongBinder(ab1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            kq.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ab1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
              goto _L5
        }

        public void a(ab ab1, Asset asset)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null) goto _L2; else goto _L1
_L1:
            ab1 = ab1.asBinder();
_L5:
            parcel.writeStrongBinder(ab1);
            if (asset == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            asset.writeToParcel(parcel, 0);
_L6:
            kq.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ab1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
              goto _L5
        }

        public void a(ab ab1, PutDataRequest putdatarequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null) goto _L2; else goto _L1
_L1:
            ab1 = ab1.asBinder();
_L5:
            parcel.writeStrongBinder(ab1);
            if (putdatarequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            putdatarequest.writeToParcel(parcel, 0);
_L6:
            kq.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ab1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
              goto _L5
        }

        public void a(ab ab1, c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null) goto _L2; else goto _L1
_L1:
            ab1 = ab1.asBinder();
_L5:
            parcel.writeStrongBinder(ab1);
            if (c1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            c1.writeToParcel(parcel, 0);
_L6:
            kq.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ab1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
              goto _L5
        }

        public void a(ab ab1, ao ao1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null) goto _L2; else goto _L1
_L1:
            ab1 = ab1.asBinder();
_L5:
            parcel.writeStrongBinder(ab1);
            if (ao1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            ao1.writeToParcel(parcel, 0);
_L6:
            kq.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ab1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
              goto _L5
        }

        public void a(ab ab1, b b1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null) goto _L2; else goto _L1
_L1:
            ab1 = ab1.asBinder();
_L5:
            parcel.writeStrongBinder(ab1);
            if (b1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            b1.writeToParcel(parcel, 0);
_L6:
            kq.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ab1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
              goto _L5
        }

        public void a(ab ab1, String s, String s1, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeByteArray(abyte0);
            kq.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ab1 = null;
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void b(ab ab1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            kq.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ab1 = null;
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        public void b(ab ab1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null) goto _L2; else goto _L1
_L1:
            ab1 = ab1.asBinder();
_L5:
            parcel.writeStrongBinder(ab1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            kq.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ab1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
              goto _L5
        }

        public void c(ab ab1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            kq.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ab1 = null;
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        public void c(ab ab1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null) goto _L2; else goto _L1
_L1:
            ab1 = ab1.asBinder();
_L5:
            parcel.writeStrongBinder(ab1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            kq.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ab1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
              goto _L5
        }

        public void d(ab ab1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            kq.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ab1 = null;
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        public void e(ab ab1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            kq.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ab1 = null;
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        public void f(ab ab1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            kq.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ab1 = null;
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        public void g(ab ab1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            kq.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ab1 = null;
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        public void h(ab ab1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ab1 = ab1.asBinder();
_L1:
            parcel.writeStrongBinder(ab1);
            kq.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ab1 = null;
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void a(ab ab)
        throws RemoteException;

    public abstract void a(ab ab, Uri uri)
        throws RemoteException;

    public abstract void a(ab ab, Asset asset)
        throws RemoteException;

    public abstract void a(ab ab, PutDataRequest putdatarequest)
        throws RemoteException;

    public abstract void a(ab ab, c c1)
        throws RemoteException;

    public abstract void a(ab ab, ao ao)
        throws RemoteException;

    public abstract void a(ab ab, b b1)
        throws RemoteException;

    public abstract void a(ab ab, String s, String s1, byte abyte0[])
        throws RemoteException;

    public abstract void b(ab ab)
        throws RemoteException;

    public abstract void b(ab ab, Uri uri)
        throws RemoteException;

    public abstract void c(ab ab)
        throws RemoteException;

    public abstract void c(ab ab, Uri uri)
        throws RemoteException;

    public abstract void d(ab ab)
        throws RemoteException;

    public abstract void e(ab ab)
        throws RemoteException;

    public abstract void f(ab ab)
        throws RemoteException;

    public abstract void g(ab ab)
        throws RemoteException;

    public abstract void h(ab ab)
        throws RemoteException;
}
