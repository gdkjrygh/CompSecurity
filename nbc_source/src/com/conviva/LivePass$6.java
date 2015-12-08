// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva;

import com.conviva.session.Session;
import com.conviva.session.SessionFactory;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.conviva:
//            LivePass

static final class 
    implements Callable
{

    final Map val$eventAttrDictCS;
    final String val$name;
    final int val$sessionId;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        LivePass.access$400().getSession(val$sessionId).sendCustomEvent(val$name, val$eventAttrDictCS);
        return null;
    }

    sion(int i, String s, Map map)
    {
        val$sessionId = i;
        val$name = s;
        val$eventAttrDictCS = map;
        super();
    }
}
