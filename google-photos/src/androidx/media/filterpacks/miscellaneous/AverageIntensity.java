// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.miscellaneous;

import ahn;
import ahs;
import ahv;
import aif;
import aig;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import ako;
import android.graphics.PointF;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public final class AverageIntensity extends ahn
{

    private static int mBinHeight = 2;
    private static int mBinWidth = 2;
    private static int mBins;
    private final String mFragShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n    gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n";
    private int mHistogram[];
    private ako mQuad;
    private ajl mShader;

    public AverageIntensity(ajr ajr, String s)
    {
        super(ajr, s);
        mQuad = ako.a(0.0F, 0.0F, 1.0F, 1.0F);
    }

    private native void averageIntensity(ByteBuffer bytebuffer, IntBuffer intbuffer, int i, int j, int k, int l);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 1);
        return (new ajw()).a("image", 2, aif1).a("wnum", 1, aif.a(Integer.TYPE)).a("hnum", 1, aif.a(Integer.TYPE)).a("targetQuad", 1, aif.a(ako)).b("histogram", 2, aif.b(Integer.TYPE)).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("wnum"))
        {
            ajo1.a("mBinWidth");
            ajo1.g = true;
        }
        if (ajo1.b.equals("hnum"))
        {
            ajo1.a("mBinHeight");
            ajo1.g = true;
        }
        if (ajo1.b.equals("targetQuad"))
        {
            ajo1.a("mQuad");
            ajo1.g = true;
        }
    }

    protected final void c()
    {
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n    gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
    }

    protected final void e()
    {
        Object obj = a("image").a().h();
        int ai[] = ((ahv) (obj)).l();
        int i = ai[0];
        int k = ai[1];
        Log.e("AverageIntensity", (new StringBuilder(36)).append("width ").append(i).append(" height ").append(k).toString());
        ai[0] = Math.round((float)ai[0] * mQuad.c().length());
        ai[1] = Math.round((float)ai[1] * mQuad.d().length());
        ahv ahv1 = ahs.a(aif.a(301, 18), ai).h();
        mShader.a(mQuad);
        mShader.a(((ahv) (obj)), ahv1);
        i = ai[0];
        k = ai[1];
        Log.e("AverageIntensity", (new StringBuilder(36)).append("width ").append(i).append(" height ").append(k).toString());
        mBins = mBinWidth * mBinHeight;
        mHistogram = new int[mBins];
        obj = ByteBuffer.allocateDirect(mBins << 2);
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        obj = ((ByteBuffer) (obj)).asIntBuffer();
        ByteBuffer bytebuffer = ahv1.a(1);
        averageIntensity(bytebuffer, ((IntBuffer) (obj)), ai[0], ai[1], mBinWidth, mBinHeight);
        bytebuffer.rewind();
        ahv1.k();
        ((IntBuffer) (obj)).rewind();
        for (int j = 0; j < mBins; j++)
        {
            mHistogram[j] = ((IntBuffer) (obj)).get();
        }

        aju aju1 = b("histogram");
        obj = aju1.a(null).e();
        ((aig) (obj)).a(mHistogram);
        aju1.a(((ahs) (obj)));
        ahv1.i();
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
