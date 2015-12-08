// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            RenderResource

public class FramebufferResource extends RenderResource
{

    public FramebufferResource()
    {
    }

    void Activate()
    {
        if (handle != 0)
        {
            return;
        } else
        {
            int ai[] = new int[1];
            GLES20.glGenFramebuffers(1, ai, 0);
            handle = ai[0];
            return;
        }
    }

    void Bind()
    {
        GLES20.glBindFramebuffer(36160, handle);
    }

    void Deactivate()
    {
        if (handle != 0)
        {
            GLES20.glDeleteFramebuffers(1, new int[] {
                handle
            }, 0);
        }
        handle = 0;
    }

    void Unbind()
    {
        GLES20.glBindFramebuffer(36160, 0);
    }
}
