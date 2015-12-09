// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.iid:
//            c

public class MessengerCompat
    implements Parcelable
{
    private final class a extends c.a
    {

        Handler a;
        final MessengerCompat b;

        public void a(Message message)
            throws RemoteException
        {
            message.arg2 = Binder.getCallingUid();
            a.dispatchMessage(message);
        }

        a(Handler handler)
        {
            b = MessengerCompat.this;
            super();
            a = handler;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public MessengerCompat a(Parcel parcel)
        {
            parcel = parcel.readStrongBinder();
            if (parcel != null)
            {
                return new MessengerCompat(parcel);
            } else
            {
                return null;
            }
        }

        public MessengerCompat[] a(int i)
        {
            return new MessengerCompat[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    Messenger a;
    c b;

    public MessengerCompat(Handler handler)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new Messenger(handler);
            return;
        } else
        {
            b = new a(handler);
            return;
        }
    }

    public MessengerCompat(IBinder ibinder)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new Messenger(ibinder);
            return;
        } else
        {
            b = com.google.android.gms.iid.c.a.a(ibinder);
            return;
        }
    }

    public static int a(Message message)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return c(message);
        } else
        {
            return message.arg2;
        }
    }

    private static int c(Message message)
    {
        return message.sendingUid;
    }

    public IBinder a()
    {
        if (a != null)
        {
            return a.getBinder();
        } else
        {
            return b.asBinder();
        }
    }

    public void b(Message message)
        throws RemoteException
    {
        if (a != null)
        {
            a.send(message);
            return;
        } else
        {
            b.a(message);
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a().equals(((MessengerCompat)obj).a());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    public int hashCode()
    {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (a != null)
        {
            parcel.writeStrongBinder(a.getBinder());
            return;
        } else
        {
            parcel.writeStrongBinder(b.asBinder());
            return;
        }
    }

}
