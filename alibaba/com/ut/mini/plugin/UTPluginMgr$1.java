// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.plugin;

import java.util.ArrayList;

// Referenced classes of package com.ut.mini.plugin:
//            UTPluginMgr

class add extends ArrayList
{

    final UTPluginMgr hK;

    (UTPluginMgr utpluginmgr)
    {
        hK = utpluginmgr;
        super();
        add("com.ut.mini.perf.UTPerfPlugin");
    }
}
