// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

protected static abstract class tException
    implements Callable
{

    public Object call()
        throws tException
    {
        boolean flag = false;
        Object obj = run();
        done();
_L2:
        return obj;
        IOException ioexception;
        ioexception;
        if (false) goto _L2; else goto _L1
_L1:
        throw new tException(ioexception);
        Object obj1;
        obj1;
        flag = true;
        throw obj1;
        obj1;
        try
        {
            done();
        }
        catch (IOException ioexception1)
        {
            if (!flag)
            {
                throw new tException(ioexception1);
            }
        }
        throw obj1;
        obj1;
        flag = true;
        throw new tException(((IOException) (obj1)));
    }

    protected abstract void done()
        throws IOException;

    protected abstract Object run()
        throws tException, IOException;

    protected tException()
    {
    }
}
