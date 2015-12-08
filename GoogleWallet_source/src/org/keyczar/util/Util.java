// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.keyczar.exceptions.Base64DecodingException;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.KeyType;

// Referenced classes of package org.keyczar.util:
//            Base64Coder

public final class Util
{

    private static final ConcurrentLinkedQueue DIGEST_QUEUE = new ConcurrentLinkedQueue();
    private static final ThreadLocal GSON_THREAD_LOCAL = new ThreadLocal() {

        private static Gson initialValue()
        {
            return (new GsonBuilder()).excludeFieldsWithoutExposeAnnotation().registerTypeAdapter(org/keyczar/interfaces/KeyType, new org.keyczar.interfaces.KeyType.KeyTypeSerializer()).registerTypeAdapter(org/keyczar/interfaces/KeyType, new org.keyczar.interfaces.KeyType.KeyTypeDeserializer()).create();
        }

        protected final volatile Object initialValue()
        {
            return initialValue();
        }

    };
    private static final ConcurrentLinkedQueue RAND_QUEUE = new ConcurrentLinkedQueue();

    public static transient byte[] cat(byte abyte0[][])
    {
        int k = 0;
        int l = abyte0.length;
        for (int i = 0; i < l; i++)
        {
            k += abyte0[i].length;
        }

        byte abyte1[] = new byte[k];
        k = 0;
        l = abyte0.length;
        for (int j = 0; j < l; j++)
        {
            byte abyte2[] = abyte0[j];
            System.arraycopy(abyte2, 0, abyte1, k, abyte2.length);
            k += abyte2.length;
        }

        return abyte1;
    }

    public static BigInteger decodeBigInteger(String s)
        throws Base64DecodingException
    {
        return new BigInteger(Base64Coder.decodeWebSafe(s));
    }

    public static byte[] fromInt(int i)
    {
        byte abyte0[] = new byte[4];
        writeInt(i, abyte0, 0);
        return abyte0;
    }

    public static Gson gson()
    {
        return (Gson)GSON_THREAD_LOCAL.get();
    }

    public static transient byte[] hash(byte abyte0[][])
        throws KeyczarException
    {
        MessageDigest messagedigest1 = (MessageDigest)DIGEST_QUEUE.poll();
        MessageDigest messagedigest = messagedigest1;
        int j;
        if (messagedigest1 == null)
        {
            try
            {
                messagedigest = MessageDigest.getInstance("SHA-1");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                throw new KeyczarException(abyte0);
            }
        }
        j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            messagedigest.update(abyte0[i]);
        }

        abyte0 = messagedigest.digest();
        DIGEST_QUEUE.add(messagedigest);
        return abyte0;
    }

    public static byte[] lenPrefix(byte abyte0[])
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            return fromInt(0);
        } else
        {
            return ByteBuffer.allocate(abyte0.length + 4).putInt(abyte0.length).put(abyte0).array();
        }
    }

    public static transient byte[] lenPrefixPack(byte abyte0[][])
    {
        boolean flag = false;
        int k = abyte0.length + 1 << 2;
        int l = abyte0.length;
        for (int i = 0; i < l; i++)
        {
            k += abyte0[i].length;
        }

        byte abyte1[] = new byte[k];
        ByteBuffer bytebuffer = ByteBuffer.wrap(abyte1);
        bytebuffer.putInt(abyte0.length);
        k = abyte0.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            byte abyte2[] = abyte0[j];
            bytebuffer.putInt(abyte2.length);
            bytebuffer.put(abyte2);
        }

        return abyte1;
    }

    public static transient byte[] prefixHash(byte abyte0[][])
        throws KeyczarException
    {
        MessageDigest messagedigest1 = (MessageDigest)DIGEST_QUEUE.poll();
        MessageDigest messagedigest = messagedigest1;
        int j;
        if (messagedigest1 == null)
        {
            try
            {
                messagedigest = MessageDigest.getInstance("SHA-1");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                throw new KeyczarException(abyte0);
            }
        }
        j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            byte abyte1[] = abyte0[i];
            messagedigest.update(fromInt(abyte1.length));
            messagedigest.update(abyte1);
        }

        abyte0 = messagedigest.digest();
        DIGEST_QUEUE.add(messagedigest);
        return abyte0;
    }

    public static void rand(byte abyte0[])
    {
        SecureRandom securerandom1 = (SecureRandom)RAND_QUEUE.poll();
        SecureRandom securerandom = securerandom1;
        if (securerandom1 == null)
        {
            securerandom = new SecureRandom();
        }
        securerandom.nextBytes(abyte0);
        RAND_QUEUE.add(securerandom);
    }

    public static byte[] rand(int i)
    {
        byte abyte0[] = new byte[i];
        rand(abyte0);
        return abyte0;
    }

    private static int readInt(byte abyte0[], int i)
    {
        int j = i + 1;
        i = abyte0[i];
        int k = j + 1;
        return (i & 0xff) << 24 | 0 | (abyte0[j] & 0xff) << 16 | (abyte0[k] & 0xff) << 8 | abyte0[k + 1] & 0xff;
    }

    public static boolean safeArrayEquals(byte abyte0[], byte abyte1[])
    {
        boolean flag1 = false;
        boolean flag;
        if (abyte0 == null || abyte1 == null)
        {
            flag = flag1;
            if (abyte0 == abyte1)
            {
                flag = true;
            }
        } else
        {
            flag = flag1;
            if (abyte0.length == abyte1.length)
            {
                byte byte0 = 0;
                for (int i = 0; i < abyte0.length; i++)
                {
                    byte0 = (byte)(abyte0[i] ^ abyte1[i] | byte0);
                }

                flag = flag1;
                if (byte0 == 0)
                {
                    return true;
                }
            }
        }
        return flag;
    }

    public static byte[] stripLeadingZeros(byte abyte0[])
    {
        int i;
        for (i = 0; i < abyte0.length && abyte0[i] == 0; i++) { }
        if (i == 0)
        {
            return abyte0;
        } else
        {
            byte abyte1[] = new byte[abyte0.length - i];
            System.arraycopy(abyte0, i, abyte1, 0, abyte1.length);
            return abyte1;
        }
    }

    public static int toInt(byte abyte0[])
    {
        return readInt(abyte0, 0);
    }

    private static void writeInt(int i, byte abyte0[], int j)
    {
        int k = j + 1;
        abyte0[j] = i >> 24;
        j = k + 1;
        abyte0[k] = (byte)(i >> 16);
        abyte0[j] = (byte)(i >> 8);
        abyte0[j + 1] = (byte)i;
    }

}
