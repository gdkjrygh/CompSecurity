// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            IntArgProcessor, TextureResource, Pulse3DView, BufferViewIterator

class DeclareTextureProcessor extends IntArgProcessor
{

    static final boolean $assertionsDisabled;
    int format_;
    Pulse3DView viewController_;
    int x_;
    int y_;

    DeclareTextureProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        TextureResource textureresource = new TextureResource(x_, y_, format_);
        int i = viewController_.resources.size();
        viewController_.resources.add(textureresource);
        if (!$assertionsDisabled && i != viewController_.resources.indexOf(textureresource))
        {
            throw new AssertionError();
        } else
        {
            viewController_.reportSuccess(serial_, (new StringBuilder()).append("").append(i).toString());
            return;
        }
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        super.parse(bufferviewiterator);
        x_ = value_;
        super.parse(bufferviewiterator);
        y_ = value_;
        super.parse(bufferviewiterator);
        format_ = value_;
    }

    static 
    {
        boolean flag;
        if (!com/amobee/pulse3d/DeclareTextureProcessor.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
