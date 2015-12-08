// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package retrofit:
//            Platform

class this._cls0
    implements ThreadFactory
{

    final _cls1.val.r this$0;

    public Thread newThread(final Runnable r)
    {
        return new Thread(new Runnable() {

            final Platform.Base._cls2 this$1;
            final Runnable val$r;

            public void run()
            {
                Thread.currentThread().setPriority(1);
                r.run();
            }

            
            {
                this$1 = Platform.Base._cls2.this;
                r = runnable;
                super();
            }
        }, "Retrofit-Idle");
    }

    _cls1.val.r()
    {
        this$0 = this._cls0.this;
        super();
    }
}
