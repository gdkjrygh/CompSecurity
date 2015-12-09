// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.ssdp;

import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.net.ssdp:
//            e, SSDPSearch, f

final class d
    implements e
{

    d()
    {
    }

    public final void a(f f)
    {
        SSDPSearch.b().info((new StringBuilder(">>>>>>>>>> onResult() \n")).append(f).toString());
    }

    public final void a(List list)
    {
        SSDPSearch.b().info(">>>>>>>>>> onResults() >>>>>>>>>>>>>>>>>");
        SSDPSearch.a(list);
    }
}
