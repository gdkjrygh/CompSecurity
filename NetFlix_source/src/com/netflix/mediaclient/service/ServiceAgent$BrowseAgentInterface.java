// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.service.browse.BrowseAgentCallback;

// Referenced classes of package com.netflix.mediaclient.service:
//            ServiceAgent

public static interface 
{

    public abstract void fetchEpisodeDetails(String s, BrowseAgentCallback browseagentcallback);

    public abstract void fetchMovieDetails(String s, BrowseAgentCallback browseagentcallback);

    public abstract void fetchSeasonDetails(String s, BrowseAgentCallback browseagentcallback);

    public abstract void fetchShowDetails(String s, String s1, BrowseAgentCallback browseagentcallback);
}
