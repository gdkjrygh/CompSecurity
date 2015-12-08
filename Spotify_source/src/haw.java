// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public abstract class haw extends hay
{

    private final Closeable a;
    private final boolean b;

    public haw(Closeable closeable, boolean flag)
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
