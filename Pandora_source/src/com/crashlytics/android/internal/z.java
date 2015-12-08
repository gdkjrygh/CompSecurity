// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.internal:
//            ad

public abstract class z extends ad
{

    private final Closeable a;
    private final boolean b;

    protected z(Closeable closeable, boolean flag)
    {
        a = closeable;
        b = flag;
    }

    protected final void a()
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
}
