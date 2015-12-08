// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;

public final class bbo extends qst
{

    public String a;
    private String b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private long g;

    public bbo()
    {
        super("hdlr");
        b = null;
        f = true;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        g = b.a(bytebuffer);
        a = b.i(bytebuffer);
        c = b.a(bytebuffer);
        d = b.a(bytebuffer);
        e = b.a(bytebuffer);
        if (bytebuffer.remaining() > 0)
        {
            b = b.a(bytebuffer, bytebuffer.remaining());
            if (b.endsWith("\0"))
            {
                b = b.substring(0, b.length() - 1);
                f = true;
                return;
            } else
            {
                f = false;
                return;
            }
        } else
        {
            f = false;
            return;
        }
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, g);
        bytebuffer.put(baw.a(a));
        bax.b(bytebuffer, c);
        bax.b(bytebuffer, d);
        bax.b(bytebuffer, e);
        if (b != null)
        {
            bytebuffer.put(b.g(b));
        }
        if (f)
        {
            bytebuffer.put((byte)0);
        }
    }

    protected final long e()
    {
        if (f)
        {
            return (long)(b.h(b) + 25);
        } else
        {
            return (long)(b.h(b) + 24);
        }
    }

    public final String toString()
    {
        String s = a;
        String s1 = b;
        return (new StringBuilder(String.valueOf(s).length() + 30 + String.valueOf(s1).length())).append("HandlerBox[handlerType=").append(s).append(";name=").append(s1).append("]").toString();
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("mdir", "Apple Meta Data iTunes Reader");
        hashmap.put("mp7b", "MPEG-7 binary XML");
        hashmap.put("mp7t", "MPEG-7 XML");
        hashmap.put("vide", "Video Track");
        hashmap.put("soun", "Sound Track");
        hashmap.put("hint", "Hint Track");
        hashmap.put("appl", "Apple specific");
        hashmap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        Collections.unmodifiableMap(hashmap);
    }
}
