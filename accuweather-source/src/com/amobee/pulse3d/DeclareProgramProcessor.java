// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, ShaderResource, Pulse3DView, Pulse3DJavaScriptInterface, 
//            Log, BufferViewIterator

class DeclareProgramProcessor extends NativeCommandProcessor
{

    ArrayList attributes_;
    int fragmentHandle_;
    ArrayList samplers_;
    ArrayList uniforms_;
    int vertexHandle_;
    Pulse3DView viewController_;

    public DeclareProgramProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
        uniforms_ = null;
        attributes_ = null;
        samplers_ = null;
    }

    void execute()
    {
        ShaderResource shaderresource;
        int i;
        int j;
        int k;
        shaderresource = new ShaderResource();
        viewController_.resources.add(shaderresource);
        j = viewController_.resources.indexOf(shaderresource);
        k = serial_;
        i = 0;
_L2:
        if (i >= uniforms_.size())
        {
            break; /* Loop/switch isn't completed */
        }
        shaderresource.uniforms.add(uniforms_.get(i));
        i++;
        if (true) goto _L2; else goto _L1
_L5:
        if (i >= attributes_.size())
        {
            break MISSING_BLOCK_LABEL_267;
        }
        shaderresource.attributes.add(attributes_.get(i));
        i++;
        continue; /* Loop/switch isn't completed */
_L3:
        Exception exception;
        for (; i >= samplers_.size(); i = 0)
        {
            break MISSING_BLOCK_LABEL_142;
        }

        shaderresource.samplers.add(samplers_.get(i));
        i++;
          goto _L3
        try
        {
            shaderresource.fragmentShaderCode = (String)viewController_.resources.get(fragmentHandle_);
            shaderresource.vertexShaderCode = (String)viewController_.resources.get(vertexHandle_);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Log.e("BinInterpreter", "declareProgram json error");
            viewController_.jsInterface3D.reportBackToJS(k, false, (new StringBuilder()).append("").append(Pulse3DJavaScriptInterface.ResultCode.INVALID_VALUE).toString());
        }
        viewController_.jsInterface3D.reportBackToJS(k, true, (new StringBuilder()).append("").append(j).toString());
        return;
_L1:
        i = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        uniforms_ = new ArrayList();
        attributes_ = new ArrayList();
        samplers_ = new ArrayList();
        vertexHandle_ = bufferviewiterator.parseInt();
        fragmentHandle_ = bufferviewiterator.parseInt();
        int l = bufferviewiterator.parseInt();
        for (int i = 0; i < l; i++)
        {
            uniforms_.add(bufferviewiterator.parseAlignedASCIIStringWithLength());
        }

        l = bufferviewiterator.parseInt();
        for (int j = 0; j < l; j++)
        {
            attributes_.add(bufferviewiterator.parseAlignedASCIIStringWithLength());
        }

        l = bufferviewiterator.parseInt();
        for (int k = 0; k < l; k++)
        {
            samplers_.add(bufferviewiterator.parseAlignedASCIIStringWithLength());
        }

    }
}
