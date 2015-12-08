// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics.security;

import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

// Referenced classes of package com.akamai.android.analytics.security:
//            PBKDF2, PBKDF2HexFormatter, PBKDF2Parameters, PBKDF2Formatter, 
//            PRF, MacBasedPRF

public class PBKDF2Engine
    implements PBKDF2
{

    protected PBKDF2Parameters parameters;
    protected PRF prf;

    public PBKDF2Engine()
    {
        parameters = null;
        prf = null;
    }

    public PBKDF2Engine(PBKDF2Parameters pbkdf2parameters)
    {
        parameters = pbkdf2parameters;
        prf = null;
    }

    public PBKDF2Engine(PBKDF2Parameters pbkdf2parameters, PRF prf1)
    {
        parameters = pbkdf2parameters;
        prf = prf1;
    }

    public static void main(String args[])
        throws IOException, NoSuchAlgorithmException
    {
        Object obj = "password";
        String s = null;
        PBKDF2HexFormatter pbkdf2hexformatter = new PBKDF2HexFormatter();
        if (args.length >= 1)
        {
            obj = args[0];
        }
        if (args.length >= 2)
        {
            s = args[1];
        }
        if (s == null)
        {
            args = SecureRandom.getInstance("SHA1PRNG");
            s = new byte[8];
            args.nextBytes(s);
            args = new PBKDF2Parameters("HmacSHA1", "ISO-8859-1", s, 1000);
            args.setDerivedKey((new PBKDF2Engine(args)).deriveKey(((String) (obj))));
            args = pbkdf2hexformatter.toString(args);
            System.out.println(args);
            return;
        }
        args = new PBKDF2Parameters();
        args.setHashAlgorithm("HmacSHA1");
        args.setHashCharset("ISO-8859-1");
        if (pbkdf2hexformatter.fromString(args, s))
        {
            throw new IllegalArgumentException((new StringBuilder("Candidate data does not have correct format (\"")).append(s).append("\")").toString());
        }
        boolean flag = (new PBKDF2Engine(args)).verifyKey(((String) (obj)));
        obj = System.out;
        int i;
        if (flag)
        {
            args = "OK";
        } else
        {
            args = "FAIL";
        }
        ((PrintStream) (obj)).println(args);
        if (flag)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        System.exit(i);
    }

    protected void INT(byte abyte0[], int i, int j)
    {
        abyte0[i + 0] = (byte)(j / 0x1000000);
        abyte0[i + 1] = (byte)(j / 0x10000);
        abyte0[i + 2] = (byte)(j / 256);
        abyte0[i + 3] = (byte)j;
    }

    protected byte[] PBKDF2(PRF prf1, byte abyte0[], int i, int j)
    {
        byte abyte1[] = abyte0;
        if (abyte0 == null)
        {
            abyte1 = new byte[0];
        }
        int i1 = prf1.getHLen();
        int j1 = ceil(j, i1);
        abyte0 = new byte[j1 * i1];
        int l = 0;
        int k = 1;
        do
        {
            if (k > j1)
            {
                if (j - (j1 - 1) * i1 < i1)
                {
                    prf1 = new byte[j];
                    System.arraycopy(abyte0, 0, prf1, 0, j);
                    return prf1;
                } else
                {
                    return abyte0;
                }
            }
            _F(abyte0, l, prf1, abyte1, i, k);
            l += i1;
            k++;
        } while (true);
    }

    protected void _F(byte abyte0[], int i, PRF prf1, byte abyte1[], int j, int k)
    {
        int l = prf1.getHLen();
        byte abyte3[] = new byte[l];
        byte abyte2[] = new byte[abyte1.length + 4];
        System.arraycopy(abyte1, 0, abyte2, 0, abyte1.length);
        INT(abyte2, abyte1.length, k);
        k = 0;
        abyte1 = abyte2;
        do
        {
            if (k >= j)
            {
                System.arraycopy(abyte3, 0, abyte0, i, l);
                return;
            }
            abyte1 = prf1.doFinal(abyte1);
            xor(abyte3, abyte1);
            k++;
        } while (true);
    }

    protected void assertPRF(byte abyte0[])
    {
        if (prf == null)
        {
            prf = new MacBasedPRF(parameters.getHashAlgorithm());
        }
        prf.init(abyte0);
    }

    protected int ceil(int i, int j)
    {
        int k = 0;
        if (i % j > 0)
        {
            k = 1;
        }
        return i / j + k;
    }

    public byte[] deriveKey(String s)
    {
        return deriveKey(s, 0);
    }

    public byte[] deriveKey(String s, int i)
    {
        String s2 = parameters.getHashCharset();
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        int j;
        try
        {
            s = s1.getBytes();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        assertPRF(s);
        j = i;
        if (i == 0)
        {
            j = prf.getHLen();
        }
        return PBKDF2(prf, parameters.getSalt(), parameters.getIterationCount(), j);
        s = s1.getBytes(s2);
        break MISSING_BLOCK_LABEL_28;
    }

    public PBKDF2Parameters getParameters()
    {
        return parameters;
    }

    public PRF getPseudoRandomFunction()
    {
        return prf;
    }

    public void setParameters(PBKDF2Parameters pbkdf2parameters)
    {
        parameters = pbkdf2parameters;
    }

    public void setPseudoRandomFunction(PRF prf1)
    {
        prf = prf1;
    }

    public boolean verifyKey(String s)
    {
        byte abyte0[] = getParameters().getDerivedKey();
        if (abyte0 != null && abyte0.length != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((s = deriveKey(s, abyte0.length)) == null || s.length != abyte0.length)
        {
            continue;
        }
        int i = 0;
        do
        {
            if (i >= s.length)
            {
                return true;
            }
            if (s[i] != abyte0[i])
            {
                continue;
            }
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void xor(byte abyte0[], byte abyte1[])
    {
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                return;
            }
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
            i++;
        } while (true);
    }
}
