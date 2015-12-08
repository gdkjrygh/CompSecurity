// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class bcb extends qst
{

    public List a;

    public bcb()
    {
        super("stsc");
        a = Collections.emptyList();
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        int j = b.f(b.a(bytebuffer));
        a = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            a.add(new bcc(b.a(bytebuffer), b.a(bytebuffer), b.a(bytebuffer)));
        }

    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, a.size());
        bcc bcc1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); bax.b(bytebuffer, bcc1.c))
        {
            bcc1 = (bcc)iterator.next();
            bax.b(bytebuffer, bcc1.a);
            bax.b(bytebuffer, bcc1.b);
        }

    }

    protected final long e()
    {
        return (long)(a.size() * 12 + 8);
    }

    public final String toString()
    {
        int i = a.size();
        return (new StringBuilder(40)).append("SampleToChunkBox[entryCount=").append(i).append("]").toString();
    }
}
