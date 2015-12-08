// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.ui.Section;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity

public abstract class PlayerSection extends Section
{

    protected PlayerActivity context;
    protected boolean tablet;
    protected int transpColor;

    public PlayerSection(PlayerActivity playeractivity)
    {
        super(playeractivity);
        context = playeractivity;
        tablet = playeractivity.isTablet();
    }

    public void destroy()
    {
    }
}
