// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.support.v7.widget.LinearLayoutManager;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            ContentListView

class val.position
    implements Runnable
{

    final val.position this$1;
    final Integer val$position;

    public void run()
    {
        layoutManager.scrollToPositionWithOffset(val$position.intValue(), 0);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$position = Integer.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/main/core/ContentListView$5

/* anonymous class */
    class ContentListView._cls5 extends Subscriber
    {

        final ContentListView this$0;

        public void onCompleted()
        {
        }

        public void onError(Throwable throwable)
        {
        }

        public void onNext(Integer integer)
        {
            post(integer. new ContentListView._cls5._cls1());
        }

        public volatile void onNext(Object obj)
        {
            onNext((Integer)obj);
        }

            
            {
                this$0 = ContentListView.this;
                super();
            }
    }

}
