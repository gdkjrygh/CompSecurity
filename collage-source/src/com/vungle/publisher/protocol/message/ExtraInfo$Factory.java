// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.db.model.AdReportExtra;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            MessageFactory, ExtraInfo

static class  extends MessageFactory
{

    protected static ExtraInfo a(Map map)
    {
        ExtraInfo extrainfo = null;
        if (map != null)
        {
            extrainfo = new ExtraInfo();
            extrainfo.a = new HashMap(map);
        }
        return extrainfo;
    }

    protected static ExtraInfo b(Map map)
    {
        ExtraInfo extrainfo = null;
        if (map != null)
        {
            extrainfo = new ExtraInfo();
            HashMap hashmap = new HashMap();
            extrainfo.a = hashmap;
            AdReportExtra adreportextra;
            for (map = map.values().iterator(); map.hasNext(); hashmap.put(adreportextra.b, adreportextra.c))
            {
                adreportextra = (AdReportExtra)map.next();
            }

        }
        return extrainfo;
    }

    protected final Object a()
    {
        return new ExtraInfo();
    }

    protected final volatile Object[] a(int i)
    {
        return new ExtraInfo[i];
    }

    ()
    {
    }
}
