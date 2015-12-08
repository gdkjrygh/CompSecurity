// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;


// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            PlayerScreenResourceHelperTablet, PlayerScreenResourceHelperPhone

public abstract class PlayerScreenResourceHelper
{

    public int pause;
    public int play;
    public int timelineDent;
    public int timelineHeightInDip;
    public int timelineHeightPaddingInDip;
    public int timelineThumbOffsetInDip;
    public int topBackground;

    public PlayerScreenResourceHelper()
    {
    }

    public static PlayerScreenResourceHelper newInstance(boolean flag)
    {
        if (flag)
        {
            return new PlayerScreenResourceHelperTablet();
        } else
        {
            return new PlayerScreenResourceHelperPhone();
        }
    }
}
