// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva;

import com.conviva.session.SessionFactory;
import com.conviva.utils.PlatformUtils;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.conviva:
//            LivePass, ConvivaContentInfo

static final class 
    implements Callable
{

    final ConvivaContentInfo val$contentInfo;
    final boolean val$global;
    final Map val$sessionOptions;
    final int val$sid;
    final Object val$streamer;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        LivePass.access$400().makeSession(val$streamer, val$contentInfo, val$sessionOptions, val$sid, val$global);
        LivePass.access$300().log("LivePass Session Created");
        return null;
    }

    entInfo(Object obj, ConvivaContentInfo convivacontentinfo, Map map, int i, boolean flag)
    {
        val$streamer = obj;
        val$contentInfo = convivacontentinfo;
        val$sessionOptions = map;
        val$sid = i;
        val$global = flag;
        super();
    }
}
