// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class bbc extends qst
{

    public List a;

    public bbc()
    {
        super("ctts");
        a = Collections.emptyList();
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        int j = b.f(b.a(bytebuffer));
        a = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            bbd bbd1 = new bbd(b.f(b.a(bytebuffer)), bytebuffer.getInt());
            a.add(bbd1);
        }

    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, a.size());
        bbd bbd1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); bytebuffer.putInt(bbd1.b))
        {
            bbd1 = (bbd)iterator.next();
            bax.b(bytebuffer, bbd1.a);
        }

    }

    protected final long e()
    {
        return (long)(a.size() * 8 + 8);
    }
}
