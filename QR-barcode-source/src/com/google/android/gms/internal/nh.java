// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            nm, ni, nn, nk

public interface nh
    extends IInterface
{
    public static abstract class a extends Binder
        implements nh
    {

        public static nh bC(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            if (iinterface != null && (iinterface instanceof nh))
            {
                return (nh)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            String s = null;
            Object obj1 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.playlog.internal.IPlayLogService");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
                s = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel1 = nm.CREATOR.cY(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj = ni.CREATOR.cX(parcel);
                }
                a(s, parcel1, ((ni) (obj)));
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
                obj = parcel.readString();
                parcel1 = s;
                if (parcel.readInt() != 0)
                {
                    parcel1 = nm.CREATOR.cY(parcel);
                }
                a(((String) (obj)), parcel1, parcel.createTypedArrayList(ni.CREATOR));
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
                obj = parcel.readString();
                parcel1 = obj1;
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = nm.CREATOR.cY(parcel);
            }
            a(((String) (obj)), parcel1, parcel.createByteArray());
            return true;
        }
    }

    private static class a.a
        implements nh
    {

        private IBinder lb;

        public void a(String s, nm nm1, ni ni1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
            parcel.writeString(s);
            if (nm1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            nm1.writeToParcel(parcel, 0);
_L3:
            if (ni1 == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            parcel.writeInt(1);
            ni1.writeToParcel(parcel, 0);
_L4:
            lb.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel.recycle();
            throw s;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(String s, nm nm1, List list)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
            parcel.writeString(s);
            if (nm1 == null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            parcel.writeInt(1);
            nm1.writeToParcel(parcel, 0);
_L1:
            parcel.writeTypedList(list);
            lb.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel.recycle();
            throw s;
        }

        public void a(String s, nm nm1, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
            parcel.writeString(s);
            if (nm1 == null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            parcel.writeInt(1);
            nm1.writeToParcel(parcel, 0);
_L1:
            parcel.writeByteArray(abyte0);
            lb.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel.recycle();
            throw s;
        }

        public IBinder asBinder()
        {
            return lb;
        }

        a.a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public abstract void a(String s, nm nm, ni ni)
        throws RemoteException;

    public abstract void a(String s, nm nm, List list)
        throws RemoteException;

    public abstract void a(String s, nm nm, byte abyte0[])
        throws RemoteException;
}
