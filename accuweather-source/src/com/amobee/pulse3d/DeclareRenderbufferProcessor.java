// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            IntArgProcessor, RenderbufferResource, Pulse3DView, Pulse3DJavaScriptInterface, 
//            BufferViewIterator

class DeclareRenderbufferProcessor extends IntArgProcessor
{

    int format_;
    Pulse3DView viewController_;
    int x_;
    int y_;

    DeclareRenderbufferProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        RenderbufferResource renderbufferresource = new RenderbufferResource(x_, y_, format_);
        viewController_.resources.add(renderbufferresource);
        int i = viewController_.resources.indexOf(renderbufferresource);
        viewController_.jsInterface3D.reportBackToJS(serial_, true, (new StringBuilder()).append("").append(i).toString());
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
}
