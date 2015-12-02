// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.sequencelogger.AbstractSequenceDefinition;
import com.google.common.collect.ImmutableSet;

public class PrefetchItemSequence extends AbstractSequenceDefinition
{

    public static final PrefetchItemSequence a = new PrefetchItemSequence();
    private static final ImmutableSet b = ImmutableSet.of("com.facebook.chrome.FbChromeDelegatingActivity");

    private PrefetchItemSequence()
    {
        super(0x1d0004, "VideoPrefetchItem", false, b);
    }

}
