// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content;

import com.nbcsports.liveextra.library.configuration.Configuration;
import javax.inject.Provider;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.content:
//            ContentService

class val.sportCode
    implements rx.cribe
{

    final ContentService this$0;
    final String val$sportCode;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        String s = ((Configuration)ContentService.access$000(ContentService.this).get()).getSportsFeaturedRequestURL().trim().replace("$(sport)", val$sportCode).replace("$(tour)", val$sportCode);
        ContentService.access$200(ContentService.this, subscriber, s);
    }

    figuration()
    {
        this$0 = final_contentservice;
        val$sportCode = String.this;
        super();
    }
}
