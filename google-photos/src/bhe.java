// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;
import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

public final class bhe
    implements Runnable
{

    private final msy a = new msy(0.52F, 0.3F, 0.12F, 1.0F);
    private final int b;
    private final long c;
    private CropOverlayView d;

    public bhe(CropOverlayView cropoverlayview, int i)
    {
        d = cropoverlayview;
        super();
        b = i;
        if (CropOverlayView.e(cropoverlayview))
        {
            i = 2;
        } else
        {
            i = 1;
        }
        c = 300L / (long)i;
    }

    public final void run()
    {
label0:
        {
label1:
            {
                if (CropOverlayView.d(d))
                {
                    float f = Math.min(1.0F, Math.max(0.0F, (float)(System.currentTimeMillis() - CropOverlayView.k(d)) / (float)c));
                    f = a.getInterpolation(f);
                    PipelineParams pipelineparams = CropOverlayView.f(d).f();
                    float f1 = CropOverlayView.g(d).left;
                    float f2 = pipelineparams.cropLeft;
                    float f3 = CropOverlayView.g(d).top;
                    float f4 = pipelineparams.cropTop;
                    float f5 = CropOverlayView.g(d).right;
                    float f6 = pipelineparams.cropRight;
                    float f7 = CropOverlayView.g(d).bottom;
                    float f8 = pipelineparams.cropBottom;
                    CropOverlayView.a(d, f2 * f + f1 * (1.0F - f), f4 * f + f3 * (1.0F - f), f6 * f + f5 * (1.0F - f), f8 * f + f7 * (1.0F - f), pipelineparams, false);
                    CropOverlayView.f(d).a(pipelineparams);
                    if (f < 0.999F)
                    {
                        break label0;
                    }
                    CropOverlayView.g(d).set(pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom);
                    if (CropOverlayView.i(d) != null)
                    {
                        CropOverlayView.i(d).a(b);
                        b.a(d.getContext(), d, CropOverlayView.a(d, b, pipelineparams));
                    }
                    if (!CropOverlayView.e(d))
                    {
                        break label1;
                    }
                    CropOverlayView.j(d).post(new bhi(d, CropOverlayView.f(d).f(), CropOverlayView.l(d), b));
                }
                return;
            }
            CropOverlayView.a(d, false);
            return;
        }
        CropOverlayView.j(d).postDelayed(this, 25L);
    }
}
