// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsClientContext, ProtocolVersion, SSL3Mac, TlsUtils

public class TlsMac
{

    protected TlsClientContext context;
    protected Mac mac;
    protected byte secret[];
    protected long seqNo;

    public TlsMac(TlsClientContext tlsclientcontext, Digest digest, byte abyte0[], int i, int j)
    {
        context = tlsclientcontext;
        seqNo = 0L;
        abyte0 = new KeyParameter(abyte0, i, j);
        secret = Arrays.clone(abyte0.getKey());
        if (tlsclientcontext.getServerVersion().getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            mac = new HMac(digest);
        } else
        {
            mac = new SSL3Mac(digest);
        }
        mac.init(abyte0);
    }

    public byte[] calculateMac(short word0, byte abyte0[], int i, int j)
    {
        ProtocolVersion protocolversion = context.getServerVersion();
        byte abyte1[];
        ByteArrayOutputStream bytearrayoutputstream;
        boolean flag;
        byte byte0;
        if (protocolversion.getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            byte0 = 13;
        } else
        {
            byte0 = 11;
        }
        bytearrayoutputstream = new ByteArrayOutputStream(byte0);
        try
        {
            long l = seqNo;
            seqNo = 1L + l;
            TlsUtils.writeUint64(l, bytearrayoutputstream);
            TlsUtils.writeUint8(word0, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalStateException("Internal error during mac calculation");
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        TlsUtils.writeVersion(protocolversion, bytearrayoutputstream);
        TlsUtils.writeUint16(j, bytearrayoutputstream);
        abyte1 = bytearrayoutputstream.toByteArray();
        mac.update(abyte1, 0, abyte1.length);
        mac.update(abyte0, i, j);
        abyte0 = new byte[mac.getMacSize()];
        mac.doFinal(abyte0, 0);
        return abyte0;
    }

    public byte[] getMACSecret()
    {
        return secret;
    }

    public long getSequenceNumber()
    {
        return seqNo;
    }

    public int getSize()
    {
        return mac.getMacSize();
    }

    public void incSequenceNumber()
    {
        seqNo = seqNo + 1L;
    }
}
