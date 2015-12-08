// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.motion;


public interface MotionProcessorObserver
{

    public abstract void detectedTempoDidChange(boolean flag, double d);

    public abstract void tempoDidChange(double d);
}
