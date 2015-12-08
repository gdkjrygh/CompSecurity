// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;

import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.az;
import java.nio.ByteOrder;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

// Referenced classes of package com.android.slyce.a.c.c:
//            n, i

public class h extends n
{

    boolean d;
    protected CRC32 e;

    public h()
    {
        super(new Inflater(true));
        d = true;
        e = new CRC32();
    }

    static short a(byte abyte0[], int j, ByteOrder byteorder)
    {
        if (byteorder == ByteOrder.BIG_ENDIAN)
        {
            return (short)(abyte0[j] << 8 | abyte0[j + 1] & 0xff);
        } else
        {
            return (short)(abyte0[j + 1] << 8 | abyte0[j] & 0xff);
        }
    }

    public void a(am am, aj aj)
    {
        if (d)
        {
            aj = new az(am);
            aj.a(10, new i(this, am, aj));
            return;
        } else
        {
            super.a(am, aj);
            return;
        }
    }
}
