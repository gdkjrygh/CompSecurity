// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.external;

import android.bluetooth.BluetoothAdapter;
import android.os.ParcelUuid;

// Referenced classes of package bluetooth.le.external:
//            ScanFilter

public static final class h
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

    public h a(int k, byte abyte0[])
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

    public j a(int k, byte abyte0[], byte abyte1[])
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

    public j a(ParcelUuid parceluuid)
    {
        c = parceluuid;
        d = null;
        return this;
    }

    public d a(ParcelUuid parceluuid, ParcelUuid parceluuid1)
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

    public d a(ParcelUuid parceluuid, byte abyte0[])
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

    public g a(ParcelUuid parceluuid, byte abyte0[], byte abyte1[])
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

    public g a(String s)
    {
        a = s;
        return this;
    }

    public ScanFilter a()
    {
        return new ScanFilter(a, b, c, d, e, f, g, h, i, j, null);
    }

    public j b(String s)
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

    public ()
    {
        h = -1;
    }
}
