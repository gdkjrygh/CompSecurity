// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, Pulse3DGLEnums_ES20, Pulse3DWebView, 
//            BufferViewIterator

class GLConstantsProcessor extends NativeCommandProcessor
{

    Pulse3DView pulse3DView;

    public GLConstantsProcessor(Pulse3DView pulse3dview)
    {
        pulse3DView = pulse3dview;
    }

    void execute()
    {
        pulse3DView.mPulse3dWebView.injectJS((new StringBuilder()).append("AdKitNative.GLConstants(").append(Pulse3DGLEnums_ES20.getResponse()).append(")").toString());
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
    }
}
