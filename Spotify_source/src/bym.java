// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

final class bym
    implements byk
{

    private IBinder a;

    bym(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(Message message)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        if (message == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        message.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        message;
        parcel.recycle();
        throw message;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
