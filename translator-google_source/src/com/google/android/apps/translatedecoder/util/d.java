// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            DecoderRuntimeException

public final class d
{

    public static ByteBuffer a(ByteBuffer bytebuffer, int i)
    {
        if (i > bytebuffer.remaining())
        {
            throw new DecoderRuntimeException("not enough remaining bits");
        } else
        {
            bytebuffer = bytebuffer.slice();
            bytebuffer.limit(i);
            return bytebuffer;
        }
    }
}
