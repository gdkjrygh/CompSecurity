// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.adobe.mediacore.MediaPlayer;

public interface PlayerAnalytics
{

    public abstract void attachPlayer(MediaPlayer mediaplayer);

    public abstract void onDestroy();

    public abstract void onPause();
}
