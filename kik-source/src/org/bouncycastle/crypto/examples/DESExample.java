// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Hex;

public class DESExample
{

    private boolean a;
    private PaddedBufferedBlockCipher b;
    private BufferedInputStream c;
    private BufferedOutputStream d;
    private byte e[];

    public DESExample()
    {
        a = true;
        b = null;
        c = null;
        d = null;
        e = null;
    }

    public DESExample(String s, String s1, String s2, boolean flag)
    {
        a = true;
        b = null;
        c = null;
        d = null;
        e = null;
        a = flag;
        try
        {
            c = new BufferedInputStream(new FileInputStream(s));
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            System.err.println((new StringBuilder("Input file not found [")).append(s).append("]").toString());
            System.exit(1);
        }
        try
        {
            d = new BufferedOutputStream(new FileOutputStream(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.err.println((new StringBuilder("Output file not created [")).append(s1).append("]").toString());
            System.exit(1);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        s = new SecureRandom();
        s.setSeed("www.bouncycastle.org".getBytes());
_L3:
        s = new KeyGenerationParameters(s, 192);
        s1 = new DESedeKeyGenerator();
        s1.init(s);
        e = s1.generateKey();
        s = new BufferedOutputStream(new FileOutputStream(s2));
        s1 = Hex.a(e);
        s.write(s1, 0, s1.length);
        s.flush();
        s.close();
        return;
        s;
        s = null;
_L4:
        try
        {
            System.err.println("Hmmm, no SHA1PRNG, you need the Sun implementation");
            System.exit(1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.err.println((new StringBuilder("Could not decryption create key file [")).append(s2).append("]").toString());
            System.exit(1);
            return;
        }
          goto _L3
_L2:
        try
        {
            s = new BufferedInputStream(new FileInputStream(s2));
            int i = s.available();
            s1 = new byte[i];
            s.read(s1, 0, i);
            e = Hex.b(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.err.println((new StringBuilder("Decryption key file not found, or not valid [")).append(s2).append("]").toString());
        }
        System.exit(1);
        return;
        s1;
          goto _L4
    }

    public static void main(String args[])
    {
        boolean flag = false;
        if (args.length < 2)
        {
            DESExample desexample = new DESExample();
            System.err.println((new StringBuilder("Usage: java ")).append(desexample.getClass().getName()).append(" infile outfile [keyfile]").toString());
            System.exit(1);
        }
        String s = "deskey.dat";
        String s1 = args[0];
        String s2 = args[1];
        if (args.length > 2)
        {
            args = args[2];
        } else
        {
            flag = true;
            args = s;
        }
        (new DESExample(s1, s2, args, flag)).process();
    }

    private void performDecrypt(byte abyte0[])
    {
        BufferedReader bufferedreader;
        b.init(false, new KeyParameter(abyte0));
        bufferedreader = new BufferedReader(new InputStreamReader(c));
        abyte0 = null;
_L2:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte1[];
        int i;
        abyte0 = Hex.a(s);
        abyte1 = new byte[b.getOutputSize(abyte0.length)];
        i = b.processBytes(abyte0, 0, abyte0.length, abyte1, 0);
        abyte0 = abyte1;
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        d.write(abyte1, 0, i);
        abyte0 = abyte1;
        if (true) goto _L2; else goto _L1
_L4:
        return;
_L1:
        i = b.doFinal(abyte0, 0);
        if (i > 0)
        {
            try
            {
                d.write(abyte0, 0, i);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                abyte0.printStackTrace();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void performEncrypt(byte abyte0[])
    {
        byte abyte1[];
        b.init(true, new KeyParameter(abyte0));
        int i = b.getOutputSize(47);
        abyte0 = new byte[47];
        abyte1 = new byte[i];
_L2:
        int j = c.read(abyte0, 0, 47);
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = b.processBytes(abyte0, 0, j, abyte1, 0);
        if (j <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte abyte2[] = Hex.a(abyte1, 0, j);
        d.write(abyte2, 0, abyte2.length);
        d.write(10);
        if (true) goto _L2; else goto _L1
_L4:
        return;
_L1:
        j = b.doFinal(abyte1, 0);
        if (j > 0)
        {
            try
            {
                abyte0 = Hex.a(abyte1, 0, j);
                d.write(abyte0, 0, abyte0.length);
                d.write(10);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                abyte0.printStackTrace();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void process()
    {
        b = new PaddedBufferedBlockCipher(new CBCBlockCipher(new DESedeEngine()));
        if (a)
        {
            performEncrypt(e);
        } else
        {
            performDecrypt(e);
        }
        try
        {
            c.close();
            d.flush();
            d.close();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }
}
