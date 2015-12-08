// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            RenderResource, Log, Pulse3DGLRenderer

class ShaderResource extends RenderResource
{

    public ArrayList attributes;
    public String fragmentShaderCode;
    public int fragmentShaderHandle;
    private int sampler_location_vector[];
    public ArrayList samplers;
    private int uniform_location_vector[];
    public ArrayList uniforms;
    public String vertexShaderCode;
    public int vertextShaderHandle;

    ShaderResource()
    {
        uniforms = new ArrayList();
        attributes = new ArrayList();
        samplers = new ArrayList();
        vertextShaderHandle = 0;
        fragmentShaderHandle = 0;
    }

    void Activate()
    {
        if (handle != 0)
        {
            Log.e("!!!!!!!", "PROGRAM ALREADY ACTIVATED!!");
            return;
        }
        vertextShaderHandle = Pulse3DGLRenderer.loadShader(35633, vertexShaderCode);
        fragmentShaderHandle = Pulse3DGLRenderer.loadShader(35632, fragmentShaderCode);
        handle = GLES20.glCreateProgram();
        Pulse3DGLRenderer.er();
        GLES20.glAttachShader(handle, vertextShaderHandle);
        Pulse3DGLRenderer.er();
        GLES20.glAttachShader(handle, fragmentShaderHandle);
        Pulse3DGLRenderer.er();
        for (int i = 0; i < attributes.size(); i++)
        {
            String s = (String)attributes.get(i);
            GLES20.glBindAttribLocation(handle, i, s);
            Pulse3DGLRenderer.er();
        }

        GLES20.glLinkProgram(handle);
        int ai[] = new int[1];
        GLES20.glGetProgramiv(handle, 35716, ai, 0);
        if (ai[0] > 0)
        {
            Log.d("GLProgram", (new StringBuilder()).append("Program link log: ").append("skip log reading, not needed and causes crash on emulator").toString());
        }
        ai = new int[1];
        GLES20.glGetProgramiv(handle, 35714, ai, 0);
        if (ai[0] == 0)
        {
            GLES20.glDeleteProgram(handle);
            Log.d("GLProgram", "bad program, deleted");
        }
        uniform_location_vector = new int[uniforms.size()];
        for (int j = 0; j < uniforms.size(); j++)
        {
            String s1 = (String)uniforms.get(j);
            int i1 = GLES20.glGetUniformLocation(handle, s1);
            uniform_location_vector[j] = i1;
            Pulse3DGLRenderer.er();
        }

        sampler_location_vector = new int[samplers.size()];
        for (int k = 0; k < samplers.size(); k++)
        {
            String s2 = (String)samplers.get(k);
            int j1 = GLES20.glGetUniformLocation(handle, s2);
            sampler_location_vector[k] = j1;
            Pulse3DGLRenderer.er();
        }

        GLES20.glUseProgram(handle);
        Pulse3DGLRenderer.er();
        for (int l = 0; l < sampler_location_vector.length; l++)
        {
            GLES20.glUniform1i(sampler_location_vector[l], l);
            Pulse3DGLRenderer.er();
        }

        GLES20.glUseProgram(0);
    }

    void Bind()
    {
        GLES20.glUseProgram(handle);
    }

    void Deactivate()
    {
        if (handle != 0)
        {
            GLES20.glDeleteProgram(handle);
        }
        handle = 0;
    }

    void Unbind()
    {
        GLES20.glUseProgram(0);
    }

    public String getUniformLocations()
    {
        String s = "{";
        int j = uniforms.size();
        for (int i = 0; i < j; i++)
        {
            String s2 = (String)uniforms.get(i);
            String s1 = (new StringBuilder()).append(s).append("\"").append(s2).append("\":").append(uniform_location_vector[i]).toString();
            s = s1;
            if (i < j - 1)
            {
                s = (new StringBuilder()).append(s1).append(",").toString();
            }
            Log.d("GLProgram", (new StringBuilder()).append("Uniform ").append(s2).append(" is at location ").append(uniform_location_vector[i]).toString());
        }

        return (new StringBuilder()).append(s).append("}").toString();
    }
}
