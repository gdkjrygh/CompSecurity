// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

final class by
    implements bw
{

    private IBinder a;

    by(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(String s)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        parcel.writeString(s);
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public final void a(String s, int i, String s1)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeString(s1);
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public final void a(String s, int i, String s1, Notification notification)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeString(s1);
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
        s;
        parcel.recycle();
        throw s;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
