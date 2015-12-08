// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;


// Referenced classes of package jp.co.cyberagent.android.a:
//            ae

public final class s extends ae
{

    private int E;
    private int F;

    public s()
    {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\nvarying highp vec2 textureCoordinate3;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform sampler2D inputImageTexture3;\n uniform lowp float alpha; uniform int useMaskTexture; \n void main()\n {\n lowp vec4 base = texture2D(inputImageTexture, textureCoordinate);\n lowp vec4 overlay = texture2D(inputImageTexture2, textureCoordinate2);\n lowp vec4 alpha1 = texture2D(inputImageTexture3, textureCoordinate3);\n gl_FragColor = vec4(mix(base.rgb, overlay.rgb, (alpha1.r + alpha1.g + alpha1.b)/3.0), 1);\n }");
        E = 0;
        F = -1;
    }

    protected final void a()
    {
        super.a();
        if (D != -1)
        {
            E = 1;
            return;
        } else
        {
            E = 0;
            return;
        }
    }

    public final void c()
    {
        super.c();
        o = 1.0F;
        E = 0;
    }

    public final void d()
    {
        super.d();
        e(o);
    }

    public final void e(float f)
    {
        o = f;
        a(e, f);
    }
}
