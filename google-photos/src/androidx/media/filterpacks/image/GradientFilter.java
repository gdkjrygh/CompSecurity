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

public class GradientFilter extends ahn
{

    private static final String mDirectionSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  gl_FragColor = vec4((atan(gy.rgb, gx.rgb) + 3.14) / (2.0 * 3.14), 1.0);\n}\n";
    private static final String mGradientXSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 cr = texture2D(tex_sampler_0, v_texcoord);\n  vec4 right = texture2D(tex_sampler_0, v_texcoord + vec2(pix.x, 0));\n  gl_FragColor = 0.5 + (right - cr) / 2.0;\n}\n";
    private static final String mGradientYSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 cr = texture2D(tex_sampler_0, v_texcoord);\n  vec4 down = texture2D(tex_sampler_0, v_texcoord + vec2(0, pix.y));\n  gl_FragColor = 0.5 + (down - cr) / 2.0;\n}\n";
    private static final String mMagnitudeSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  gl_FragColor = vec4(sqrt(gx.rgb * gx.rgb + gy.rgb * gy.rgb), 1.0);\n}\n";
    private ajl mDirectionShader;
    private ajl mGradientXShader;
    private ajl mGradientYShader;
    private aif mImageType;
    private ajl mMagnitudeShader;

    public GradientFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private static native boolean gradientOperator(int i, int j, ByteBuffer bytebuffer, ByteBuffer bytebuffer1, ByteBuffer bytebuffer2, ByteBuffer bytebuffer3, ByteBuffer bytebuffer4);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).b("gradientX", 1, aif2).b("gradientY", 1, aif2).b("direction", 1, aif2).b("magnitude", 1, aif2).a();
    }

    protected final void c()
    {
        if (r())
        {
            mGradientXShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 cr = texture2D(tex_sampler_0, v_texcoord);\n  vec4 right = texture2D(tex_sampler_0, v_texcoord + vec2(pix.x, 0));\n  gl_FragColor = 0.5 + (right - cr) / 2.0;\n}\n");
            mGradientYShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 cr = texture2D(tex_sampler_0, v_texcoord);\n  vec4 down = texture2D(tex_sampler_0, v_texcoord + vec2(0, pix.y));\n  gl_FragColor = 0.5 + (down - cr) / 2.0;\n}\n");
            mMagnitudeShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  gl_FragColor = vec4(sqrt(gx.rgb * gx.rgb + gy.rgb * gy.rgb), 1.0);\n}\n");
            mDirectionShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  gl_FragColor = vec4((atan(gy.rgb, gx.rgb) + 3.14) / (2.0 * 3.14), 1.0);\n}\n");
            mImageType = aif.a(301, 18);
        }
    }

    protected final void d()
    {
        super.d();
        if (super.mConnectedOutputPortArray.length == 0)
        {
            throw new IllegalStateException("Gradient Filter has no output port!");
        } else
        {
            return;
        }
    }

    protected final void e()
    {
        aju aju1 = b("gradientX");
        aju aju2 = b("gradientY");
        aju aju3 = b("magnitude");
        aju aju4 = b("direction");
        ahv ahv5 = a("image").a().h();
        Object aobj[] = ahv5.l();
        ahv ahv1;
        ahv ahv2;
        ahv ahv3;
        ahv ahv4;
        Object obj;
        Object obj1;
        if (aju3 != null)
        {
            ahv3 = aju3.a(((int []) (aobj))).h();
        } else
        {
            ahv3 = null;
        }
        if (aju4 != null)
        {
            ahv4 = aju4.a(((int []) (aobj))).h();
        } else
        {
            ahv4 = null;
        }
        if (aju1 != null)
        {
            ahv2 = aju1.a(((int []) (aobj))).h();
        } else
        {
            ahv2 = null;
        }
        if (aju2 != null)
        {
            ahv1 = aju2.a(((int []) (aobj))).h();
        } else
        {
            ahv1 = null;
        }
        if (r())
        {
            mGradientXShader.a("pix", new float[] {
                1.0F / (float)aobj[0], 1.0F / (float)aobj[1]
            });
            mGradientYShader.a("pix", new float[] {
                1.0F / (float)aobj[0], 1.0F / (float)aobj[1]
            });
            if (aju1 == null)
            {
                ahv2 = ahs.a(mImageType, ((int []) (aobj))).h();
            }
            if (aju2 == null)
            {
                ahv1 = ahs.a(mImageType, ((int []) (aobj))).h();
            }
            mGradientXShader.a(ahv5, ahv2);
            mGradientYShader.a(ahv5, ahv1);
            aobj = new ahv[2];
            aobj[0] = ahv2;
            aobj[1] = ahv1;
            if (aju3 != null)
            {
                mMagnitudeShader.a(((ahv []) (aobj)), ahv3);
            }
            if (aju4 != null)
            {
                mDirectionShader.a(((ahv []) (aobj)), ahv4);
            }
            if (aju1 == null)
            {
                ahv2.i();
            }
            obj = ahv2;
            obj1 = ahv1;
            if (aju2 == null)
            {
                ahv1.i();
                obj1 = ahv1;
                obj = ahv2;
            }
        } else
        {
            ByteBuffer bytebuffer2 = ahv5.a(1);
            ByteBuffer bytebuffer;
            ByteBuffer bytebuffer1;
            if (ahv3 != null)
            {
                obj = ahv3.a(2);
            } else
            {
                obj = null;
            }
            if (ahv4 != null)
            {
                obj1 = ahv4.a(2);
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
            if (ahv1 != null)
            {
                bytebuffer1 = ahv1.a(2);
            } else
            {
                bytebuffer1 = null;
            }
            gradientOperator(ahv5.m(), ahv5.n(), bytebuffer2, ((ByteBuffer) (obj)), ((ByteBuffer) (obj1)), bytebuffer, bytebuffer1);
            ahv5.k();
            if (ahv3 != null)
            {
                ahv3.k();
            }
            if (ahv4 != null)
            {
                ahv4.k();
            }
            if (ahv2 != null)
            {
                ahv2.k();
            }
            if (ahv1 != null)
            {
                ahv1.k();
            }
            obj = ahv2;
            obj1 = ahv1;
        }
        if (ahv3 != null)
        {
            aju3.a(ahv3);
        }
        if (ahv4 != null)
        {
            aju4.a(ahv4);
        }
        if (aju1 != null)
        {
            aju1.a(((ahs) (obj)));
        }
        if (aju2 != null)
        {
            aju2.a(((ahs) (obj1)));
        }
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
