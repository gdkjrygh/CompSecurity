// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.reduce;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajq;
import ajr;
import aju;
import ajw;
import ald;
import ale;
import alf;
import java.util.Iterator;
import java.util.Vector;

public class ImageReduceFilter extends ahn
{

    public static final int CHANNEL_AVG = 4;
    public static final int CHANNEL_BLUE = 3;
    public static final int CHANNEL_GRAY = 8;
    public static final int CHANNEL_GREEN = 2;
    public static final int CHANNEL_MAX = 7;
    public static final int CHANNEL_MIN = 6;
    public static final int CHANNEL_RED = 1;
    public static final int CHANNEL_SUM = 5;
    public static final int OPERATION_AVG = 3;
    public static final int OPERATION_MAX = 1;
    public static final int OPERATION_MIN = 2;
    public static final int OPERATION_PRODUCT = 5;
    public static final int OPERATION_SUM = 4;
    private int mChannel;
    private ajq mChannelListener;
    private int mCurrentHeight;
    private int mCurrentWidth;
    private int mLevel;
    private int mOperation;
    private ajq mOperationListener;
    private Vector mPyramid;
    private ajl mShader;
    private boolean mShaderDirtyFlag;

    public ImageReduceFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mLevel = -1;
        mCurrentWidth = 0;
        mCurrentHeight = 0;
        mOperation = 3;
        mChannel = 8;
        mShaderDirtyFlag = false;
        mShader = null;
        mPyramid = new Vector();
        mOperationListener = new ald(this);
        mChannelListener = new ale(this);
    }

    public static int a(ImageReduceFilter imagereducefilter)
    {
        return imagereducefilter.mOperation;
    }

    public static int a(ImageReduceFilter imagereducefilter, int i)
    {
        imagereducefilter.mOperation = i;
        return i;
    }

    private ahv a(int i, ahv ahv1, ahv ahv2)
    {
        if (i == 0)
        {
            return ahv1;
        }
        if (i >= mLevel)
        {
            return ahv2;
        } else
        {
            return (ahv)mPyramid.get(i);
        }
    }

    private void a()
    {
        for (Iterator iterator = mPyramid.iterator(); iterator.hasNext(); ((ahv)iterator.next()).i()) { }
        mPyramid.clear();
        int i = mCurrentWidth;
        int k = mCurrentHeight;
        if (i <= 0 || k <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder(50)).append("Illegal image dimensions: ").append(i).append("x").append(k).append("!").toString());
        }
        Object obj = new Vector();
        alf alf1 = new alf(0, i, k);
        i = 1;
        do
        {
            ((Vector) (obj)).add(alf1);
            if (alf1.a == 1 && alf1.b == 1)
            {
                break;
            }
            alf1 = new alf(i, (alf1.a + 1) / 2, (alf1.b + 1) / 2);
            i++;
        } while (true);
        alf aalf[] = (alf[])((Vector) (obj)).toArray(new alf[0]);
        obj = aif.a(301, 18);
        for (int j = 0; j < aalf.length; j++)
        {
            Object obj1 = aalf[j];
            obj1 = ahs.a(((aif) (obj)), new int[] {
                ((alf) (obj1)).a, ((alf) (obj1)).b
            }).h();
            mPyramid.add(obj1);
        }

    }

    public static boolean a(ImageReduceFilter imagereducefilter, boolean flag)
    {
        imagereducefilter.mShaderDirtyFlag = true;
        return true;
    }

    public static int b(ImageReduceFilter imagereducefilter)
    {
        return imagereducefilter.mChannel;
    }

    public static int b(ImageReduceFilter imagereducefilter, int i)
    {
        imagereducefilter.mChannel = i;
        return i;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("operation", 1, aif.a(Integer.TYPE)).a("level", 1, aif.a(Integer.TYPE)).a("channel", 1, aif.a(Integer.TYPE)).b("image", 2, aif2).a();
    }

    protected final void b(ajo ajo1)
    {
        if (ajo1.b.equals("level"))
        {
            ajo1.a("mLevel");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("operation"))
            {
                ajo1.a(mOperationListener);
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("channel"))
            {
                ajo1.a(mChannelListener);
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void d()
    {
        mShaderDirtyFlag = true;
    }

    protected final void e()
    {
        aju aju1;
        ahv ahv2;
        int ai[];
        aju1 = b("image");
        ahv2 = a("image").a().h();
        ai = ahv2.l();
        if (!mShaderDirtyFlag) goto _L2; else goto _L1
_L1:
        String s1 = String.valueOf("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\n\nfloat reduce(float v0, float v1, float v2, float v3) {\n  return ");
        mOperation;
        JVM INSTR tableswitch 1 5: default 80
    //                   1 121
    //                   2 217
    //                   3 224
    //                   4 231
    //                   5 238;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        int i = mOperation;
        throw new IllegalArgumentException((new StringBuilder(31)).append("Unknown operation: ").append(i).append("!").toString());
_L4:
        String s = "max(max(v0, v1), max(v2, v3))";
_L18:
        mChannel;
        JVM INSTR tableswitch 1 8: default 176
    //                   1 245
    //                   2 613
    //                   3 620
    //                   4 627
    //                   5 634
    //                   6 641
    //                   7 648
    //                   8 655;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L9:
        int j = mChannel;
        throw new IllegalArgumentException((new StringBuilder(29)).append("Unknown channel: ").append(j).append("!").toString());
_L5:
        s = "min(min(v0, v1), min(v2, v3))";
          goto _L18
_L6:
        s = "(v0 + v1 + v2 + v3) / 4.0";
          goto _L18
_L7:
        s = "(v0 + v1 + v2 + v3)";
          goto _L18
_L8:
        s = "(v0 * v1 * v2 * v3)";
          goto _L18
_L10:
        Object obj = "color.r";
_L20:
        mShader = new ajl((new StringBuilder(String.valueOf(s1).length() + 482 + String.valueOf(s).length() + String.valueOf(obj).length())).append(s1).append(s).append(";\n}\n").append("\nfloat colorValue(vec4 color) {\n").append("  return ").append(((String) (obj))).append(";\n}\n").append("void main() {\n  float c0 = colorValue(texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, -pix.y)));\n").append("  float c1 = colorValue(texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, -pix.y)));\n  float c2 = colorValue(texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, +pix.y)));\n").append("  float c3 = colorValue(texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, +pix.y)));\n  float r = reduce(c0, c1, c2, c3);\n").append("  gl_FragColor = vec4(r, r, r, 1.0);\n}\n").toString());
        mShaderDirtyFlag = false;
_L2:
        if (ai[0] != mCurrentWidth || ai[1] != mCurrentHeight)
        {
            mCurrentWidth = ai[0];
            mCurrentHeight = ai[1];
            a();
        }
        if (mLevel >= mPyramid.size() || mLevel < 0)
        {
            mLevel = mPyramid.size() - 1;
        }
        obj = aju1.a(((ahv)mPyramid.get(mLevel)).l()).h();
        int k = 0;
        while (k < mLevel) 
        {
            ahv ahv1 = a(k, ahv2, ((ahv) (obj)));
            ahv ahv3 = a(k + 1, ahv2, ((ahv) (obj)));
            int l = ahv1.m();
            int i1 = ahv1.n();
            int j1 = ahv3.m();
            int k1 = ahv3.n();
            float f;
            float f1;
            if (j1 == l)
            {
                f = 1.0F;
            } else
            {
                f = ((float)j1 * 2.0F) / (float)l;
            }
            if (k1 == i1)
            {
                f1 = 1.0F;
            } else
            {
                f1 = ((float)k1 * 2.0F) / (float)i1;
            }
            mShader.a(0.0F, 0.0F, f, f1);
            mShader.a("pix", new float[] {
                0.5F / (float)l, 0.5F / (float)i1
            });
            mShader.a(ahv1, ahv3);
            k++;
        }
        break; /* Loop/switch isn't completed */
_L11:
        obj = "color.g";
        continue; /* Loop/switch isn't completed */
_L12:
        obj = "color.b";
        continue; /* Loop/switch isn't completed */
_L13:
        obj = "(color.r + color.g + color.b) / 3.0";
        continue; /* Loop/switch isn't completed */
_L14:
        obj = "(color.r + color.g + color.b)";
        continue; /* Loop/switch isn't completed */
_L15:
        obj = "min(color.r, min(color.g, color.b))";
        continue; /* Loop/switch isn't completed */
_L16:
        obj = "max(color.r, max(color.g, color.b))";
        continue; /* Loop/switch isn't completed */
_L17:
        obj = "dot(color, vec4(0.299, 0.587, 0.114, 0))";
        if (true) goto _L20; else goto _L19
_L19:
        aju1.a(a(mLevel, ahv2, ((ahv) (obj))));
        return;
    }
}
