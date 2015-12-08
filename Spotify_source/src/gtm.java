// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import okio.ByteString;

final class gtm
{

    int a;
    final hcj b;
    private final hcp c;

    public gtm(hcj hcj1)
    {
        c = new hcp(new hcm(hcj1) {

            private gtm a;

            public final long a(hch hch, long l)
            {
                if (a.a != 0)
                {
                    if ((l = super.a(hch, Math.min(l, a.a))) != -1L)
                    {
                        a.a = (int)((long)a.a - l);
                        return l;
                    }
                }
                return -1L;
            }

            
            {
                a = gtm.this;
                super(hcw);
            }
        }, new Inflater() {

            public final int inflate(byte abyte0[], int i, int j)
            {
                int l = super.inflate(abyte0, i, j);
                int k = l;
                if (l == 0)
                {
                    k = l;
                    if (needsDictionary())
                    {
                        setDictionary(gtq.a);
                        k = super.inflate(abyte0, i, j);
                    }
                }
                return k;
            }

        });
        b = hcq.a(c);
    }

    private ByteString a()
    {
        int i = b.i();
        return b.c(i);
    }

    public final List a(int i)
    {
        a = a + i;
        int j = b.i();
        if (j < 0)
        {
            throw new IOException((new StringBuilder("numberOfPairs < 0: ")).append(j).toString());
        }
        if (j > 1024)
        {
            throw new IOException((new StringBuilder("numberOfPairs > 1024: ")).append(j).toString());
        }
        ArrayList arraylist = new ArrayList(j);
        for (i = 0; i < j; i++)
        {
            ByteString bytestring = a().e();
            ByteString bytestring1 = a();
            if (bytestring.f() == 0)
            {
                throw new IOException("name.size == 0");
            }
            arraylist.add(new gta(bytestring, bytestring1));
        }

        if (a > 0)
        {
            c.b();
            if (a != 0)
            {
                throw new IOException((new StringBuilder("compressedLimit > 0: ")).append(a).toString());
            }
        }
        return arraylist;
    }
}
