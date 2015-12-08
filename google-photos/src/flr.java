// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicReference;

final class flr
    implements ane
{

    private static final AtomicReference b = new AtomicReference();
    private final Uri c;
    private final Integer d;

    flr(Uri uri, Integer integer)
    {
        c = uri;
        d = integer;
    }

    public final void a(MessageDigest messagedigest)
    {
        messagedigest.update(c.toString().getBytes(a));
        if (d != null)
        {
            ByteBuffer bytebuffer1 = (ByteBuffer)b.getAndSet(null);
            ByteBuffer bytebuffer = bytebuffer1;
            if (bytebuffer1 == null)
            {
                bytebuffer = ByteBuffer.allocate(4);
            }
            bytebuffer.position(0);
            messagedigest.update(bytebuffer.putInt(d.intValue()).array());
            b.set(bytebuffer);
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof flr)
        {
            obj = (flr)obj;
            if (c.equals(((flr) (obj)).c) && d != null)
            {
                flag = d.equals(((flr) (obj)).d);
            } else
            {
                flag = flag1;
                if (((flr) (obj)).d == null)
                {
                    return true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(c, c.a(d, 17));
    }

}
