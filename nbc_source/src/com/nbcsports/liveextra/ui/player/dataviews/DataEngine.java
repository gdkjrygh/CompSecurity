// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.dataviews;

import com.adobe.mediacore.MediaPlayer;

public interface DataEngine
{

    public abstract int getBottomPanel();

    public abstract int getSidePanel();

    public abstract int getTopPanel();

    public abstract void start(MediaPlayer mediaplayer);

    public abstract void stop();
}
