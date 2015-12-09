// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Subtitle;

public final class LanguageChoice
{

    private AudioSource audio;
    private Subtitle subtitle;

    public LanguageChoice(Subtitle subtitle1, AudioSource audiosource)
    {
        subtitle = subtitle1;
        audio = audiosource;
    }

    public AudioSource getAudio()
    {
        return audio;
    }

    public Subtitle getSubtitle()
    {
        return subtitle;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LanguageChoice [subtitle=").append(subtitle).append(", audio=").append(audio).append("]").toString();
    }
}
