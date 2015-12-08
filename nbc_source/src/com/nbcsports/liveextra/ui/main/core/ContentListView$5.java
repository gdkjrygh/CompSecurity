// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.support.v7.widget.LinearLayoutManager;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            ContentListView

class this._cls0 extends Subscriber
{

    final ContentListView this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
    }

    public void onNext(final Integer position)
    {
        post(new Runnable() {

            final ContentListView._cls5 this$1;
            final Integer val$position;

            public void run()
            {
                layoutManager.scrollToPositionWithOffset(position.intValue(), 0);
            }

            
            {
                this$1 = ContentListView._cls5.this;
                position = integer;
                super();
            }
        });
    }

    public volatile void onNext(Object obj)
    {
        onNext((Integer)obj);
    }

    _cls1.val.position()
    {
        this$0 = ContentListView.this;
        super();
    }
}
