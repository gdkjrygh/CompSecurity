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

public class HarrisCornerFilter extends ahn
{

    private static final float CORNER_STRENGTH_THRESHOLD = 0.0006F;
    private static final String mCornerStrengthSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  float Ix2 = texture2D(tex_sampler_0, v_texcoord).r * 2.0 - 1.0;\n  float Iy2 = texture2D(tex_sampler_0, v_texcoord).g * 2.0 - 1.0;\n  float Ixy = texture2D(tex_sampler_0, v_texcoord).b * 2.0 - 1.0;\n  float response = (Ix2 * Iy2 - Ixy * Ixy) / (Ix2 + Iy2 + 0.0000001) ;\n  gl_FragColor = vec4(response, response, response, 1.0);\n}\n";
    private static final String mNonMaxSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float threshold;uniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 c = texture2D(tex_sampler_0, v_texcoord);\n  float a1 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(-pix.x, -pix.y)).r < c.r);\n  float a2 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(0.0,    -pix.y)).r < c.r);\n  float a3 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(+pix.x, -pix.y)).r < c.r);\n  float a4 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(-pix.x, 0.0)).r < c.r);\n  float a5 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(+pix.x, 0.0)).r < c.r);\n  float a6 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(-pix.x, +pix.y)).r < c.r);\n  float a7 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(0.0,    +pix.y)).r < c.r);\n  float a8 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(+pix.x, +pix.y)).r < c.r);\n  float localmax = float(threshold < c.r) * a1 * a2 * a3 * a4 * a5 * a6 * a7 * a8;\n  gl_FragColor = vec4(localmax, localmax, localmax, 1.0);\n}\n";
    private ajl mCornerStrengthShader;
    private aif mIntermediateImageType;
    private ajl mNonMaxShader;

    public HarrisCornerFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private static native boolean markCorners(int i, int j, ByteBuffer bytebuffer, ByteBuffer bytebuffer1);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("structureTensor", 2, aif1).b("cornerMap", 2, aif2).a();
    }

    protected final void c()
    {
        if (r())
        {
            mCornerStrengthShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  float Ix2 = texture2D(tex_sampler_0, v_texcoord).r * 2.0 - 1.0;\n  float Iy2 = texture2D(tex_sampler_0, v_texcoord).g * 2.0 - 1.0;\n  float Ixy = texture2D(tex_sampler_0, v_texcoord).b * 2.0 - 1.0;\n  float response = (Ix2 * Iy2 - Ixy * Ixy) / (Ix2 + Iy2 + 0.0000001) ;\n  gl_FragColor = vec4(response, response, response, 1.0);\n}\n");
            mNonMaxShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float threshold;uniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 c = texture2D(tex_sampler_0, v_texcoord);\n  float a1 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(-pix.x, -pix.y)).r < c.r);\n  float a2 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(0.0,    -pix.y)).r < c.r);\n  float a3 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(+pix.x, -pix.y)).r < c.r);\n  float a4 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(-pix.x, 0.0)).r < c.r);\n  float a5 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(+pix.x, 0.0)).r < c.r);\n  float a6 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(-pix.x, +pix.y)).r < c.r);\n  float a7 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(0.0,    +pix.y)).r < c.r);\n  float a8 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(+pix.x, +pix.y)).r < c.r);\n  float localmax = float(threshold < c.r) * a1 * a2 * a3 * a4 * a5 * a6 * a7 * a8;\n  gl_FragColor = vec4(localmax, localmax, localmax, 1.0);\n}\n");
            mIntermediateImageType = aif.a(301, 18);
        }
    }

    protected final void e()
    {
        aju aju1 = b("cornerMap");
        ahv ahv1 = a("structureTensor").a().h();
        int ai[] = ahv1.l();
        ahv ahv2 = aju1.a(ai).h();
        if (r())
        {
            ahv ahv3 = ahs.a(mIntermediateImageType, ai).h();
            mCornerStrengthShader.a(ahv1, ahv3);
            mNonMaxShader.a("pix", new float[] {
                1.0F / (float)ai[0], 1.0F / (float)ai[1]
            });
            mNonMaxShader.a("threshold", 0.0006F);
            mNonMaxShader.a(ahv3, ahv2);
            ahv3.i();
        } else
        {
            ByteBuffer bytebuffer = ahv1.a(1);
            ByteBuffer bytebuffer1 = ahv2.a(2);
            markCorners(ahv1.m(), ahv1.n(), bytebuffer, bytebuffer1);
            ahv1.k();
            ahv2.k();
        }
        aju1.a(ahv2);
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
