// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, BufferViewIterator

class FloatArgProcessor extends NativeCommandProcessor
{

    public float value_;

    FloatArgProcessor()
    {
        value_ = 0.0F;
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        value_ = bufferviewiterator.parseFloat();
    }
}
