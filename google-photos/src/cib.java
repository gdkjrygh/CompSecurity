// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.io.IOException;
import java.io.InputStream;

public class cib
{

    public final cic a;
    int b;

    protected cib(int i, Context context, int j)
    {
        boolean flag;
        if (i == 35633 || i == 35632)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "type must be either GLES20.GL_VERTEX_SHADER or GLES20.GL_FRAGMENT_SHADER");
        a = new cic(j);
        b = a(i, a(context, j));
    }

    protected cib(int i, String s)
    {
        a = new cic(s);
        b = a(35632, s);
    }

    private static int a(int i, String s)
    {
        int j = GLES20.glCreateShader(i);
        if (j == 0)
        {
            s = GLUtils.getEGLErrorString(GLES20.glGetError());
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 49)).append("Could not create shader type: ").append(i).append(" Error: ").append(s).toString());
        }
        GLES20.glShaderSource(j, s);
        GLES20.glCompileShader(j);
        s = new int[1];
        GLES20.glGetShaderiv(j, 35713, s, 0);
        if (s[0] == 0)
        {
            s = GLES20.glGetShaderInfoLog(j);
            GLES20.glDeleteShader(j);
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 37)).append("Could not compile shader ").append(i).append(":").append(s).toString());
        } else
        {
            return j;
        }
    }

    private static String a(Context context, int i)
    {
        context = context.getResources().openRawResource(i);
        String s;
        byte abyte0[] = new byte[context.available()];
        context.read(abyte0);
        s = new String(abyte0);
        b.a(context);
        return s;
        Object obj;
        obj;
        throw new RuntimeException((new StringBuilder(52)).append("Unable to load the shader source with id:").append(i).toString());
        obj;
        b.a(context);
        throw obj;
    }

    public final void a()
    {
        if (b == 0)
        {
            throw new RuntimeException("Shader had destroy() called twice");
        } else
        {
            GLES20.glDeleteShader(b);
            b = 0;
            return;
        }
    }
}
