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
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Vector;

public final class ConvolutionFilter extends ahn
{

    private static final String mConvolutionShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = __CONVOLUTION__;\n}\n";
    private float mMask[];
    private int mMaskHeight;
    private int mMaskWidth;
    private int mOldDim[];
    private float mOldMask[];
    private ajl mShader;

    public ConvolutionFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mMask = null;
        mOldMask = null;
        mOldDim = null;
        mMaskWidth = 0;
        mMaskHeight = 0;
    }

    private String a(int i, int j)
    {
        int l = 0;
        int j1 = (mMaskWidth - 1) / 2;
        int k1 = (mMaskHeight - 1) / 2;
        Vector vector = new Vector();
        for (int k = -k1; k <= k1; k++)
        {
            for (int i1 = -j1; i1 <= j1;)
            {
                float f = (float)i1 / (float)i;
                float f1 = (float)k / (float)j;
                float f2 = mMask[l];
                vector.add((new StringBuilder(112)).append(f2).append(" * texture2D(tex_sampler_0, vec2(v_texcoord.x + ").append(f).append(", v_texcoord.y + ").append(f1).append("))").toString());
                i1++;
                l++;
            }

        }

        return TextUtils.join(" + ", vector);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("mask", 1, aif.b(Float.TYPE)).a("maskWidth", 1, aif.a(Integer.TYPE)).a("maskHeight", 1, aif.a(Integer.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("mask"))
        {
            ajo1.a("mMask");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("maskWidth"))
            {
                ajo1.a("mMaskWidth");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("maskHeight"))
            {
                ajo1.a("mMaskHeight");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        int ai[] = ahv1.l();
        ahv ahv2 = aju1.a(ai).h();
        if (mMask == null)
        {
            throw new NullPointerException("No mask specified!");
        }
        if (!Arrays.equals(mOldMask, mMask) || !Arrays.equals(ai, mOldDim))
        {
            if (mMaskWidth == 0 || mMaskHeight == 0)
            {
                double d = Math.sqrt(mMask.length);
                int i;
                if (d == (double)(int)d)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i == 0)
                {
                    i = mMask.length;
                    throw new IllegalArgumentException((new StringBuilder(55)).append("Illegal mask size ").append(i).append("! Must be power of 2 size!").toString());
                }
                i = (int)Math.sqrt(mMask.length);
                if (i % 2 != 1)
                {
                    i = mMask.length;
                    throw new IllegalArgumentException((new StringBuilder(81)).append("Illegal mask size ").append(i).append("! Each dimension must contain odd number of entries!").toString());
                }
                mMaskWidth = i;
                mMaskHeight = i;
            }
            String s = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = __CONVOLUTION__;\n}\n".replace("__CONVOLUTION__", a(ai[0], ai[1]));
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                "ShaderCode: ".concat(s1);
            } else
            {
                new String("ShaderCode: ");
            }
            mShader = new ajl(s);
            mOldMask = mMask;
            mOldDim = ai;
        }
        mShader.a(ahv1, ahv2);
        aju1.a(ahv2);
    }
}
