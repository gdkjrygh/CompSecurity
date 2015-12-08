// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.io.Serializable;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            ArrayBasedStringMap, DecoderRuntimeException

public abstract class StringMap
    implements Serializable
{

    private static final long serialVersionUID = 0xa526ad845d89f35L;

    public StringMap()
    {
    }

    public static StringMap readFromByteBuffer(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        if (i == 1)
        {
            return ArrayBasedStringMap.readFromByteBufferHelper(bytebuffer);
        } else
        {
            throw new DecoderRuntimeException((new StringBuilder(28)).append("unknown class id ").append(i).toString());
        }
    }

    public abstract String get(String s);

    public abstract void writeToByteBuffer(ByteBuffer bytebuffer);
}
