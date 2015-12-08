// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gms.iid:
//            d, e, h, g

public class MessengerCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    Messenger a;
    g b;

    public MessengerCompat(Handler handler)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new Messenger(handler);
            return;
        } else
        {
            b = new e(this, handler);
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
            b = h.a(ibinder);
            return;
        }
    }

    public static int a(Message message)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return message.sendingUid;
        } else
        {
            return message.arg2;
        }
    }

    public final IBinder a()
    {
        if (a != null)
        {
            return a.getBinder();
        } else
        {
            return b.asBinder();
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
