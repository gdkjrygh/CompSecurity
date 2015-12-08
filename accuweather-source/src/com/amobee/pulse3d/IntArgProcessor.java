// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, BufferViewIterator

class IntArgProcessor extends NativeCommandProcessor
{

    public int value_;

    IntArgProcessor()
    {
        value_ = 0;
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        value_ = bufferviewiterator.parseInt();
    }
}
