// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v4.content:
//            ModernAsyncTask

class rkerRunnable extends rkerRunnable
{

    final ModernAsyncTask this$0;

    public Object call()
        throws Exception
    {
        ModernAsyncTask.access$200(ModernAsyncTask.this).set(true);
        Process.setThreadPriority(10);
        return ModernAsyncTask.access$300(ModernAsyncTask.this, doInBackground(mParams));
    }

    rkerRunnable()
    {
        this$0 = ModernAsyncTask.this;
        super(null);
    }
}
