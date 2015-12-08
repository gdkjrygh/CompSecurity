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

    private PaddedBufferedBlockCipher cipher;
    private boolean encrypt;
    private BufferedInputStream in;
    private byte key[];
    private BufferedOutputStream out;

    public DESExample()
    {
        encrypt = true;
        cipher = null;
        in = null;
        out = null;
        key = null;
    }

    public DESExample(String s, String s1, String s2, boolean flag)
    {
        encrypt = true;
        cipher = null;
        in = null;
        out = null;
        key = null;
        encrypt = flag;
        try
        {
            in = new BufferedInputStream(new FileInputStream(s));
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            System.err.println((new StringBuilder()).append("Input file not found [").append(s).append("]").toString());
            System.exit(1);
        }
        try
        {
            out = new BufferedOutputStream(new FileOutputStream(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.err.println((new StringBuilder()).append("Output file not created [").append(s1).append("]").toString());
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
        key = s1.generateKey();
        s = new BufferedOutputStream(new FileOutputStream(s2));
        s1 = Hex.encode(key);
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
            System.err.println((new StringBuilder()).append("Could not decryption create key file [").append(s2).append("]").toString());
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
            key = Hex.decode(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.err.println((new StringBuilder()).append("Decryption key file not found, or not valid [").append(s2).append("]").toString());
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
            System.err.println((new StringBuilder()).append("Usage: java ").append(desexample.getClass().getName()).append(" infile outfile [keyfile]").toString());
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
        cipher.init(false, new KeyParameter(abyte0));
        bufferedreader = new BufferedReader(new InputStreamReader(in));
        abyte0 = null;
_L2:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte1[];
        int i;
        abyte0 = Hex.decode(s);
        abyte1 = new byte[cipher.getOutputSize(abyte0.length)];
        i = cipher.processBytes(abyte0, 0, abyte0.length, abyte1, 0);
        abyte0 = abyte1;
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        out.write(abyte1, 0, i);
        abyte0 = abyte1;
        if (true) goto _L2; else goto _L1
_L4:
        return;
_L1:
        i = cipher.doFinal(abyte0, 0);
        if (i > 0)
        {
            try
            {
                out.write(abyte0, 0, i);
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
        cipher.init(true, new KeyParameter(abyte0));
        int i = cipher.getOutputSize(47);
        abyte0 = new byte[47];
        abyte1 = new byte[i];
_L2:
        int j = in.read(abyte0, 0, 47);
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = cipher.processBytes(abyte0, 0, j, abyte1, 0);
        if (j <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte abyte2[] = Hex.encode(abyte1, 0, j);
        out.write(abyte2, 0, abyte2.length);
        out.write(10);
        if (true) goto _L2; else goto _L1
_L4:
        return;
_L1:
        j = cipher.doFinal(abyte1, 0);
        if (j > 0)
        {
            try
            {
                abyte0 = Hex.encode(abyte1, 0, j);
                out.write(abyte0, 0, abyte0.length);
                out.write(10);
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
        cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new DESedeEngine()));
        if (encrypt)
        {
            performEncrypt(key);
        } else
        {
            performDecrypt(key);
        }
        try
        {
            in.close();
            out.flush();
            out.close();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }
}
