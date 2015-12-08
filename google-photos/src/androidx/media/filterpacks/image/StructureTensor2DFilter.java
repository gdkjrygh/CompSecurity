// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;

public class StructureTensor2DFilter extends ahn
{

    private static final String mStructuredTensorSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  float dx = texture2D(tex_sampler_0, v_texcoord).r * 2.0 - 1.0;\n  float dy = texture2D(tex_sampler_1, v_texcoord).r * 2.0 - 1.0;\n  float dx2 = (dx * dx) * 0.5 + 0.5;\n  float dy2 = (dy * dy) * 0.5 + 0.5;\n  float dxy = (dx * dy) * 0.5 + 0.5;\n  gl_FragColor = vec4(dx2, dy2, dxy, 1.0);\n}\n";
    private ajl mStructuredTensorShader;

    public StructureTensor2DFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private static native boolean constructStructureTensor(int i, int j, ByteBuffer bytebuffer, ByteBuffer bytebuffer1, ByteBuffer bytebuffer2);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 2);
        aif aif3 = aif.a(301, 16);
        return (new ajw()).a("dx", 2, aif1).a("dy", 2, aif2).b("image", 2, aif3).a();
    }

    protected final void c()
    {
        if (r())
        {
            mStructuredTensorShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  float dx = texture2D(tex_sampler_0, v_texcoord).r * 2.0 - 1.0;\n  float dy = texture2D(tex_sampler_1, v_texcoord).r * 2.0 - 1.0;\n  float dx2 = (dx * dx) * 0.5 + 0.5;\n  float dy2 = (dy * dy) * 0.5 + 0.5;\n  float dxy = (dx * dy) * 0.5 + 0.5;\n  gl_FragColor = vec4(dx2, dy2, dxy, 1.0);\n}\n");
        }
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("dx").a().h();
        ahv ahv2 = a("dy").a().h();
        ahv ahv3 = aju1.a(ahv1.l()).h();
        if (r())
        {
            mStructuredTensorShader.a(new ahv[] {
                ahv1, ahv2
            }, ahv3);
        } else
        {
            ByteBuffer bytebuffer = ahv1.a(1);
            ByteBuffer bytebuffer1 = ahv2.a(1);
            ByteBuffer bytebuffer2 = ahv3.a(2);
            constructStructureTensor(ahv1.m(), ahv1.n(), bytebuffer, bytebuffer1, bytebuffer2);
            ahv1.k();
            ahv2.k();
            ahv3.k();
        }
        aju1.a(ahv3);
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
