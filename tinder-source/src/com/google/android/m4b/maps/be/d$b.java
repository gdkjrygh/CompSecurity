// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import com.google.android.m4b.maps.ad.a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Locale;

// Referenced classes of package com.google.android.m4b.maps.be:
//            d

static final class c
{

    private static final int j = 43;
    final int a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;
    final long g;
    final Locale h;
    final int i;
    private int k;
    private int l;

    private byte[] a()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
        dataoutputstream.writeInt(a);
        dataoutputstream.writeInt(k);
        dataoutputstream.writeInt(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.writeInt(d);
        dataoutputstream.writeBoolean(e);
        dataoutputstream.writeInt(f);
        dataoutputstream.writeLong(g);
        dataoutputstream.writeUTF(h.getLanguage());
        dataoutputstream.writeUTF(h.getCountry());
        dataoutputstream.writeUTF(h.getVariant());
        dataoutputstream.writeInt(l);
        return bytearrayoutputstream.toByteArray();
    }

    final int a(byte abyte0[])
    {
        byte abyte1[] = a();
        System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
        return abyte1.length;
    }

    public final String toString()
    {
        int i1 = a;
        int j1 = b;
        int k1 = c;
        int l1 = d;
        boolean flag = e;
        int i2 = f;
        long l2 = g;
        int j2 = l;
        return (new StringBuilder(207)).append("CatalogVersion:").append(i1).append(" BlockSize:").append(j1).append(" MaxShardCount:").append(k1).append(" RecordsPerBlock: ").append(l1).append(" AutoConfig: ").append(flag).append(" DataVersion:").append(i2).append(" CacheCreationTimeMs:").append(l2).append(" Checksum:").append(j2).toString();
    }


    (int i1, int j1, int k1, int l1, boolean flag, int i2, long l2, Locale locale)
    {
        a = i1;
        b = j1;
        c = k1;
        d = l1;
        e = flag;
        f = i2;
        h = locale;
        g = l2;
        locale = a();
        k = locale.length;
        com.google.android.m4b.maps.be.d.a(locale, 4, k);
        l = com.google.android.m4b.maps.be.d.c(locale, 0, locale.length - 4);
        i = ((c * 1024 - 1) / 8192 + 1) * 8192 + 16384;
    }

    c(byte abyte0[])
    {
        a = com.google.android.m4b.maps.be.d.a(abyte0, 0);
        if (a == 1)
        {
            throw new IOException("Can't parse header for old schema");
        }
        k = com.google.android.m4b.maps.be.d.a(abyte0, 4);
        if (k < 43 || k + 0 > 8192)
        {
            int i1 = k;
            throw new IOException((new StringBuilder(30)).append("Wrong header size: ").append(i1).toString());
        }
        l = com.google.android.m4b.maps.be.d.a(abyte0, (k + 0) - 4);
        int j1 = com.google.android.m4b.maps.be.d.c(abyte0, 0, k - 4);
        if (l != j1)
        {
            int k1 = l;
            throw new IOException((new StringBuilder(44)).append("Checksum mismatch ").append(k1).append(" vs ").append(j1).toString());
        } else
        {
            abyte0 = new a(abyte0);
            abyte0.skipBytes(8);
            b = abyte0.readInt();
            c = abyte0.readInt();
            d = abyte0.readInt();
            e = abyte0.readBoolean();
            f = abyte0.readInt();
            g = abyte0.readLong();
            h = new Locale(abyte0.readUTF(), abyte0.readUTF(), abyte0.readUTF());
            i = ((c * 1024 - 1) / 8192 + 1) * 8192 + 16384;
            return;
        }
    }
}
