// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.e;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

// Referenced classes of package b.a.a.a.a.e:
//            d

protected static abstract class b extends b
{

    private final Closeable a;
    private final boolean b;

    protected final void b()
    {
        if (a instanceof Flushable)
        {
            ((Flushable)a).flush();
        }
        if (b)
        {
            try
            {
                a.close();
                return;
            }
            catch (IOException ioexception)
            {
                return;
            }
        } else
        {
            a.close();
            return;
        }
    }

    protected e(Closeable closeable, boolean flag)
    {
        a = closeable;
        b = flag;
    }
}
