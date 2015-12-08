// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// Referenced classes of package com.amazonaws.internal:
//            c

public abstract class g extends InputStream
    implements c
{

    public g()
    {
    }

    protected abstract InputStream a();

    public final boolean d()
    {
        InputStream inputstream = a();
        if (inputstream instanceof c)
        {
            return ((c)inputstream).d();
        } else
        {
            return false;
        }
    }

    protected final void e()
    {
        if (Thread.interrupted())
        {
            try
            {
                f();
            }
            catch (IOException ioexception)
            {
                LogFactory.getLog(getClass()).debug("FYI", ioexception);
            }
            throw new AbortedException();
        } else
        {
            return;
        }
    }

    protected void f()
        throws IOException
    {
    }
}
