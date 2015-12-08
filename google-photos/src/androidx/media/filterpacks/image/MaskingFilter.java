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
import ajz;
import java.nio.ByteBuffer;

public class MaskingFilter extends ahn
{

    private static final String mMaskingSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord) *\ntexture2D(tex_sampler_1, v_texcoord);\n}\n";
    private aif mImageType;
    private ajl mMaskingShader;

    public MaskingFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private static native boolean applyMask(int i, int j, ByteBuffer bytebuffer, ByteBuffer bytebuffer1, ByteBuffer bytebuffer2);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 2);
        aif aif3 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("mask", 2, aif2).b("image", 2, aif3).a();
    }

    protected final void c()
    {
        if (r())
        {
            mMaskingShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord) *\ntexture2D(tex_sampler_1, v_texcoord);\n}\n");
            mImageType = aif.a(301, 18);
        }
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahv ahv2 = a("mask").a().h();
        ahv ahv3 = aju1.a(ahv1.l()).h();
        if (r())
        {
            ahv2.o().b(10240, 9728);
            ahv2.k();
            if (ahv3 != null)
            {
                mMaskingShader.a(new ahv[] {
                    ahv1, ahv2
                }, ahv3);
            }
            ahv2.o().d();
            ahv2.k();
        } else
        {
            ByteBuffer bytebuffer = ahv1.a(1);
            ByteBuffer bytebuffer1 = ahv2.a(1);
            ByteBuffer bytebuffer2 = ahv3.a(2);
            applyMask(ahv1.m(), ahv1.n(), bytebuffer, bytebuffer1, bytebuffer2);
            ahv1.k();
            ahv2.k();
            ahv3.k();
        }
        if (ahv3 != null)
        {
            aju1.a(ahv3);
        }
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
