// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, BufferViewIterator

class StringArgProcessor extends NativeCommandProcessor
{

    public String string_;

    public StringArgProcessor()
    {
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        string_ = bufferviewiterator.parseAlignedASCIIStringWithLength();
    }
}
