// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.plugins;

import rx.exceptions.Exceptions;

public abstract class RxJavaErrorHandler
{

    protected static final String ERROR_IN_RENDERING_SUFFIX = ".errorRendering";

    public RxJavaErrorHandler()
    {
    }

    public void handleError(Throwable throwable)
    {
    }

    public final String handleOnNextValueRendering(Object obj)
    {
        String s = render(obj);
        return s;
        Object obj1;
        obj1;
        Thread.currentThread().interrupt();
_L2:
        return (new StringBuilder()).append(obj.getClass().getName()).append(".errorRendering").toString();
        obj1;
        Exceptions.throwIfFatal(((Throwable) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected String render(Object obj)
        throws InterruptedException
    {
        return null;
    }
}
