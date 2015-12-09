// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.service.configuration.SubtitleConfiguration;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            SimpleSubtitleManager, EnhancedSubtitleManager, PlayerActivity, SubtitleManager

public final class SubtitleManagerFactory
{

    private SubtitleManagerFactory()
    {
    }

    static SubtitleManager createInstance(SubtitleConfiguration subtitleconfiguration, PlayerActivity playeractivity)
    {
        if (playeractivity == null)
        {
            throw new IllegalArgumentException("Player activity is null!");
        }
        if (subtitleconfiguration == null)
        {
            throw new IllegalArgumentException("Subtitle profile can not be null!");
        }
        if (com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode.EVENTS.equals(subtitleconfiguration.getMode()))
        {
            return new SimpleSubtitleManager(playeractivity);
        }
        if (com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode.DATA_XML.equals(subtitleconfiguration.getMode()))
        {
            return new EnhancedSubtitleManager(playeractivity);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Subtitle configuration is NOT supported ").append(subtitleconfiguration).toString());
        }
    }
}
