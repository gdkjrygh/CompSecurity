// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.external;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.fitbit.f.b;

// Referenced classes of package bluetooth.le.external:
//            e

public final class ScanResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final String a = bluetooth/le/external/ScanResult.getSimpleName();
    private BluetoothDevice b;
    private e c;
    private int d;
    private long e;

    public ScanResult(BluetoothDevice bluetoothdevice, e e1, int i, long l)
    {
        b = bluetoothdevice;
        c = e1;
        d = i;
        e = l;
    }

    private ScanResult(Parcel parcel)
    {
        a(parcel);
    }

    ScanResult(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    private void a(Parcel parcel)
    {
        if (parcel.readInt() == 1)
        {
            b = (BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 1)
        {
            c = bluetooth.le.external.e.a(parcel.createByteArray());
        }
        d = parcel.readInt();
        e = parcel.readLong();
    }

    public BluetoothDevice a()
    {
        return b;
    }

    public e b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public long d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        try
        {
            a().getName();
            a().getAddress();
        }
        catch (NullPointerException nullpointerexception)
        {
            Log.w(a, (new StringBuilder()).append("Invalid bluetooth device detected: ").append(this).toString());
            return false;
        }
        return true;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ScanResult)obj;
            if (!com.fitbit.f.b.a(b, ((ScanResult) (obj)).b) || d != ((ScanResult) (obj)).d || !com.fitbit.f.b.a(c, ((ScanResult) (obj)).c) || e != ((ScanResult) (obj)).e)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return com.fitbit.f.b.a(new Object[] {
            b, Integer.valueOf(d), c, Long.valueOf(e)
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("ScanResult{mDevice=").append(b).append(", mScanRecord=").append(com.fitbit.f.b.a(c)).append(", mRssi=").append(d).append(", mTimestampNanos=").append(e).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (b != null)
        {
            parcel.writeInt(1);
            b.writeToParcel(parcel, i);
        } else
        {
            parcel.writeInt(0);
        }
        if (c != null)
        {
            parcel.writeInt(1);
            parcel.writeByteArray(c.g());
        } else
        {
            parcel.writeInt(0);
        }
        parcel.writeInt(d);
        parcel.writeLong(e);
    }


    /* member class not found */
    class _cls1 {}

}
