// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.internal:
//            ac

public abstract class ad
    implements Callable
{

    protected ad()
    {
    }

    protected abstract void a()
        throws IOException;

    protected abstract Object b()
        throws ac, IOException;

    public Object call()
        throws ac
    {
        boolean flag = true;
        Object obj = b();
        try
        {
            a();
        }
        catch (IOException ioexception)
        {
            throw new ac(ioexception);
        }
        return obj;
        Object obj1;
        obj1;
        throw obj1;
        obj1;
_L4:
        a();
_L2:
        throw obj1;
        obj1;
        throw new ac(((IOException) (obj1)));
        IOException ioexception1;
        ioexception1;
        if (flag) goto _L2; else goto _L1
_L1:
        throw new ac(ioexception1);
        obj1;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
