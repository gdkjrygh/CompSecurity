// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gms.iid:
//            IMessengerCompat

public class MessengerCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
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

        public final volatile Object[] newArray(int i)
        {
            return new MessengerCompat[i];
        }

    };
    Messenger messenger;
    IMessengerCompat messengerCompat;

    public MessengerCompat(IBinder ibinder)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            messenger = new Messenger(ibinder);
            return;
        } else
        {
            messengerCompat = IMessengerCompat.Stub.asInterface(ibinder);
            return;
        }
    }

    private IBinder getBinder()
    {
        if (messenger != null)
        {
            return messenger.getBinder();
        } else
        {
            return messengerCompat.asBinder();
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
            flag = getBinder().equals(((MessengerCompat)obj).getBinder());
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
        return getBinder().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (messenger != null)
        {
            parcel.writeStrongBinder(messenger.getBinder());
            return;
        } else
        {
            parcel.writeStrongBinder(messengerCompat.asBinder());
            return;
        }
    }

}
