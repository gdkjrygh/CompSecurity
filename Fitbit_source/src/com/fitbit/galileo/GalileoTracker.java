// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.fitbit.bluetooth.broadcom.a;
import com.fitbit.galileo.a.c;
import com.fitbit.galileo.a.f;
import java.util.UUID;

// Referenced classes of package com.fitbit.galileo:
//            GalileoTrackerType

public final class GalileoTracker
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public GalileoTracker a(Parcel parcel)
        {
            GalileoTracker galileotracker = new GalileoTracker((BluetoothDevice)parcel.readParcelable(android/bluetooth/BluetoothDevice.getClassLoader()));
            galileotracker.a(parcel.readInt());
            galileotracker.a(parcel.createByteArray());
            galileotracker.a((ParcelUuid)parcel.readParcelable(android/os/ParcelUuid.getClassLoader()));
            int i = parcel.readInt();
            com.fitbit.galileo.GalileoTracker.a(galileotracker, GalileoTrackerType.values()[i]);
            return galileotracker;
        }

        public GalileoTracker[] a(int i)
        {
            return new GalileoTracker[i];
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
    private final BluetoothDevice a;
    private int b;
    private byte c[];
    private ParcelUuid d;
    private GalileoTrackerType e;

    public GalileoTracker(BluetoothDevice bluetoothdevice)
    {
        a = bluetoothdevice;
    }

    static GalileoTrackerType a(GalileoTracker galileotracker, GalileoTrackerType galileotrackertype)
    {
        galileotracker.e = galileotrackertype;
        return galileotrackertype;
    }

    public BluetoothDevice a()
    {
        return a;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(ParcelUuid parceluuid)
    {
        d = parceluuid;
    }

    public void a(UUID uuid)
    {
        a(new ParcelUuid(uuid));
    }

    public void a(byte abyte0[])
    {
        c = abyte0;
    }

    public int b()
    {
        return b;
    }

    public byte[] c()
    {
        return c;
    }

    public UUID d()
    {
        if (d != null)
        {
            return d.getUuid();
        } else
        {
            return null;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return com.fitbit.galileo.a.f.a(a);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (GalileoTracker)obj;
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((GalileoTracker) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((GalileoTracker) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public GalileoTrackerType f()
    {
        if (e == null)
        {
            if (c != null)
            {
                e = com.fitbit.galileo.GalileoTrackerType.a(c);
            } else
            {
                e = com.fitbit.galileo.GalileoTrackerType.a(a);
            }
        }
        return e;
    }

    public String g()
    {
        if (c != null)
        {
            return com.fitbit.bluetooth.broadcom.a.b(c);
        } else
        {
            return f().b();
        }
    }

    public int hashCode()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return i + 31;
    }

    public String toString()
    {
        return (new StringBuilder()).append("GalileoTracker [device=").append(a.getName()).append(", mac=").append(a.getAddress()).append(", rssi=").append(b).append(", serviceData=").append(com.fitbit.galileo.a.c.a(c)).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeInt(b);
        parcel.writeByteArray(c);
        parcel.writeParcelable(d, i);
        GalileoTrackerType galileotrackertype;
        if (e == null)
        {
            galileotrackertype = GalileoTrackerType.h;
        } else
        {
            galileotrackertype = e;
        }
        parcel.writeInt(galileotrackertype.ordinal());
    }

}
