// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;


// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback

private static abstract class callback
    implements Runnable
{

    private final BrowseAgentCallback callback;
    private final String category;
    private final int from;
    private final int to;

    protected BrowseAgentCallback getCallback()
    {
        return callback;
    }

    protected String getCategory()
    {
        return category;
    }

    protected int getFromIndex()
    {
        return from;
    }

    protected int getToIndex()
    {
        return to;
    }

    public (String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        category = s;
        from = i;
        to = j;
        callback = browseagentcallback;
    }
}
