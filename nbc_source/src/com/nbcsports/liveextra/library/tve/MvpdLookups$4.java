// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            MvpdLookups

class this._cls0
    implements rx.ubscribe
{

    final MvpdLookups this$0;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        MvpdLookups.access$202(MvpdLookups.this, subscriber);
        areLookupsReady();
    }

    ()
    {
        this$0 = MvpdLookups.this;
        super();
    }
}
