// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;


// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            RemotePlayer

public class <init>
{

    public final boolean buffering;
    public final int duration;
    public final boolean paused;
    public final int positionInSeconds;
    public final boolean showMiniPlayer;
    final RemotePlayer this$0;
    public final int volume;

    public String toString()
    {
        return (new StringBuilder()).append("RemoteTargetState [paused=").append(paused).append(", buffering=").append(buffering).append(", position(seconds)=").append(positionInSeconds).append(", duration=").append(duration).append(", volume=").append(volume).append(", showMiniPlayer=").append(showMiniPlayer).append("]").toString();
    }

    private (boolean flag, boolean flag1, int i, int j, int k, boolean flag2)
    {
        this$0 = RemotePlayer.this;
        super();
        paused = flag;
        buffering = flag1;
        positionInSeconds = i;
        duration = j;
        volume = k;
        showMiniPlayer = flag2;
    }

    showMiniPlayer(boolean flag, boolean flag1, int i, int j, int k, boolean flag2, 
            showMiniPlayer showminiplayer)
    {
        this(flag, flag1, i, j, k, flag2);
    }
}
