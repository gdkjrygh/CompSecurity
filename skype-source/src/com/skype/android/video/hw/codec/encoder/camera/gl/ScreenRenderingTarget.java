// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;


// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            AbstractRenderingTarget, GLException, Context

public class ScreenRenderingTarget extends AbstractRenderingTarget
{

    private static final int EGL_CONTEXT_ATTRIBUTES[] = {
        12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 
        12325, 0, 12326, 0, 12344
    };

    public ScreenRenderingTarget(Context context, AbstractRenderingTarget.Events events)
        throws GLException
    {
        super(context, EGL_CONTEXT_ATTRIBUTES, events);
    }

    protected void doInitialBinding()
        throws GLException
    {
        if (!isBoundAny())
        {
            bind();
        }
    }

}
