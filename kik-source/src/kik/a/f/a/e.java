// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.a;

import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kik.a.f.n;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.a.f.a:
//            g, a, f

final class e extends g
{

    private static final b f = c.a("KikChallengeHC");
    private static final byte h[] = {
        -128, 64, 32, 16, 8, 4, 2, 1
    };
    int a;
    byte b[];
    private final long g;

    public e(String s)
    {
        this(s, (byte)0);
    }

    private e(String s, byte byte0)
    {
        super(s);
        g = 15000L;
    }

    private static int a(byte abyte0[])
    {
        int i1 = abyte0.length;
        int j = 0;
        int i = 0;
        int l;
label0:
        do
        {
            l = i;
            if (j >= i1)
            {
                break;
            }
            byte byte0 = abyte0[j];
            byte abyte1[] = h;
            int j1 = abyte1.length;
            for (int k = 0; k < j1;)
            {
                l = i;
                if ((abyte1[k] & byte0) != 0)
                {
                    break label0;
                }
                k++;
                i++;
            }

            j++;
        } while (true);
        return l;
    }

    public final void a()
    {
        Object obj;
        ByteBuffer bytebuffer;
        byte abyte0[];
        int i;
        long l;
        try
        {
            obj = MessageDigest.getInstance("SHA-256");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        bytebuffer = ByteBuffer.allocate(b.length + 4);
        bytebuffer.put(b);
        l = System.currentTimeMillis();
        abyte0 = new byte[((MessageDigest) (obj)).getDigestLength()];
        i = 0x80000000;
_L2:
        if (i >= 0x7fffffff)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        try
        {
            if (d)
            {
                throw new a();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new f("Digest failed");
        }
        if (i % 1000 != 0)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        if (System.currentTimeMillis() - l > g)
        {
            throw new f("Timed out");
        }
        bytebuffer.putInt(b.length, i);
        ((MessageDigest) (obj)).update(bytebuffer.array());
        ((MessageDigest) (obj)).digest(abyte0, 0, abyte0.length);
        ((MessageDigest) (obj)).update(abyte0);
        ((MessageDigest) (obj)).digest(abyte0, 0, abyte0.length);
        if (a(abyte0) < a)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        e = com.kik.m.e.a(bytebuffer.array());
        if (e == null)
        {
            throw new f("No solution");
        } else
        {
            System.currentTimeMillis();
            return;
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void a(n n1)
    {
        int i = Integer.parseInt(n1.getAttributeValue(null, "n"));
        n1 = com.kik.m.e.a(n1.nextText());
        a = i;
        b = n1;
    }

}
