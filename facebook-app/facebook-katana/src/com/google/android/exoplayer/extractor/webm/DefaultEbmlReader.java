// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.util.Assertions;
import java.nio.charset.Charset;
import java.util.Stack;

// Referenced classes of package com.google.android.exoplayer.extractor.webm:
//            EbmlReader, VarintReader, EbmlReaderOutput

final class DefaultEbmlReader
    implements EbmlReader
{

    private final byte a[] = new byte[8];
    private final Stack b = new Stack();
    private final VarintReader c = new VarintReader();
    private EbmlReaderOutput d;
    private int e;
    private int f;
    private long g;

    DefaultEbmlReader()
    {
    }

    private long a(ExtractorInput extractorinput, int i)
    {
        int j = 0;
        extractorinput.b(a, 0, i);
        long l = 0L;
        for (; j < i; j++)
        {
            l = l << 8 | (long)(a[j] & 0xff);
        }

        return l;
    }

    private double b(ExtractorInput extractorinput, int i)
    {
        long l = a(extractorinput, i);
        if (i == 4)
        {
            return (double)Float.intBitsToFloat((int)l);
        } else
        {
            return Double.longBitsToDouble(l);
        }
    }

    private static String c(ExtractorInput extractorinput, int i)
    {
        byte abyte0[] = new byte[i];
        extractorinput.b(abyte0, 0, i);
        return new String(abyte0, Charset.forName("UTF-8"));
    }

    public final void a()
    {
        e = 0;
        b.clear();
        c.a();
    }

    public final void a(EbmlReaderOutput ebmlreaderoutput)
    {
        d = ebmlreaderoutput;
    }

    public final boolean a(ExtractorInput extractorinput)
    {
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        do
        {
            if (!b.isEmpty() && extractorinput.b() >= MasterElement.a((MasterElement)b.peek()))
            {
                d.b(MasterElement.b((MasterElement)b.pop()));
                return true;
            }
            if (e == 0)
            {
                long l = c.a(extractorinput, true, false);
                if (l == -1L)
                {
                    return false;
                }
                f = (int)l;
                e = 1;
            }
            if (e == 1)
            {
                g = c.a(extractorinput, false, true);
                e = 2;
            }
            int i = d.a(f);
            switch (i)
            {
            default:
                throw new IllegalStateException((new StringBuilder("Invalid element type ")).append(i).toString());

            case 1: // '\001'
                long l1 = extractorinput.b();
                long l2 = g;
                b.add(new MasterElement(f, l2 + l1, (byte)0));
                d.a(f, l1, g);
                e = 0;
                return true;

            case 2: // '\002'
                if (g > 8L)
                {
                    throw new IllegalStateException((new StringBuilder("Invalid integer size: ")).append(g).toString());
                } else
                {
                    d.a(f, a(extractorinput, (int)g));
                    e = 0;
                    return true;
                }

            case 5: // '\005'
                if (g != 4L && g != 8L)
                {
                    throw new IllegalStateException((new StringBuilder("Invalid float size: ")).append(g).toString());
                } else
                {
                    d.a(f, b(extractorinput, (int)g));
                    e = 0;
                    return true;
                }

            case 3: // '\003'
                if (g > 0x7fffffffL)
                {
                    throw new IllegalStateException((new StringBuilder("String element size: ")).append(g).toString());
                } else
                {
                    d.a(f, c(extractorinput, (int)g));
                    e = 0;
                    return true;
                }

            case 4: // '\004'
                d.a(f, (int)g, extractorinput);
                e = 0;
                return true;

            case 0: // '\0'
                extractorinput.a((int)g);
                e = 0;
                break;
            }
        } while (true);
    }

    private class MasterElement
    {

        private final int a;
        private final long b;

        static long a(MasterElement masterelement)
        {
            return masterelement.b;
        }

        static int b(MasterElement masterelement)
        {
            return masterelement.a;
        }

        private MasterElement(int i, long l)
        {
            a = i;
            b = l;
        }

        MasterElement(int i, long l, byte byte0)
        {
            this(i, l);
        }
    }

}
