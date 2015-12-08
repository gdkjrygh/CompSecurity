// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, Pulse3DWebView, Pulse3DJavaScriptInterface, 
//            Pulse3DGLSurfaceView, BufferViewIterator

class NoArgProcessor extends NativeCommandProcessor
{
    public static class TYPE
    {

        public static final int COMMIT_DISPLAY_LIST_CHANGES = 5;
        public static final int DECLARE_FRAMEBUFFER = 3;
        public static final int ENSURE_RENDER = 2;
        public static final int FENCE = 4;
        public static final int READY_TO_DISPLAY = 1;
        public static final int TOGGLE_BANNER = 0;

        public TYPE()
        {
        }
    }


    Pulse3DView pulse3DView;
    private int type_;

    public NoArgProcessor(Pulse3DView pulse3dview, int i)
    {
        pulse3DView = pulse3dview;
        type_ = i;
    }

    void execute()
    {
        if (type_ != 0) goto _L2; else goto _L1
_L1:
        pulse3DView.mPulse3dWebView.toggleBanner();
_L4:
        return;
_L2:
        if (type_ == 1)
        {
            pulse3DView.jsInterface3D.readyToDisplay();
            return;
        }
        if (type_ != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (pulse3DView != null && pulse3DView.mGLView != null)
        {
            pulse3DView.mGLView.requestRender();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (type_ == 3)
        {
            pulse3DView.jsInterface3D.declareFramebuffer(serial_);
            return;
        }
        if (type_ == 4)
        {
            pulse3DView.jsInterface3D.notImplemented("fence");
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
    }
}
