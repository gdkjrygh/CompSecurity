// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, BufferViewIterator

class SetSupportedOrientationProcessor extends NativeCommandProcessor
{

    boolean landscape_;
    boolean portrait_;
    Pulse3DView viewController_;

    SetSupportedOrientationProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
        portrait_ = false;
        landscape_ = false;
    }

    void execute()
    {
        viewController_.adSupportsPortrait = portrait_;
        viewController_.adSupportsLandscape = landscape_;
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        boolean flag1 = true;
        boolean flag;
        if (bufferviewiterator.parseInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        portrait_ = flag;
        if (bufferviewiterator.parseInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        landscape_ = flag;
    }
}
