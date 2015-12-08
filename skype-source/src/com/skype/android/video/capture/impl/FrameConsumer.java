// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture.impl;


public interface FrameConsumer
{

    public abstract void onFrameArrived(byte abyte0[], int i, int j);
}
