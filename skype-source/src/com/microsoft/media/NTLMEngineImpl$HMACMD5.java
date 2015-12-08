// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import java.security.MessageDigest;
import org.apache.http.impl.auth.NTLMEngineException;

// Referenced classes of package com.microsoft.media:
//            NTLMEngineImpl

static class ipad
{

    protected byte ipad[];
    protected MessageDigest md5;
    protected byte opad[];

    byte[] getOutput()
    {
        byte abyte0[] = md5.digest();
        md5.update(opad);
        return md5.digest(abyte0);
    }

    void update(byte abyte0[])
    {
        md5.update(abyte0);
    }

    void update(byte abyte0[], int i, int j)
    {
        md5.update(abyte0, i, j);
    }

    on(byte abyte0[])
        throws NTLMEngineException
    {
        byte abyte1[];
        int i;
        int j;
        int k;
        try
        {
            md5 = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new NTLMEngineException((new StringBuilder("Error getting md5 message digest implementation: ")).append(abyte0.getMessage()).toString(), abyte0);
        }
        ipad = new byte[64];
        opad = new byte[64];
        i = abyte0.length;
        j = i;
        abyte1 = abyte0;
        if (i > 64)
        {
            md5.update(abyte0);
            abyte1 = md5.digest();
            j = abyte1.length;
        }
        i = 0;
        do
        {
            k = i;
            if (i >= j)
            {
                break;
            }
            ipad[i] = (byte)(abyte1[i] ^ 0x36);
            opad[i] = (byte)(abyte1[i] ^ 0x5c);
            i++;
        } while (true);
        for (; k < 64; k++)
        {
            ipad[k] = 54;
            opad[k] = 92;
        }

        md5.reset();
        md5.update(ipad);
    }
}
