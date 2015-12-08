// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class lkk extends Binder
    implements lkj
{

    public static lkj a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
        if (iinterface != null && (iinterface instanceof lkj))
        {
            return (lkj)iinterface;
        } else
        {
            return new lkl(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        com.google.android.gms.nearby.messages.internal.MessageWrapper messagewrapper = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.nearby.messages.internal.IMessageListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            if (parcel.readInt() != 0)
            {
                messagewrapper = lkt.a(parcel);
            }
            a(messagewrapper);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            messagewrapper = obj;
            break;
        }
        if (parcel.readInt() != 0)
        {
            messagewrapper = lkt.a(parcel);
        }
        b(messagewrapper);
        parcel1.writeNoException();
        return true;
    }
}
