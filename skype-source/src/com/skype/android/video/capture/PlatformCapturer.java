// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import java.io.Closeable;

public interface PlatformCapturer
    extends Closeable
{

    public abstract boolean attachPreview(Object obj, int i, int j);

    public abstract boolean banResolution(int i, int j);

    public abstract void close();

    public abstract boolean detachPreview();

    public abstract int getCaptureHeight();

    public abstract int getCaptureWidth();

    public abstract int getImageOrientation(int i);

    public abstract float getMaxFramerate();

    public abstract boolean registerResolution(int i, int j);

    public abstract boolean setCallbackEnabled(boolean flag);

    public abstract boolean setCameraParameters(int i, int j, float f);

    public abstract boolean setPreviewResolutioin(int i, int j);

    public abstract boolean setRotation(int i, boolean flag);

    public abstract boolean start(long l);

    public abstract boolean stop(long l);
}
