// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;

final class lkl
    implements lkj
{

    private IBinder a;

    lkl(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(MessageWrapper messagewrapper)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
        if (messagewrapper == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        messagewrapper.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        messagewrapper;
        parcel1.recycle();
        parcel.recycle();
        throw messagewrapper;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(MessageWrapper messagewrapper)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
        if (messagewrapper == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        messagewrapper.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        messagewrapper;
        parcel1.recycle();
        parcel.recycle();
        throw messagewrapper;
    }
}
