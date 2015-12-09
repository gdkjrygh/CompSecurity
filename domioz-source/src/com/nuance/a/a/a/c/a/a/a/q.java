// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.a;

import com.nuance.a.a.a.a.c.e;
import com.nuance.a.a.a.a.d.a.a;
import com.nuance.a.a.a.a.d.a.b;
import com.nuance.a.a.a.a.d.a.c;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.c.a.c.g;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.nuance.a.a.a.c.a.a.a:
//            j

public class q extends j
    implements c, g
{

    private static final com.nuance.a.a.a.a.d.a.e a = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/a/a/a/q);
    private int b;
    private com.nuance.a.a.a.c.a.a.b.c c;
    private boolean d;
    private a e;

    public q(String s, com.nuance.a.a.a.c.a.a.b.c c1, a a1)
    {
        super(s, (byte)1);
        d = false;
        c = c1;
        e = a1;
        b = c1.a();
        a1.a(new b((byte)1, null), this, Thread.currentThread(), a1.a()[0]);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (b)obj;
        ((b) (obj)).a;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 45;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        c.a(b);
        return;
_L3:
        obj1 = ((Object) ((Object[])((b) (obj)).b));
        obj = (byte[])obj1[0];
        boolean flag = ((Boolean)obj1[1]).booleanValue();
        if (obj != null)
        {
            if (com.nuance.a.a.a.a.c.e.a(c.g()) || com.nuance.a.a.a.a.c.e.b(c.g()))
            {
                obj1 = new ByteArrayOutputStream();
                if (obj.length < 128)
                {
                    ((ByteArrayOutputStream) (obj1)).write(obj.length & 0x7f);
                } else
                if (obj.length < 16384)
                {
                    ((ByteArrayOutputStream) (obj1)).write(obj.length >> 7 & 0x7f | 0x80);
                    ((ByteArrayOutputStream) (obj1)).write(obj.length & 0x7f);
                } else
                if (obj.length < 0x200000)
                {
                    ((ByteArrayOutputStream) (obj1)).write(obj.length >> 14 & 0x7f | 0x80);
                    ((ByteArrayOutputStream) (obj1)).write(obj.length >> 7 & 0x7f | 0x80);
                    ((ByteArrayOutputStream) (obj1)).write(obj.length & 0x7f);
                } else
                if (obj.length < 0x10000000)
                {
                    ((ByteArrayOutputStream) (obj1)).write(obj.length >> 21 & 0x7f | 0x80);
                    ((ByteArrayOutputStream) (obj1)).write(obj.length >> 14 & 0x7f | 0x80);
                    ((ByteArrayOutputStream) (obj1)).write(obj.length >> 7 & 0x7f | 0x80);
                    ((ByteArrayOutputStream) (obj1)).write(obj.length & 0x7f);
                } else
                {
                    a.b("buffer size is too big!");
                    return;
                }
                ((ByteArrayOutputStream) (obj1)).write(((byte []) (obj)), 0, obj.length);
                c.a(((ByteArrayOutputStream) (obj1)).toByteArray(), b);
            } else
            {
                c.a(((byte []) (obj)), b);
            }
        }
        if (flag)
        {
            c.b(b);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(byte abyte0[], int i, int k, boolean flag)
    {
        if (abyte0 == null && !flag)
        {
            a.b("PDXAudioParam.addAudioBuf() in (NMSPAudioSink)PDXAudioParam.addAudioBuf(), the param \"buffer\" is null.");
            throw new NullPointerException("in (NMSPAudioSink)PDXAudioParam.addAudioBuf(), the param \"buffer\" is null.");
        }
        if (abyte0 != null && i < 0)
        {
            a.b("PDXAudioParam.addAudioBuf() the offset of the \"buffer\" is less than 0");
            throw new IllegalArgumentException("the offset of the \"buffer\" is less than 0");
        }
        if (abyte0 != null && k <= 0)
        {
            a.b("PDXAudioParam.addAudioBuf() the indicated length of the \"buffer\" is less than 1 byte");
            throw new IllegalArgumentException("the indicated length of the \"buffer\" is less than 1 byte");
        }
        if (d)
        {
            a.b("PDXAudioParam.addAudioBuf() last audio buffer already added!");
            throw new com.nuance.a.a.a.c.c.g("last audio buffer already added!");
        }
        if (flag)
        {
            d = true;
        }
        byte abyte1[] = null;
        if (abyte0 != null)
        {
            abyte1 = new byte[k];
            System.arraycopy(abyte0, i, abyte1, 0, k);
        }
        abyte0 = new Boolean(flag);
        e.a(new b((byte)2, ((Object) (new Object[] {
            abyte1, abyte0
        }))), this, Thread.currentThread(), e.a()[0]);
    }

    protected final int c()
    {
        return b;
    }

}
