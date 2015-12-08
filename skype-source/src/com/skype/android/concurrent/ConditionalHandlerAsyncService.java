// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.skype.android.util.Conditional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.concurrent:
//            ExecutorAsyncService, ConditionalAsyncCallback, AsyncCallback, AsyncResult

public class ConditionalHandlerAsyncService extends ExecutorAsyncService
    implements android.os.Handler.Callback
{
    private final class a
        implements AsyncCallback
    {

        final ConditionalHandlerAsyncService a;
        private AsyncCallback b;
        private AsyncResult c;

        static AsyncCallback a(a a1)
        {
            return a1.b;
        }

        static AsyncResult b(a a1)
        {
            return a1.c;
        }

        final boolean a()
        {
            if (b instanceof ConditionalAsyncCallback)
            {
                return ((ConditionalAsyncCallback)b).a().a();
            } else
            {
                return true;
            }
        }

        public final void done(AsyncResult asyncresult)
        {
            c = asyncresult;
            asyncresult = ConditionalHandlerAsyncService.a(a).obtainMessage(0, this);
            ConditionalHandlerAsyncService.a(a).sendMessage(asyncresult);
        }

        a(AsyncCallback asynccallback)
        {
            a = ConditionalHandlerAsyncService.this;
            super();
            b = asynccallback;
        }
    }


    private Handler a;

    public ConditionalHandlerAsyncService(ExecutorService executorservice, Looper looper)
    {
        super(executorservice);
        a = new Handler(looper, this);
    }

    static Handler a(ConditionalHandlerAsyncService conditionalhandlerasyncservice)
    {
        return conditionalhandlerasyncservice.a;
    }

    protected final AsyncCallback a(AsyncCallback asynccallback)
    {
        return new a(asynccallback);
    }

    public final Future a(Callable callable, AsyncCallback asynccallback)
    {
        Object obj = asynccallback;
        if (asynccallback instanceof Conditional)
        {
            obj = new ConditionalAsyncCallback((Conditional)asynccallback, asynccallback);
        }
        return super.a(callable, ((AsyncCallback) (obj)));
    }

    public final Future a(Callable callable, Object obj, AsyncCallback asynccallback)
    {
        Object obj1 = asynccallback;
        if (asynccallback instanceof Conditional)
        {
            obj1 = new ConditionalAsyncCallback((Conditional)asynccallback, asynccallback);
        }
        return super.a(callable, obj, ((AsyncCallback) (obj1)));
    }

    public boolean handleMessage(Message message)
    {
        message = (a)message.obj;
        AsyncCallback asynccallback = a.a(message);
        if (message.a() && asynccallback != null)
        {
            asynccallback.done(a.b(message));
        }
        return false;
    }
}
