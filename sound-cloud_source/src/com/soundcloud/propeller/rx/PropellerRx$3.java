// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.rx;

import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.query.Query;
import rx.b;
import rx.b.e;

// Referenced classes of package com.soundcloud.propeller.rx:
//            PropellerRx

class val.query
    implements e
{

    final PropellerRx this$0;
    final Query val$query;

    public volatile Object call()
    {
        return call();
    }

    public b call()
    {
        return b.just(PropellerRx.access$000(PropellerRx.this).query(val$query));
    }

    ()
    {
        this$0 = final_propellerrx;
        val$query = Query.this;
        super();
    }
}
