// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.mdx.MdxTargetSelection;
import com.netflix.mediaclient.ui.mdx.RemotePlayer;

// Referenced classes of package com.netflix.mediaclient.util:
//            MdxUtils

public static interface 
{

    public abstract long getCurrentPositionMs();

    public abstract PlayContext getPlayContext();

    public abstract RemotePlayer getPlayer();

    public abstract MdxTargetSelection getTargetSelection();

    public abstract Playable getVideoDetails();

    public abstract boolean isPlayingLocally();

    public abstract boolean isPlayingRemotely();

    public abstract void notifyPlayingBackLocal();

    public abstract void notifyPlayingBackRemote();
}
