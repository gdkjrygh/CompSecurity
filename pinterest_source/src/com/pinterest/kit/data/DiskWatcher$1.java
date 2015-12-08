// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.data;

import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.pinterest.kit.data:
//            DiskWatcher

class this._cls0 extends FileObserver
{

    final DiskWatcher this$0;

    public void onEvent(final int event, String s)
    {
        class _cls1
            implements Runnable
        {

            final DiskWatcher._cls1 this$1;
            final int val$event;

            public void run()
            {
                onEvent(event);
            }

            _cls1()
            {
                this$1 = DiskWatcher._cls1.this;
                event = i;
                super();
            }
        }

        (new Handler(Looper.getMainLooper())).post(new _cls1());
    }

    _cls1(String s, int i)
    {
        this$0 = DiskWatcher.this;
        super(s, i);
    }
}
