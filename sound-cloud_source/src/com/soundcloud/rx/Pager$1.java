// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx;

import rx.X;
import rx.b;
import rx.g.c;

// Referenced classes of package com.soundcloud.rx:
//            Pager

class val.source
    implements rx.bject
{

    final Pager this$0;
    final b val$source;

    public volatile void call(Object obj)
    {
        call((X)obj);
    }

    public void call(X x)
    {
        Pager.access$002(Pager.this, c.a());
        Pager.access$102(Pager.this, b.switchOnNext(Pager.access$000(Pager.this)).subscribe(new geSubscriber(Pager.this, x)));
        x.add(Pager.access$100(Pager.this));
        Pager.access$000(Pager.this).onNext(val$source);
    }

    geSubscriber()
    {
        this$0 = final_pager;
        val$source = b.this;
        super();
    }
}
