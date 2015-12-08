// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import java.nio.ByteBuffer;

public interface AmplitudeAnalyzer
{

    public abstract float frameAmplitude(ByteBuffer bytebuffer, int i);

    public abstract int getLastValue();
}
