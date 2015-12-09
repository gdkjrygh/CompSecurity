// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.bluetooth.AirlinkSession;

public class BluetoothConnectionServiceStatus
    implements Parcelable
{
    public static class a
    {

        private int a;
        private BluetoothDevice b;
        private AirlinkSession c;

        private a a(int j, boolean flag)
        {
            if (flag)
            {
                a = a | j;
                return this;
            } else
            {
                a = a & ~j;
                return this;
            }
        }

        public a a(BluetoothDevice bluetoothdevice)
        {
            b = bluetoothdevice;
            return this;
        }

        public a a(boolean flag)
        {
            return a(1, flag);
        }

        public a a(boolean flag, AirlinkSession airlinksession)
        {
            c = airlinksession;
            return a(8, flag);
        }

        public BluetoothConnectionServiceStatus a()
        {
            return new BluetoothConnectionServiceStatus(a, b, c);
        }

        public a b(boolean flag)
        {
            return a(2, flag);
        }

        public a c(boolean flag)
        {
            return a(4, flag);
        }

        public a d(boolean flag)
        {
            return a(16, flag);
        }

        public String toString()
        {
            return BluetoothConnectionServiceStatus.a(a, b, null);
        }

        public a()
        {
            a = 0;
            b = null;
            c = null;
        }

        public a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
        {
            a = bluetoothconnectionservicestatus.a();
            b = bluetoothconnectionservicestatus.h();
            c = BluetoothConnectionServiceStatus.a(bluetoothconnectionservicestatus);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public BluetoothConnectionServiceStatus a(Parcel parcel)
        {
            BluetoothDevice bluetoothdevice = (BluetoothDevice)parcel.readParcelable(android/bluetooth/BluetoothDevice.getClassLoader());
            AirlinkSession airlinksession = (AirlinkSession)parcel.readParcelable(com/fitbit/bluetooth/AirlinkSession.getClassLoader());
            return new BluetoothConnectionServiceStatus(parcel.readInt(), bluetoothdevice, airlinksession);
        }

        public BluetoothConnectionServiceStatus[] a(int j)
        {
            return new BluetoothConnectionServiceStatus[j];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int j)
        {
            return a(j);
        }

    };
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    private final int f;
    private final BluetoothDevice g;
    private final AirlinkSession h;

    public BluetoothConnectionServiceStatus()
    {
        this(0, null, null);
    }

    public BluetoothConnectionServiceStatus(int j, BluetoothDevice bluetoothdevice, AirlinkSession airlinksession)
    {
        f = j;
        g = bluetoothdevice;
        h = airlinksession;
    }

    static AirlinkSession a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        return bluetoothconnectionservicestatus.h;
    }

    static String a(int j, BluetoothDevice bluetoothdevice, AirlinkSession airlinksession)
    {
        return b(j, bluetoothdevice, airlinksession);
    }

    private static String b(int j, BluetoothDevice bluetoothdevice, AirlinkSession airlinksession)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("flags = [");
        String s;
        if ((j & 1) > 0)
        {
            s = " CONNECTED";
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if ((j & 2) > 0)
        {
            s = " FBACTIVITY_NOTIFICATIONS_ENABLED";
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if ((j & 4) > 0)
        {
            s = " LIVEDATA_NOTIFICATIONS_ENABLED";
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if ((j & 8) > 0)
        {
            s = " SESSION_OPENED";
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if ((j & 0x10) > 0)
        {
            s = " DEVICE_SUBSCRIBED";
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(" ], connectedDevice = ").append(bluetoothdevice).append(", session = ").append(airlinksession).toString();
    }

    public int a()
    {
        return f;
    }

    public AirlinkSession b()
    {
        return h;
    }

    public boolean c()
    {
        return (f & 1) > 0;
    }

    public boolean d()
    {
        return (f & 2) > 0;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return (f & 4) > 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BluetoothConnectionServiceStatus)obj;
            if (g == null)
            {
                if (((BluetoothConnectionServiceStatus) (obj)).g != null)
                {
                    return false;
                }
            } else
            if (!g.equals(((BluetoothConnectionServiceStatus) (obj)).g))
            {
                return false;
            }
            if (f != ((BluetoothConnectionServiceStatus) (obj)).f)
            {
                return false;
            }
        }
        return true;
    }

    public boolean f()
    {
        return (f & 8) > 0;
    }

    public boolean g()
    {
        return (f & 0x10) > 0;
    }

    public BluetoothDevice h()
    {
        return g;
    }

    public int hashCode()
    {
        int j;
        if (g == null)
        {
            j = 0;
        } else
        {
            j = g.hashCode();
        }
        return (j + 31) * 31 + f;
    }

    public a i()
    {
        return new a(this);
    }

    public String toString()
    {
        return b(f, g, h);
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeParcelable(g, j);
        parcel.writeParcelable(h, j);
        parcel.writeInt(j);
    }

}
