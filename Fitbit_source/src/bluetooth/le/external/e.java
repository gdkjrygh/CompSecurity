// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.external;

import android.bluetooth.le.ScanRecord;
import android.os.ParcelUuid;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package bluetooth.le.external:
//            d, c

public final class e
{

    private static final String a = "ScanRecord";
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    private static final int h = 7;
    private static final int i = 8;
    private static final int j = 9;
    private static final int k = 10;
    private static final int l = 22;
    private static final int m = 255;
    private final int n;
    private final List o;
    private final SparseArray p;
    private final Map q;
    private final int r;
    private final String s;
    private final byte t[];

    e(List list, SparseArray sparsearray, Map map, int i1, int j1, String s1, byte abyte0[])
    {
        o = list;
        p = sparsearray;
        q = map;
        s = s1;
        n = i1;
        r = j1;
        t = abyte0;
    }

    private static int a(byte abyte0[], int i1, int j1, int k1, List list)
    {
        while (j1 > 0) 
        {
            list.add(bluetooth.le.external.d.a(a(abyte0, i1, k1)));
            j1 -= k1;
            i1 += k1;
        }
        return i1;
    }

    public static e a(ScanRecord scanrecord)
    {
        return new e(scanrecord.getServiceUuids(), scanrecord.getManufacturerSpecificData(), scanrecord.getServiceData(), scanrecord.getAdvertiseFlags(), scanrecord.getTxPowerLevel(), scanrecord.getDeviceName(), scanrecord.getBytes());
    }

    public static e a(byte abyte0[])
    {
        Object obj;
        ArrayList arraylist1;
        SparseArray sparsearray;
        ArrayMap arraymap;
        int i1;
        int j1;
        int k1;
        if (abyte0 == null)
        {
            return null;
        }
        k1 = 0;
        arraylist1 = new ArrayList();
        sparsearray = new SparseArray();
        arraymap = new ArrayMap();
        i1 = 0x80000000;
        obj = null;
        j1 = -1;
_L11:
        ArrayList arraylist;
        int i2;
        if (k1 < abyte0.length)
        {
            i2 = k1 + 1;
            k1 = abyte0[k1] & 0xff;
            if (k1 != 0)
            {
                break MISSING_BLOCK_LABEL_151;
            }
        }
        arraylist = arraylist1;
        if (arraylist1.isEmpty())
        {
            arraylist = null;
        }
        try
        {
            obj = new e(arraylist, sparsearray, arraymap, j1, i1, ((String) (obj)), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("ScanRecord", (new StringBuilder()).append("unable to parse scan record: ").append(Arrays.toString(abyte0)).toString());
            return new e(null, null, null, -1, 0x80000000, null, abyte0);
        }
        return ((e) (obj));
        int l1;
        k1--;
        l1 = i2 + 1;
        abyte0[i2] & 0xff;
        JVM INSTR lookupswitch 12: default 413
    //                   1: 423
    //                   2: 276
    //                   3: 276
    //                   4: 290
    //                   5: 290
    //                   6: 304
    //                   7: 304
    //                   8: 319
    //                   9: 319
    //                   10: 436
    //                   22: 338
    //                   255: 371;
           goto _L1 _L2 _L3 _L3 _L4 _L4 _L5 _L5 _L6 _L6 _L7 _L8 _L9
_L7:
        break MISSING_BLOCK_LABEL_436;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        a(abyte0, l1, k1, 2, ((List) (arraylist1)));
        break; /* Loop/switch isn't completed */
_L4:
        a(abyte0, l1, k1, 4, ((List) (arraylist1)));
        break; /* Loop/switch isn't completed */
_L5:
        a(abyte0, l1, k1, 16, ((List) (arraylist1)));
        break; /* Loop/switch isn't completed */
_L6:
        obj = new String(a(abyte0, l1, k1));
        break; /* Loop/switch isn't completed */
_L8:
        arraymap.put(bluetooth.le.external.d.a(a(abyte0, l1, 2)), a(abyte0, l1 + 2, k1 - 2));
        break; /* Loop/switch isn't completed */
_L9:
        sparsearray.put(((abyte0[l1 + 1] & 0xff) << 8) + (abyte0[l1] & 0xff), a(abyte0, l1 + 2, k1 - 2));
_L12:
        k1 += l1;
        if (true) goto _L11; else goto _L10
_L10:
        j1 = abyte0[l1] & 0xff;
          goto _L12
        i1 = abyte0[l1];
          goto _L12
    }

    private static byte[] a(byte abyte0[], int i1, int j1)
    {
        byte abyte1[] = new byte[j1];
        System.arraycopy(abyte0, i1, abyte1, 0, j1);
        return abyte1;
    }

    public int a()
    {
        return n;
    }

    public byte[] a(int i1)
    {
        return (byte[])p.get(i1);
    }

    public byte[] a(ParcelUuid parceluuid)
    {
        if (parceluuid == null)
        {
            return null;
        } else
        {
            return (byte[])q.get(parceluuid);
        }
    }

    public List b()
    {
        return o;
    }

    public SparseArray c()
    {
        return p;
    }

    public Map d()
    {
        return q;
    }

    public int e()
    {
        return r;
    }

    public String f()
    {
        return s;
    }

    public byte[] g()
    {
        return t;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ScanRecord [mAdvertiseFlags=").append(n).append(", mServiceUuids=").append(o).append(", mManufacturerSpecificData=").append(bluetooth.le.external.c.a(p)).append(", mServiceData=").append(bluetooth.le.external.c.a(q)).append(", mTxPowerLevel=").append(r).append(", mDeviceName=").append(s).append("]").toString();
    }
}
