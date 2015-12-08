// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.composite;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import ako;

public final class OverlayFilter extends ahn
{

    public static final int OVERLAY_ADD = 2;
    public static final int OVERLAY_BURN = 8;
    public static final int OVERLAY_DARKEN = 11;
    public static final int OVERLAY_DIFFERENCE = 5;
    public static final int OVERLAY_DIVIDE = 3;
    public static final int OVERLAY_DODGE = 7;
    public static final int OVERLAY_HARDLIGHT = 9;
    public static final int OVERLAY_LIGHTEN = 12;
    public static final int OVERLAY_MULTIPLY = 1;
    public static final int OVERLAY_NORMAL = 0;
    public static final int OVERLAY_OVERLAY = 13;
    public static final int OVERLAY_SCREEN = 6;
    public static final int OVERLAY_SOFTLIGHT = 10;
    public static final int OVERLAY_SQUARED_DIFFERENCE = 14;
    public static final int OVERLAY_SUBTRACT = 4;
    private static final ako mDefaultQuads[] = {
        ako.a(0.0F, 0.0F, 1.0F, 1.0F)
    };
    private boolean mHasMask;
    private ajl mIdShader;
    private int mInputFrameCount;
    private int mOldOverlayMode;
    private float mOpacity;
    private int mOverlayMode;
    private ajl mOverlayShader;
    private ako mSourceQuads[];
    private ako mTargetQuads[];

    public OverlayFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mOpacity = 1.0F;
        mSourceQuads = null;
        mTargetQuads = null;
        mHasMask = false;
        mOverlayMode = 0;
        mOldOverlayMode = -1;
        mInputFrameCount = 1;
    }

    public final void a(ajo ajo1)
    {
        if (ajo1.b.equals("mask"))
        {
            mHasMask = true;
        }
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("source", 2, aif1).a("overlay", 2, aif1).a("mask", 1, aif1).a("opacity", 1, aif.a(Float.TYPE)).a("mode", 1, aif.a(Integer.TYPE)).a("sourceQuads", 1, aif.b(ako)).a("targetQuads", 1, aif.b(ako)).b("composite", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("opacity"))
        {
            ajo1.a("mOpacity");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("sourceQuads"))
            {
                ajo1.a("mSourceQuads");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("targetQuads"))
            {
                ajo1.a("mTargetQuads");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("mode"))
            {
                ajo1.a("mOverlayMode");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void c()
    {
        mIdShader = ajl.a();
    }

    protected final void e()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        aju aju1;
        boolean flag1;
        aju1 = b("composite");
        String s2;
        String s4;
        String s5;
        int i;
        int k;
        boolean flag2;
        if (mOverlayMode != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (mOverlayMode == mOldOverlayMode) goto _L2; else goto _L1
_L1:
        flag2 = mHasMask;
        s2 = String.valueOf("attribute vec4 a_position;\nattribute vec2 a_texcoord;\n");
        String s;
        String s1;
        String s3;
        if (flag2)
        {
            obj = "attribute vec2 a_texcoord_full;\n";
        } else
        {
            obj = "";
        }
        if (flag1)
        {
            s = "attribute vec2 a_texcoord_src;\n";
        } else
        {
            s = "";
        }
        if (flag2)
        {
            s1 = "varying vec2 v_texcoord_mask;\n";
        } else
        {
            s1 = "";
        }
        if (flag1)
        {
            obj1 = "varying vec2 v_texcoord_src;\n";
        } else
        {
            obj1 = "";
        }
        if (flag2)
        {
            obj2 = "v_texcoord_mask = a_texcoord_full;\n";
        } else
        {
            obj2 = "";
        }
        if (flag1)
        {
            obj3 = "v_texcoord_src = a_texcoord_src;\n";
        } else
        {
            obj3 = "";
        }
        s4 = (new StringBuilder(String.valueOf(s2).length() + 96 + String.valueOf(obj).length() + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(obj1).length() + String.valueOf(obj2).length() + String.valueOf(obj3).length())).append(s2).append(((String) (obj))).append(s).append("varying vec2 v_texcoord;\n").append(s1).append(((String) (obj1))).append("void main() {\n  gl_Position = a_position;\n").append("  v_texcoord = a_texcoord;\n").append(((String) (obj2))).append(((String) (obj3))).append("}\n").toString();
        flag2 = mHasMask;
        if (flag1)
        {
            obj = "tex_sampler_2";
        } else
        {
            obj = "tex_sampler_1";
        }
        s5 = String.valueOf("precision mediump float;\nuniform sampler2D tex_sampler_0;\n");
        if (flag1)
        {
            s = "uniform sampler2D tex_sampler_1;\n";
        } else
        {
            s = "";
        }
        if (flag2)
        {
            s1 = (new StringBuilder(String.valueOf(obj).length() + 20)).append("uniform sampler2D ").append(((String) (obj))).append(";\n").toString();
        } else
        {
            s1 = "";
        }
        if (flag2)
        {
            obj1 = "varying vec2 v_texcoord_mask;\n";
        } else
        {
            obj1 = "";
        }
        if (flag1)
        {
            obj2 = "varying vec2 v_texcoord_src;\n";
        } else
        {
            obj2 = "";
        }
        if (flag1)
        {
            obj3 = "  vec4 srcColor = texture2D(tex_sampler_1, v_texcoord_src);\n";
        } else
        {
            obj3 = "";
        }
        if (flag2)
        {
            s3 = (new StringBuilder(String.valueOf(obj).length() + 45)).append("ovlColor.a = texture2D(").append(((String) (obj))).append(", v_texcoord_mask).a;\n").toString();
        } else
        {
            s3 = "";
        }
        mOverlayMode;
        JVM INSTR tableswitch 1 14: default 432
    //                   1 996
    //                   2 1003
    //                   3 1010
    //                   4 1017
    //                   5 1024
    //                   6 1031
    //                   7 1038
    //                   8 1045
    //                   9 1052
    //                   10 1059
    //                   11 1066
    //                   12 1073
    //                   13 1080
    //                   14 1087;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L3:
        obj = "ovlColor.rgb";
_L19:
        mOverlayShader = new ajl(s4, (new StringBuilder(String.valueOf(s5).length() + 167 + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(obj1).length() + String.valueOf(obj2).length() + String.valueOf(obj3).length() + String.valueOf(s3).length() + String.valueOf(obj).length())).append(s5).append(s).append(s1).append("uniform float opacity;\nvarying vec2 v_texcoord;\n").append(((String) (obj1))).append(((String) (obj2))).append("void main() {\n  vec4 ovlColor = texture2D(tex_sampler_0, v_texcoord);\n").append(((String) (obj3))).append(s3).append("  gl_FragColor = vec4(").append(((String) (obj))).append(", ovlColor.a * opacity);\n}\n").toString());
        if (mHasMask)
        {
            mOverlayShader.a("a_texcoord_full", new float[] {
                0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F
            }, 2);
        }
        mOverlayShader.c = true;
        obj = mOverlayShader;
        obj.d = 770;
        obj.e = 771;
        mInputFrameCount = 1;
        if (flag1)
        {
            mInputFrameCount = mInputFrameCount + 1;
        }
        if (mHasMask)
        {
            mInputFrameCount = mInputFrameCount + 1;
        }
        mOldOverlayMode = mOverlayMode;
_L2:
        obj1 = a("source").a().h();
        obj2 = a("overlay").a().h();
        obj = null;
        if (mHasMask)
        {
            obj = a("mask").a().h();
        }
        obj3 = aju1.a(((ahv) (obj1)).l()).h();
        mIdShader.a(((ahv) (obj1)), ((ahv) (obj3)));
        mOverlayShader.a("opacity", mOpacity);
        if (mSourceQuads != null && mTargetQuads != null && mSourceQuads.length != mTargetQuads.length)
        {
            i = mSourceQuads.length;
            k = mTargetQuads.length;
            throw new RuntimeException((new StringBuilder(91)).append("Mismatch between input source quad count (").append(i).append(") and target quad count (").append(k).append(")!").toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        obj = "srcColor.rgb * ovlColor.rgb";
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "srcColor.rgb + ovlColor.rgb";
        continue; /* Loop/switch isn't completed */
_L6:
        obj = "srcColor.rgb / ovlColor.rgb";
        continue; /* Loop/switch isn't completed */
_L7:
        obj = "srcColor.rgb - ovlColor.rgb";
        continue; /* Loop/switch isn't completed */
_L8:
        obj = "abs(srcColor.rgb - ovlColor.rgb)";
        continue; /* Loop/switch isn't completed */
_L9:
        obj = "1.0 - ((1.0 - ovlColor.rgb) * (1.0 - srcColor.rgb))";
        continue; /* Loop/switch isn't completed */
_L10:
        obj = "srcColor.rgb / (1.0 - ovlColor.rgb)";
        continue; /* Loop/switch isn't completed */
_L11:
        obj = "1.0 - ((1.0 - srcColor.rgb) / ovlColor.rgb)";
        continue; /* Loop/switch isn't completed */
_L12:
        obj = "vec3(ovlColor.r > 0.5 ? 1.0 - ((1.0 - 2.0 * (ovlColor.r - 0.5)) * (1.0 - srcColor.r)) : (2.0 * ovlColor.r * srcColor.r),     ovlColor.g > 0.5 ? 1.0 - ((1.0 - 2.0 * (ovlColor.g - 0.5)) * (1.0 - srcColor.g)) : (2.0 * ovlColor.g * srcColor.g),     ovlColor.b > 0.5 ? 1.0 - ((1.0 - 2.0 * (ovlColor.b - 0.5)) * (1.0 - srcColor.b)) : (2.0 * ovlColor.b * srcColor.b))";
        continue; /* Loop/switch isn't completed */
_L13:
        obj = "srcColor.rgb * ((1.0 - srcColor.rgb) * ovlColor.rgb + (1.0 - ((1.0 - ovlColor.rgb) * (1.0 - srcColor.rgb))))";
        continue; /* Loop/switch isn't completed */
_L14:
        obj = "min(srcColor.rgb, ovlColor.rgb)";
        continue; /* Loop/switch isn't completed */
_L15:
        obj = "max(srcColor.rgb, ovlColor.rgb)";
        continue; /* Loop/switch isn't completed */
_L16:
        obj = "srcColor.rgb * (srcColor.rgb + (2.0 * ovlColor.rgb) * (1.0 - srcColor.rgb))";
        continue; /* Loop/switch isn't completed */
_L17:
        obj = "(srcColor.rgb - ovlColor.rgb) * (srcColor.rgb - ovlColor.rgb)";
        if (true) goto _L19; else goto _L18
_L18:
        ako aako[] = mDefaultQuads;
        ako aako1[] = mDefaultQuads;
        boolean flag = false;
        if (mSourceQuads != null)
        {
            aako = mSourceQuads;
            flag = true;
        }
        if (mTargetQuads != null)
        {
            aako1 = mTargetQuads;
            flag = true;
        }
        int j;
        if (flag)
        {
            ahv aahv[] = mSourceQuads;
            Object obj4 = mTargetQuads;
            int l;
            if (aahv == null)
            {
                j = obj4.length;
            } else
            if (obj4 == null)
            {
                j = aahv.length;
            } else
            {
                if (aahv.length != obj4.length)
                {
                    j = aahv.length;
                    int i1 = obj4.length;
                    throw new RuntimeException((new StringBuilder(91)).append("Mismatch between input source quad count (").append(j).append(") and target quad count (").append(i1).append(")!").toString());
                }
                j = aahv.length;
            }
        } else
        {
            j = 1;
        }
        l = 0;
        while (l < j) 
        {
            int j1;
            if (l < aako.length)
            {
                j1 = l;
            } else
            {
                j1 = 0;
            }
            aahv = aako[j1];
            if (l < aako1.length)
            {
                j1 = l;
            } else
            {
                j1 = 0;
            }
            obj4 = aako1[j1];
            mOverlayShader.a(aahv);
            mOverlayShader.b(((ako) (obj4)));
            if (flag1)
            {
                mOverlayShader.a("a_texcoord_src", ((ako) (obj4)).b(), 2);
            }
            aahv = new ahv[mInputFrameCount];
            j1 = 1;
            aahv[0] = obj2;
            if (flag1)
            {
                j1 = 2;
                aahv[1] = obj1;
            }
            if (mHasMask)
            {
                aahv[j1] = obj;
            }
            mOverlayShader.a(aahv, ((ahv) (obj3)));
            l++;
        }
        ((ahv) (obj3)).a(((ahv) (obj1)).c());
        aju1.a(((ahs) (obj3)));
        return;
    }

}
