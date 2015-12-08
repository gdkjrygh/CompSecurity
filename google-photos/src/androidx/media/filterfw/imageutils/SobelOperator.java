// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterfw.imageutils;

import ahs;
import ahv;
import aif;
import ajl;
import java.nio.ByteBuffer;

public class SobelOperator
{

    private ajl a;
    private ajl b;
    private ajl c;
    private ajl d;
    private aif e;
    private final boolean f;

    public SobelOperator(boolean flag)
    {
        f = flag;
        if (f)
        {
            a = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 a1 = -1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, -pix.y));\n  vec4 a2 = -2.0 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, 0.0));\n  vec4 a3 = -1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, +pix.y));\n  vec4 b1 = +1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, -pix.y));\n  vec4 b2 = +2.0 * texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, 0.0));\n  vec4 b3 = +1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, +pix.y));\n  gl_FragColor = 0.5 + (a1 + a2 + a3 + b1 + b2 + b3) / 8.0;\n}\n");
            b = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 a1 = -1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, -pix.y));\n  vec4 a2 = -2.0 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0,    -pix.y));\n  vec4 a3 = -1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, -pix.y));\n  vec4 b1 = +1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, +pix.y));\n  vec4 b2 = +2.0 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0,    +pix.y));\n  vec4 b3 = +1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, +pix.y));\n  gl_FragColor = 0.5 + (a1 + a2 + a3 + b1 + b2 + b3) / 8.0;\n}\n");
            c = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  gl_FragColor = vec4(sqrt(gx.rgb * gx.rgb + gy.rgb * gy.rgb), 1.0);\n}\n");
            d = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  gl_FragColor = vec4((atan(gy.rgb, gx.rgb) + 3.14) / (2.0 * 3.14), 1.0);\n}\n");
            e = aif.a(301, 18);
        }
    }

    private static native boolean sobelOperator(int i, int j, ByteBuffer bytebuffer, ByteBuffer bytebuffer1, ByteBuffer bytebuffer2, ByteBuffer bytebuffer3, ByteBuffer bytebuffer4);

    public final void a(ahv ahv1, ahv ahv2, ahv ahv3, ahv ahv4, ahv ahv5)
    {
        int ai[] = ahv1.l();
        if (f)
        {
            Object obj;
            Object obj1;
            ByteBuffer bytebuffer;
            ByteBuffer bytebuffer1;
            ByteBuffer bytebuffer2;
            if (ahv2 == null)
            {
                obj = ahs.a(e, ai).h();
            } else
            {
                obj = ahv2;
            }
            if (ahv3 == null)
            {
                obj1 = ahs.a(e, ai).h();
            } else
            {
                obj1 = ahv3;
            }
            a.a("pix", new float[] {
                1.0F / (float)ai[0], 1.0F / (float)ai[1]
            });
            b.a("pix", new float[] {
                1.0F / (float)ai[0], 1.0F / (float)ai[1]
            });
            a.a(ahv1, ((ahv) (obj)));
            b.a(ahv1, ((ahv) (obj1)));
            ahv1 = new ahv[2];
            ahv1[0] = obj;
            ahv1[1] = obj1;
            if (ahv4 != null)
            {
                c.a(ahv1, ahv4);
            }
            if (ahv5 != null)
            {
                d.a(ahv1, ahv5);
            }
            if (ahv2 == null)
            {
                ((ahv) (obj)).i();
            }
            if (ahv3 == null)
            {
                ((ahv) (obj1)).i();
            }
        } else
        {
            bytebuffer2 = ahv1.a(1);
            if (ahv4 != null)
            {
                obj = ahv4.a(2);
            } else
            {
                obj = null;
            }
            if (ahv5 != null)
            {
                obj1 = ahv5.a(2);
            } else
            {
                obj1 = null;
            }
            if (ahv2 != null)
            {
                bytebuffer = ahv2.a(2);
            } else
            {
                bytebuffer = null;
            }
            if (ahv3 != null)
            {
                bytebuffer1 = ahv3.a(2);
            } else
            {
                bytebuffer1 = null;
            }
            sobelOperator(ahv1.m(), ahv1.n(), bytebuffer2, ((ByteBuffer) (obj)), ((ByteBuffer) (obj1)), bytebuffer, bytebuffer1);
            ahv1.k();
            if (ahv4 != null)
            {
                ahv4.k();
            }
            if (ahv5 != null)
            {
                ahv5.k();
            }
            if (ahv2 != null)
            {
                ahv2.k();
            }
            if (ahv3 != null)
            {
                ahv3.k();
                return;
            }
        }
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
