// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            w, AddListenerRequest, AncsNotificationParcelable, RemoveListenerRequest, 
//            v

public interface y
    extends IInterface
{
    public static abstract class a extends Binder
        implements y
    {

        public static y a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            if (iinterface != null && (iinterface instanceof y))
            {
                return (y)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
            throws RemoteException
        {
            boolean flag = false;
            w w15 = null;
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
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.IWearableService");
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w15 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                }
                a(w15, ((ConnectionConfiguration) (obj)));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                c(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w2 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = w15;
                if (parcel.readInt() != 0)
                {
                    obj = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(parcel);
                }
                a(w2, ((PutDataRequest) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w3 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                a(w3, ((Uri) (obj)));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w4 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                b(w4, ((Uri) (obj)));
                parcel1.writeNoException();
                return true;

            case 40: // '('
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w5 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                a(w5, ((Uri) (obj)), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w6 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                c(w6, ((Uri) (obj)));
                parcel1.writeNoException();
                return true;

            case 41: // ')'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w7 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                b(w7, ((Uri) (obj)), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w8 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = (Asset)Asset.CREATOR.createFromParcel(parcel);
                }
                a(w8, ((Asset) (obj)));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                c(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                d(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 43: // '+'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 46: // '.'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                d(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 47: // '/'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                e(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w9 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = obj8;
                if (parcel.readInt() != 0)
                {
                    obj = (AddListenerRequest)AddListenerRequest.CREATOR.createFromParcel(parcel);
                }
                a(w9, ((AddListenerRequest) (obj)));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w10 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = obj9;
                if (parcel.readInt() != 0)
                {
                    obj = (RemoveListenerRequest)RemoveListenerRequest.CREATOR.createFromParcel(parcel);
                }
                a(w10, ((RemoveListenerRequest) (obj)));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                e(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                f(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                g(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                h(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w11 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                obj = obj10;
                if (parcel.readInt() != 0)
                {
                    obj = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                }
                a(w11, ((AncsNotificationParcelable) (obj)));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                c(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                i(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                f(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), v.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                b(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), v.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 38: // '&'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w12 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                String s = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                }
                a(w12, s, ((ParcelFileDescriptor) (obj)));
                parcel1.writeNoException();
                return true;

            case 39: // '\''
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w13 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                String s1 = parcel.readString();
                ParcelFileDescriptor parcelfiledescriptor;
                if (parcel.readInt() != 0)
                {
                    parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcelfiledescriptor = null;
                }
                a(w13, s1, parcelfiledescriptor, parcel.readLong(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                j(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 48: // '0'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(w, flag);
                parcel1.writeNoException();
                return true;

            case 49: // '1'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                k(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 50: // '2'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w1 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                b(w1, flag);
                parcel1.writeNoException();
                return true;

            case 51: // '3'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                l(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 52: // '4'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                m(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 53: // '5'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readByte());
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                w w14 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                ConnectionConfiguration connectionconfiguration = obj11;
                if (parcel.readInt() != 0)
                {
                    connectionconfiguration = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                }
                b(w14, connectionconfiguration);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                n(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                o(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                p(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static final class a.a
        implements y
    {

        private IBinder a;

        public final void a(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void a(w w1, byte byte0)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeByte(byte0);
            a.transact(53, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void a(w w1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeInt(i1);
            a.transact(43, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void a(w w1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void a(w w1, Uri uri, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void a(w w1, Asset asset)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void a(w w1, ConnectionConfiguration connectionconfiguration)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void a(w w1, PutDataRequest putdatarequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void a(w w1, AddListenerRequest addlistenerrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void a(w w1, AncsNotificationParcelable ancsnotificationparcelable)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void a(w w1, RemoveListenerRequest removelistenerrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void a(w w1, v v1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            w1 = obj;
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            w1 = v1.asBinder();
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            a.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void a(w w1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            a.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void a(w w1, String s, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            a.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void a(w w1, String s, ParcelFileDescriptor parcelfiledescriptor)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void a(w w1, String s, ParcelFileDescriptor parcelfiledescriptor, long l1, long l2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void a(w w1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            parcel.writeString(s1);
            a.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void a(w w1, String s, String s1, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeByteArray(abyte0);
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void a(w w1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void b(w w1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeInt(i1);
            a.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void b(w w1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void b(w w1, Uri uri, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void b(w w1, ConnectionConfiguration connectionconfiguration)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void b(w w1, v v1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            w1 = obj;
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            w1 = v1.asBinder();
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            a.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void b(w w1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            a.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void b(w w1, String s, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            a.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void b(w w1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void c(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void c(w w1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeInt(i1);
            a.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void c(w w1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            w1 = w1.asBinder();
_L5:
            parcel.writeStrongBinder(w1);
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
            w1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
              goto _L5
        }

        public final void c(w w1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            a.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void d(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void d(w w1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            a.transact(46, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void e(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void e(w w1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            a.transact(47, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void f(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void f(w w1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            a.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void g(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void h(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void i(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void j(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void k(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(49, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void l(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(51, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void m(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(52, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void n(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void o(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void p(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(w w)
        throws RemoteException;

    public abstract void a(w w, byte byte0)
        throws RemoteException;

    public abstract void a(w w, int i1)
        throws RemoteException;

    public abstract void a(w w, Uri uri)
        throws RemoteException;

    public abstract void a(w w, Uri uri, int i1)
        throws RemoteException;

    public abstract void a(w w, Asset asset)
        throws RemoteException;

    public abstract void a(w w, ConnectionConfiguration connectionconfiguration)
        throws RemoteException;

    public abstract void a(w w, PutDataRequest putdatarequest)
        throws RemoteException;

    public abstract void a(w w, AddListenerRequest addlistenerrequest)
        throws RemoteException;

    public abstract void a(w w, AncsNotificationParcelable ancsnotificationparcelable)
        throws RemoteException;

    public abstract void a(w w, RemoveListenerRequest removelistenerrequest)
        throws RemoteException;

    public abstract void a(w w, v v, String s)
        throws RemoteException;

    public abstract void a(w w, String s)
        throws RemoteException;

    public abstract void a(w w, String s, int i1)
        throws RemoteException;

    public abstract void a(w w, String s, ParcelFileDescriptor parcelfiledescriptor)
        throws RemoteException;

    public abstract void a(w w, String s, ParcelFileDescriptor parcelfiledescriptor, long l1, long l2)
        throws RemoteException;

    public abstract void a(w w, String s, String s1)
        throws RemoteException;

    public abstract void a(w w, String s, String s1, byte abyte0[])
        throws RemoteException;

    public abstract void a(w w, boolean flag)
        throws RemoteException;

    public abstract void b(w w)
        throws RemoteException;

    public abstract void b(w w, int i1)
        throws RemoteException;

    public abstract void b(w w, Uri uri)
        throws RemoteException;

    public abstract void b(w w, Uri uri, int i1)
        throws RemoteException;

    public abstract void b(w w, ConnectionConfiguration connectionconfiguration)
        throws RemoteException;

    public abstract void b(w w, v v, String s)
        throws RemoteException;

    public abstract void b(w w, String s)
        throws RemoteException;

    public abstract void b(w w, String s, int i1)
        throws RemoteException;

    public abstract void b(w w, boolean flag)
        throws RemoteException;

    public abstract void c(w w)
        throws RemoteException;

    public abstract void c(w w, int i1)
        throws RemoteException;

    public abstract void c(w w, Uri uri)
        throws RemoteException;

    public abstract void c(w w, String s)
        throws RemoteException;

    public abstract void d(w w)
        throws RemoteException;

    public abstract void d(w w, String s)
        throws RemoteException;

    public abstract void e(w w)
        throws RemoteException;

    public abstract void e(w w, String s)
        throws RemoteException;

    public abstract void f(w w)
        throws RemoteException;

    public abstract void f(w w, String s)
        throws RemoteException;

    public abstract void g(w w)
        throws RemoteException;

    public abstract void h(w w)
        throws RemoteException;

    public abstract void i(w w)
        throws RemoteException;

    public abstract void j(w w)
        throws RemoteException;

    public abstract void k(w w)
        throws RemoteException;

    public abstract void l(w w)
        throws RemoteException;

    public abstract void m(w w)
        throws RemoteException;

    public abstract void n(w w)
        throws RemoteException;

    public abstract void o(w w)
        throws RemoteException;

    public abstract void p(w w)
        throws RemoteException;
}
