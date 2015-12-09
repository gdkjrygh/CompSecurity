// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            IMdxSharedState

public static final class I extends Enum
{

    private static final Paused $VALUES[];
    public static final Paused Loading;
    public static final Paused Paused;
    public static final Paused Playing;
    public static final Paused Stopped;
    public static final Paused Transitioning;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/netflix/mediaclient/servicemgr/IMdxSharedState$MdxPlaybackState, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        Stopped = new <init>("Stopped", 0);
        Loading = new <init>("Loading", 1);
        Transitioning = new <init>("Transitioning", 2);
        Playing = new <init>("Playing", 3);
        Paused = new <init>("Paused", 4);
        $VALUES = (new .VALUES[] {
            Stopped, Loading, Transitioning, Playing, Paused
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
