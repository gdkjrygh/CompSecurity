// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bcf extends qst
{

    public List a;

    public bcf()
    {
        super("subs");
        a = new ArrayList();
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        long l1 = b.a(bytebuffer);
        for (int i = 0; (long)i < l1; i++)
        {
            bcg bcg1 = new bcg();
            bcg1.a = b.a(bytebuffer);
            int k = b.c(bytebuffer);
            int j = 0;
            while (j < k) 
            {
                bch bch1 = new bch();
                long l;
                if (l() == 1)
                {
                    l = b.a(bytebuffer);
                } else
                {
                    l = b.c(bytebuffer);
                }
                bch1.a = l;
                bch1.b = b.a(bytebuffer.get());
                bch1.c = b.a(bytebuffer.get());
                bch1.d = b.a(bytebuffer);
                bcg1.b.add(bch1);
                j++;
            }
            a.add(bcg1);
        }

    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, a.size());
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            Object obj = (bcg)iterator.next();
            bax.b(bytebuffer, ((bcg) (obj)).a);
            bax.b(bytebuffer, ((bcg) (obj)).b.size());
            obj = ((bcg) (obj)).b.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                bch bch1 = (bch)((Iterator) (obj)).next();
                if (l() == 1)
                {
                    bax.b(bytebuffer, bch1.a);
                } else
                {
                    bax.b(bytebuffer, b.f(bch1.a));
                }
                bax.c(bytebuffer, bch1.b);
                bax.c(bytebuffer, bch1.c);
                bax.b(bytebuffer, bch1.d);
            }
        }

    }

    protected final long e()
    {
        long l1;
        Iterator iterator = a.iterator();
        l1 = 8L;
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                bcg bcg1 = (bcg)iterator.next();
                long l = l1 + 4L + 2L;
                int i = 0;
                do
                {
                    l1 = l;
                    if (i >= bcg1.b.size())
                    {
                        break;
                    }
                    if (l() == 1)
                    {
                        l += 4L;
                    } else
                    {
                        l += 2L;
                    }
                    l = l + 2L + 4L;
                    i++;
                } while (true);
            }
        } while (true);
        return l1;
    }

    public final String toString()
    {
        String s = String.valueOf("SubSampleInformationBox{entryCount=");
        int i = a.size();
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 22 + String.valueOf(s1).length())).append(s).append(i).append(", entries=").append(s1).append("}").toString();
    }
}
