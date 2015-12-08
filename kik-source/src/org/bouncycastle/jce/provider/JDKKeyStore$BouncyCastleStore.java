// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Hashtable;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.io.DigestInputStream;
import org.bouncycastle.crypto.io.DigestOutputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyStore

public static class A extends JDKKeyStore
{

    public void engineLoad(InputStream inputstream, char ac[])
    {
        a.clear();
        if (inputstream != null)
        {
            Object obj = new DataInputStream(inputstream);
            int i = ((DataInputStream) (obj)).readInt();
            if (i != 1 && i != 0)
            {
                throw new IOException("Wrong version of key store.");
            }
            byte abyte1[] = new byte[((DataInputStream) (obj)).readInt()];
            if (abyte1.length != 20)
            {
                throw new IOException("Key store corrupted.");
            }
            ((DataInputStream) (obj)).readFully(abyte1);
            int j = ((DataInputStream) (obj)).readInt();
            if (j < 0 || j > 4096)
            {
                throw new IOException("Key store corrupted.");
            }
            byte abyte0[];
            if (i == 0)
            {
                inputstream = "OldPBEWithSHAAndTwofish-CBC";
            } else
            {
                inputstream = "PBEWithSHAAndTwofish-CBC";
            }
            inputstream = new CipherInputStream(((InputStream) (obj)), a(inputstream, 2, ac, abyte1, j));
            obj = new SHA1Digest();
            a(new DigestInputStream(inputstream, ((Digest) (obj))));
            ac = new byte[((Digest) (obj)).getDigestSize()];
            ((Digest) (obj)).doFinal(ac, 0);
            abyte0 = new byte[((Digest) (obj)).getDigestSize()];
            Streams.a(inputstream, abyte0);
            if (!Arrays.b(ac, abyte0))
            {
                a.clear();
                throw new IOException("KeyStore integrity check failed.");
            }
        }
    }

    public void engineStore(OutputStream outputstream, char ac[])
    {
        outputstream = new DataOutputStream(outputstream);
        byte abyte0[] = new byte[20];
        int i = (b.nextInt() & 0x3ff) + 1024;
        b.nextBytes(abyte0);
        outputstream.writeInt(1);
        outputstream.writeInt(20);
        outputstream.write(abyte0);
        outputstream.writeInt(i);
        outputstream = new CipherOutputStream(outputstream, a("PBEWithSHAAndTwofish-CBC", 1, ac, abyte0, i));
        ac = new DigestOutputStream(outputstream, new SHA1Digest());
        a(ac);
        ac = ac.getDigest();
        abyte0 = new byte[ac.getDigestSize()];
        ac.doFinal(abyte0, 0);
        outputstream.write(abyte0);
        outputstream.close();
    }

    public A()
    {
    }
}
