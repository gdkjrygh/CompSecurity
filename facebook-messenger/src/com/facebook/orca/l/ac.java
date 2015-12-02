// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.server.FetchMoreMessagesResult;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.l:
//            x

class ac
    implements Function
{

    private ac()
    {
    }

    ac(x x)
    {
        this();
    }

    public Long a(FetchMoreMessagesResult fetchmoremessagesresult)
    {
        return Long.valueOf(fetchmoremessagesresult.f());
    }

    public Object apply(Object obj)
    {
        return a((FetchMoreMessagesResult)obj);
    }
}
