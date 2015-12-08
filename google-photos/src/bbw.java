// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bbw extends qst
{

    public List a;

    public bbw()
    {
        super("sdtp");
        a = new ArrayList();
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        for (; bytebuffer.remaining() > 0; a.add(new bbx(b.a(bytebuffer.get())))) { }
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); bax.c(bytebuffer, ((bbx)iterator.next()).a)) { }
    }

    protected final long e()
    {
        return (long)(a.size() + 4);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SampleDependencyTypeBox");
        stringbuilder.append("{entries=").append(a);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
