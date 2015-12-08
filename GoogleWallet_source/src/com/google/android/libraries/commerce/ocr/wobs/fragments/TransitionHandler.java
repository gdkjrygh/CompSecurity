// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.fragments;

import java.util.TimerTask;

public interface TransitionHandler
{

    public abstract void captureSingleSide(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side);

    public abstract void exit(int i);

    public abstract void next();

    public abstract void pauseCapture(TimerTask timertask, long l);

    public abstract void pauseCaptureAndFlipSide();

    public abstract void pauseCaptureAndPreview();
}
