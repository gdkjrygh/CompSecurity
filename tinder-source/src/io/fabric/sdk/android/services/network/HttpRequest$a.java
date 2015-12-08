// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

protected static abstract class b extends b
{

    private final Closeable a;
    private final boolean b;

    protected final void b()
        throws IOException
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

    protected (Closeable closeable, boolean flag)
    {
        a = closeable;
        b = flag;
    }
}
