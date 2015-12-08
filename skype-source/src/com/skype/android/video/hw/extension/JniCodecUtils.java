// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.extension;

import java.nio.ByteBuffer;

public final class JniCodecUtils
{

    public JniCodecUtils()
    {
    }

    public static native void fillInputFrameBuffer(long l, ByteBuffer bytebuffer, int i);

    public static native void returnCapabilities(long l, String s, int ai[], int i, int ai1[], long l1, 
            long l2, boolean flag, int j, int k, int i1, int j1, 
            int k1, int i2, int j2, boolean flag1, int k2, boolean flag2);
}
