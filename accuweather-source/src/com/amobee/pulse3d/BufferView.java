// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

class BufferView
{

    public ByteBuffer asByte;
    public CharBuffer asChar;
    public FloatBuffer asFloat;
    public IntBuffer asInt;
    public ShortBuffer asShort;
    byte byteArray[];

    BufferView(byte abyte0[])
    {
        byteArray = abyte0;
        asByte = ByteBuffer.wrap(abyte0);
        asByte.order(ByteOrder.nativeOrder());
        asFloat = asByte.asFloatBuffer();
        asShort = asByte.asShortBuffer();
        asInt = asByte.asIntBuffer();
        asChar = asByte.asCharBuffer();
    }
}
