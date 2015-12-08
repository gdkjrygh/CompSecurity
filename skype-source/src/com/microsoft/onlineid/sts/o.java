// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import java.nio.ByteBuffer;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.microsoft.onlineid.sts:
//            e

public final class o
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a e[];
        private final int c = 32;
        private final String d;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/sts/o$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        final int a()
        {
            return c;
        }

        final String b()
        {
            return d;
        }

        static 
        {
            a = new a("CredentialSignature", 0, "WS-SecureConversation");
            b = new a("STSDigest", 1, "WS-SecureConversationWS-SecureConversation");
            e = (new a[] {
                a, b
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            d = s1;
        }
    }


    private final byte a[];

    public o(byte abyte0[])
    {
        a = abyte0;
    }

    public final byte[] a(a a1, byte abyte0[])
    {
        int l = a1.a();
        byte abyte1[] = a;
        a1 = a1.b();
        ByteBuffer bytebuffer = ByteBuffer.allocate(l);
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(4);
        Mac mac = e.a(new SecretKeySpec(abyte1, "HmacSHA256"));
        for (int i = 1; bytebuffer.position() < l; i++)
        {
            mac.reset();
            bytebuffer1.clear();
            bytebuffer1.putInt(i);
            bytebuffer1.rewind();
            mac.update(bytebuffer1);
            mac.update(a1.getBytes(com.microsoft.onlineid.internal.o.a));
            mac.update((byte)0);
            mac.update(abyte0);
            bytebuffer1.clear();
            bytebuffer1.putInt(l * 8);
            bytebuffer1.rewind();
            mac.update(bytebuffer1);
            byte abyte2[] = mac.doFinal();
            int k = abyte2.length;
            int j = k;
            if (k > bytebuffer.remaining())
            {
                j = bytebuffer.remaining();
            }
            bytebuffer.put(abyte2, 0, j);
        }

        return bytebuffer.array();
    }
}
