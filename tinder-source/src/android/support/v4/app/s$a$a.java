// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//            s

private static final class a
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

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
