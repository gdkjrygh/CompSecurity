// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.conviva:
//            LivePass, ConvivaContentInfo

static final class 
    implements Callable
{

    final Map val$attributes;
    final String val$name;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        if (LivePass.access$600() < 0)
        {
            int _tmp = LivePass.access$602(LivePass.access$700(null, new ConvivaContentInfo("", new HashMap()), null, true));
        }
        LivePass.sendSessionEvent(LivePass.access$600(), val$name, val$attributes);
        return null;
    }

    entInfo(String s, Map map)
    {
        val$name = s;
        val$attributes = map;
        super();
    }
}
