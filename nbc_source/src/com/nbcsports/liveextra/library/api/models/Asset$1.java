// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;

import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;

// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            Asset, VideoSource

class val.device
    implements Predicate
{

    final Asset this$0;
    final String val$device;

    public boolean evaluate(VideoSource videosource)
    {
        if (CollectionUtils.isEmpty(videosource.devices))
        {
            return true;
        }
        for (videosource = videosource.devices.iterator(); videosource.hasNext();)
        {
            if (((String)videosource.next()).equalsIgnoreCase(val$device))
            {
                return true;
            }
        }

        return false;
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((VideoSource)obj);
    }

    rce()
    {
        this$0 = final_asset;
        val$device = String.this;
        super();
    }
}
