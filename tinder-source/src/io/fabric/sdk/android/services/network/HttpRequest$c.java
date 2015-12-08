// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

protected static abstract class tpRequestException
    implements Callable
{

    protected abstract Object a()
        throws tpRequestException, IOException;

    protected abstract void b()
        throws IOException;

    public Object call()
        throws tpRequestException
    {
        boolean flag = true;
        Object obj = a();
        try
        {
            b();
        }
        catch (IOException ioexception)
        {
            throw new tpRequestException(ioexception);
        }
        return obj;
        Object obj1;
        obj1;
        throw obj1;
        obj1;
_L4:
        b();
_L2:
        throw obj1;
        obj1;
        throw new tpRequestException(((IOException) (obj1)));
        IOException ioexception1;
        ioexception1;
        if (flag) goto _L2; else goto _L1
_L1:
        throw new tpRequestException(ioexception1);
        obj1;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected tpRequestException()
    {
    }
}
