// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;

import java.util.Collections;
import java.util.List;

class ActiveExperiments
{

    private static final List EXPERIMENTS = Collections.singletonList("player_share_button");
    private static final String LAYERS[] = {
        "android_listening"
    };

    ActiveExperiments()
    {
    }

    public String[] getRequestLayers()
    {
        return LAYERS;
    }

    public boolean isActive(String s)
    {
        return EXPERIMENTS.contains(s);
    }

}
