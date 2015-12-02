// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class <init>
    implements <init>
{

    public final int a()
    {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo a(int i)
    {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean a(String s, android.media.cListCompatV16 clistcompatv16)
    {
        return "video/avc".equals(s);
    }

    public final boolean b()
    {
        return false;
    }

    private I()
    {
    }

    I(byte byte0)
    {
        this();
    }
}
