// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.util;

import java.io.InterruptedIOException;
import java.util.concurrent.Callable;

// Referenced classes of package roboguice.util:
//            SafeAsyncTask

class val.e
    implements Callable
{

    final val.e this$0;
    final Exception val$e;

    public Object call()
        throws Exception
    {
        if ((val$e instanceof InterruptedException) || (val$e instanceof InterruptedIOException))
        {
            rent.onInterrupted(val$e);
        } else
        {
            rent.onException(val$e);
        }
        return null;
    }

    ()
    {
        this$0 = final_;
        val$e = Exception.this;
        super();
    }
}
