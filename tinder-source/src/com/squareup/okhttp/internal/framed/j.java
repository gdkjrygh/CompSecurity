// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okio.ByteString;
import okio.c;
import okio.e;
import okio.h;
import okio.k;
import okio.l;
import okio.r;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            e, n

final class j
{

    int a;
    final e b;
    private final k c;

    public j(e e1)
    {
        c = new k(new h(e1) {

            final j a;

            public final long a(c c1, long l1)
                throws IOException
            {
                if (a.a != 0)
                {
                    if ((l1 = super.a(c1, Math.min(l1, a.a))) != -1L)
                    {
                        a.a = (int)((long)a.a - l1);
                        return l1;
                    }
                }
                return -1L;
            }

            
            {
                a = j.this;
                super(r);
            }
        }, new Inflater() {

            final j a;

            public final int inflate(byte abyte0[], int i, int i1)
                throws DataFormatException
            {
                int k1 = super.inflate(abyte0, i, i1);
                int j1 = k1;
                if (k1 == 0)
                {
                    j1 = k1;
                    if (needsDictionary())
                    {
                        setDictionary(n.a);
                        j1 = super.inflate(abyte0, i, i1);
                    }
                }
                return j1;
            }

            
            {
                a = j.this;
                super();
            }
        });
        b = l.a(c);
    }

    private ByteString a()
        throws IOException
    {
        int i = b.h();
        return b.c(i);
    }

    public final List a(int i)
        throws IOException
    {
        a = a + i;
        int i1 = b.h();
        if (i1 < 0)
        {
            throw new IOException((new StringBuilder("numberOfPairs < 0: ")).append(i1).toString());
        }
        if (i1 > 1024)
        {
            throw new IOException((new StringBuilder("numberOfPairs > 1024: ")).append(i1).toString());
        }
        ArrayList arraylist = new ArrayList(i1);
        for (i = 0; i < i1; i++)
        {
            ByteString bytestring = a().c();
            ByteString bytestring1 = a();
            if (bytestring.c.length == 0)
            {
                throw new IOException("name.size == 0");
            }
            arraylist.add(new com.squareup.okhttp.internal.framed.e(bytestring, bytestring1));
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
