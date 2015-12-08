// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageSkinCheckFilter extends GPUImageFilter
{

    public static final String SKINCHECK_FRAGMENT_SHADER = " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float r = textureColor.r;    lowp float g = textureColor.g;    lowp float b = textureColor.b;   if ((r > 95.0/255.0 && g > 40.0/255.0 && b >20.0/255.0         && (r > b))                                 ){      gl_FragColor = textureColor;      } else {               gl_FragColor = vec4(0, 0, 0, 0);          } }";

    public GPUImageSkinCheckFilter()
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float r = textureColor.r;    lowp float g = textureColor.g;    lowp float b = textureColor.b;   if ((r > 95.0/255.0 && g > 40.0/255.0 && b >20.0/255.0         && (r > b))                                 ){      gl_FragColor = textureColor;      } else {               gl_FragColor = vec4(0, 0, 0, 0);          } }");
    }

    public void onInit()
    {
        super.onInit();
    }

    public void onInitialized()
    {
        super.onInitialized();
    }
}
