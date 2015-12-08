// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.IOException;
import java.util.concurrent.Callable;

public abstract class tException
    implements Callable
{

    protected abstract Object a()
        throws tException, IOException;

    protected abstract void b()
        throws IOException;

    public Object call()
        throws tException
    {
        boolean flag = true;
        Object obj = a();
        try
        {
            b();
        }
        catch (IOException ioexception)
        {
            throw new tException(ioexception);
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
        throw new tException(((IOException) (obj1)));
        IOException ioexception1;
        ioexception1;
        if (flag) goto _L2; else goto _L1
_L1:
        throw new tException(ioexception1);
        obj1;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected tException()
    {
    }
}
