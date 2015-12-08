// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.controllers;

import com.immersion.hapticmediasdk.models.HapticFileInformation;

public interface IHapticFileReader
{

    public abstract boolean bufferAtPlaybackPosition(int i);

    public abstract void close();

    public abstract long getBlockOffset(long l);

    public abstract int getBlockSizeMS();

    public abstract byte[] getBufferForPlaybackPosition(int i);

    public abstract byte[] getEncryptedHapticHeader();

    public abstract int getHapticBlockIndex(long l);

    public abstract HapticFileInformation getHapticFileInformation();

    public abstract void setBlockSizeMS(int i);

    public abstract void setBytesAvailable(int i);
}
