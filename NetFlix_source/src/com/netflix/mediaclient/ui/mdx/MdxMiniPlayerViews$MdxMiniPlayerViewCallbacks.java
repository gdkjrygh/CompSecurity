// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.VideoDetails;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

static interface ngeListener
    extends com.netflix.mediaclient.android.widget.ner
{

    public abstract float getCurrentRating();

    public abstract VideoDetails getCurrentVideo();

    public abstract ServiceManager getManager();

    public abstract IMdx getMdx();

    public abstract boolean isEpisodeReady();

    public abstract boolean isLanguageReady();

    public abstract boolean isPanelExpanded();

    public abstract boolean isPlayingRemotely();

    public abstract boolean isRemotePlayerReady();

    public abstract boolean isVideoUnshared();

    public abstract void notifyControlsEnabled(boolean flag);

    public abstract void onPauseClicked();

    public abstract void onResumeClicked();

    public abstract void onShowLanguageSelectorDialog();

    public abstract void onSkipBackClicked();

    public abstract void onStopClicked();
}
