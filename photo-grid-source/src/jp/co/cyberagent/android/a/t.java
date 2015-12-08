// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import java.util.List;

// Referenced classes of package jp.co.cyberagent.android.a:
//            am, h

public final class t extends am
{

    private float F;

    public t()
    {
        this(1.0F);
    }

    public t(float f1)
    {
        super("attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n", "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\nvec4 minTriColor(vec2 coord, vec4 baseColor)\n{\n   vec4 minc;\n   vec4 baseColorTop = texture2D(inputImageTexture, centerTextureCoordinate-coord); \n   vec4 baseColorBottom = texture2D(inputImageTexture, centerTextureCoordinate+coord); \n   minc = minColor(baseColorTop, baseColor);\n   minc = minColor(baseColorBottom, minc);\n   return minc;\n}\n\nvoid main()\n{\n   vec2 offsetCoordinate = vec2(texelWidthOffset,texelHeightOffset); \n   vec2 offsetCoordinate2 = vec2(2.0*texelWidthOffset,2.0*texelHeightOffset); \n   vec2 offsetCoordinate3 = vec2(3.0*texelWidthOffset,3.0*texelHeightOffset); \n   vec2 offsetCoordinate4 = vec2(4.0*texelWidthOffset,4.0*texelHeightOffset); \n   vec2 offsetCoordinate5 = vec2(5.0*texelWidthOffset,5.0*texelHeightOffset); \n   vec2 offsetCoordinate6 = vec2(6.0*texelWidthOffset,6.0*texelHeightOffset); \n   //vec2 offsetCoordinate7 = vec2(7.0*texelWidthOffset,7.0*texelHeightOffset); \n   vec4 baseColor = texture2D(inputImageTexture, centerTextureCoordinate); \n   baseColor = minTriColor(offsetCoordinate, baseColor);\n   baseColor = minTriColor(offsetCoordinate2, baseColor);\n   baseColor = minTriColor(offsetCoordinate3, baseColor);\n   baseColor = minTriColor(offsetCoordinate4, baseColor);\n   baseColor = minTriColor(offsetCoordinate5, baseColor);\n   baseColor = minTriColor(offsetCoordinate6, baseColor);\n   //baseColor = minTriColor(offsetCoordinate7, baseColor);\n\n   gl_FragColor = baseColor;\n}\n", "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n", "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\nvec4 minTriColor(vec2 coord, vec4 baseColor)\n{\n   vec4 minc;\n   vec4 baseColorTop = texture2D(inputImageTexture, centerTextureCoordinate-coord); \n   vec4 baseColorBottom = texture2D(inputImageTexture, centerTextureCoordinate+coord); \n   minc = minColor(baseColorTop, baseColor);\n   minc = minColor(baseColorBottom, minc);\n   return minc;\n}\n\nvoid main()\n{\n   vec2 offsetCoordinate = vec2(texelWidthOffset,texelHeightOffset); \n   vec2 offsetCoordinate2 = vec2(2.0*texelWidthOffset,2.0*texelHeightOffset); \n   vec2 offsetCoordinate3 = vec2(3.0*texelWidthOffset,3.0*texelHeightOffset); \n   vec2 offsetCoordinate4 = vec2(4.0*texelWidthOffset,4.0*texelHeightOffset); \n   vec2 offsetCoordinate5 = vec2(5.0*texelWidthOffset,5.0*texelHeightOffset); \n   vec2 offsetCoordinate6 = vec2(6.0*texelWidthOffset,6.0*texelHeightOffset); \n   //vec2 offsetCoordinate7 = vec2(7.0*texelWidthOffset,7.0*texelHeightOffset); \n   vec4 baseColor = texture2D(inputImageTexture, centerTextureCoordinate); \n   baseColor = minTriColor(offsetCoordinate, baseColor);\n   baseColor = minTriColor(offsetCoordinate2, baseColor);\n   baseColor = minTriColor(offsetCoordinate3, baseColor);\n   baseColor = minTriColor(offsetCoordinate4, baseColor);\n   baseColor = minTriColor(offsetCoordinate5, baseColor);\n   baseColor = minTriColor(offsetCoordinate6, baseColor);\n   //baseColor = minTriColor(offsetCoordinate7, baseColor);\n\n   gl_FragColor = baseColor;\n}\n");
        F = 1.0F;
        F = f1;
    }

    public final float f()
    {
        return F;
    }

    public final float g()
    {
        return 1.0F;
    }

    protected final void r()
    {
        h h1 = (h)y.get(0);
        int i = GLES20.glGetUniformLocation(h1.p(), "texelWidthOffset");
        int j = GLES20.glGetUniformLocation(h1.p(), "texelHeightOffset");
        int k = GLES20.glGetUniformLocation(h1.p(), "radius");
        h1.a(i, 1.0F / (float)g);
        h1.a(j, 0.0F);
        h1.a(k, F);
        h1 = (h)y.get(1);
        i = GLES20.glGetUniformLocation(h1.p(), "texelWidthOffset");
        j = GLES20.glGetUniformLocation(h1.p(), "texelHeightOffset");
        k = GLES20.glGetUniformLocation(h1.p(), "radius");
        h1.a(i, 0.0F);
        h1.a(j, 1.0F / (float)h);
        h1.a(k, F);
    }
}
