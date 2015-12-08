// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;
import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

public final class bhi
    implements Runnable
{

    private final msy a = new msy(0.52F, 0.3F, 0.12F, 1.0F);
    private final PipelineParams b;
    private final PipelineParams c;
    private final long d = System.currentTimeMillis();
    private final long e;
    private final int f;
    private CropOverlayView g;

    bhi(CropOverlayView cropoverlayview, PipelineParams pipelineparams, PipelineParams pipelineparams1, int i)
    {
        g = cropoverlayview;
        super();
        b = pipelineparams;
        c = pipelineparams1;
        int j;
        if (CropOverlayView.d(cropoverlayview))
        {
            j = 2;
        } else
        {
            j = 1;
        }
        e = 300L / (long)j;
        f = i;
    }

    public final void run()
    {
label0:
        {
            if (CropOverlayView.e(g))
            {
                float f1 = Math.min(1.0F, Math.max(0.0F, (float)(System.currentTimeMillis() - d) / (float)e));
                f1 = a.getInterpolation(f1);
                PipelineParams pipelineparams = CropOverlayView.f(g).f();
                float f2 = c.cropLeft;
                f2 = b.cropLeft * (1.0F - f1) + f2 * f1;
                float f3 = c.cropTop;
                f3 = b.cropTop * (1.0F - f1) + f3 * f1;
                float f4 = c.cropRight;
                f4 = b.cropRight * (1.0F - f1) + f4 * f1;
                float f5 = c.cropBottom;
                f5 = b.cropBottom * (1.0F - f1) + f5 * f1;
                pipelineparams.cropLeft = f2;
                pipelineparams.cropRight = f4;
                pipelineparams.cropTop = f3;
                pipelineparams.cropBottom = f5;
                CropOverlayView.a(g, f2, f3, f4, f5, pipelineparams, false);
                CropOverlayView.f(g).a(pipelineparams);
                CropOverlayView.g(g).set(pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom);
                if (f1 < 0.999F)
                {
                    break label0;
                }
                CropOverlayView.g(g).set(pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom);
                g.a.left = pipelineparams.cropLeft;
                g.a.top = pipelineparams.cropTop;
                g.a.right = pipelineparams.cropRight;
                g.a.bottom = pipelineparams.cropBottom;
                CropOverlayView.h(g);
                pipelineparams.cropLeft = c.cropLeft;
                pipelineparams.cropRight = c.cropRight;
                pipelineparams.cropTop = c.cropTop;
                pipelineparams.cropBottom = c.cropBottom;
                CropOverlayView.a(g, pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom, pipelineparams, false);
                CropOverlayView.f(g).a(pipelineparams);
                CropOverlayView.a(g, false);
                CropOverlayView.b(g, false);
                if (CropOverlayView.i(g) != null)
                {
                    CropOverlayView.i(g).a(f);
                    b.a(g.getContext(), g, CropOverlayView.a(g, f, pipelineparams));
                }
            }
            return;
        }
        CropOverlayView.j(g).postDelayed(this, 25L);
    }
}
