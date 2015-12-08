// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.tasks;

import com.brightcove.player.media.CaptionType;

class c
{

    static final int a[];

    static 
    {
        a = new int[CaptionType.values().length];
        try
        {
            a[CaptionType.WEBVTT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[CaptionType.TTML.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
