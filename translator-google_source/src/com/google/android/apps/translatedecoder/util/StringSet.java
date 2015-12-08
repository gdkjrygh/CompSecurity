// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.io.Serializable;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            ArrayBasedStringSet, DecoderRuntimeException

public abstract class StringSet
    implements Serializable
{

    private static final long serialVersionUID = 0x35bbe98efaff1a4aL;

    public StringSet()
    {
    }

    public static StringSet readFromByteBuffer(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        if (i == 1)
        {
            return ArrayBasedStringSet.readFromByteBufferHelper(bytebuffer);
        } else
        {
            throw new DecoderRuntimeException((new StringBuilder(28)).append("unknown class id ").append(i).toString());
        }
    }

    public abstract boolean contains(String s);

    public abstract void writeToByteBuffer(ByteBuffer bytebuffer);
}
