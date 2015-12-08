// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterfw.imageutils;

import ahs;
import ahv;
import aif;
import ajl;
import java.nio.ByteBuffer;

public class FastBoxBlur
{

    private ajl a;
    private ajl b;
    private ajl c;
    private aif d;
    private final int e;
    private final int f;
    private final boolean g;

    public FastBoxBlur(boolean flag, int i, int j)
    {
        g = flag;
        e = i;
        f = j;
        if (g)
        {
            if (e > 1)
            {
                a = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float pix;\nuniform float pixel_weight;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 sum_color = vec4(0.0); \n  for (int i = -$$filter_radius_width$$; i <= $$filter_radius_width$$; i++) {\n    sum_color += texture2D(tex_sampler_0, \n        v_texcoord + vec2(pix * float(i), 0));\n  }\n  gl_FragColor = sum_color * pixel_weight;\n}\n".replaceAll("\\$\\$filter_radius_width\\$\\$", String.valueOf(e >> 1)));
            }
            if (f > 1)
            {
                b = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float pix;\nuniform float pixel_weight;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 sum_color = vec4(0.0);\n  for (int j = -$$filter_radius_height$$; j <= $$filter_radius_height$$; j++) {\n    sum_color += texture2D(tex_sampler_0, \n        v_texcoord + vec2(0, pix * float(j)));\n  }\n  gl_FragColor = sum_color * pixel_weight;\n}\n".replaceAll("\\$\\$filter_radius_height\\$\\$", String.valueOf(f >> 1)));
            }
            d = aif.a(301, 18);
            c = ajl.a();
        }
    }

    private static native boolean blur(int i, int j, int k, int l, ByteBuffer bytebuffer, ByteBuffer bytebuffer1);

    public final void a(ahv ahv1, ahv ahv2)
    {
        int ai[] = ahv1.l();
        if (g)
        {
            if (b != null)
            {
                b.a("pix", 1.0F / (float)ai[1]);
                b.a("pixel_weight", 1.0F / (float)f);
            }
            if (a != null)
            {
                a.a("pix", 1.0F / (float)ai[0]);
                a.a("pixel_weight", 1.0F / (float)e);
            }
            if (f == 1 && e == 1)
            {
                c.a(ahv1, ahv2);
                return;
            }
            if (f > 1 && e == 1)
            {
                b.a(ahv1, ahv2);
                return;
            }
            if (f == 1 && e > 1)
            {
                a.a(ahv1, ahv2);
                return;
            } else
            {
                ahv ahv3 = ahs.a(d, ai).h();
                b.a(ahv1, ahv3);
                a.a(ahv3, ahv2);
                ahv3.i();
                return;
            }
        } else
        {
            ByteBuffer bytebuffer = ahv1.a(1);
            ByteBuffer bytebuffer1 = ahv2.a(2);
            blur(ahv1.m(), ahv1.n(), e, f, bytebuffer, bytebuffer1);
            ahv1.k();
            ahv2.k();
            return;
        }
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
