// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.util;

import java.util.concurrent.Callable;

// Referenced classes of package roboguice.util:
//            SafeAsyncTask

class val.e
    implements Callable
{

    final val.e this$0;
    final Throwable val$e;

    public Object call()
        throws Exception
    {
        rent.onThrowable(val$e);
        return null;
    }

    ()
    {
        this$0 = final_;
        val$e = Throwable.this;
        super();
    }
}
