// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.threads.MessagesCollection;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.l:
//            x

class ag
    implements Function
{

    private ag()
    {
    }

    ag(x x)
    {
        this();
    }

    public MessagesCollection a(FetchThreadResult fetchthreadresult)
    {
        return fetchthreadresult.b();
    }

    public Object apply(Object obj)
    {
        return a((FetchThreadResult)obj);
    }
}
