// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import com.skype.Video;
import com.skype.VideoImpl;
import com.skype.android.video.render.BindingRenderer;
import com.skype.android.video.render.GLESBindingRenderer;
import com.skype.android.video.render.GLTextureView;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.calling:
//            VideoCall

public class BindingRendererContext
    implements com.skype.android.video.render.BindingRenderer.Callback
{
    static interface a
    {

        public abstract void a(int i, int j);
    }


    private final GLTextureView a;
    private final VideoImpl b;
    private a c;
    private final BindingRenderer d = new GLESBindingRenderer(this);
    private int e;
    private boolean f;

    public BindingRendererContext(Video video, GLTextureView gltextureview, a a1)
    {
        a = gltextureview;
        b = (VideoImpl)video;
        c = a1;
        VideoCall.a.info((new StringBuilder("BindingRendererContext ctr - videoObjId: ")).append(b.getObjectID()).toString());
        d.registerView(a);
        int i = d.getNativeBindingType();
        int j = (int)d.getNativeBindingEvent();
        b.createBinding(i, j);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        VideoCall.a.info((new StringBuilder("BindingRendererContext release - videoObjId: ")).append(b.getObjectID()).toString());
        d.unregisterView(a);
        if (e == 0) goto _L2; else goto _L1
_L1:
        b.releaseBinding(e);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i, int j)
    {
        d.setTargetResolution(i, j);
    }

    public final long b()
    {
        return d.getNativeBindingEvent();
    }

    public void onBindingCreated(long l)
    {
        this;
        JVM INSTR monitorenter ;
        VideoCall.a.info((new StringBuilder("BindingRendererContext onBindingCreated - videoObjId: ")).append(b.getObjectID()).append(" bindingRef ").append(l).toString());
        e = (int)l;
        if (f)
        {
            b.releaseBinding(e);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onBindingFailed()
    {
        VideoCall.a.info((new StringBuilder("BindingRendererContext onBindingFailed - videoObjId: ")).append(b.getObjectID()).toString());
        d.dispose();
    }

    public void onBindingReleased()
    {
        VideoCall.a.info((new StringBuilder("BindingRendererContext onBindingReleased - videoObjId: ")).append(b.getObjectID()).toString());
        d.dispose();
    }

    public void onSizeChanged(int i, int j)
    {
        VideoCall.a.info((new StringBuilder("BindingRendererContext onSizeChanged - videoObjId: ")).append(b.getObjectID()).append("wxh:").append(i).append("x").append(j).toString());
        c.a(i, j);
    }
}
