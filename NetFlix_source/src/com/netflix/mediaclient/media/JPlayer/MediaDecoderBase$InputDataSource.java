// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import java.nio.ByteBuffer;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderBase

public static interface BufferMeta
{
    public static class BufferMeta
    {

        long debug;
        int flags;
        byte iv[];
        byte key[];
        int nByteEncrypted[];
        int nByteInClear[];
        int nSubsample;
        int offset;
        int size;
        long timestamp;

        public BufferMeta()
        {
        }
    }


    public abstract BufferMeta onRequestData(ByteBuffer bytebuffer);
}
