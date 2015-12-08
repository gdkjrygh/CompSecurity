// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class bbl extends qsr
{

    public String a;
    public List b;
    private long c;

    public bbl()
    {
        super("ftyp");
        b = Collections.emptyList();
    }

    public bbl(String s, long l, List list)
    {
        super("ftyp");
        b = Collections.emptyList();
        a = s;
        c = 0L;
        b = list;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        a = b.i(bytebuffer);
        c = b.a(bytebuffer);
        int j = bytebuffer.remaining() / 4;
        b = new LinkedList();
        for (int i = 0; i < j; i++)
        {
            b.add(b.i(bytebuffer));
        }

    }

    protected final void b(ByteBuffer bytebuffer)
    {
        bytebuffer.put(baw.a(a));
        bax.b(bytebuffer, c);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); bytebuffer.put(baw.a((String)iterator.next()))) { }
    }

    protected final long e()
    {
        return (long)((b.size() << 2) + 8);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("FileTypeBox[");
        stringbuilder.append("majorBrand=").append(a);
        stringbuilder.append(";");
        stringbuilder.append("minorVersion=").append(c);
        String s;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); stringbuilder.append("compatibleBrand=").append(s))
        {
            s = (String)iterator.next();
            stringbuilder.append(";");
        }

        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
