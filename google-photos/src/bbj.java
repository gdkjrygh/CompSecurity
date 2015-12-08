// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class bbj extends qst
{

    public List a;

    public bbj()
    {
        super("elst");
        a = new LinkedList();
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        int j = b.f(b.a(bytebuffer));
        a = new LinkedList();
        for (int i = 0; i < j; i++)
        {
            a.add(new bbk(this, bytebuffer));
        }

    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, a.size());
        Iterator iterator = a.iterator();
        while (iterator.hasNext()) 
        {
            bbk bbk1 = (bbk)iterator.next();
            if (bbk1.a.l() == 1)
            {
                bax.a(bytebuffer, bbk1.b);
                bytebuffer.putLong(bbk1.c);
            } else
            {
                bax.b(bytebuffer, b.f(bbk1.b));
                bytebuffer.putInt(b.f(bbk1.c));
            }
            bax.a(bytebuffer, bbk1.d);
        }
    }

    protected final long e()
    {
        if (l() == 1)
        {
            return (long)(a.size() * 20) + 8L;
        } else
        {
            return (long)(a.size() * 12) + 8L;
        }
    }

    public final String toString()
    {
        String s = String.valueOf("EditListBox{entries=");
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }
}
