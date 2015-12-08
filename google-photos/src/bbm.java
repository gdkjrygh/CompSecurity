// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class bbm
    implements baz
{

    private ByteBuffer a;
    private List b;
    private bbe c;

    public bbm()
    {
        b = new LinkedList();
        a = ByteBuffer.wrap(new byte[0]);
    }

    private ByteBuffer d()
    {
        if (a != null)
        {
            return (ByteBuffer)a.duplicate().rewind();
        } else
        {
            return null;
        }
    }

    public final bbe a()
    {
        return c;
    }

    public final void a(bbe bbe)
    {
        c = bbe;
    }

    public final void a(WritableByteChannel writablebytechannel)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((baz)iterator.next()).a(writablebytechannel)) { }
        ByteBuffer bytebuffer = ByteBuffer.allocate(8);
        bax.b(bytebuffer, a.limit() + 8);
        bytebuffer.put("free".getBytes());
        bytebuffer.rewind();
        writablebytechannel.write(bytebuffer);
        bytebuffer.rewind();
        a.rewind();
        writablebytechannel.write(a);
        a.rewind();
    }

    public final void a(qsw qsw1, ByteBuffer bytebuffer, long l, bau bau)
    {
        qsw1.b();
        bytebuffer.remaining();
        if (l > 0x100000L)
        {
            a = qsw1.a(qsw1.b(), l);
            qsw1.a(qsw1.b() + l);
            return;
        } else
        {
            a = ByteBuffer.allocate(b.f(l));
            qsw1.a(a);
            return;
        }
    }

    public final long b()
    {
        Iterator iterator = b.iterator();
        long l;
        for (l = 8L; iterator.hasNext(); l = ((baz)iterator.next()).b() + l) { }
        return (long)a.limit() + l;
    }

    public final String c()
    {
        return "free";
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (bbm)obj;
            if (d() == null ? ((bbm) (obj)).d() != null : !d().equals(((bbm) (obj)).d()))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (a != null)
        {
            return a.hashCode();
        } else
        {
            return 0;
        }
    }
}
