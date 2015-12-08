// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.opengl.GLES20;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            GLException

class Shader
    implements Closeable
{

    private int id;

    public Shader(int i, String s)
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Creating new shader").toString());
        }
        i = GLES20.glCreateShader(i);
        id = i;
        if (i == 0)
        {
            try
            {
                throw new GLException("Failed to create shader.", GLES20.glGetError());
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Constructor failed").toString());
            }
            close();
            throw s;
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Shader ").append(id).append(" created").toString());
        }
        loadSourceCode(s);
        compile();
        return;
    }

    private void compile()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Compiling shader ").append(id).toString());
        }
        GLES20.glCompileShader(id);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Shader ").append(id).append(" compiled").toString());
        }
        int i = GLES20.glGetError();
        if (i != 0)
        {
            throw new GLException("Failed to compile shader.", i);
        } else
        {
            return;
        }
    }

    private void loadSourceCode(String s)
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Loading shader ").append(id).append(" source code\n").append(s).toString());
        }
        GLES20.glShaderSource(id, s);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Shader ").append(id).append(" source code loaded").toString());
        }
        int i = GLES20.glGetError();
        if (i != 0)
        {
            throw new GLException("Failed to load shader code.", i);
        } else
        {
            return;
        }
    }

    public void close()
    {
        if (id != 0)
        {
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Deleting shader ").append(id).toString());
            }
            GLES20.glDeleteShader(id);
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Shader ").append(id).append(" deleted").toString());
            }
            if (GLES20.glGetError() != 0 && Log.isLoggable("SLIQ", 5))
            {
                Log.w("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Failed to delete shader ").append(id).toString());
            }
            id = 0;
        }
    }

    public int getId()
    {
        return id;
    }
}
