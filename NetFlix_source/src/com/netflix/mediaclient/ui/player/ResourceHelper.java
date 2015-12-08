// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;


// Referenced classes of package com.netflix.mediaclient.ui.player:
//            ResourceHelperTablet, ResourceHelperPhone

public abstract class ResourceHelper
{

    public int pause;
    public int play;
    public int timelineDent;
    public int timelineHeightInDip;
    public int timelineHeightPaddingInDip;
    public int timelineThumbOffsetInDip;
    public int topBackground;
    public int zoomIn;
    public int zoomOut;

    public ResourceHelper()
    {
    }

    public static ResourceHelper newInstance(boolean flag)
    {
        if (flag)
        {
            return new ResourceHelperTablet();
        } else
        {
            return new ResourceHelperPhone();
        }
    }
}
