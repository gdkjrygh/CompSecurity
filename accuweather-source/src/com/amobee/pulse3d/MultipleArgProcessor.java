// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, BufferViewIterator

class MultipleArgProcessor extends NativeCommandProcessor
{

    protected ArrayList processors_;

    MultipleArgProcessor()
    {
        processors_ = new ArrayList();
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        for (int i = 0; i < processors_.size(); i++)
        {
            ((NativeCommandProcessor)processors_.get(i)).parse(bufferviewiterator);
        }

    }
}
