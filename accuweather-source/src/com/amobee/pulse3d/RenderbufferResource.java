// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            RenderResource

public class RenderbufferResource extends RenderResource
{

    int format_;
    int x_;
    int y_;

    RenderbufferResource(int i, int j, int k)
    {
        format_ = k;
        x_ = i;
        y_ = j;
    }

    void Activate()
    {
        if (handle != 0)
        {
            return;
        } else
        {
            int ai[] = new int[1];
            GLES20.glGenRenderbuffers(1, ai, 0);
            GLES20.glBindRenderbuffer(36161, ai[0]);
            handle = ai[0];
            GLES20.glRenderbufferStorage(36161, format_, x_, y_);
            GLES20.glBindRenderbuffer(36161, 0);
            return;
        }
    }

    void Bind()
    {
        GLES20.glBindRenderbuffer(36161, handle);
    }

    void Deactivate()
    {
        if (handle != 0)
        {
            GLES20.glDeleteTextures(1, new int[] {
                handle
            }, 0);
        }
        handle = 0;
    }

    public void Resize(int i, int j)
    {
        Deactivate();
        x_ = i;
        y_ = j;
        Activate();
    }

    void Unbind()
    {
        GLES20.glBindRenderbuffer(36161, 0);
    }
}
