// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.external;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.fitbit.f.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package bluetooth.le.external:
//            ScanResult, e

public final class ScanFilter
    implements Parcelable
{
    public static final class a
    {

        private String a;
        private String b;
        private ParcelUuid c;
        private ParcelUuid d;
        private ParcelUuid e;
        private byte f[];
        private byte g[];
        private int h;
        private byte i[];
        private byte j[];

        public a a(int k, byte abyte0[])
        {
            if (abyte0 != null && k < 0)
            {
                throw new IllegalArgumentException("invalid manufacture id");
            } else
            {
                h = k;
                i = abyte0;
                j = null;
                return this;
            }
        }

        public a a(int k, byte abyte0[], byte abyte1[])
        {
            if (abyte0 != null && k < 0)
            {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            if (j != null)
            {
                if (i == null)
                {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
                if (i.length != j.length)
                {
                    throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                }
            }
            h = k;
            i = abyte0;
            j = abyte1;
            return this;
        }

        public a a(ParcelUuid parceluuid)
        {
            c = parceluuid;
            d = null;
            return this;
        }

        public a a(ParcelUuid parceluuid, ParcelUuid parceluuid1)
        {
            if (d != null && c == null)
            {
                throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
            } else
            {
                c = parceluuid;
                d = parceluuid1;
                return this;
            }
        }

        public a a(ParcelUuid parceluuid, byte abyte0[])
        {
            if (parceluuid == null)
            {
                throw new IllegalArgumentException("serviceDataUuid is null");
            } else
            {
                e = parceluuid;
                f = abyte0;
                g = null;
                return this;
            }
        }

        public a a(ParcelUuid parceluuid, byte abyte0[], byte abyte1[])
        {
            if (parceluuid == null)
            {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            if (g != null)
            {
                if (f == null)
                {
                    throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                }
                if (f.length != g.length)
                {
                    throw new IllegalArgumentException("size mismatch for service data and service data mask");
                }
            }
            e = parceluuid;
            f = abyte0;
            g = abyte1;
            return this;
        }

        public a a(String s)
        {
            a = s;
            return this;
        }

        public ScanFilter a()
        {
            return new ScanFilter(a, b, c, d, e, f, g, h, i, j, null);
        }

        public a b(String s)
        {
            if (s != null && !BluetoothAdapter.checkBluetoothAddress(s))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid device address ").append(s).toString());
            } else
            {
                b = s;
                return this;
            }
        }

        public a()
        {
            h = -1;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final String a;
    private final String b;
    private final ParcelUuid c;
    private final ParcelUuid d;
    private final ParcelUuid e;
    private final byte f[];
    private final byte g[];
    private final int h;
    private final byte i[];
    private final byte j[];

    private ScanFilter(String s, String s1, ParcelUuid parceluuid, ParcelUuid parceluuid1, ParcelUuid parceluuid2, byte abyte0[], byte abyte1[], 
            int k, byte abyte2[], byte abyte3[])
    {
        a = s;
        c = parceluuid;
        d = parceluuid1;
        b = s1;
        e = parceluuid2;
        f = abyte0;
        g = abyte1;
        h = k;
        i = abyte2;
        j = abyte3;
    }

    ScanFilter(String s, String s1, ParcelUuid parceluuid, ParcelUuid parceluuid1, ParcelUuid parceluuid2, byte abyte0[], byte abyte1[], 
            int k, byte abyte2[], byte abyte3[], _cls1 _pcls1)
    {
        this(s, s1, parceluuid, parceluuid1, parceluuid2, abyte0, abyte1, k, abyte2, abyte3);
    }

    private boolean a(ParcelUuid parceluuid, ParcelUuid parceluuid1, List list)
    {
        if (parceluuid == null)
        {
            return true;
        }
        if (list == null)
        {
            return false;
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            ParcelUuid parceluuid2 = (ParcelUuid)iterator.next();
            if (parceluuid1 == null)
            {
                list = null;
            } else
            {
                list = parceluuid1.getUuid();
            }
            if (a(parceluuid.getUuid(), ((UUID) (list)), parceluuid2.getUuid()))
            {
                return true;
            }
        }

        return false;
    }

    private boolean a(UUID uuid, UUID uuid1, UUID uuid2)
    {
        boolean flag1 = false;
        boolean flag;
        if (uuid1 == null)
        {
            flag = uuid.equals(uuid2);
        } else
        {
            flag = flag1;
            if ((uuid.getLeastSignificantBits() & uuid1.getLeastSignificantBits()) == (uuid2.getLeastSignificantBits() & uuid1.getLeastSignificantBits()))
            {
                flag = flag1;
                if ((uuid.getMostSignificantBits() & uuid1.getMostSignificantBits()) == (uuid2.getMostSignificantBits() & uuid1.getMostSignificantBits()))
                {
                    return true;
                }
            }
        }
        return flag;
    }

    private boolean a(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        if (abyte2 != null && abyte2.length >= abyte0.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (abyte1 == null)
        {
            for (int k = 0; k < abyte0.length; k++)
            {
                if (abyte2[k] != abyte0[k])
                {
                    continue; /* Loop/switch isn't completed */
                }
            }

            return true;
        }
        int l = 0;
label0:
        do
        {
label1:
            {
                if (l >= abyte0.length)
                {
                    break label1;
                }
                if ((abyte1[l] & abyte2[l]) != (abyte1[l] & abyte0[l]))
                {
                    break label0;
                }
                l++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public String a()
    {
        return a;
    }

    public boolean a(ScanResult scanresult)
    {
        if (scanresult != null)
        {
            BluetoothDevice bluetoothdevice = scanresult.a();
            if (b == null || bluetoothdevice != null && b.equals(bluetoothdevice.getAddress()))
            {
                scanresult = scanresult.b();
                if ((scanresult != null || a == null && c == null && i == null && f == null) && (a == null || a.equals(scanresult.f())) && (c == null || a(c, d, scanresult.b())) && (e == null || a(f, g, scanresult.a(e))) && (h < 0 || a(i, j, scanresult.a(h))))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public ParcelUuid b()
    {
        return c;
    }

    public ParcelUuid c()
    {
        return d;
    }

    public String d()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ScanFilter)obj;
            if (!com.fitbit.f.b.a(a, ((ScanFilter) (obj)).a) || !com.fitbit.f.b.a(b, ((ScanFilter) (obj)).b) || h != ((ScanFilter) (obj)).h || !com.fitbit.f.b.b(i, ((ScanFilter) (obj)).i) || !com.fitbit.f.b.b(j, ((ScanFilter) (obj)).j) || !com.fitbit.f.b.b(e, ((ScanFilter) (obj)).e) || !com.fitbit.f.b.b(f, ((ScanFilter) (obj)).f) || !com.fitbit.f.b.b(g, ((ScanFilter) (obj)).g) || !com.fitbit.f.b.a(c, ((ScanFilter) (obj)).c) || !com.fitbit.f.b.a(d, ((ScanFilter) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public byte[] f()
    {
        return g;
    }

    public ParcelUuid g()
    {
        return e;
    }

    public int h()
    {
        return h;
    }

    public int hashCode()
    {
        return com.fitbit.f.b.a(new Object[] {
            a, b, Integer.valueOf(h), i, j, e, f, g, c, d
        });
    }

    public byte[] i()
    {
        return i;
    }

    public byte[] j()
    {
        return j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("BluetoothLeScanFilter [mDeviceName=").append(a).append(", mDeviceAddress=").append(b).append(", mUuid=").append(c).append(", mUuidMask=").append(d).append(", mServiceDataUuid=").append(com.fitbit.f.b.a(e)).append(", mServiceData=").append(Arrays.toString(f)).append(", mServiceDataMask=").append(Arrays.toString(g)).append(", mManufacturerId=").append(h).append(", mManufacturerData=").append(Arrays.toString(i)).append(", mManufacturerDataMask=").append(Arrays.toString(j)).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        boolean flag = false;
        int l;
        if (a == null)
        {
            l = 0;
        } else
        {
            l = 1;
        }
        parcel.writeInt(l);
        if (a != null)
        {
            parcel.writeString(a);
        }
        if (b == null)
        {
            l = 0;
        } else
        {
            l = 1;
        }
        parcel.writeInt(l);
        if (b != null)
        {
            parcel.writeString(b);
        }
        if (c == null)
        {
            l = 0;
        } else
        {
            l = 1;
        }
        parcel.writeInt(l);
        if (c != null)
        {
            parcel.writeParcelable(c, k);
            if (d == null)
            {
                l = 0;
            } else
            {
                l = 1;
            }
            parcel.writeInt(l);
            if (d != null)
            {
                parcel.writeParcelable(d, k);
            }
        }
        if (e == null)
        {
            l = 0;
        } else
        {
            l = 1;
        }
        parcel.writeInt(l);
        if (e != null)
        {
            parcel.writeParcelable(e, k);
            if (f == null)
            {
                k = 0;
            } else
            {
                k = 1;
            }
            parcel.writeInt(k);
            if (f != null)
            {
                parcel.writeInt(f.length);
                parcel.writeByteArray(f);
                if (g == null)
                {
                    k = 0;
                } else
                {
                    k = 1;
                }
                parcel.writeInt(k);
                if (g != null)
                {
                    parcel.writeInt(g.length);
                    parcel.writeByteArray(g);
                }
            }
        }
        parcel.writeInt(h);
        if (i == null)
        {
            k = 0;
        } else
        {
            k = 1;
        }
        parcel.writeInt(k);
        if (i != null)
        {
            parcel.writeInt(i.length);
            parcel.writeByteArray(i);
            if (j == null)
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = 1;
            }
            parcel.writeInt(k);
            if (j != null)
            {
                parcel.writeInt(j.length);
                parcel.writeByteArray(j);
            }
        }
    }


    /* member class not found */
    class _cls1 {}

}
