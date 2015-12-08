// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsUtils

public class TlsMac
{

    protected long a;
    protected HMac b;

    public TlsMac(Digest digest, byte abyte0[], int i, int j)
    {
        b = new HMac(digest);
        digest = new KeyParameter(abyte0, i, j);
        b.init(digest);
        a = 0L;
    }

    public byte[] calculateMac(short word0, byte abyte0[], int i, int j)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(13);
        byte abyte1[];
        try
        {
            long l = a;
            a = 1L + l;
            TlsUtils.writeUint64(l, bytearrayoutputstream);
            TlsUtils.writeUint8(word0, bytearrayoutputstream);
            TlsUtils.writeVersion(bytearrayoutputstream);
            TlsUtils.writeUint16(j, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalStateException("Internal error during mac calculation");
        }
        abyte1 = bytearrayoutputstream.toByteArray();
        b.update(abyte1, 0, abyte1.length);
        b.update(abyte0, i, j);
        abyte0 = new byte[b.getMacSize()];
        b.doFinal(abyte0, 0);
        return abyte0;
    }

    public int getSize()
    {
        return b.getMacSize();
    }
}
