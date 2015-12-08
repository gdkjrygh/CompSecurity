// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


public interface IAudioManager
{
    public static interface MusicFocusable
    {

        public abstract void focusGained();

        public abstract void focusLost(boolean flag, boolean flag1);
    }


    public static final int FOCUS_GAIN = 1;
    public static final int FOCUS_TRANSIENT = 2;
    public static final int FOCUS_TRANSIENT_DUCK = 3;

    public abstract boolean abandonMusicFocus(boolean flag);

    public abstract boolean isFocusSupported();

    public abstract void onFocusAbandoned();

    public abstract void onFocusObtained();

    public abstract boolean requestMusicFocus(MusicFocusable musicfocusable, int i);
}
