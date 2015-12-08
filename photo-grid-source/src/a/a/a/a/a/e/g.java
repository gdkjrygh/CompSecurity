// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.e;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

// Referenced classes of package a.a.a.a.a.e:
//            k

public abstract class g extends k
{

    private final Closeable a;
    private final boolean b;

    protected g(Closeable closeable, boolean flag)
    {
        a = closeable;
        b = flag;
    }

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
}
