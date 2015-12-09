// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import java.util.HashMap;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MdxSharedState

static final class ansitioning extends HashMap
{

    xPlaybackState()
    {
        put(com.netflix.mediaclient.servicemgr.dxPlaybackState.Playing, "Playing");
        put(com.netflix.mediaclient.servicemgr.dxPlaybackState.Paused, "Paused");
        put(com.netflix.mediaclient.servicemgr.dxPlaybackState.Stopped, "Stopped");
        put(com.netflix.mediaclient.servicemgr.dxPlaybackState.Loading, "Loading");
        put(com.netflix.mediaclient.servicemgr.dxPlaybackState.Transitioning, "Transitioning");
    }
}
