// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.opengl.GLES20;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            GLException, Shader

class Program
    implements Closeable
{

    private Shader fragmentShader;
    private int id;
    private Shader vertexShader;

    public Program(String s, String s1)
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Creating new GL program ").toString());
        }
        int i = GLES20.glCreateProgram();
        id = i;
        if (i == 0)
        {
            throw new GLException("Failed to create GL program.", GLES20.glGetError());
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": GL program ").append(id).append(" created").toString());
        }
        vertexShader = new Shader(35633, s);
        fragmentShader = new Shader(35632, s1);
        attachShader(vertexShader);
        attachShader(fragmentShader);
        link();
    }

    private void attachShader(Shader shader)
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Attaching shader ").append(shader.getId()).append(" to GL program ").append(id).toString());
        }
        GLES20.glAttachShader(id, shader.getId());
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Shader ").append(shader.getId()).append(" attached to GL program ").append(id).toString());
        }
        int i = GLES20.glGetError();
        if (i != 0)
        {
            throw new GLException((new StringBuilder("Failed to attach shader")).append(shader.getId()).append(" to GL program ").append(id).toString(), i);
        } else
        {
            return;
        }
    }

    private void link()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Linking GL program ").append(id).toString());
        }
        GLES20.glLinkProgram(id);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": GL program ").append(id).append(" linkled").toString());
        }
        int ai[] = new int[1];
        GLES20.glGetProgramiv(id, 35714, ai, 0);
        if (ai[0] != 1)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder("Failed to link GL program ")).append(id).append("\n").append(GLES20.glGetProgramInfoLog(id)).toString());
            }
            throw new GLException((new StringBuilder("Failed to link GL program")).append(id).toString());
        } else
        {
            return;
        }
    }

    public void close()
    {
        if (vertexShader != null)
        {
            vertexShader.close();
            vertexShader = null;
        }
        if (fragmentShader != null)
        {
            fragmentShader.close();
            fragmentShader = null;
        }
        if (id != 0)
        {
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Deleting GL program ").append(id).toString());
            }
            GLES20.glDeleteProgram(id);
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": GL program ").append(id).append(" deleted").toString());
            }
            if (GLES20.glGetError() != 0 && Log.isLoggable("SLIQ", 5))
            {
                Log.w("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Failed to delete GL program ").append(id).toString());
            }
            id = 0;
        }
    }

    public int getAttribLocation(String s)
        throws GLException
    {
        int i = GLES20.glGetAttribLocation(id, s);
        if (i < 0)
        {
            throw new GLException((new StringBuilder("Failed get location of the attribute '")).append(s).append("' within GL program ").append(id).toString());
        } else
        {
            return i;
        }
    }

    public int getUniformLocation(String s)
        throws GLException
    {
        int i = GLES20.glGetUniformLocation(id, s);
        if (i < 0)
        {
            throw new GLException((new StringBuilder("Failed get location of the uniform '")).append(s).append("' within GL program ").append(id).toString());
        } else
        {
            return i;
        }
    }

    public void install()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Installing GL program ").append(id).toString());
        }
        GLES20.glUseProgram(id);
        int i = GLES20.glGetError();
        if (i != 0)
        {
            throw new GLException((new StringBuilder("Failed install GL program ")).append(id).toString(), i);
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": GL program ").append(id).append(" installed").toString());
        }
    }
}
