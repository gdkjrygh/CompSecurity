// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.sequencelogger.AbstractSequenceDefinition;
import com.google.common.collect.ImmutableSet;

public class InitializationSequence extends AbstractSequenceDefinition
{

    public static final InitializationSequence a = new InitializationSequence();
    private static final ImmutableSet b = ImmutableSet.of("com.facebook.chrome.FbChromeDelegatingActivity");

    private InitializationSequence()
    {
        super(0x1d0001, "VideoInitialization", false, b);
    }

}
