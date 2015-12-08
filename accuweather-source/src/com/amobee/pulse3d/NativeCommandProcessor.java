// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            BufferViewIterator

abstract class NativeCommandProcessor
{

    int serial_;

    NativeCommandProcessor()
    {
    }

    void execute()
    {
    }

    abstract void parse(BufferViewIterator bufferviewiterator);

    void serial_set(int i)
    {
        serial_ = i;
    }
}
