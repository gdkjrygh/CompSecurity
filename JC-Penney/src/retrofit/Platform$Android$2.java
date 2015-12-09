// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.util.concurrent.ThreadFactory;

class this._cls0
    implements ThreadFactory
{

    final _cls1 this$0;

    public Thread newThread(final Runnable r)
    {
        class _cls1
            implements Runnable
        {

            final Platform.Android._cls2 this$1;
            final Runnable val$r;

            public void run()
            {
                Process.setThreadPriority(10);
                r.run();
            }

            _cls1()
            {
                this$1 = Platform.Android._cls2.this;
                r = runnable;
                super();
            }
        }

        return new Thread(new _cls1(), "Retrofit-Idle");
    }

    _cls1()
    {
        this$0 = this._cls0.this;
        super();
    }
}
