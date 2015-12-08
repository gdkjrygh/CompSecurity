// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface s
    extends IInterface
{
    public static abstract class a extends Binder
        implements s
    {

        public static s a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (iinterface != null && (iinterface instanceof s))
            {
                return (s)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("android.support.v4.app.INotificationSideChannel");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                parcel1 = parcel.readString();
                i = parcel.readInt();
                String s1 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel = (Notification)Notification.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(parcel1, i, s1, parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                a(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;

            case 3: // '\003'
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                a(parcel.readString());
                return true;
            }
        }
    }

    private static final class a.a
        implements s
    {

        private IBinder a;

        public final void a(String s1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            parcel.writeString(s1);
            a.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            s1;
            parcel.recycle();
            throw s1;
        }

        public final void a(String s1, int i, String s2)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            parcel.writeString(s1);
            parcel.writeInt(i);
            parcel.writeString(s2);
            a.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            s1;
            parcel.recycle();
            throw s1;
        }

        public final void a(String s1, int i, String s2, Notification notification)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            parcel.writeString(s1);
            parcel.writeInt(i);
            parcel.writeString(s2);
            if (notification == null)
            {
                break MISSING_BLOCK_LABEL_70;
            }
            parcel.writeInt(1);
            notification.writeToParcel(parcel, 0);
_L1:
            a.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s1;
            parcel.recycle();
            throw s1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(String s1)
        throws RemoteException;

    public abstract void a(String s1, int i, String s2)
        throws RemoteException;

    public abstract void a(String s1, int i, String s2, Notification notification)
        throws RemoteException;
}
