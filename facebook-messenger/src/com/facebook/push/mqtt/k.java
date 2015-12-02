// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.mqtt.messages.SubscribeTopic;

// Referenced classes of package com.facebook.push.mqtt:
//            j, l

public abstract class k extends Binder
    implements j
{

    public k()
    {
        attachInterface(this, "com.facebook.push.mqtt.IMqttPushService");
    }

    public static j a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.facebook.push.mqtt.IMqttPushService");
        if (iinterface != null && (iinterface instanceof j))
        {
            return (j)iinterface;
        } else
        {
            return new l(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int i1)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, i1);

        case 1598968902: 
            parcel1.writeString("com.facebook.push.mqtt.IMqttPushService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.facebook.push.mqtt.IMqttPushService");
            boolean flag4 = a();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag4)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.facebook.push.mqtt.IMqttPushService");
            boolean flag5 = b();
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag5)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.facebook.push.mqtt.IMqttPushService");
            boolean flag6 = a(parcel.readLong());
            parcel1.writeNoException();
            i = ((flag2) ? 1 : 0);
            if (flag6)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.facebook.push.mqtt.IMqttPushService");
            i = a(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.facebook.push.mqtt.IMqttPushService");
            boolean flag7 = a(parcel.readString(), parcel.readString(), parcel.readLong());
            parcel1.writeNoException();
            i = ((flag3) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.facebook.push.mqtt.IMqttPushService");
            a(parcel.createTypedArrayList(SubscribeTopic.CREATOR));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.facebook.push.mqtt.IMqttPushService");
            b(parcel.createTypedArrayList(SubscribeTopic.CREATOR));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.facebook.push.mqtt.IMqttPushService");
            parcel = c();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;
        }
    }
}
