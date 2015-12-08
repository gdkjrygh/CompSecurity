// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            j, BeginCompoundOperationRequest, o, EndCompoundOperationRequest, 
//            ParcelableIndexReference, n, c, d, 
//            e, h, i, l, 
//            g, f, k

public interface m
    extends IInterface
{
    public static abstract class a extends Binder
        implements m
    {

        public static m al(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
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
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), n.a.am(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(com.google.android.gms.drive.realtime.internal.c.a.ab(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(o.a.an(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                b(com.google.android.gms.drive.realtime.internal.c.a.ab(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                b(o.a.an(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 40: // '('
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(l.a.ak(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), parcel.readString(), f.a.ae(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), l.a.ak(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                s = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR.B(parcel);
                }
                a(s, ((DataHolder) (obj)), com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), f.a.ae(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), parcel.readString(), g.a.af(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                b(parcel.readString(), l.a.ak(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                b(parcel.readString(), n.a.am(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), parcel.readInt(), parcel.readString(), com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), parcel.readInt(), parcel.readInt(), com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), parcel.readString(), com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                b(parcel.readString(), f.a.ae(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                c(parcel.readString(), l.a.ak(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                s2 = parcel.readString();
                i = parcel.readInt();
                obj = s;
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR.B(parcel);
                }
                a(s2, i, ((DataHolder) (obj)), com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                String s1 = parcel.readString();
                i = parcel.readInt();
                obj = s2;
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR.B(parcel);
                }
                a(s1, i, ((DataHolder) (obj)), g.a.af(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), parcel.readInt(), parcel.readInt(), g.a.af(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (BeginCompoundOperationRequest)BeginCompoundOperationRequest.CREATOR.createFromParcel(parcel);
                }
                a(((BeginCompoundOperationRequest) (obj)), o.a.an(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 41: // ')'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(parcel);
                }
                a(((EndCompoundOperationRequest) (obj)), com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                b(com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                c(com.google.android.gms.drive.realtime.internal.c.a.ab(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                d(com.google.android.gms.drive.realtime.internal.c.a.ab(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (ParcelableIndexReference)ParcelableIndexReference.CREATOR.createFromParcel(parcel);
                }
                a(((ParcelableIndexReference) (obj)), n.a.am(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), k.a.aj(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), parcel.readInt(), o.a.an(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                b(l.a.ak(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readInt(), com.google.android.gms.drive.realtime.internal.j.a.ai(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(e.a.ad(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(com.google.android.gms.drive.realtime.internal.d.a.ac(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(com.google.android.gms.drive.realtime.internal.i.a.ah(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 36: // '$'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(h.a.ag(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 38: // '&'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                a(parcel.readString(), o.a.an(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 39: // '\''
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                b(parcel.readString(), o.a.an(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                obj = obj4;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(parcel);
            }
            a(((EndCompoundOperationRequest) (obj)), o.a.an(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }

    private static class a.a
        implements m
    {

        private IBinder le;

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
            le.transact(30, parcel, parcel1, 0);
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
            le.transact(18, parcel, parcel1, 0);
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

        public void a(EndCompoundOperationRequest endcompoundoperationrequest, j j1)
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
            if (j1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            endcompoundoperationrequest = j1.asBinder();
_L4:
            parcel.writeStrongBinder(endcompoundoperationrequest);
            le.transact(41, parcel, parcel1, 0);
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
            le.transact(19, parcel, parcel1, 0);
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
            le.transact(26, parcel, parcel1, 0);
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
            le.transact(2, parcel, parcel1, 0);
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
            le.transact(32, parcel, parcel1, 0);
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
            le.transact(31, parcel, parcel1, 0);
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
            le.transact(36, parcel, parcel1, 0);
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
            le.transact(34, parcel, parcel1, 0);
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
            le.transact(22, parcel, parcel1, 0);
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
            le.transact(40, parcel, parcel1, 0);
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
            le.transact(3, parcel, parcel1, 0);
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
            le.transact(17, parcel, parcel1, 0);
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
            le.transact(11, parcel, parcel1, 0);
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
            le.transact(16, parcel, parcel1, 0);
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
            le.transact(15, parcel, parcel1, 0);
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
            le.transact(28, parcel, parcel1, 0);
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
            le.transact(37, parcel, parcel1, 0);
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
            le.transact(10, parcel, parcel1, 0);
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
            le.transact(6, parcel, parcel1, 0);
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
            le.transact(20, parcel, parcel1, 0);
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
            le.transact(7, parcel, parcel1, 0);
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
            le.transact(27, parcel, parcel1, 0);
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
            le.transact(5, parcel, parcel1, 0);
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
            le.transact(1, parcel, parcel1, 0);
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
            le.transact(38, parcel, parcel1, 0);
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
            le.transact(4, parcel, parcel1, 0);
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
            le.transact(21, parcel, parcel1, 0);
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
            le.transact(12, parcel, parcel1, 0);
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
            return le;
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
            le.transact(33, parcel, parcel1, 0);
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
            le.transact(23, parcel, parcel1, 0);
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

        public void b(l l1)
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
            le.transact(29, parcel, parcel1, 0);
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
            le.transact(35, parcel, parcel1, 0);
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
            le.transact(13, parcel, parcel1, 0);
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
            le.transact(8, parcel, parcel1, 0);
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
            le.transact(9, parcel, parcel1, 0);
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
            le.transact(39, parcel, parcel1, 0);
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
            le.transact(24, parcel, parcel1, 0);
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
            le.transact(14, parcel, parcel1, 0);
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
            le.transact(25, parcel, parcel1, 0);
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

        a.a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public abstract void a(int i, j j)
        throws RemoteException;

    public abstract void a(BeginCompoundOperationRequest begincompoundoperationrequest, o o)
        throws RemoteException;

    public abstract void a(EndCompoundOperationRequest endcompoundoperationrequest, j j)
        throws RemoteException;

    public abstract void a(EndCompoundOperationRequest endcompoundoperationrequest, o o)
        throws RemoteException;

    public abstract void a(ParcelableIndexReference parcelableindexreference, n n)
        throws RemoteException;

    public abstract void a(c c1)
        throws RemoteException;

    public abstract void a(d d1)
        throws RemoteException;

    public abstract void a(e e)
        throws RemoteException;

    public abstract void a(h h)
        throws RemoteException;

    public abstract void a(i i)
        throws RemoteException;

    public abstract void a(j j)
        throws RemoteException;

    public abstract void a(l l)
        throws RemoteException;

    public abstract void a(o o)
        throws RemoteException;

    public abstract void a(String s, int i, int j, g g)
        throws RemoteException;

    public abstract void a(String s, int i, int j, j j1)
        throws RemoteException;

    public abstract void a(String s, int i, DataHolder dataholder, g g)
        throws RemoteException;

    public abstract void a(String s, int i, DataHolder dataholder, j j)
        throws RemoteException;

    public abstract void a(String s, int i, o o)
        throws RemoteException;

    public abstract void a(String s, int i, String s1, int j, j j1)
        throws RemoteException;

    public abstract void a(String s, int i, String s1, j j)
        throws RemoteException;

    public abstract void a(String s, DataHolder dataholder, j j)
        throws RemoteException;

    public abstract void a(String s, com.google.android.gms.drive.realtime.internal.f f)
        throws RemoteException;

    public abstract void a(String s, j j)
        throws RemoteException;

    public abstract void a(String s, k k)
        throws RemoteException;

    public abstract void a(String s, l l)
        throws RemoteException;

    public abstract void a(String s, n n)
        throws RemoteException;

    public abstract void a(String s, o o)
        throws RemoteException;

    public abstract void a(String s, String s1, com.google.android.gms.drive.realtime.internal.f f)
        throws RemoteException;

    public abstract void a(String s, String s1, g g)
        throws RemoteException;

    public abstract void a(String s, String s1, j j)
        throws RemoteException;

    public abstract void b(c c1)
        throws RemoteException;

    public abstract void b(j j)
        throws RemoteException;

    public abstract void b(l l)
        throws RemoteException;

    public abstract void b(o o)
        throws RemoteException;

    public abstract void b(String s, com.google.android.gms.drive.realtime.internal.f f)
        throws RemoteException;

    public abstract void b(String s, l l)
        throws RemoteException;

    public abstract void b(String s, n n)
        throws RemoteException;

    public abstract void b(String s, o o)
        throws RemoteException;

    public abstract void c(c c1)
        throws RemoteException;

    public abstract void c(String s, l l)
        throws RemoteException;

    public abstract void d(c c1)
        throws RemoteException;
}
