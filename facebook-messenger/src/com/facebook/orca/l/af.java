// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.server.FetchMoreMessagesResult;
import com.facebook.orca.threads.MessagesCollection;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.l:
//            x

class af
    implements Function
{

    private af()
    {
    }

    af(x x)
    {
        this();
    }

    public MessagesCollection a(FetchMoreMessagesResult fetchmoremessagesresult)
    {
        return fetchmoremessagesresult.a();
    }

    public Object apply(Object obj)
    {
        return a((FetchMoreMessagesResult)obj);
    }
}
