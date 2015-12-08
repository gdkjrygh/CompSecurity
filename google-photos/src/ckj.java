// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ckj
    implements civ, cjf
{

    cjt a;
    public cki b;

    public ckj()
    {
    }

    public cki a(ByteBuffer bytebuffer)
    {
        boolean flag1 = true;
        b.b = (ByteBuffer)b.a(bytebuffer, "byteBuffer", null);
        if (!e())
        {
            return null;
        }
        boolean flag;
        try
        {
            flag = a.g();
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw c.a("Error checking read status.", bytebuffer);
        }
        if (!flag)
        {
            return null;
        }
        try
        {
            b.c = a.a(b.b, 0);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw c.a("Error reading sample data.", bytebuffer);
        }
        b.d = a.d();
        bytebuffer = b;
        if ((a.c() & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bytebuffer.e = flag;
        a.b();
        bytebuffer = b;
        if (!e())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        bytebuffer.f = flag;
        return b;
    }

    public volatile Object a(Object obj)
    {
        return a((ByteBuffer)obj);
    }

    public final void a()
    {
        dee.a(a);
    }

    public boolean a(long l)
    {
        b.a(a, l);
        return true;
    }

    public final MediaFormat b()
    {
        return b.a;
    }

    public boolean e()
    {
        return a.e() != -1;
    }

    protected final long f()
    {
        return a.d();
    }

    protected final void g()
    {
        a.h();
    }
}
