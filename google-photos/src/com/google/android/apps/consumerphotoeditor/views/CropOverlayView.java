// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import ay;
import b;
import bdo;
import bee;
import bge;
import bgf;
import bhd;
import bhe;
import bhh;
import bhj;
import bhm;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import com.google.android.apps.consumerphotoeditor.fragments.ConsumerPhotoEditorActivity;
import mk;
import mry;
import msm;
import msn;
import msp;
import msy;
import olq;
import pwu;

public class CropOverlayView extends View
    implements android.view.ScaleGestureDetector.OnScaleGestureListener
{

    private final RectF A;
    private boolean B;
    private PipelineParams C;
    private final RectF D;
    private final Handler E;
    private final Handler F;
    private final Handler G;
    private boolean H;
    private boolean I;
    private long J;
    private final RectF K;
    private Handler L;
    private PipelineParams M;
    private long N;
    private PipelineParams O;
    private float P[];
    private final msy Q;
    private final msy R;
    private final Handler S;
    private final Handler T;
    public final RectF a;
    public RectF b;
    public bdo c;
    public final Handler d;
    public final Handler e;
    public int f;
    public boolean g;
    public Handler h;
    public PipelineParams i;
    public long j;
    public int k;
    public PipelineParams l;
    public PipelineParams m;
    public float n[];
    public float o[];
    public boolean p;
    public boolean q;
    public bhd r;
    private ScaleGestureDetector s;
    private final PointF t;
    private final RectF u;
    private int v;
    private int w;
    private int x;
    private int y;
    private final PointF z;

    public CropOverlayView(Context context, Drawable drawable)
    {
        super(context);
        t = new PointF();
        a = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
        u = new RectF();
        v = -1;
        w = 0;
        b = new RectF();
        z = new PointF();
        A = new RectF();
        B = false;
        D = new RectF();
        E = new Handler();
        d = new Handler();
        F = new Handler();
        e = new Handler();
        G = new Handler();
        H = false;
        I = false;
        J = 0L;
        K = new RectF();
        L = new Handler();
        N = 0L;
        f = 0;
        g = false;
        Q = new msy(0.52F, 0.3F, 0.12F, 1.0F);
        h = new Handler();
        j = 0L;
        k = 0;
        p = false;
        R = new msy(0.52F, 0.3F, 0.12F, 1.0F);
        S = new Handler();
        T = new Handler();
        q = false;
        f();
    }

    public CropOverlayView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        t = new PointF();
        a = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
        u = new RectF();
        v = -1;
        w = 0;
        b = new RectF();
        z = new PointF();
        A = new RectF();
        B = false;
        D = new RectF();
        E = new Handler();
        d = new Handler();
        F = new Handler();
        e = new Handler();
        G = new Handler();
        H = false;
        I = false;
        J = 0L;
        K = new RectF();
        L = new Handler();
        N = 0L;
        f = 0;
        g = false;
        Q = new msy(0.52F, 0.3F, 0.12F, 1.0F);
        h = new Handler();
        j = 0L;
        k = 0;
        p = false;
        R = new msy(0.52F, 0.3F, 0.12F, 1.0F);
        S = new Handler();
        T = new Handler();
        q = false;
        f();
    }

    public CropOverlayView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        t = new PointF();
        a = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
        u = new RectF();
        v = -1;
        w = 0;
        b = new RectF();
        z = new PointF();
        A = new RectF();
        B = false;
        D = new RectF();
        E = new Handler();
        d = new Handler();
        F = new Handler();
        e = new Handler();
        G = new Handler();
        H = false;
        I = false;
        J = 0L;
        K = new RectF();
        L = new Handler();
        N = 0L;
        f = 0;
        g = false;
        Q = new msy(0.52F, 0.3F, 0.12F, 1.0F);
        h = new Handler();
        j = 0L;
        k = 0;
        p = false;
        R = new msy(0.52F, 0.3F, 0.12F, 1.0F);
        S = new Handler();
        T = new Handler();
        q = false;
        f();
    }

    public static PipelineParams A(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.l;
    }

    public static PipelineParams B(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.i;
    }

    public static Handler C(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.h;
    }

    public static int D(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.k;
    }

    public static float[] E(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.n;
    }

    public static PipelineParams F(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.m;
    }

    public static float[] G(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.o;
    }

    public static Handler H(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.S;
    }

    public static boolean I(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.q;
    }

    public static Handler J(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.T;
    }

    public static Handler K(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.d;
    }

    public static Handler L(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.e;
    }

    public static RectF M(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.u;
    }

    public static int N(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.x;
    }

    private float a(float f1)
    {
        return (f1 - b.left) / b.width();
    }

    private int a(float f1, float f2)
    {
        if (!u.isEmpty()) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        D.set(u);
        D.inset(-x, -x);
        bge bge1 = new bge(u.left, u.top, u.left, u.bottom);
        bge bge2 = new bge(u.left, u.top, u.right, u.top);
        bge bge3 = new bge(u.right, u.top, u.right, u.bottom);
        bge bge4 = new bge(u.left, u.bottom, u.right, u.bottom);
        int i1;
        int j1;
        if (b.a(bge1, f1, f2) < (float)x)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if (b.a(bge2, f1, f2) < (float)x)
        {
            i1 = j1 | 2;
        }
        j1 = i1;
        if (b.a(bge3, f1, f2) < (float)x)
        {
            j1 = i1 | 4;
        }
        i1 = j1;
        if (b.a(bge4, f1, f2) < (float)x)
        {
            i1 = j1 | 8;
        }
        if ((i1 & 5) != 5 && (i1 & 0xa) != 10)
        {
            j1 = i1;
            if (i1 != 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j1 = 15;
        if (!b.a(c.m, 0.0F) && (j1 - 1 & j1) == 0) goto _L1; else goto _L3
_L3:
        return j1;
    }

    public static int a(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.v;
    }

    public static int a(CropOverlayView cropoverlayview, float f1, float f2)
    {
        return cropoverlayview.a(f1, f2);
    }

    public static int a(CropOverlayView cropoverlayview, int i1)
    {
        cropoverlayview.f = 1;
        return 1;
    }

    public static String a(CropOverlayView cropoverlayview, int i1, PipelineParams pipelineparams)
    {
        pipelineparams = Renderer.getUserFriendlyCropCoordinates(pipelineparams);
        switch (i1)
        {
        case 5: // '\005'
        case 7: // '\007'
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 14: // '\016'
        default:
            return "";

        case 1: // '\001'
            return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_left_edge_moved, new Object[] {
                Integer.valueOf(Math.round(((RectF) (pipelineparams)).left * 100F))
            });

        case 2: // '\002'
            return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_top_edge_moved, new Object[] {
                Integer.valueOf(Math.round(((RectF) (pipelineparams)).top * 100F))
            });

        case 4: // '\004'
            return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_right_edge_moved, new Object[] {
                Integer.valueOf(Math.round(((RectF) (pipelineparams)).right * 100F))
            });

        case 8: // '\b'
            return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_bottom_edge_moved, new Object[] {
                Integer.valueOf(Math.round(((RectF) (pipelineparams)).bottom * 100F))
            });

        case 15: // '\017'
            return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_whole_area_moved, new Object[] {
                Integer.valueOf(Math.round(((RectF) (pipelineparams)).left * 100F)), Integer.valueOf(Math.round(((RectF) (pipelineparams)).top * 100F)), Integer.valueOf(Math.round(((RectF) (pipelineparams)).right * 100F)), Integer.valueOf(Math.round(((RectF) (pipelineparams)).bottom * 100F))
            });

        case 3: // '\003'
            return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_left_top_corner_moved, new Object[] {
                Integer.valueOf(Math.round(((RectF) (pipelineparams)).left * 100F)), Integer.valueOf(Math.round(((RectF) (pipelineparams)).top * 100F))
            });

        case 6: // '\006'
            return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_right_top_corner_moved, new Object[] {
                Integer.valueOf(Math.round(((RectF) (pipelineparams)).right * 100F)), Integer.valueOf(Math.round(((RectF) (pipelineparams)).top * 100F))
            });

        case 9: // '\t'
            return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_left_bottom_corner_moved, new Object[] {
                Integer.valueOf(Math.round(((RectF) (pipelineparams)).left * 100F)), Integer.valueOf(Math.round(((RectF) (pipelineparams)).bottom * 100F))
            });

        case 12: // '\f'
            return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_right_bottom_corner_moved, new Object[] {
                Integer.valueOf(Math.round(((RectF) (pipelineparams)).right * 100F)), Integer.valueOf(Math.round(((RectF) (pipelineparams)).bottom * 100F))
            });
        }
    }

    private void a(float f1, float f2, float f3, float f4, PipelineParams pipelineparams, boolean flag)
    {
        if (b.isEmpty())
        {
            return;
        }
        if (!flag)
        {
            if (Renderer.isCropWidthConstrained(pipelineparams, f1, f2, f3, f4))
            {
                pipelineparams.zoomScale = ((float)getWidth() - pipelineparams.marginLeft - pipelineparams.marginRight) / (b.width() / pipelineparams.zoomScale);
                pipelineparams.zoomScale = pipelineparams.zoomScale / (f3 - f1);
            } else
            {
                pipelineparams.zoomScale = ((float)getHeight() - pipelineparams.marginTop - pipelineparams.marginBottom) / (b.height() / pipelineparams.zoomScale);
                pipelineparams.zoomScale = pipelineparams.zoomScale / (f4 - f2);
            }
        }
        f1 = (f3 + f1) / 2.0F;
        f2 = (f4 + f2) / 2.0F;
        if (Math.abs(pipelineparams.zoomScale - 1.0F) < 0.001F)
        {
            pipelineparams.zoomCenterX = f1;
            pipelineparams.zoomCenterY = f2;
            pipelineparams.zoomScale = 1.0F;
            return;
        } else
        {
            pipelineparams.zoomCenterX = f1 - (0.5F - f1) / (pipelineparams.zoomScale - 1.0F);
            pipelineparams.zoomCenterY = f2 - (0.5F - f2) / (pipelineparams.zoomScale - 1.0F);
            return;
        }
    }

    private void a(float f1, float f2, boolean flag)
    {
        if (w != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f3;
        float f4;
        Object obj;
        int i1;
        float f5 = f1 - z.x;
        f4 = f2 - z.y;
        i1 = w;
        obj = A;
        float f6;
        float f7;
        float f8;
        RectF rectf;
        Object obj1;
        PointF pointf;
        boolean flag1;
        boolean flag2;
        if ((i1 & 1) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((i1 & 4) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (flag1)
        {
            if (i1 != 0)
            {
                f3 = -f5;
            } else
            {
                f3 = f5;
                if (f5 > 0.0F)
                {
                    f3 = Math.min(f5, ((RectF) (obj)).width() - (float)y);
                }
            }
        } else
        {
            f3 = f5;
            if (i1 != 0)
            {
                f3 = f5;
                if (f5 < 0.0F)
                {
                    f3 = Math.max(f5, (float)y - ((RectF) (obj)).width());
                }
            }
        }
        if (flag1)
        {
            obj.left = ((RectF) (obj)).left + f3;
        }
        if (i1 != 0)
        {
            obj.right = ((RectF) (obj)).right + f3;
        }
        if (flag1 || i1 != 0)
        {
            if (f3 == 0.0F);
        }
        i1 = w;
        obj = A;
        if ((i1 & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((i1 & 8) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (i1 != 0)
        {
            f3 = -f4;
        } else
        {
            f3 = f4;
            if (f4 > 0.0F)
            {
                f3 = Math.min(f4, ((RectF) (obj)).height() - (float)y);
            }
        }
_L5:
        if (flag1)
        {
            obj.top = ((RectF) (obj)).top + f3;
        }
        if (i1 != 0)
        {
            obj.bottom = ((RectF) (obj)).bottom + f3;
        }
        if (flag1 || i1 != 0)
        {
            if (f3 == 0.0F);
        }
        z.set(f1, f2);
        obj = Renderer.magicMove(c.f(), 1.2F, w, c.m, flag, a(A.left), b(A.top), a(A.right), b(A.bottom));
        C = Renderer.magicMove(C, 1.0F, w, c.m, flag, a(A.left), b(A.top), a(A.right), b(A.bottom));
        if (Math.max(Math.max(Math.abs(C.cropLeft - ((PipelineParams) (obj)).cropLeft), Math.abs(C.cropRight - ((PipelineParams) (obj)).cropRight)), Math.max(Math.abs(C.cropTop - ((PipelineParams) (obj)).cropTop), Math.abs(C.cropBottom - ((PipelineParams) (obj)).cropBottom))) > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        B = flag;
        a.left = ((PipelineParams) (obj)).cropLeft;
        a.top = ((PipelineParams) (obj)).cropTop;
        a.right = ((PipelineParams) (obj)).cropRight;
        a.bottom = ((PipelineParams) (obj)).cropBottom;
        flag = b.a(u.width(), u.height());
        d();
        flag2 = b.a(u.width(), u.height());
        f8 = a(u.left);
        f7 = b(u.top);
        f6 = a(u.right);
        f5 = b(u.bottom);
        f4 = f8;
        f3 = f7;
        f2 = f6;
        f1 = f5;
        if (w != 15)
        {
            f4 = Math.min(K.left, f8);
            f3 = Math.min(K.top, f7);
            f2 = Math.max(K.right, f6);
            f1 = Math.max(K.bottom, f5);
        }
        if (f4 < K.left || f3 < K.top || f2 > K.right || f1 > K.bottom || w == 15)
        {
            a(f4, f3, f2, f1, ((PipelineParams) (obj)), false);
            K.set(f4, f3, f2, f1);
        }
        rectf = new RectF();
        obj1 = A;
        rectf.set(a(((RectF) (obj1)).left), b(((RectF) (obj1)).top), a(((RectF) (obj1)).right), b(((RectF) (obj1)).bottom));
        obj1 = new PointF();
        pointf = z;
        ((PointF) (obj1)).set(a(pointf.x), b(pointf.y));
        if (flag && !flag2 && c.q)
        {
            c.q = false;
        }
        if (c.q && !I && flag2)
        {
            I = true;
            (new bhh(this, 0.0F, 1.0F)).a();
        }
        c.a(((PipelineParams) (obj)));
        A.set(c(rectf.left), d(rectf.top), c(rectf.right), d(rectf.bottom));
        if (w != 15)
        {
            z.set(c(((PointF) (obj1)).x), d(((PointF) (obj1)).y));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        f3 = f4;
        if (i1 != 0)
        {
            f3 = f4;
            if (f4 < 0.0F)
            {
                f3 = Math.max(f4, (float)y - ((RectF) (obj)).height());
            }
        }
          goto _L5
    }

    public static void a(CropOverlayView cropoverlayview, float f1, float f2, float f3, float f4, PipelineParams pipelineparams, boolean flag)
    {
        cropoverlayview.a(f1, f2, f3, f4, pipelineparams, flag);
    }

    public static void a(CropOverlayView cropoverlayview, float f1, float f2, boolean flag)
    {
        cropoverlayview.a(f1, f2, true);
    }

    public static void a(CropOverlayView cropoverlayview, PipelineParams pipelineparams)
    {
        pipelineparams.cropLeft = cropoverlayview.a.left;
        pipelineparams.cropTop = cropoverlayview.a.top;
        pipelineparams.cropRight = cropoverlayview.a.right;
        pipelineparams.cropBottom = cropoverlayview.a.bottom;
    }

    public static void a(CropOverlayView cropoverlayview, float af[])
    {
        a(af);
    }

    private void a(msp msp)
    {
        mry.a(getContext(), 30, (new msn()).a(new msm(msp)).a(new msm(pwu.m)).a(getContext()));
    }

    public static void a(float af[])
    {
        for (int i1 = 0; i1 < af.length; i1++)
        {
            af[i1] = 1.0F / af[i1];
        }

    }

    public static boolean a(CropOverlayView cropoverlayview, boolean flag)
    {
        cropoverlayview.H = false;
        return false;
    }

    private float b(float f1)
    {
        return (f1 - b.top) / b.height();
    }

    public static PointF b(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.z;
    }

    public static String b(CropOverlayView cropoverlayview, int i1)
    {
        if (cropoverlayview.c == null) goto _L2; else goto _L1
_L1:
        RectF rectf = Renderer.getUserFriendlyCropCoordinates(cropoverlayview.c.f());
        i1;
        JVM INSTR tableswitch 1 15: default 92
    //                   1 95
    //                   2 126
    //                   3 298
    //                   4 157
    //                   5 92
    //                   6 345
    //                   7 92
    //                   8 188
    //                   9 392
    //                   10 92
    //                   11 92
    //                   12 439
    //                   13 92
    //                   14 92
    //                   15 219;
           goto _L2 _L3 _L4 _L5 _L6 _L2 _L7 _L2 _L8 _L9 _L2 _L2 _L10 _L2 _L2 _L11
_L2:
        return "";
_L3:
        return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_handle_left_edge, new Object[] {
            Integer.valueOf(Math.round(rectf.left * 100F))
        });
_L4:
        return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_handle_top_edge, new Object[] {
            Integer.valueOf(Math.round(rectf.top * 100F))
        });
_L6:
        return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_handle_right_edge, new Object[] {
            Integer.valueOf(Math.round(rectf.right * 100F))
        });
_L8:
        return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_handle_bottom_edge, new Object[] {
            Integer.valueOf(Math.round(rectf.bottom * 100F))
        });
_L11:
        return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_handle_whole_area, new Object[] {
            Integer.valueOf(Math.round(rectf.left * 100F)), Integer.valueOf(Math.round(rectf.top * 100F)), Integer.valueOf(Math.round(rectf.right * 100F)), Integer.valueOf(Math.round(rectf.bottom * 100F))
        });
_L5:
        return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_handle_left_top_corner, new Object[] {
            Integer.valueOf(Math.round(rectf.left * 100F)), Integer.valueOf(Math.round(rectf.top * 100F))
        });
_L7:
        return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_handle_right_top_corner, new Object[] {
            Integer.valueOf(Math.round(rectf.right * 100F)), Integer.valueOf(Math.round(rectf.top * 100F))
        });
_L9:
        return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_handle_left_bottom_corner, new Object[] {
            Integer.valueOf(Math.round(rectf.left * 100F)), Integer.valueOf(Math.round(rectf.bottom * 100F))
        });
_L10:
        return cropoverlayview.getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_handle_right_bottom_corner, new Object[] {
            Integer.valueOf(Math.round(rectf.right * 100F)), Integer.valueOf(Math.round(rectf.bottom * 100F))
        });
    }

    public static boolean b(CropOverlayView cropoverlayview, boolean flag)
    {
        cropoverlayview.B = false;
        return false;
    }

    private float c(float f1)
    {
        return b.width() * f1 + b.left;
    }

    public static Handler c(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.G;
    }

    public static boolean c(CropOverlayView cropoverlayview, boolean flag)
    {
        cropoverlayview.p = false;
        return false;
    }

    private float d(float f1)
    {
        return b.height() * f1 + b.top;
    }

    public static boolean d(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.H;
    }

    public static boolean d(CropOverlayView cropoverlayview, boolean flag)
    {
        cropoverlayview.q = false;
        return false;
    }

    private void e()
    {
        e.removeCallbacksAndMessages(null);
        PipelineParams pipelineparams = c.f();
        pipelineparams.straightenAngle = Math.max(-0.7853982F, Math.min(0.7853982F, pipelineparams.straightenAngle));
        c.a(pipelineparams);
    }

    public static boolean e(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.B;
    }

    public static bdo f(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.c;
    }

    private void f()
    {
        getRootView();
        Resources resources = getResources();
        x = resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_touch_handle_size);
        y = resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_min_crop_area_size);
        setClickable(true);
        setEnabled(true);
        s = new ScaleGestureDetector((ConsumerPhotoEditorActivity)((olq)getContext()).getBaseContext(), this);
    }

    public static RectF g(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.K;
    }

    private boolean g()
    {
        return w != 0;
    }

    public static void h(CropOverlayView cropoverlayview)
    {
        cropoverlayview.d();
    }

    public static bhd i(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.r;
    }

    public static Handler j(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.E;
    }

    public static long k(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.J;
    }

    public static PipelineParams l(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.C;
    }

    public static boolean m(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.g;
    }

    public static long n(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.N;
    }

    public static msy o(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.Q;
    }

    public static PipelineParams p(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.O;
    }

    public static RectF q(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.b;
    }

    public static int r(CropOverlayView cropoverlayview)
    {
        int i1 = cropoverlayview.f;
        cropoverlayview.f = i1 - 1;
        return i1;
    }

    public static int s(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.f;
    }

    public static void t(CropOverlayView cropoverlayview)
    {
        cropoverlayview.b();
    }

    public static PipelineParams u(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.M;
    }

    public static float[] v(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.P;
    }

    public static Handler w(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.L;
    }

    public static boolean x(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.p;
    }

    public static long y(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.j;
    }

    public static msy z(CropOverlayView cropoverlayview)
    {
        return cropoverlayview.R;
    }

    public final void a()
    {
        H = false;
        d.removeCallbacksAndMessages(null);
        e();
    }

    public final void a(float f1, PipelineParams pipelineparams, float f2)
    {
        d.removeCallbacksAndMessages(null);
        PipelineParams pipelineparams1 = new PipelineParams(pipelineparams);
        pipelineparams1.straightenAngle = f1;
        pipelineparams = Renderer.magicStraighten(pipelineparams1, f1 - pipelineparams.straightenAngle, c.m);
        a.left = pipelineparams.cropLeft;
        a.top = pipelineparams.cropTop;
        a.right = pipelineparams.cropRight;
        a.bottom = pipelineparams.cropBottom;
        d();
        a(pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom, pipelineparams, false);
        K.set(pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom);
        pipelineparams.ruleOfThirdsOpacity = f2;
        c.a(pipelineparams);
    }

    public final void a(bdo bdo1)
    {
        c = bdo1;
        e();
        PipelineParams pipelineparams = bdo1.f();
        a.left = pipelineparams.cropLeft;
        a.top = pipelineparams.cropTop;
        a.right = pipelineparams.cropRight;
        a.bottom = pipelineparams.cropBottom;
        a(pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom, pipelineparams, false);
        bdo1.a(pipelineparams);
        K.set(pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom);
    }

    public final void a(PipelineParams pipelineparams)
    {
        bee bee1 = (bee)((ConsumerPhotoEditorActivity)((olq)getContext()).getBaseContext()).c().a("CropToolbarFragment");
        if (bee1 != null)
        {
            bee1.a(pipelineparams.straightenAngle);
            a(c);
            bee1.a(false);
        }
    }

    public void b()
    {
        if (c == null)
        {
            return;
        }
        PipelineParams pipelineparams = c.f();
        int i1 = (int)(pipelineparams.rotateAngle / 1.570796F + 0.5F) * 90;
        if (f == 0)
        {
            g = false;
            switch (i1)
            {
            default:
                return;

            case 0: // '\0'
                b.a(getContext(), this, getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_rotate_done_360));
                return;

            case 90: // 'Z'
                b.a(getContext(), this, getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_rotate_done_90));
                return;

            case 180: 
                b.a(getContext(), this, getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_rotate_done_180));
                return;

            case 270: 
                b.a(getContext(), this, getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_rotate_done_270));
                break;
            }
            return;
        }
        if (i1 == 0)
        {
            i1 = 270;
        } else
        {
            i1 -= 90;
        }
        M = new PipelineParams(pipelineparams);
        O = new PipelineParams(pipelineparams);
        O = Renderer.computeEndPipelineParamsForResetRotateAnimation(M, ((float)(i1 << 1) * 3.141593F) / 360F, false, O);
        P = Renderer.computeSmoothFactorForResetRotateAnimation(M, O);
        g = true;
        N = System.currentTimeMillis();
        L.postDelayed(new bhm(this), 25L);
    }

    public final void c()
    {
        bee bee1 = (bee)((ConsumerPhotoEditorActivity)((olq)getContext()).getBaseContext()).c().a("CropToolbarFragment");
        if (bee1 != null)
        {
            bee1.a(0.0F);
            a(c);
            bee1.a(false);
        }
    }

    public void d()
    {
        u.left = c(a.left);
        u.top = d(a.top);
        u.right = c(a.right);
        u.bottom = d(a.bottom);
    }

    protected boolean dispatchHoverEvent(MotionEvent motionevent)
    {
        if (r != null && r.a(motionevent))
        {
            return true;
        } else
        {
            return super.dispatchHoverEvent(motionevent);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        for (Context context = getContext(); context == null || !((AccessibilityManager)context.getSystemService("accessibility")).isEnabled() || r != null;)
        {
            return;
        }

        r = new bhd(this, this);
        mk.a(this, r);
        x = getResources().getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_touch_handle_size_talkback);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (r != null)
        {
            setAccessibilityDelegate(null);
            r = null;
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        if (v != -2)
        {
            return false;
        }
        float f3 = scalegesturedetector.getScaleFactor();
        float f5 = t.x;
        float f4 = t.y;
        scalegesturedetector = c.f();
        float f1 = (((PipelineParams) (scalegesturedetector)).cropLeft - f5) / f3 + f5;
        float f2 = (((PipelineParams) (scalegesturedetector)).cropTop - f4) / f3 + f4;
        f5 += (((PipelineParams) (scalegesturedetector)).cropRight - f5) / f3;
        f3 = f4 + (((PipelineParams) (scalegesturedetector)).cropBottom - f4) / f3;
        scalegesturedetector = Renderer.magicPinch(scalegesturedetector, 1.2F, f1, f2, f5, f3);
        C = Renderer.magicPinch(C, 1.0F, f1, f2, f5, f3);
        boolean flag;
        if (Math.max(Math.max(Math.abs(C.cropLeft - ((PipelineParams) (scalegesturedetector)).cropLeft), Math.abs(C.cropRight - ((PipelineParams) (scalegesturedetector)).cropRight)), Math.max(Math.abs(C.cropTop - ((PipelineParams) (scalegesturedetector)).cropTop), Math.abs(C.cropBottom - ((PipelineParams) (scalegesturedetector)).cropBottom))) > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        B = flag;
        a.left = ((PipelineParams) (scalegesturedetector)).cropLeft;
        a.top = ((PipelineParams) (scalegesturedetector)).cropTop;
        a.right = ((PipelineParams) (scalegesturedetector)).cropRight;
        a.bottom = ((PipelineParams) (scalegesturedetector)).cropBottom;
        d();
        a(((PipelineParams) (scalegesturedetector)).cropLeft, ((PipelineParams) (scalegesturedetector)).cropTop, ((PipelineParams) (scalegesturedetector)).cropRight, ((PipelineParams) (scalegesturedetector)).cropBottom, scalegesturedetector, false);
        K.set(((PipelineParams) (scalegesturedetector)).cropLeft, ((PipelineParams) (scalegesturedetector)).cropTop, ((PipelineParams) (scalegesturedetector)).cropRight, ((PipelineParams) (scalegesturedetector)).cropBottom);
        c.a(scalegesturedetector);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        v = -2;
        t.set(a(z.x), b(z.y));
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        v = -1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (H || g) goto _L2; else goto _L1
_L1:
        if (v == -1)
        {
            z.set(motionevent.getX(), motionevent.getY());
        }
        if (g())
        {
            s.onTouchEvent(motionevent);
        }
        if (v != -2) goto _L3; else goto _L2
_L2:
        return true;
_L3:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 100
    //                   0 102
    //                   1 583
    //                   2 549
    //                   3 583;
           goto _L4 _L5 _L6 _L7 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L4:
        return true;
_L5:
        float f1;
        float f3;
        int i1;
        int j1;
        i1 = a(motionevent.getX(), motionevent.getY());
        j1 = motionevent.getPointerId(0);
        f1 = motionevent.getX();
        f3 = motionevent.getY();
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1;
        JVM INSTR tableswitch 1 15: default 216
    //                   1 430
    //                   2 440
    //                   3 470
    //                   4 450
    //                   5 216
    //                   6 490
    //                   7 216
    //                   8 460
    //                   9 480
    //                   10 216
    //                   11 216
    //                   12 500
    //                   13 216
    //                   14 216
    //                   15 510;
           goto _L8 _L9 _L10 _L11 _L12 _L8 _L13 _L8 _L14 _L15 _L8 _L8 _L16 _L8 _L8 _L17
_L8:
        w = i1;
        z.set(f1, f3);
        v = j1;
        A.set(u);
        motionevent = c.f();
        PipelineParams pipelineparams = new PipelineParams(c.f());
        pipelineparams.ruleOfThirdsOpacity = 0.7F;
        G.post(new bgf(motionevent, pipelineparams, c, G));
        G.postDelayed(new bhj(this), 25L);
        motionevent = (bee)((ConsumerPhotoEditorActivity)((olq)getContext()).getBaseContext()).c().a("CropToolbarFragment");
        C = c.f();
        if (b.a(u.width(), u.height()) && c.q)
        {
            c.q = false;
        }
        C.bannerOpacity = 0.0F;
        c.a(C);
        if (motionevent != null)
        {
            motionevent.a(false);
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        a(pwu.g);
          goto _L8
_L10:
        a(pwu.i);
          goto _L8
_L12:
        a(pwu.h);
          goto _L8
_L14:
        a(pwu.d);
          goto _L8
_L11:
        a(pwu.j);
          goto _L8
_L15:
        a(pwu.e);
          goto _L8
_L13:
        a(pwu.k);
          goto _L8
_L16:
        a(pwu.f);
          goto _L8
_L17:
        mry.a(getContext(), 30, (new msn()).a(new msm(pwu.A)).a(getContext()));
          goto _L8
_L7:
        if (g() && v == motionevent.getPointerId(0))
        {
            a(motionevent.getX(), motionevent.getY(), true);
            return true;
        }
        continue; /* Loop/switch isn't completed */
        if (!g()) goto _L2; else goto _L18
_L18:
        v = -1;
        if (g())
        {
            G.removeCallbacksAndMessages(null);
            H = true;
            J = System.currentTimeMillis();
            motionevent = c.f();
            c.a(motionevent);
            Object obj = new PipelineParams(motionevent);
            obj.ruleOfThirdsOpacity = 0.0F;
            F.post(new bgf(motionevent, ((PipelineParams) (obj)), c, F));
            obj = (bee)((ConsumerPhotoEditorActivity)((olq)getContext()).getBaseContext()).c().a("CropToolbarFragment");
            if (obj != null)
            {
                ((bee) (obj)).a(false);
            }
            float f2 = ((PipelineParams) (motionevent)).marginLeft;
            float f4 = ((PipelineParams) (motionevent)).marginTop;
            float f5 = getWidth();
            float f6 = ((PipelineParams) (motionevent)).marginRight;
            float f7 = getHeight();
            float f8 = ((PipelineParams) (motionevent)).marginBottom;
            K.set(a(f2), b(f4), a(f5 - f6), b(f7 - f8));
            E.postDelayed(new bhe(this, w), 25L);
            if (I && ((PipelineParams) (motionevent)).bannerOpacity > 0.0F)
            {
                (new bhh(this, ((PipelineParams) (motionevent)).bannerOpacity, 0.0F)).a();
            }
            w = 0;
            A.setEmpty();
            return true;
        }
        if (true) goto _L2; else goto _L19
_L19:
    }
}
