// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterfw.imageutils;

import ahs;
import ahu;
import ahv;
import aif;
import ajl;
import ajz;
import ako;
import b;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class GrayValuesExtractor
{

    private ajl a;
    private final boolean b;

    public GrayValuesExtractor(boolean flag)
    {
        b = flag;
        if (b)
        {
            a = new ajl("precision mediump float;\nconst vec4 coeff_y = vec4(0.299, 0.587, 0.114, 0);\nuniform sampler2D tex_sampler_0;\nuniform float pix_stride;\nvarying vec2 v_texcoord;\nvoid main() {\n  for (int i = 0; i < 4; i++) {\n  vec4 p = texture2D(tex_sampler_0,\n                       v_texcoord + vec2(pix_stride * (float(i) - 1.5), 0.0));\n    gl_FragColor[i] = dot(p, coeff_y);\n  }\n}\n");
        }
    }

    private static native boolean toGrayValues(ByteBuffer bytebuffer, ByteBuffer bytebuffer1);

    public final void a(ahv ahv1, ahu ahu1)
    {
        int ai[] = a(ahv1.l());
        if (!Arrays.equals(ahu1.l(), ai))
        {
            throw new IllegalArgumentException("Invalid dimensions of the output frame for gray values.");
        }
        if (ahu1.a().a != 100)
        {
            throw new IllegalArgumentException("Invalid type of output buffer.");
        }
        ByteBuffer bytebuffer = ahu1.a(2);
        if (b)
        {
            int ai1[] = new int[2];
            ai1[0] = ai[0] / 4;
            ai1[1] = ai[1];
            ahv ahv2 = ahs.a(aif.a(301, 2), ai1).h();
            a.a(ako.a(0.0F, 0.0F, (float)ai[0] / (float)ahv1.m(), 1.0F));
            a.a("pix_stride", 1.0F / (float)ai[0]);
            ahv1.o().b(10240, 9728);
            ahv1.k();
            a.a(ahv1, ahv2);
            ahv1.o().d();
            ahv1.k();
            b.a(ahv2.p(), bytebuffer, ai1[0], ai1[1]);
            ahv2.k();
            ahv2.i();
        } else
        {
            if (!toGrayValues(ahv1.a(1), bytebuffer))
            {
                throw new RuntimeException("Native implementation encountered an error during processing!");
            }
            ahv1.k();
        }
        ahu1.k();
    }

    public final int[] a(int ai[])
    {
        int ai1[] = ai;
        if (b)
        {
            int i = ai[0];
            ai1 = (new int[] {
                ai[0] - i % 4, ai[1]
            });
        }
        return ai1;
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
