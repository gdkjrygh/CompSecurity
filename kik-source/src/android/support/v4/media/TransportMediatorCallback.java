// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.view.KeyEvent;

interface TransportMediatorCallback
{

    public abstract long getPlaybackPosition();

    public abstract void handleAudioFocusChange(int i);

    public abstract void handleKey(KeyEvent keyevent);

    public abstract void playbackPositionUpdate(long l);
}
