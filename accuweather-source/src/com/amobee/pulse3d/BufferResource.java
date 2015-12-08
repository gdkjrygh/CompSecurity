// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

// Referenced classes of package com.amobee.pulse3d:
//            RenderResource, Log, Pulse3DGLRenderer

class BufferResource extends RenderResource
{

    static String TAG = "Pulse3d_GLBuffer";
    public Object o;
    public int target;

    BufferResource()
    {
        o = null;
        target = 0;
    }

    void Activate()
    {
        if (handle != 0)
        {
            Log.d("!!!!!!", (new StringBuilder()).append("Buffer ").append(handle).append(" already activated").toString());
            return;
        }
        int ai[] = new int[1];
        GLES20.glGenBuffers(1, ai, 0);
        if (o instanceof ShortBuffer)
        {
            ShortBuffer shortbuffer = (ShortBuffer)o;
            GLES20.glBindBuffer(34963, ai[0]);
            Pulse3DGLRenderer.er();
            GLES20.glBufferData(34963, shortbuffer.capacity() * 2, shortbuffer, 35044);
            Pulse3DGLRenderer.er();
            GLES20.glBindBuffer(34963, 0);
            target = 34963;
        } else
        if (o instanceof FloatBuffer)
        {
            FloatBuffer floatbuffer = (FloatBuffer)o;
            GLES20.glBindBuffer(34962, ai[0]);
            Pulse3DGLRenderer.er();
            GLES20.glBufferData(34962, floatbuffer.capacity() * 4, floatbuffer, 35044);
            Pulse3DGLRenderer.er();
            GLES20.glBindBuffer(34962, 0);
            Pulse3DGLRenderer.er();
            target = 34962;
        } else
        {
            Log.e(TAG, "activateBuffer error!!");
        }
        handle = ai[0];
    }

    void Bind()
    {
        GLES20.glBindBuffer(target, handle);
    }

    void Deactivate()
    {
        if (handle != 0)
        {
            GLES20.glDeleteBuffers(1, new int[] {
                handle
            }, 0);
        }
        handle = 0;
    }

    void Unbind()
    {
        Log.d("GLTexture", (new StringBuilder()).append("UNBIND  buffer with handle").append(handle).toString());
        GLES20.glBindBuffer(target, 0);
    }

}
